package ex.EmailDecorator;

public class BasicEmail implements iEmail{

    private String message;
    
    @Override
    public String getContents() {
        return message;
    }

    @Override
    public String sendEmail() {
       return "Email enviado!";
    }
    
}
