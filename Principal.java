public class Principal {
    public static void main(String[] args) {
        
        
        BuracoRedondo buracoRedondo = new BuracoRedondo(10);
        PinoRedondoConcreto pinoRedondo = new PinoRedondoConcreto(10);
        System.out.println("Verificando se o pino redondo encaixa: " + buracoRedondo.encaixa(pinoRedondo));

        
        PinoQuadrado pinoQuadrado = new PinoQuadrado(10);
        AdaptadorPinoQuadrado adaptador = new AdaptadorPinoQuadrado(pinoQuadrado);
        System.out.println("Verificando se o pino quadrado encaixa: " + buracoRedondo.encaixa(adaptador));
    }
}