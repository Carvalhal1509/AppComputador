package trabalhojava;
public class Computador{
    //5 atributos
    private String modelo;
    private String marca;
    private float valor;
    private int hd;
    private boolean pcUsado;
    //construtor sem parâmetros
    public Computador() {}
    //construtor com os 5 atributos
    public Computador(String modelo, String marca, float valor, int hd,boolean pcUsado) {
        super();
        this.modelo = modelo;
        this.marca = marca;
        this.valor = valor;
        this.hd = hd;
        this.pcUsado = pcUsado;
}
//metodo imprimir 
    public static String imprimir(Computador computador1, Computador computador2, Computador computador3, Computador computador4) {
        return  System.lineSeparator() + "*****************COMPUTADORES*****************" +
                System.lineSeparator() + "Computador 1: " + computador1.toString() +
                System.lineSeparator() + "*********************************************" +
                System.lineSeparator() + "Computador 2: " + computador2.toString() +
                System.lineSeparator() + "*********************************************" +
                System.lineSeparator() + "Computador 3: " + computador3.toString() +
                System.lineSeparator() + "*********************************************" +
                System.lineSeparator() + "Computador 4: " + computador4.toString();
    }
    //metodo toString (imprimir o objeto)
    @Override
    public String toString() {
        return " marca = " + marca + ",modelo = " + modelo + ", valor = " + valor + ", MemoriaHD = " + hd
                + ", Usado = " + pcUsado;
    }
    //metodos de acesso (setters e getters)
    public String getNome(){
        return modelo;
    }
    public void setNome(String modelo){
    this.modelo = modelo;
    }
    public String getMarca(){
       return marca;
    }
    public void setMarca(String marca){
        this.marca = marca;
    }
    public float getValor(){
        return valor;
    }
    public void setValor(float valor){
        this.valor = valor;
    }
    public int getMemoriaHD(){
        return hd;
    }
    public void setMemoriaHD(int hd){
        this.hd = hd;
    }
    public boolean isPcUsado(){
        return pcUsado;
    }
    public void setPcUsado(boolean pcUsado){
        this.pcUsado = pcUsado;
    }
}

