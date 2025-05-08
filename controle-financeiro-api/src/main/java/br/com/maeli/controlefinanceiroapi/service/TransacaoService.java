package br.com.maeli.controlefinanceiroapi.service;
import br.com.maeli.controlefinanceiroapi.model.Transacao;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TransacaoService {
    //Simulando o banco de dados
    private final List<Transacao> transacoes = new ArrayList<>();

    public void adicionarTransacao(Transacao transacao) {
        transacoes.add(transacao);
    }

    public List<Transacao> listarTransacoes() {
        return transacoes;
    }

    public double calcularSaldo(){
        double saldo = 0.0;

        for(Transacao t: transacoes) {
            if (t.getTipo().equalsIgnoreCase("receita")){
                saldo += t.getValor();
            } else if (t.getTipo().equalsIgnoreCse("despesas")) {
                saldo -= t.getValor();
            }
        }

        return saldo;
    }
}
