package mascota;

public class Mascota {
	// Atributos
	private String nombre;
	private int vida;
	
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
	// Getters and Setters
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getVida() {
		return vida;
	}

	public void setVida(int vida) {
		this.vida = vida;
	}
		
	
	public String alimentar() {
		String msj;
		int vida = getVida();
		
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
		int vida = getVida();
		int vidaAct;
		
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
