public class iphone implements AparelhoTelefonico, NavegadorInternet, ReprodutorMusical{ 
    public void ligar(String numero){
        System.out.println("Ligando....");
    };
    public void atender(){
        System.out.println("Atendendo....");
    };
    public void IniciarCorreioVoz(){
        System.out.println("Iniciando correio de voz....");
    };

    
    public void exibirPagina(String url){
        System.out.println("Exibindo nova página....");
    };
    public void adicionarNovaAba(){
        System.out.println("Adicionando nova aba....");
    };
    public void atualizarPagina(){
        System.out.println("Atualizando página....");
    };


    public void tocar(){
        System.out.println("Tocando música....");
    };
    public void pausar(){
        System.out.println("Pausando música....");
    };
    public void selecionarMusica(String musica){
        System.out.println("Selecionando música....");
    };
}