package QUESTAO4;

class ValidadorSchemaXml implements Validador {

    public Resultado validar(DocumentoFiscal doc, Contexto ctx) {

        if (doc.xml.contains("<erroXml>")) return Resultado.erro("XML inválido!");
        return Resultado.ok("Schema XML válido.");

    }

    public String getNome() { return "SchemaXml"; }

    public boolean suportaRollback() { return false; }

    public void rollback(DocumentoFiscal d, DocumentoFiscal s) {}
    
}
