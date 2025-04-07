package com.certificate;

import com.certificate.models.UserInfo;
import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class CertificateGenerator {

    private String templatePath = "C:/Users/hp22r/GenerateCertiAndMailer/src/main/resources/TechnoManthan.png";

    public void generateCertificate(UserInfo userInfo, String outputPath) {
        try {

            BufferedImage certificateTemplate = ImageIO.read(new File(templatePath));

            //New BufferedImage with same dimensions & type to retain quality
            BufferedImage certificateImage = new BufferedImage(
                    certificateTemplate.getWidth(),
                    certificateTemplate.getHeight(),
                    BufferedImage.TYPE_INT_ARGB
            );

            Graphics2D g2d1 = certificateImage.createGraphics();

            //To maintain original dimensions and type
            g2d1.drawImage(certificateTemplate, 0, 0, null);

            //Anti-aliasing for better text & shape quality
            g2d1.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
            g2d1.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING, RenderingHints.VALUE_TEXT_ANTIALIAS_ON);
            g2d1.setRenderingHint(RenderingHints.KEY_RENDERING, RenderingHints.VALUE_RENDER_QUALITY);

            g2d1.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 36));
            g2d1.setColor(Color.BLACK);
            g2d1.drawString(userInfo.getName(), 590,555);  // Name position
            g2d1.drawString(userInfo.getCollegeName(), 590,662); // CollegeName position

            //g2d1.setFont(new Font("Arial", Font.PLAIN, 14));
            //g2d1.drawString(userInfo.getCertificateId(), 151, 795); // Certificate ID position

            //Save generated certificate
            ImageIO.write(certificateImage, "png", new File(outputPath));

            g2d1.dispose();
        } catch (IOException e) {
            System.err.println("Error generating certificate for: " + userInfo.getName());
            e.printStackTrace();
        }
    }
}
