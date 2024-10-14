import lombok.Data;

@Data
public class Usuario {
    private String correo;
    private String pais;
    private String platafroma;

    public Usuario(String correo, String pais, String platafroma) {
        this.correo = correo;
        this.pais = pais;
        this.platafroma = platafroma;
    }
}
