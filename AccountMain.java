
import java.util.*;

/**
 * 
 */
public class AccountMain extends Account {

    /**
     * Default constructor
     */
    public AccountMain() {
    }

    /**
     * 
     */
    public void virerArgent() {
        // TODO implement here
    }

    /**
     * 
     */
    public void retirerArgent(double retrait) {
        // TODO implement here
    	System.out.println(getNomTitulaire() + "Votre solde est de : " + getSolde() + " Euros");
    	
    	solde = getSolde() - retrait;
    	
    	System.out.println("Après retrait de "  + retrait  + " Euros, votre nouveau solde est de : " + getSolde() + " Euros");
    }

}