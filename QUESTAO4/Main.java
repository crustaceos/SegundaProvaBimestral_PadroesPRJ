package QUESTAO4;

public class Main {
    public static void main(String[] args) {

        ExecutorValidadores executor = new ExecutorValidadores(

            new ValidadorSchemaXml(),
            new ValidadorCertificado(),
            new ValidadorRegrasFiscais(),
            new ValidadorBanco(),
            new ValidadorSefaz()

        );

        System.out.println("=== Caso 1: Documento válido ===");
        DocumentoFiscal d1 = new DocumentoFiscal("NF100", "<xml>ok</xml>", "cert-ok");
        System.out.println(executor.executar(d1).msg);
        System.out.println();

        System.out.println("=== Caso 2: Certificado expirado ===");
        DocumentoFiscal d2 = new DocumentoFiscal("NF101", "<xml>ok</xml>", "cert-expirado");
        System.out.println(executor.executar(d2).msg);
        System.out.println();

        System.out.println("=== Caso 3: Duplicidade com rollback ===");
        DocumentoFiscal d3a = new DocumentoFiscal("NF200", "<xml>ok</xml>", "cert-ok");
        executor.executar(d3a); 
        DocumentoFiscal d3b = new DocumentoFiscal("NF200", "<xml><sefazOffline></sefazOffline></xml>", "cert-ok");
        System.out.println(executor.executar(d3b).msg);

    }
}

