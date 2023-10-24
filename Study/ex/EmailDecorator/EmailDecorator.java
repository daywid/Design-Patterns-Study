package ex.EmailDecorator;

public abstract class EmailDecorator implements iEmail{

    private iEmail decoratedEmail;

    @Override
    public String getContents() {
        return decoratedEmail.getContents();
    }

    @Override
    public String sendEmail() {
        return decoratedEmail.sendEmail();
    }
    
}
