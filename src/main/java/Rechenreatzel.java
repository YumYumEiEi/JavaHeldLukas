public class Rechenreatzel {
    public static void main(String[] args) {

        for (int x = 0; x < 10; x++){
            for (int o = 0; o < 10; o++){
                for (int l = 0; l < 10; l++){
                    for(int t = 0; t < 10; t++){
                        int ersteZahl = x*100 + o*10 + l;
                        int zweiteZahl = l*100 + x*10 + x;
                        int ergebnis = t*100 + l*10 + t;

                        if(ersteZahl + zweiteZahl == ergebnis){
                            if(x!=o && x!=l && x!=t && o!=l && o!=t && l!=t ){
                                System.out.println(">> " + ersteZahl + " + " + zweiteZahl + " = " + ergebnis + " <<");
                            }else{
                                System.out.println("   " + ersteZahl + " + " + zweiteZahl + " = " + ergebnis + "   ");
                            }
                        }
                    }
                }
            }
        }
    }
}
