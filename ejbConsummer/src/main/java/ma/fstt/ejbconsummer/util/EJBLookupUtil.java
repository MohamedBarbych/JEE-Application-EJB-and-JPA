package ma.fstt.ejbconsummer.util;

import ma.fstt.container.EtudiantServiceRemote;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

public class EJBLookupUtil {

    private static final String JNDI_NAME = "java:global/EjbProvider-1.0-SNAPSHOT/EtudiantServiceImpl!ma.fstt.container.EtudiantServiceRemote";

    public static EtudiantServiceRemote getEtudiantService() throws NamingException {
        Context context = new InitialContext();
        return (EtudiantServiceRemote) context.lookup(JNDI_NAME);
    }
}
