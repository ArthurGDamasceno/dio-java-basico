public class DeclarandoMetodos {
    
    public static void main(String[] args) {
        
        String primeiroNome = "Arthur";
        String segundoNome = "Damasceno";

        String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);

        System.out.println(nomeCompleto);

    }
        
    //Estrutura 
    //TipoRetorno NomeObjetivoNoInfitivo Parametro(s) 
        
    //Exemplo
    public static String nomeCompleto (String primeiroNome,String segundoNome){
        return primeiroNome.concat(" ").concat(segundoNome);
    }
}
