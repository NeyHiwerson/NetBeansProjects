package projetoyoutube;

public class ProjetoYouTube {

    public static void main(String[] args) {
        Video v[] = new Video[10];
        v[0] = new Video("Poeira em Alto Mar");
        v[1] = new Video("Titanic");
        v[2] = new Video("As Branquelas");
        v[3] = new Video("As Lindas Tranças de um Careca");
        v[4] = new Video("Lagoa Azul");
        v[5] = new Video("A Mordida do Banguela");
        v[6] = new Video("Zohan o agente bom de corte");
        v[7] = new Video("Eduard mãos de tesoura");
        v[8] = new Video("As Aventuras de Lady&Frida");
        v[9] = new Video("A mulher barbada");

        Gafanhoto g[] = new Gafanhoto[10];
        g[0] = new Gafanhoto("Maria", 15, "F", "Mari");
        g[1] = new Gafanhoto("João", 21, "M", "Jão");
        g[2] = new Gafanhoto("José", 13, "M", "Zé");
        g[3] = new Gafanhoto("Cleber", 17, "M", "BamBam");
        g[4] = new Gafanhoto("Elton", 12, "M", "Grilo");
        g[5] = new Gafanhoto("Priscila", 36, "F", "Pri");
        g[6] = new Gafanhoto("Luiza", 32, "F", "Sonsa");
        g[7] = new Gafanhoto("Aline", 29, "F", "Alice");
        g[8] = new Gafanhoto("Marcela", 22, "F", "Flor");
        g[9] = new Gafanhoto("Frank", 40, "M", "Basto");
        /*
        System.out.println(v[0].toString());
        System.out.println(g[9].toString());
        int i;
        for (i = 0; i < 10; i++) {
            System.out.println(v[i].toString());
        }
        
        int cont;
        for (cont = 0; cont < 10; cont++) {
            System.out.println(g[cont].toString());
        }
        */
        Visualizacao vis[] = new Visualizacao[10];
        vis[0]= new Visualizacao(g[0],v[1]);
        vis[0].avaliar();
        System.out.println(vis[0].toString());
        vis[1]=new Visualizacao(g[0],v[3]);
        vis[1].avaliar(70.5f);
        System.out.println(vis[1].toString());
         vis[2]=new Visualizacao(g[0],v[8]);
         vis[2].avaliar(10);
        System.out.println(vis[2].toString());
        
    }

}
