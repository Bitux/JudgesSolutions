public class Soccer{
    
    public int maxPoints(int[] wins, int[] ties){
        int an = 0;
    	int guardando;
        for(int i = 0; i<wins.length; i++){
        	guardando = (wins[i]*3)+ties[i];            
            if(guardando>an){
            	an=guardando;
            }
        }
      return an;  
    }
}
