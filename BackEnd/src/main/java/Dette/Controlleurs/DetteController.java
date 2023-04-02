package Dette.Controlleurs;

import Dette.DTO.Mappers.Convert;
import Dette.DTO.Objects.SignaletiqueDTO;
import Dette.Entites.Classes.Banque;
import Dette.Repositories.BanqueRepository;
import Dette.Repositories.SignaletiqueRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("api/v1/dette")
@CrossOrigin("*")
public class DetteController {

    @Autowired
    BanqueRepository banqueRepository;
    @Autowired
    SignaletiqueRepository signaletiqueRepository;
    @Autowired
    Convert convert;

    @GetMapping("/All")
    List<Banque> getAllBanks(){
        return banqueRepository.findAll();
    }

    @GetMapping("/Signals")
    List<SignaletiqueDTO> getAllSignal(){
        return signaletiqueRepository.findAll().stream().map(f->convert.mapIn(f)).collect(Collectors.toList());
    }
}
