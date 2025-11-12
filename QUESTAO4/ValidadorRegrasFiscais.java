package QUESTAO4;

class ValidadorRegrasFiscais implements Validador {

    public Resultado validar(DocumentoFiscal doc, Contexto ctx) {

        if (!ctx.deveExecutarValidador3e5) return Resultado.ok("Pulando regras fiscais.");
        if (doc.xml.contains("<impostoInvalido>")) return Resultado.erro("Erro de imposto!");
        return Resultado.ok("Regras fiscais ok.");

    }

    public String getNome() { return "RegrasFiscais"; }

    public boolean suportaRollback() { return false; }

    public void rollback(DocumentoFiscal d, DocumentoFiscal s) {}
    
}

