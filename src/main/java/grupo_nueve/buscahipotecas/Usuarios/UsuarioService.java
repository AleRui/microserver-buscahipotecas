package grupo_nueve.buscahipotecas.Usuarios;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor // Inyeccion de dependencia.
public class UsuarioService {

    private final UsuarioRepository usuarioRepository; // Inyeccion de dependencia.

    public void create (Usuario usuario)
    {
        usuarioRepository.save(usuario);
    }


}
