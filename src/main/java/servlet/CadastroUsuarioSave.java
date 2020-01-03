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

@WebServlet(
        name = "cadastro-usuario-edit",
        urlPatterns = "/usuario/edit"
)
public class CadastroUsuarioSave extends HttpServlet {
    UsuarioRepository usuarioRepository;

    public CadastroUsuarioSave(){
        usuarioRepository = new UsuarioRepository();
    }
    @Override
    protected void doGet (HttpServletRequest req, HttpServletResponse resp) throws SaslException, IOException, ServletException {
        String name = req.getParameter("name");
        Usuario usuario = usuarioRepository.getByName(name);
        req.setAttribute("name",name);
        req.getRequestDispatcher("/usuario/save.jsp").forward(req,resp);
    }

    @Override
    protected void doPost (HttpServletRequest req,HttpServletResponse resp) throws ServletException,IOException{
        String action = req.getParameter("TypeAction");
        if ("edit".equals(action)){
            save(req,resp);
        }
        resp.sendRedirect(req.getContextPath()+"/usuario/list");
    }

    private void save(HttpServletRequest req,HttpServletResponse resp){
        String name = req.getParameter("name");
        String email = req.getParameter("email");
        String senha = req.getParameter("senha");
        Usuario usuario = usuarioRepository.getByName("name");
        usuario.setEmail(email);
        usuario.setSenha(senha);
        usuarioRepository.save(usuario);
    }
}
