
package controlador;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import modelo.Socio;
import modelo.SocioDAO;


public class ControladorSocio extends HttpServlet {
    SocioDAO dao=new SocioDAO();
Socio p=new Socio();

 
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet ControladorSocio</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet ControladorSocio at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

  
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

   
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String accion=request.getParameter("accion");
        switch (accion){
            case "Listar":
                List<Socio>datos= dao.listar();
                request.setAttribute("datos",datos);//se envia para mostrar en la vista
                request.getRequestDispatcher("index.jsp").forward(request, response);//
                break;
            case "Nuevo":
                 request.getRequestDispatcher("agregar.jsp").forward(request, response);//
                 break;
            case "Guardar":
                int id=Integer.parseInt(request.getParameter("txtid"));
                String cedula=request.getParameter("txtcedula");
                String usuario=request.getParameter("txtusuario");
                String nombre=request.getParameter("txtnombres");
                String apellido=request.getParameter("txtapellido");
                String telefono=request.getParameter("txttelefono");
                p.setCODIGO_SOCIO(id);
                p.setCEDULA_SOCIO(cedula);
                p.setUSUARIO_SOCIO(usuario);
                p.setNOMBRE_SOCIO(nombre);
                p.setAPELLIDO_SOCIO(apellido);
                p.setTELEFONO_SOCIO(telefono);
                dao.agregar(p);
                request.getRequestDispatcher("ControladorSocio?accion=Listar").forward(request, response);
                break;
            case "Editar":
                String ide=request.getParameter("id");
                Socio pe=dao.listarId(ide);
                request.setAttribute("socio", pe);
                request.getRequestDispatcher("editar.jsp").forward(request, response);
                break;
            case "Actualizar":
                int id1=Integer.parseInt(request.getParameter("txtid"));
                String cedula1=request.getParameter("txtcedula");
                String usuario1=request.getParameter("txtusuario");
                String nombre1=request.getParameter("txtnombres");
                String apellido1=request.getParameter("txtapellido");
                String telefono1=request.getParameter("txttelefono");
                p.setCODIGO_SOCIO(id1);
                p.setCEDULA_SOCIO(cedula1);
                p.setUSUARIO_SOCIO(usuario1);
                p.setNOMBRE_SOCIO(nombre1);
                p.setAPELLIDO_SOCIO(apellido1);
                p.setTELEFONO_SOCIO(telefono1);
                dao.actualizar(p);
                request.getRequestDispatcher("ControladorSocio?accion=Listar").forward(request, response);
                
                break;
            case "Eliminar":
                 String id2=request.getParameter("id");
                 dao.eliminar(id2);
                 request.getRequestDispatcher("ControladorSocio?accion=Listar").forward(request, response);
                
                break;
            default:
                throw new AssertionError(); 
        }
    }

   
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
