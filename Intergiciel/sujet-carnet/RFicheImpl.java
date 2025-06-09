import java.rmi.*;
import java.rmi.server.*;
public class RFicheImpl extends UnicastRemoteObject implements RFiche {
    private String Nom;
	private String Email;
    public RFicheImpl(String name, String email) throws RemoteException {
        this.Nom = name;
        this.Email = email;

    } 

 
    public String getNom() throws RemoteException  {
        // TODO Auto-generated method stub
        return this.Nom;
    }
   
    public String getEmail() throws RemoteException  {
        // TODO Auto-generated method stub
        return this.Email;
    }
}
