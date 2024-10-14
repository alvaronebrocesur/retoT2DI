import java.util.ArrayList;

public class Data {
    public static ArrayList<Usuario> usuarios;
    public static ArrayList<String> paises;
    public static ArrayList<String> plataformas;
    static {
        usuarios = new ArrayList<>();
        usuarios.add(new Usuario("alvaronebro23@gmail.com", "España", "escritorio"));
        usuarios.add(new Usuario("emilio@hotmail.com", "Andorra", "movil"));
        usuarios.add(new Usuario("joseantonio@cesurformacion", "Chile", "desconocido"));
        paises = new ArrayList<>();
        paises.add("España");
        paises.add("Andorra");
        paises.add("Chile");
        paises.add("Portugal");
        paises.add("Francia");
        plataformas = new ArrayList<>();
        plataformas.add("movil");
        plataformas.add("escritorio");
        plataformas.add("desconocido");
    }
}
