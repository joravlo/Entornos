
public class Bomba07 {
  public static void main(String[] args) {
	  String mensaje="Paquito es el tio mas guapo que conozco";
	  String mensajeCodificado="";
	  String temporal="";
	  //Almacenamos en mensajeCodificado el mensaje convertido a mayusculas
	  mensajeCodificado=mensaje.toUpperCase();
	  //Recorremos mensajeCodificado
	  for(int i=0;i<mensajeCodificado.length();i=i+2){
		  if(i+1==mensajeCodificado.length()){
			  //Sumamos a temporal la letra del string mensajeCodificado en la posicion i 
			  temporal=temporal+mensajeCodificado.charAt(i);
		  }else {
			//Sumamos a temporal la letra del string mensajeCodificado en la posicion i+1 y en la posicion i 
			  temporal = temporal+mensajeCodificado.charAt(i+1)+mensajeCodificado.charAt(i);
		  }
	  }
	  mensajeCodificado=temporal;
	  
	  System.out.println(mensajeCodificado);
	  
  }
}


