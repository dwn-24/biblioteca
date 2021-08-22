<%-- 
    Document   : index
    Created on : 19-ago-2021, 22:58:59
    Author     : HORUS
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="css/bootstrap.css" rel="stylesheet" type="text/css"/>
        <title>Biblioteca</title>
    </head>
    <body>
       
    <center>
        <div class="container">
            <h3>SOCIO</h3>
            <form action="ControladorSocio" method="post">
                <input class="btn btn-secondary" type="submit" name="accion" value="Listar">
                <input class="btn btn-success" type="submit" name="accion" value="Nuevo">
                
            </form>
            <hr>
        </div>
        <div class="container">
            <table class="table table-bordered" >
                <thead>
                    <tr>
                        
                        <th class="text-center">Codigo</th>
                        <th class="text-center">Cedula</th>
                        <th class="text-center">Usuario</th>
                        <th class="text-center">Nombre</th>
                        <th class="text-center">Apellido</th>
                        <th class="text-center">Telefono</th>
                        <th class="text-center">Acciones</th>
                    </tr>
                </thead>
                <tbody>
                    
                <c:forEach var="dato" items="${datos}">
                    <tr>
                        
                        <td class="text-center">${dato.getCODIGO_SOCIO()}</td>
                        <td class="text-center">${dato.getCEDULA_SOCIO()}</td>
                        <td class="text-center">${dato.getUSUARIO_SOCIO()}</td>
                        <td class="text-center">${dato.getNOMBRE_SOCIO()}</td>
                        <td class="text-center">${dato.getAPELLIDO_SOCIO()}</td>
                        <td class="text-center">${dato.getTELEFONO_SOCIO()}</td>
                        <td class="text-center">
                            <form action="ControladorSocio" method="post" >
                                <input  type="hidden" name="id" value="${dato.getCODIGO_SOCIO()}" >
                                <input class="btn btn-warning" type="submit" name="accion" value="Editar" >
                                <input class="btn btn-danger" type="submit" name="accion" value="Eliminar" >
                            </form>
                        </td>
                    </tr>
                </c:forEach>
                </tbody>
                
            </table>
        </div>
    </center>
    </body>
</html>
