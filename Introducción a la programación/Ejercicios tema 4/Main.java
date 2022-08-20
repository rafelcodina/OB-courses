public class Main {
    public static void main(String[] args) {
        // if
        int numeroIf = -1;
        if (numeroIf<0){
            System.out.println("numeroIf: " + numeroIf + " --> negativo");
        }
        else if(numeroIf>0){
            System.out.println("numeroIf: " + numeroIf + " --> positivo");
        } 
        else {
            System.out.println("numeroIf es 0");
        }
    
        //while
        int numeroWhile = 0;
        while(numeroWhile < 3){
            numeroWhile++;
            System.out.println("numeroWhile: " + numeroWhile);
        }

        //do while
        int numeroDoWhile = 3;
        do{
            numeroDoWhile++;
            System.out.println("numeroDoWhile: " + numeroDoWhile);
        }while(numeroDoWhile < 3);

        // for
        for(int numeroFor = 0; numeroFor <= 3; numeroFor++){
            System.out.println("numeroFor: " + numeroFor);
        }

        //switch
        String estacion = "verano";
        switch(estacion) {
            case "verano":
                System.out.println("Ahora es verano");
                break;
            case "invierno":
                System.out.println("Ahora es invierno");
                break;
            case "primavera":
                System.out.println("Ahora es primavera");
                break;
            case "otoño":
                System.out.println("Ahora es otoño");
                break;
            default:
                System.out.println("Esta variable no es una estación");
        }

    }

}
