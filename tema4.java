public class Main {

   public static void main(String[] args) {
       int numeroIf = 0;
       int numeroWhile = 0;
       int numeroFor = 0;
       var estacion = "primavera";

       if (numeroIf > 0) {
           System.out.println(numeroIf);
       } else if (numeroIf<0){
           System.out.println(numeroIf);
       } else {
           System.out.println(numeroIf);
       }

       while (numeroWhile < 3) {
           numeroWhile = numeroWhile + 1;
           System.out.println(numeroWhile);
       }

       do {
        numeroWhile = numeroWhile + 1;
        
       } while (numeroWhile < 3); 
        System.out.println(numeroWhile);

       for (;numeroFor <= 3; numeroFor = numeroFor + 1) {
          System.out.println(numeroFor);
       }

       switch (estacion) {
           case "primavera":
             System.out.println("Es primavera");
               break;
             
           case "verano":
             System.out.println("Es verano");
               break;
           
           case "invierno":
             System.out.println("Es invierno");
               break;
             
           case "otoño":
             System.out.println("Es otoño");
               break;  
       
           default:
             System.out.println("No es una estacion");
               break;
       }
           
   }


}
