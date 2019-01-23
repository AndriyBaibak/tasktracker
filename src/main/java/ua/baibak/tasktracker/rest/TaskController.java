package ua.baibak.tasktracker.rest;


import org.springframework.http.HttpEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/task")
public class TaskController {

    @RequestMapping(value = "/create", method = RequestMethod.POST)
    public HttpEntity<?> createTask() {
        return new HttpEntity<>();
    }

}
