package QUESTAO2;

import java.util.HashMap;

class SistemaBancarioLegado {

    public HashMap<String, Object> processarTransacao(HashMap<String, Object> parametros) {
        HashMap<String, Object> resposta = new HashMap<>();

       
        if (!parametros.containsKey("bancoOrigem")) {

            //Campo obrigatório especifico do banco legado
            resposta.put("status", "ERRO");

            resposta.put("mensagem", "Campo obrigatório 'bancoOrigem' ausente");

            return resposta;

        }

        //Simulaçao de processamento do banco legado
        resposta.put("status", "OK");
        //Criação de um código aleatorio 
        resposta.put("codigoAutorizacao", "AUT-" + Math.round(Math.random() * 10000));

        resposta.put("valorProcessado", parametros.get("valor"));

        resposta.put("moedaCodigo", parametros.get("moedaCodigo"));

        return resposta;

    }
}
