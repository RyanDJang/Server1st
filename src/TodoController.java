import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import serviceImpl.CommentServiceImpl;
import serviceImpl.TodoServiceImpl;

@RestController
@RequestMapping("/api")
public class TodoController {

    @Autowired
    private AuthServiceImpl authService;

    @Autowired
    private TodoServiceImpl todoService;

    @Autowired
    private CommentServiceImpl commentService;

    // 나중에 API 메서드들을 여기에 추가해야 됨
}
