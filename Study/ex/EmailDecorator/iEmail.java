package ex.EmailDecorator;

public interface iEmail {
    
    public String getContents();

    public default String sendEmail(){
        return "email enviado!";
    }

}
