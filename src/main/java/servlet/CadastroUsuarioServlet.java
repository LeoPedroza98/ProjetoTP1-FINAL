package servlet;

import leonardo.pedroza.Usuario;
import leonardo.pedroza.UsuarioRepository;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(
        name = "cadastro-usuario-servlet",
        urlPatterns = "/usuario/create"
)
public class CadastroUsuarioServlet extends HttpServlet {
    UsuarioRepository usuarioRepository;

    public CadastroUsuarioServlet(){
        usuarioRepository = new UsuarioRepository();
    }
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("/usuario/create.jsp").forward(req, resp);
    }
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name =  req.getParameter("nome");
        String email = req.getParameter("email");
        String senha = req.getParameter("senha");
        Usuario usuario = new Usuario(name,email,senha);
        usuarioRepository.save(usuario);
        resp.sendRedirect(req.getContextPath()+"/usuario/list");
    }
}
