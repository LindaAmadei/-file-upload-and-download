//inizio: creato i vari layers, aggiungo dipendenze commons IO, settaggio di application yml. Poi inizio a popolare i layers


package co.develhope.UploaderDownloader.controller;

import co.develhope.UploaderDownloader.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/file")
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @PostMapping("/{id}/profile")
    public void uploadProfileImage(){

    }

    @GetMapping
    public void getAll(){

    }

    @GetMapping("/{id}")
    public void getOne(){

    }

    @GetMapping("/{id}/profile")
    public void getProfilePicture(){

    }

    @PutMapping("/{id}")
    public void update(){

    }

    @DeleteMapping("/{id}")
    public void delete(){

    }
}
