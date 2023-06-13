package github.jeanalvesr.exceptions;

public class EntityNotFound extends RuntimeException{
    public EntityNotFound(String msg){
        super(msg);
    }
}
