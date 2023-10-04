package poo.LISTA2;

public class L2_2_Ponto2D {

    private double x;
    private double y;
    
    //construtores
    public L2_2_Ponto2D(){
        this.x = 0;
        this.y = 0;
    }
    
    public L2_2_Ponto2D(double x, double y){
        this.x = x;
        this.y = y;
    }
    
    public L2_2_Ponto2D(L2_2_Ponto2D obj){
        this.x = obj.getX();
        this.y = obj.getY();
    }
    //getters and setters 
    public double getX() {
        return this.x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return this.y;
    }

    public void setY(double y) {
        this.y = y;
    }
    
    //metodos da classe
    
    public void movimentacao(){
        
        this.x += 1;
        this.y += 2.5;
    }
    
    public void movimentacao(double x, double y){
        
        this.x += x;
        this.y += y;
        
    }
    
    public void movimentacao(L2_2_Ponto2D obj){
        
        this.x += obj.getX();
        this.y += obj.getY();
        
    }
    
    public boolean equals(L2_2_Ponto2D obj){
                            
        return (this.x == obj.getX() && this.y == obj.getY());
    }
    
    public String toString(){
        String saida = "X: " + this.x + " Y : " + this.y;
        return saida;
    }
    
    public String distanciaPontos(L2_2_Ponto2D obj){
        double distanciax = this.x - obj.getX();
        double distanciay = this.y - obj.getY();
        
        String saida = "Distancia entre os pontos : " + distanciax + " e " + distanciay;
        return saida;
    }
    
    public L2_2_Ponto2D clone( ){
        L2_2_Ponto2D novoponto = new L2_2_Ponto2D();
        novoponto.setX(this.x);
        novoponto.setY(this.y);
        return novoponto;
    }
}
