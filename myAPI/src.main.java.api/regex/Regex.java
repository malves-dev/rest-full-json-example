package regex;
	
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author MarioS
 *
 */
public class Regex {
		
	public static void main(String[] args) {
		//showPosition();
		passwdValidation();
	}
	
	private static void passwdValidation() {	
		String passwd = "a#f8";	
		
		for(PatternEnum key : PatternEnum.values()){
			int position = 0;

			Pattern pattern = Pattern.compile(key.expressao);
			Matcher matcher = pattern.matcher(passwd);
			
			while(matcher.find()){
				   position++;
			}
			
			if(position > 1){
				System.out.println(key.regra);
				return;
			}	

		}
		
	}

	/**
	 * 
	 */
	static void showPosition(){
	
		String regex = "([a-zA-Z0-9])";
		
		String text = "12XcvA*#";
		
		Pattern pattern = Pattern.compile(regex);
		
		Matcher matcher = pattern.matcher(text);
	
		StringBuilder sb = new StringBuilder();
	
		int position = 0;
	
		while (matcher.find()) {
			sb.append("\nCaracter \"" + matcher.group() + "\" encontrado na posi��o: " + matcher.start());
			position++;
		}
	
		sb.insert(0, "O n�mero de apari��es do padr�o .s. � " + position);
	
		System.out.append(sb.toString());
	}
}
