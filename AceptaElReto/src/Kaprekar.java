import java.util.*;

public class Kaprekar{

    public static String numString, nR="", nD="";       //Generamos las Strings;
    public static char[] nRev;
    public static String[] numArray;
    public static int nMayor, contador, diferencia;


    public static Scanner sc = new Scanner(System.in);

    public static void main(String[]args){

        int veces = sc.nextInt();               // Numero de casos a evaluar
        String[] numArray = new String[veces];
        for(int i=0; i<veces; i++){             // Llena un array con los casos 
        	numArray[i]= sc.next();             // respectivos
        }

        for(int j=0; j<numArray.length; j++){ // Ejecutamos la funcion     
            contador=0;
            kaprekarNum(numArray[j]);         // para cada caso 
        }
    }

    public static int kaprekarNum(String numM){

        String nR=""; nD="";        
        if(numM.length()<4){            //Evitamos bucle
            for(int z=4-numM.length(); z>0; z--){
				numM+='0';
			}	
        }
		nRev = numM.toCharArray();         // cadena a arreglo de chars

		Arrays.sort(nRev);                // Organizar ascend el arreglo
        if(nRev[0]==nRev[3]){
            contador=8;
            System.out.println(contador);
            return 0;
        }
		nMayor = Integer.parseInt(numM);  //Verificamos que # != 6174

		if(nMayor==6174){            
			System.out.println(contador);
            return 0;
		}       

        for(int i=0; i<nRev.length; i++){    
            nR+=nRev[nRev.length-1-i];      
            nD+=nRev[i];
        }        

        //System.out.print(nR+" ");                
        //System.out.print(nD+" ");

		// Convertimos to Int y comparamos.
		int num1 = Integer.parseInt(nR), num2 = Integer.parseInt(nD);

		if(num1>num2){
			diferencia = num1-num2;
            contador+=1;
		}else{
            contador+=1;
			diferencia = num2-num1;
		}
        //System.out.println(contador+" "+diferencia+"\n")
        return kaprekarNum(Integer.toString(diferencia));
    }	
}
