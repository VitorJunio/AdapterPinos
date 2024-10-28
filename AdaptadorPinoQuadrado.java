public class AdaptadorPinoQuadrado implements PinoRedondo{
    
    private PinoQuadrado pinoQuadrado;

    public AdaptadorPinoQuadrado(PinoQuadrado pinoQuadrado){
        
        this.pinoQuadrado = pinoQuadrado;
        
    }

    @Override
    public double getRaio() {
        
        return pinoQuadrado.largura() * Math.sqrt(2) / 2;
        
    }
}