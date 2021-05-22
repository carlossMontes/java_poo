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
		
	// Metodo para alimentar a la mascota
	public String alimentar() {
		String msj;
		int vida = getVida();
		
		// Si la mascota tiene 100 o más, no se suma. Si tiene 0 esta muerta, no suma. Si tiene entre 10 y 90 suma.
		if (vida >= 100) {
			msj = "Tu mascota ya se encuenta al 100%, mejor golpealo";
		} else if (vida == 0) {
			msj = "No puedes alimentar a tu mascota porque se encuentra muerta. Intenta revivirla";
		} 
		else {
			vida = (byte) (vida + 10);
			setVida(vida);
			msj = "Alimentación correcta. Tu mascota ahora tiene " + vida + "% de vida";
		}
		
		return msj;
	}

	// Metodo para golpear a la mascota
	public String golpear() {
		String msj;
		int vida = getVida();
		int vidaAct;
		
		// Si la mascota tiene 0, ya esta muerta. Si tiene 10, la mata. Si tiene entre 20 y 100 le resta 10
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
	
	// Metodo para revivir a la mascota
	public String revivir() {
		String msj;
		int vida = getVida();
		
		// Si tiene 0 de vida, se revivie. Caso contrario tiene vida y no realiza nada
		if (vida > 0) {
			msj = "Tu mascota se encuentra con vida, no es necesario revivirla";
		} else {
			setVida(vida + 10);
			msj = "Tu mascota ha sido golpeada. Ahora tiene " + getVida() + "% de vida, recuerda alimentarla";
		}
		
		return msj;
	}
	
	// Metodo para matar a la mascota
	public String matar() {
		String msj;
		int vida = getVida();
		
		//Si tiene 0 de vida, ya esta muerta, no realiza nada. Si tiene vida, se mata
		if (vida == 0) {
			msj = "Tu mascota ya se encuentra muerta ):";
		} else {
			setVida(0);
			msj = "Tu mascata acaba de morir ):";
		}
		
		return msj;
	}
}
