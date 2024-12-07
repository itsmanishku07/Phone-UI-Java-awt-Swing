import java.awt.Desktop;
import java.io.File;
import java.io.IOException;

class Music
{
	public static void main(String[] args) throws IOException {
		File file = new File("C:\\Users\\manis\\Desktop\\music.mp3");
		Desktop desk = Desktop.getDesktop();
		desk.open(file);
	}
}