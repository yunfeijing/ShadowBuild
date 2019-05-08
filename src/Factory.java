import org.newdawn.slick.Graphics;
import org.newdawn.slick.Image;
import org.newdawn.slick.SlickException;

public class Factory extends Buildings{
	
	public static final String IMAGE_LOCATION = "assets/buildings/factory.png";
	
	public Factory(float x, float y) throws SlickException {
		super(x, y);
		super.setImage(new Image(IMAGE_LOCATION));
	}

	@Override
	public void update(World world) {
		// TODO Auto-generated method stub
		
	}
	
}
