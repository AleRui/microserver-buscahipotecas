package grupo_nueve.buscahipotecas.Usuarios;

import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;


@RestController
@RequestMapping("/usuario")
@RequiredArgsConstructor // Inyeccion de dependencia.
public class UsuarioController {

    private final UsuarioService usuarioService; // Inyeccion de dependencia.

    @PostMapping("/create")
    public void createUsuario(@RequestBody Usuario usuario)
    {
        usuarioService.create(usuario);
    }
}