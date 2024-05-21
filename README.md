# iphone-diagramacao-dio
Projeto de estudo sobre diagramação e poo do bootcamp dio Java


A parte de modelagem foi feita usando o mermaid
Segue abaixo a modelação UML do projeto criado:
classDiagram
    Iphone <|-- ReprodutorMusica
    Iphone <|-- AparelhoTelefonico
    Iphone <|-- NavegadorInternet
    Iphone: +tocar()
    Iphone: +pausar()
    Iphone: +selecionarMusica()
    Iphone: +ligar()
    Iphone: +atender()
    Iphone: +IniciarCorreioVoz()
    Iphone: +exibirPagina()
    Iphone: +adicionarNovaAba()
    Iphone: +atualizarPagina()


    class ReprodutorMusica{
      +tocar()
      +pausar()
      +selecionarMusica()
    }
    class AparelhoTelefonico{
      +ligar()
      +atender()
      +IniciarCorreioVoz()
    }
    class NavegadorInternet{
      +exibirPagina()
      +adicionarNovaAba()
      +atualizarPagina()
    }
