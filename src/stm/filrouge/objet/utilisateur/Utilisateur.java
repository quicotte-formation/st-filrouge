package stm.filrouge.objet.utilisateur;

public class Utilisateur {

	public enum TypeUtilisateur {

		ADMIN,
		MODERATEUR,
		UTIL
	}
	
	private String pseudo;
	private TypeUtilisateur typeUtil;
	
	
	public String getPseudo() {
		return pseudo;
	}
	public void setPseudo(String pseudo) {
		this.pseudo = pseudo;
	}
	public TypeUtilisateur getTypeUtil() {
		return typeUtil;
	}
	public void setTypeUtil(TypeUtilisateur typeUtil) {
		this.typeUtil = typeUtil;
	}
	@Override
	public String toString() {
		return "Utilisateur [pseudo=" + pseudo + ", typeUtil=" + typeUtil + "]";
	}
	
	
}
