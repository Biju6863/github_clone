import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RegistrationController {

    @PostMapping("/register")
    public String registerUser(@RequestBody User user) {
        System.out.println("Received name: " + user.name); 
        return "User registered with name: " + user.name;
    }
}
