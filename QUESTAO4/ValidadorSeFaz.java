package QUESTAO4;

class ValidadorSefaz implements Validador {

    public Resultado validar(DocumentoFiscal doc, Contexto ctx) {

        if (!ctx.deveExecutarValidador3e5) return Resultado.ok("Pulando SEFAZ.");
        if (doc.xml.contains("<sefazOffline>")) return Resultado.erro("SEFAZ offline!");
        return Resultado.ok("Consulta SEFAZ ok.");

    }

    public String getNome() { return "Sefaz"; }

    public boolean suportaRollback() { return false; }

    public void rollback(DocumentoFiscal d, DocumentoFiscal s) {}
    
}

