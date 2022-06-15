import javax.sound.sampled.*;
import java.io.File;
import java.io.IOException;
public class Music extends Thread {
    private String fileName;
    private final int EXTERNAL_BUFFER_SIZE = 524288;
    public Music() {
        this.fileName = "/home/sina/IdeaProjects/BJ/Sounds/music.wav";
    }
    @SuppressWarnings("unused")
    public void run() {
        File soundFile = new File(fileName); // The file name of the music to play
        if (!soundFile.exists()) {
            System.err.println("Wave file not found:" + fileName);
            return;
        }

            AudioInputStream audioInputStream = null; // Create an audio input stream object
            try {
                audioInputStream = AudioSystem.getAudioInputStream(soundFile); // Create audio objects
            } catch (UnsupportedAudioFileException e1) {
                e1.printStackTrace();
                return;
            } catch (IOException e1) {
                e1.printStackTrace();
                return;
            }
            AudioFormat format = audioInputStream.getFormat(); // Audio format
            SourceDataLine auline = null; // Source data line
            DataLine.Info info = new DataLine.Info(SourceDataLine.class, format);
            try {
                auline = (SourceDataLine) AudioSystem.getLine(info);
                auline.open(format);
            } catch (LineUnavailableException e) {
                e.printStackTrace();
                return;
            } catch (Exception e) {
                e.printStackTrace();
                return;
            }
            if (auline.isControlSupported(FloatControl.Type.PAN)) {
                FloatControl pan = (FloatControl) auline.getControl(FloatControl.Type.PAN);
            }
            auline.start();
            int nBytesRead = 0;
            byte[] abData = new byte[EXTERNAL_BUFFER_SIZE];
            try {
                while (nBytesRead != -1) {
                    nBytesRead = audioInputStream.read(abData, 0, abData.length);
                    if (nBytesRead >= 0)
                        auline.write(abData, 0, nBytesRead);
                }
            } catch (IOException e) {
                e.printStackTrace();
                return;
            } finally {
                auline.drain();
// auline.close();
            }

    }
}