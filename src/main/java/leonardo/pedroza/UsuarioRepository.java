package leonardo.pedroza;

import java.awt.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UsuarioRepository {

    static Map <String,Usuario> usuarioMap;

    static {
        usuarioMap = new HashMap<String, Usuario>();
    }

    public List<Usuario> findAll(){
        List<Usuario> usuarioList = new ArrayList<Usuario>();
        usuarioList.addAll(usuarioMap.values());
        return usuarioList;
    }
    public void save (Usuario usuario){
        usuarioMap.put(usuario.getNome(),usuario);
    }
    public Usuario getByName(String name){
        return usuarioMap.get(name);
    }
}
