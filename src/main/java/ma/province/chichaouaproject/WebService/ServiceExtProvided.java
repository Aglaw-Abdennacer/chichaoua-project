package ma.province.chichaouaproject.WebService;

import ma.province.chichaouaproject.bean.ServiceExt;
import ma.province.chichaouaproject.service.ServiceExtService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/chichaouaProject/ServiceExt")
public class ServiceExtProvided {

    @GetMapping("/codeServiceExt/{codeServiceExt}")
    public ServiceExt findByCodeServiceExt(@PathVariable long codeServiceExt) {
        return serviceExtService.findByCodeServiceExt(codeServiceExt);
    }

    @GetMapping("/")
    public List<ServiceExt> findAll() {
        return serviceExtService.findAll();
    }

    @PostMapping("/")
    public int saveServicExt(@RequestBody ServiceExt serviceExt) {
        return serviceExtService.saveServicExt(serviceExt);
    }

    @Autowired
    private ServiceExtService serviceExtService;
}
