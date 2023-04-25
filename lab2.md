Code of `String Server`
```
import java.io.IOException;
import java.net.URI;
import java.util.ArrayList;

class Handler3 implements URLHandler {
    ArrayList<String> str = new ArrayList<>(); 

    public String handleRequest(URI url) {
        
        if (url.getPath().equals("/add-message")) {
            String[] parameters = url.getQuery().split("=");
            if (parameters[0].equals("s")){

                str.add(parameters[1]);
                return String.join("\n",str) + "\n";
 
            }         
        }
        return "";
    }
}


class StringServer {
    public static void main(String[] args) throws IOException {
        if(args.length == 0){
            System.out.println("Missing port number! Try any number between 1024 to 49151");
            return;
        }

        int port = Integer.parseInt(args[0]);

        Server.start(port, new Handler3());
    }
}
```
![Image](1.png)
When calling the main method, the handleRequest method is called to add string, server.start() is called to start the service.
`http://localhost:7600/add-message?s=Hello`
`url` is http://localhost:7600/add-message?s=Hello
`parameters[0]` is `s`
`parameter[1]` is `Hello`
`str` is `Hello`
`port` is `7600`
Everything just got updated beacuse it is the first time calling the method.
![Image](2.png)
Same thing happended when when calling `http://localhost:7600/add-message?s=lab2`
`url` is http://localhost:7600/add-message?s=lab2
`parameters[0]` is `s`
`parameter[1]` is `lab2`
`str` is `Hello` and `lab2`
`port` is `7600`
For the second time, only the ArrayList `str` changed by adding another string to it.
