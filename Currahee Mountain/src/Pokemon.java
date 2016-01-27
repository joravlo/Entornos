
public class Pokemon {

	public static void main(String[] args) {
		String frase="Paco@es@un c1ch4nd4";
		String codificada="";
		String subfrase1=frase.substring(0,(frase.length()/2));
		String subfrase2=frase.substring((frase.length()/2));;
		for(int i=0;i<subfrase1.length();i++){
			if(subfrase1.charAt(i)=='@'){
				codificada=codificada+" ";
			}else{
				codificada=codificada+subfrase1.charAt(i);
			}	
		}
		for(int i=0;i<subfrase2.length();i++){
			if((subfrase2.charAt(i)=='1')){
				codificada=codificada+"a";
			} else if((subfrase2.charAt(i)=='4')){
				codificada=codificada+"o";
			}else{
				codificada=codificada+subfrase2.charAt(i);
			}			
		}
		System.out.println(codificada);
	}

}
