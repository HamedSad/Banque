
import java.util.*;

/**
 * 
 */
public class CreateAccount {

    /**
     * Default constructor
     */
    public CreateAccount() {
    }

    /**
     * 
     */
    public static void main(String [] args) {
        // TODO implement here
    	
    	//creation d'instance 
    	
    	AccountMain account1 = new AccountMain();
    	AccountMain account2 = new AccountMain();
    	
    	account1.setNomTitulaire("Pierre ");
    	account1.setSolde(2000);
    	account1.setNumeroCompte(261250);
    	
    	account2.setNomTitulaire("Aurélia ");
    	account2.setSolde(2000);
    	account2.setNumeroCompte(67462);
    	
    	account1.retirerArgent(250);
    	account2.retirerArgent(500);
    }

}