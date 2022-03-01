package Observer;

import java.io.File;

public class WhatsAppListener implements EventListener {
    private String number;
    public WhatsAppListener(String number) {
        this.number = number;
    }
    @Override
    public void update(String eventType, File file) {
        System.out.println("SMS to " + number + ": Someone has performed "
         + eventType + " operation with the following file: " + file.getName());
    }
}
