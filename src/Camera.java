
import javax.media.opengl.glu.GLU;

public class Camera {
	private GLU glu;

	private static Camera uniqueInstance = null;

	protected Camera() {
		// Exists only to defeat instantiation.
	}

	public static Camera getInstance() {
		if (uniqueInstance == null) {
			uniqueInstance = new Camera();
		}
		return uniqueInstance;
	}

	public GLU getGlu() {
		return glu;
	}

	public void setGlu(GLU glu) {
		this.glu = glu;
	}

}
