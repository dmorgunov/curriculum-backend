package dm.dev.curriculum.controllers;

import dm.dev.curriculum.exception.ResourceNotFoundException;
import dm.dev.curriculum.model.Curriculum;
import dm.dev.curriculum.repository.CurriculumRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/curriculum")
public class CurriculumController {
    private final CurriculumRepository curriculumRepository;

    @GetMapping("")
    public Iterable<Curriculum> getAll(Pageable p) {
        return curriculumRepository.findAll(p);
    }

    @GetMapping("/{id}")
    public Curriculum getAll(@PathVariable Long id) {
        return curriculumRepository.findById(id)
                .orElseThrow(ResourceNotFoundException::new);
    }

}
