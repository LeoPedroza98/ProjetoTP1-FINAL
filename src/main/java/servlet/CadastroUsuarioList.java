package servlet;

import leonardo.pedroza.Usuario;
import leonardo.pedroza.UsuarioRepository;

import javax.security.sasl.SaslException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(
        name = "cadastro-usuario-list",
        urlPatterns = "/usuario/list"
)
public class CadastroUsuarioList extends HttpServlet {
    UsuarioRepository usuarioRepository;
    public CadastroUsuarioList (){
        usuarioRepository = new UsuarioRepository();
    }

    @Override
    protected void doGet (HttpServletRequest req, HttpServletResponse resp) throws SaslException, IOException, ServletException {
        List<Usuario> usuarioList = usuarioRepository.findAll();
        req.setAttribute("usuarioList",usuarioList);
        req.getRequestDispatcher("/usuario/list.jsp").forward(req,resp);
    }
}
