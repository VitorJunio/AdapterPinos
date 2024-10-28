public class BuracoRedondo {
    double raio;

    public boolean encaixa(PinoRedondo pino) {
        
        return pino.getRaio() <= this.raio;
        
    }
    
}