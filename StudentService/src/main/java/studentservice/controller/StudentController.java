package studentservice.controller;


import com.gain.java.knowledge.api.StudentApi;
import com.gain.java.knowledge.api.model.Student;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.NativeWebRequest;


import java.util.List;
import java.util.Optional;

@RestController
public class StudentController implements StudentApi {

    @Override
    public Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    @Override
    public ResponseEntity<Void> addStudent(String correlationId, Student student) {
        return null;
    }

    @Override
    public ResponseEntity<List<Student>> getAllStudent(String correlationId) {
        return null;
    }
}
