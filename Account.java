
import java.util.*;

/**
 * 
 */
public class Account {

    /**
     * Default constructor
     */
    public Account() {
    }

    /**
     * 
     */
    public int numeroCompte;

    /**
     * 
     */
    public String nomTitulaire;

    /**
     * 
     */
    public double solde;

	public int getNumeroCompte() {
		return numeroCompte;
	}

	public void setNumeroCompte(int numeroCompte) {
		this.numeroCompte = numeroCompte;
	}

	public String getNomTitulaire() {
		return nomTitulaire;
	}

	public void setNomTitulaire(String nomTitulaire) {
		this.nomTitulaire = nomTitulaire;
	}

	public double getSolde() {
		return solde;
	}

	public void setSolde(double solde) {
		this.solde = solde;
	}

}