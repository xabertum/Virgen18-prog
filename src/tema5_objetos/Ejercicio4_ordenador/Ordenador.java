package tema5_objetos.Ejercicio4_ordenador;

public class Ordenador {

    private int memoriaRAM;
    private String CPU;
    private String SO;
    
    
    /*******CONSTRUCTOR******/
    
    public Ordenador() {
	
	this.memoriaRAM = 5;
	this.CPU = "Intel dual Core";
	this.SO = "Windows 7";
	
    }

    
    /********** GETTERS and SETTERS*******/
    public int getMemoriaRAM() {
        return memoriaRAM;
    }

    public void setMemoriaRAM(int memoriaRAM) {
        this.memoriaRAM = memoriaRAM;
    }

    public String getCPU() {
        return CPU;
    }

    public void setCPU(String cPU) {
        CPU = cPU;
    }

    public String getSO() {
        return SO;
    }

    public void setSO(String sO) {
        SO = sO;
    }   
    
    
    
    
    
    
    
    
    
    
    
}
