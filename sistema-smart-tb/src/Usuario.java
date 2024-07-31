public class Usuario {
    public static void main(String[] args) throws Exception{
        SmartTv smartTv = new SmartTv();

        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.aumentarVolume();

        System.out.println("TV Ligada : " + smartTv.ligada);
        System.out.println("TV Canal : " + smartTv.canal);
        System.out.println("TV Volume : " + smartTv.volume);

        smartTv.ligar();
        System.out.println("Novo Status -> TV Ligada : " + smartTv.ligada);
        

        smartTv.mudarCanal(15);
        System.out.println("TV Canal : " + smartTv.canal);
    
    }
}
