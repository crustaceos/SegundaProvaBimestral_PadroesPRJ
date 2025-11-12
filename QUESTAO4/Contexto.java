package QUESTAO4;

class Contexto {

    int falhas = 0;
    boolean circuitBreaker = false;
    boolean deveExecutarValidador3e5 = true;

    void registrarFalha() {
        //Ir somando a quantidade de falhas toda vez que essa for instânciada, e caso seja maior ou igual a 3, ativa o circuit breaker
        falhas++;
        if (falhas >= 3) circuitBreaker = true;

    }

}

