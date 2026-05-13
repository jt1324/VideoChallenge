public class Main {
    public static void main(String[] args) {
        
        Video v[] = new Video[3];
        v[0] = new Video("OOP class 001");
        v[1] = new Video("OOP class 002");
        v[2] = new Video("OOP class 003");

        System.out.println(v[0].toString());

        Gafanhoto g[] = new Gafanhoto[2];
        g[0] = new Gafanhoto("Jubileu", 25, "M", "jb25");
        g[1] = new Gafanhoto("Creuza", 55, "F", "creu55");

        System.out.println(g[0].toString());

        Visualisation vis = new Visualisation(g[0], v[2]);
        System.out.println(vis.toString());

        Visualisation vis1 = new Visualisation(g[0], v[1]);
        System.out.println(vis1.toString());

    }
}
