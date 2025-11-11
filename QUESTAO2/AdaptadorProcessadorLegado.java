package QUESTAO2;

import java.util.HashMap;

class AdaptadorProcessadorLegado implements ProcessadorTransacoes {

    private SistemaBancarioLegado sistemaLegado;

    public AdaptadorProcessadorLegado(SistemaBancarioLegado sistemaLegado) {

        this.sistemaLegado = sistemaLegado;

    }

    public String autorizar(String cartao, double valor, String moeda) {

        HashMap<String, Object> parametros = new HashMap<>();

        parametros.put("cartao", cartao);

        parametros.put("valor", valor);

        parametros.put("moedaCodigo", converterMoedaParaCodigo(moeda));

        //Adição do campo obrigatório do legado
        parametros.put("bancoOrigem", "BANCO_PADRAO");

        HashMap<String, Object> respostaLegado = sistemaLegado.processarTransacao(parametros);

        //Converte legado para formato moderno
        return converterResposta(respostaLegado);
    }

    private int converterMoedaParaCodigo(String moeda) {

        if (moeda.equalsIgnoreCase("USD")) return 1;

        if (moeda.equalsIgnoreCase("EUR")) return 2;

        if (moeda.equalsIgnoreCase("BRL")) return 3;

        return 0;
    }

    //Conversão de resposta legado para moderno
    private String converterResposta(HashMap<String, Object> resposta) {

        String status = (String) resposta.get("status");

        if ("ERRO".equals(status)) {

            return "Falha: " + resposta.get("mensagem");

        }

        return "Transação aprovada. Código: " + resposta.get("codigoAutorizacao")

                + ", Valor: " + resposta.get("valorProcessado")

                + ", Moeda Código: " + resposta.get("moedaCodigo");
                
    }
}

