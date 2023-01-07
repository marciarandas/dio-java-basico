public class Usuario {
    public static void main(String[] args) throws Exception {
        SmartTv smartTv = new SmartTv();

        System.out.println("TV ligada?" +smartTv.ligada);
        System.out.println("Volume atual?" +smartTv.volume);
        System.out.println("Canal atual ?" +smartTv.canal);

        smartTv.mudarCanal(13);
        System.out.println("Novo canal" +smartTv.canal);

        

        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.aumentarVolume();

        System.out.println("O volume atual é ?"+ smartTv.volume);

        smartTv.ligar ();
        System.out.println("Novo status - TV ligada?" +smartTv.ligada );
    }

   
}
