package QUESTAO4;

class DocumentoFiscal {

    String numero;
    String xml;
    String certificado;
    boolean inseridoNoBanco = false;

    DocumentoFiscal(String numero, String xml, String certificado) {

        this.numero = numero;
        this.xml = xml;
        this.certificado = certificado;

    }

    //Clonar o documento, para gerar uma cópia deste, como plano de rollback
    DocumentoFiscal clonar() {

        DocumentoFiscal c = new DocumentoFiscal(numero, xml, certificado);
        c.inseridoNoBanco = inseridoNoBanco;
        return c;

    }
}

