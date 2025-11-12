package QUESTAO4;

class Resultado {

    boolean ok;
    String msg;

    Resultado(boolean ok, String msg) {

        this.ok = ok;
        this.msg = msg;

    }

    static Resultado ok(String msg) {

        return new Resultado(true, msg);

    }

    static Resultado erro(String msg) {

        return new Resultado(false, msg);
        
    }
}

