package QUESTAO4;

interface Validador {

    Resultado validar(DocumentoFiscal doc, Contexto ctx);
    String getNome();
    boolean suportaRollback();
    void rollback(DocumentoFiscal doc, DocumentoFiscal snapshot);
    
}

