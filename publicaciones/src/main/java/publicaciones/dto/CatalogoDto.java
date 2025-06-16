package publicaciones.dto;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class CatalogoDto {
    private String tipo;
    private String titulo;
    private int anioPublicacion;
    private String resumen;
    private String editorial;
    private String isbn;

}
