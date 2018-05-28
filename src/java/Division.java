
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;

@Path("division")
public class Division {
    
    @GET
    public String operarcion(@QueryParam("cantidad_Colones") double cantColones){
        
        double tipo_Cambio = 558.7;
        
        return String.valueOf("Usted tiene: " + cantColones / tipo_Cambio + " Dolares.");
    }
    
    // http://localhost:8080/JavaRest/tipo_Cambio/division?cantidad_Colones=200000
}
