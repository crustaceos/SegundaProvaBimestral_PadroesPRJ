package QUESTAO4;

class ValidadorCertificado implements Validador {

    public Resultado validar(DocumentoFiscal doc, Contexto ctx) {

        if (doc.certificado.contains("expirado")) return Resultado.erro("Certificado expirado!");
        return Resultado.ok("Certificado válido.");

    }

    public String getNome() { return "Certificado"; }

    public boolean suportaRollback() { return false; }

    public void rollback(DocumentoFiscal d, DocumentoFiscal s) {}
    
}
