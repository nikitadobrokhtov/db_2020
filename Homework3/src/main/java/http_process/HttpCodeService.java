package http_process;

import com.sun.net.httpserver.HttpPrincipal;

public class HttpCodeService {



    public void processHttp(String text) {
        //todo dgasfdjgsafd  httpcode: 404   sjdghfkjdshgafsdah
        int endOfKeyWord = text.indexOf("httpcode:") + 8 + 1;
        while (!Character.isDigit(text.charAt(endOfKeyWord))){
            endOfKeyWord++;
        }

        int httpCode = Integer.parseInt(text.substring(endOfKeyWord, endOfKeyWord + 3));

        int k = 1;

        if (httpCode >= 100 && httpCode< 200){
            HttpScenario httpScenario = HttpScenario.INFORMATIONAL;
            httpScenario.codeReaction(httpCode);
        } else if(httpCode >= 200 && httpCode< 300){
            HttpScenario httpScenario = HttpScenario.SUCCESS;
            httpScenario.codeReaction(httpCode);
        } else if(httpCode >= 300 && httpCode< 400){
            HttpScenario httpScenario = HttpScenario.REDIRECTION;
            httpScenario.codeReaction(httpCode);
        } else if(httpCode >= 400 && httpCode< 500){
            HttpScenario httpScenario = HttpScenario.CLIENT_ERROR;
            httpScenario.codeReaction(httpCode);
        } else if(httpCode >= 500 && httpCode< 600){
            HttpScenario httpScenario = HttpScenario.SERVER_ERROR;
            httpScenario.codeReaction(httpCode);
        }
    }


}