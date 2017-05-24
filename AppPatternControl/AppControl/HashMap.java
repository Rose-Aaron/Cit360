package appcontrol;

import java.util.HashMap;

public class ApplicationController {
    private HashMap<String,Handler> hMap = new HashMap();

    public void handleRequest(String command, HashMap<String,Object> data){
        Handler isAuthenticUser = hMap.get(command);
        if (isAuthenticUser != null){
            isAuthenticUser.handleIt(data);
        }
    }

    public void mapCommand(String aCommand, Handler acHandler){
        hMap.put(aCommand,acHandler);
    }
}
