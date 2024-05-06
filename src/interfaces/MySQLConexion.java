package interfaces;

public class MySQLConexion implements ConexionBD {

    protected String status;

    public MySQLConexion(String status){
        this.status = status;
    }

    @Override
    public String conectar(){
        status = "La base de datos a sido conectada";
        return status;
    }

    @Override
    public String desconectar(){
        status = "La base de datos a sido desconectada";
        return status;
    }

    @Override
    public String consultar(){
        return status;
    }

}
