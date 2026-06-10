package Exemplo.copaMundo.Service;

import Exemplo.copaMundo.Model.Convocacao;
import Exemplo.copaMundo.Model.Selecao;
import Exemplo.copaMundo.Repositories.ConvocacaoRepository;
import Exemplo.copaMundo.Repositories.SelecaoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
@Service
@RequiredArgsConstructor

public class ConvocacaoService {

    private final ConvocacaoRepository convocacaoRepository;
    private final SelecaoRepository selecaoRepository;
    public Convocacao registrar(Convocacao convocacao) {
        Selecao selecao =
                selecaoRepository.findById(convocacao.getSelecao().getId())
                        .orElseThrow(() -> new RuntimeException("Seleção não encontrada"));
                                Integer saldoAtual = selecao.getJogadoresDisponiveis();
        selecao.setJogadoresDisponiveis(saldoAtual +
                convocacao.getQuantidade());
        selecaoRepository.save(selecao);
        convocacao.setSelecao(selecao);
        return convocacaoRepository.save(convocacao);
    }
}

