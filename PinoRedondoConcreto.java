public class PinoRedondoConcreto implements PinoRedondo{
    
    double raio;

    public PinoRedondoConcreto(double raio){
        
        this.raio = raio;
    }

    @Override
    public double getRaio(){
        
        return this.raio;
    }
    
}