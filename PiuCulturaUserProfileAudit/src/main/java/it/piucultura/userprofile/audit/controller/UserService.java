package it.piucultura.userprofile.audit.controller;

import it.piucultura.userprofile.audit.PiuCulturaUserProfileAuditApplication;
import it.piucultura.userprofile.audit.model.LogUser;
import it.piucultura.userprofile.audit.model.User;
import it.piucultura.userprofile.audit.utils.CounterSingleton;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;

/**
 * Created by earthshrek on 06/06/2017.
 */
@RestController
@RequestMapping(value = "/piucultura/rest/api")

public class UserService {
    private static final Logger log = LoggerFactory.getLogger("it.piucultura.simulatore");

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public HashMap<Long, User> getAllUsers() {

        return PiuCulturaUserProfileAuditApplication.hmUser;
    }


    // Get all users
    @RequestMapping(value = "/all", method = RequestMethod.GET)
    public HashMap<Long, User> getAllStudents() {

        return PiuCulturaUserProfileAuditApplication.hmUser;
    }
//Insert data

    /**
     *
     * @param name
     * @param subject
     * @return
     */
    /**
     * [USER]  	: 	identificativo univoco utente nel sistema.
     * [QUESTION ID] 	:  rapresenta sempre la domanda stessa o la domanda a cui si riferisce.
     * <p>
     * [Q/A/D]		: tipologia di richiesta.. Domanda, Risposta, Approfondimento.
     * [QUESTION/ANSWER]	: la domanda/risposta in linguaggio naturale.
     * [IMAGE DESCRIPTION]  	: Descrittore del immagine
     * [LINKS] 	: 	Link file multimediali
     */


    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public LogUser addRequest(
            @RequestParam(value = "user", required=true) String user,
            @RequestParam(value = "questionId",required=false, defaultValue = "0") Integer questionId,
            @RequestParam(value = "type",required=false, defaultValue = "Q") String type,
            @RequestParam(value = "questionAnswer", required=true) String questionAnswer,
            @RequestParam(value = "imageDescription", required=false, defaultValue = "") String imageDescription,
            @RequestParam(value = "links", required=false, defaultValue = "")  String links

    ) {

//        System.out.println("entry generalRequest questionId:"+questionId);
//        log.info("entry generalRequest questionId:"+questionId +" "+questionId.getClass().getName());

int counterS = 0;
if (questionId!=null )
    counterS = questionId;
else
    counterS = CounterSingleton.getInstance().getCounter();


        LogUser logUser  = new LogUser(user,questionId,type,questionAnswer,imageDescription,links);



        log.info(logUser.toString());

       // PiuCulturaUserProfileAuditApplication.hmUser.put(new Long(logUser.getId()), logUser);


        return logUser;

    }


    // Specializzazione
    //CHI/DEFINIZIONE

    @RequestMapping(value = "/chi/definizione", method = RequestMethod.POST)
    public User addUserChi(@RequestParam(value = "name") String name
            , @RequestParam(value = "subject", defaultValue = "unknown") String subject) {

        User user = new User(name, subject);
        log.info("user: " + user.toString());

        PiuCulturaUserProfileAuditApplication.hmUser.put(new Long(user.getId()), user);

        return user;

    }


    @RequestMapping(value = "/addAll", method = RequestMethod.POST)
    public User updateStudent(@RequestBody User user) throws Exception {

        log.info("user: " + user.toString());

        return user;
    }


}
