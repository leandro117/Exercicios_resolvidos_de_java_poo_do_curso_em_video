
package projetoyoutube;

public class ProjetoYouTube {

    public static void main(String[] args) {
        
        //gafanhoto
        Gafanhoto g[] = new Gafanhoto[1];
        g[0] = new Gafanhoto("Jubileu", 22, "Masculino");
        //video
        Video v[] = new Video[1];
        v[0] = new Video("Java");
        
        //vis
        Vizualizacao vis = new Vizualizacao(g[0], v[0]);
        
        System.out.println(g[0].toString());
        System.out.println("---------------------");
        System.out.println(v[0].toString());
        System.out.println("---------------------");
        System.out.println(vis.toString());
    }
    
}
