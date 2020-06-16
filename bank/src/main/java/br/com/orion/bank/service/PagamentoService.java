package br.com.orion.bank.service;

import org.springframework.stereotype.Service;

import br.com.orion.bank.exceptions.PaymentException;
import br.com.orion.bank.model.Payment;
import br.com.orion.bank.model.dto.PaymentDto;
import br.com.orion.bank.repository.PaymentRepository;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class PagamentoService {

    private final PaymentRepository repository;

    private final CardService service;

    public void pagamento(PaymentDto dto) {
        if (!service.isSaldoSuficiente(dto.getCardNumber(), dto.getSecurityCode(), dto.getBillAmount())) {
            throw new PaymentException("There is no enough balance");
        }

        Payment pagamento = Payment.builder().billAmount(dto.getBillAmount())
            .card(service.getCard(dto.getCardNumber(), dto.getSecurityCode())).build();

        repository.save(pagamento);
        service.atualizaSaldo(dto.getCardNumber(), dto.getSecurityCode(), dto.getBillAmount());
    }
}