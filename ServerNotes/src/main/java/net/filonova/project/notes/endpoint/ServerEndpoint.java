package net.filonova.project.notes.endpoint;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/debug")
// REVU SettingsEndpoint лучше
public class ServerEndpoint {

    @GetMapping(value = "/settings")
    public String getServerSettings() {
        return null;
    }

    @PostMapping(value = "/clear")
    public void clearDatabase() {

    }


}
