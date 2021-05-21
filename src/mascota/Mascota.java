package mascota;

public class Mascota {
	// Atributos
	private String nombre;
	private byte vida;
	
	// Constructores
	// Constructor por defecto
	public Mascota() {
		this.nombre = "Sin nombre";
		this.vida = 100;
	}
	
	public Mascota(String nombre, byte vida) {
		this.nombre = nombre;
		this.vida = vida;
	}
	
	// Metodos
	public String getNombre() {
		return this.nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public byte getVida() {
		return this.vida;
	}
	
	public void setVida(byte vida) {
		this.vida = vida;
	}
	
	public String alimentar() {
		String msj;
		byte vida = getVida();
		
		if (vida >= 100) {
			msj = "Tu mascota ya se encuenta al 100%, mejor golpealo";
		} else {
			vida = (byte) (vida + 10);
			setVida(vida);
			msj = "Alimentación correcta. Tu mascota ahora tiene " + vida + "% de vida";
		}
		
		return msj;
	}
	
	public String golpear() {
		String msj;
		byte vida = getVida();
		byte vidaAct;
		
		if (vida == 0) {
			msj = "Tu mascota ya se encuentra muerta. Intenta revivirla";
		} else if(vida == 10) {
			vidaAct = (byte) (vida - 10);
			setVida(vidaAct);
			msj = "Tu mascota ha muerto";
		} else {
			vidaAct = (byte) (vida - 10);
			setVida(vidaAct);
			msj = "Tu mascota ha sido golpeada. Ahora tiene " + getVida() + "% de vida";
		}
		
		return msj;
	}
}
