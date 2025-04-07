package com.certificate;

import com.certificate.models.UserInfo;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;

@WebServlet("/generate")
public class GenerateCertificateServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String name = request.getParameter("name");
        String course = request.getParameter("course");
        String email = request.getParameter("email");
        String date = request.getParameter("date");

        UserInfo user = new UserInfo(name, course, email, date);

        // Generate certificate
        CertificateGenerator generator = new CertificateGenerator();
        String certPath = generator.generate(user);

        // Send email with certificate
        EmailSender sender = new EmailSender();
        sender.sendCertificate(email, certPath);

        response.sendRedirect("success.jsp");
    }
}
