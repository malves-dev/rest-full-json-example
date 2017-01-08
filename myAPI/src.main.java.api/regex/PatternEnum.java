package regex;

/**
 * @author MarioS
 *
 */
public enum PatternEnum {
	
	
	
	/**
	 * 
	 */
	ROLES_PASSWD_1("Senha deve ter no minimo 8 caracteres.","[\\s\\S]{8}", false),
	ROLES_PASSWD_2("Senha n�o pode ter espa�o em branco.","[\\s+]", false),
	ROLES_PASSWD_3("Senha deve conter 2 caracteres min�sculos.","[a-z]", true),	
	ROLES_PASSWD_4("Senha deve conter 2 caracteres mai�sculos.","[A-Z]", true),	
	ROLES_PASSWD_5("Senha deve conter 2 n�meros. ","[0-9]", true),	
	ROLES_PASSWD_6("Senha deve conter 2 caracteres especiais. ","[!@#$%&*()_,.;{}?]", true);
	
	

	/**
	 * 
	 */
	String regra;
	/**
	 * 
	 */
	String expressao;	
	/**
	 * 
	 */
	boolean countValidator;
	
	/**
	 * @param regra
	 * @param expressao
	 * @param countValidator
	 */
	private PatternEnum(String regra, String expressao, boolean countValidator) {
		this.regra = regra;
		this.expressao = expressao;
		this.countValidator = countValidator;
	}
	
	public String getRegra(){
		return regra;
	}
	
	public String getExpressao(){
		return expressao;
	}
	
	public boolean getCountValidator(){
		return countValidator;
	}
	

}
