import java.util.ArrayList;

public class MessagingService {
    
    private ArrayList<Message> list;

    public MessagingService(){

        this.list = new ArrayList<>();

    }

    public void add(Message message){
        String msg = message.getContent();
        if(msg.length()<=280){
            list.add(message);
        }
    }

    public ArrayList<Message> getMessages(){
        return list;
    }

}
