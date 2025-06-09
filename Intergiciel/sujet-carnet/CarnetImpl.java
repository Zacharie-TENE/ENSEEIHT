import java.rmi.*;
import java.util.*;
import java.net.*;
import java.rmi.server.*;
import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;

public class CarnetImpl extends UnicastRemoteObject implements Carnet{

    protected CarnetImpl() throws RemoteException {
        //TODO Auto-generated constructor stub
    }

    private int numero;
    private Hashtable <String, RFiche> table = new Hashtable<String, RFiche>();
    private Carnet autre=null;

public CarnetImpl(int numero) throws RemoteException{
    this.numero=numero;
}

    @Override
    public void Ajouter(SFiche sf) throws RemoteException {
        // TODO Auto-generated method stub
        String cle = sf.getNom();
        RFiche valeur = new RFicheImpl(sf.getNom(),sf.getEmail());
        table.put(cle, valeur);
        
        
    }

    @Override
    public RFiche Consulter(String nom, boolean forward) throws RemoteException {
        //  Auto-generated method stub
        RFiche rf = table.get(nom);
        if (rf == null && forward){
            if (this.autre == null){
                try {
                    this.autre = (Carnet) Naming.lookup("//localhost:4000/Carnet"+numero%2+1);
                }catch (Exception e){

                }
                
            }
            rf = this.autre.Consulter(nom, false);
        }
        return rf;
    }
    
   public static void main(String[] args) {
        try {

            LocateRegistry.createRegistry(4000);

            Carnet carnet1 = new CarnetImpl(1);
            Carnet carnet2 = new CarnetImpl(2);


            Naming.rebind("rmi://localhost:4000/Carnet1", carnet1);
            Naming.rebind("rmi://localhost:4000/Carnet2", carnet2);

            System.out.println("RMI Server started...");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}