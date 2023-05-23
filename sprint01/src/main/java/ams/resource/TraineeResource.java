package ams.resource;

import ams.model.entity.Trainee;
import ams.service.TraineeService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/trainees")
public class TraineeResource {
    private final TraineeService traineeService;

    public TraineeResource(TraineeService traineeService) {
        this.traineeService = traineeService;
    }
    @PostMapping("/createNewTrainee")
    public Trainee createNewTrainee(Trainee trainee){
        return traineeService.create(trainee);
    }
}
