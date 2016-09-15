

import javax.media.opengl.GL;

public class Mundo {
	private GL gl;
	private Camera camera;
	private ObjetoGrafico objetos;
	private Ponto4D ponto;

	private static Mundo uniqueInstance = null;

	protected Mundo() {
	}

	public static Mundo getInstace() {
		if (uniqueInstance == null) {
			return new Mundo();
		}

		return uniqueInstance;
	}

	public GL getGl() {
		return gl;
	}

	public void setGl(GL gl) {
		this.gl = gl;
	}

	public Camera getCamera() {
		return camera;
	}

	public void setCamera(Camera camera) {
		this.camera = camera;
	}

	public ObjetoGrafico getObjetos() {
		return objetos;
	}

	public void setObjetos(ObjetoGrafico objetos) {
		this.objetos = objetos;
	}

	public Ponto4D getPonto() {
		return ponto;
	}

	public void setPonto(Ponto4D ponto) {
		this.ponto = ponto;
	}

}
