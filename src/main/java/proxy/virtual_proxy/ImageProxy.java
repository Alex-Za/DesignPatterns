package proxy.virtual_proxy;

import proxy.virtual_proxy.interfaces.Icon;

import java.net.URL;

public class ImageProxy implements Icon {
    ImageIcon imageIcon;
    URL imageUrl;
    Thread retrievingThread;
    boolean retrieving = false;

    public ImageProxy(URL imageUrl) {
        this.imageUrl = imageUrl;
    }

    @Override
    public int getIconWidth() {
        if (imageIcon != null) {
            return imageIcon.getIconWidth();
        } else {
            return 800;
        }
    }

    @Override
    public int getIconHeight() {
        if (imageIcon != null) {
            return imageIcon.getIconHeight();
        } else {
            return 600;
        }
    }

    @Override
    public void paintIcon() {
        if (imageIcon != null) {
            imageIcon.paintIcon();
        } else {
            System.out.println("Loading CD cover, please wait...");
            //loading data from ImageIcon
        }
    }
}
