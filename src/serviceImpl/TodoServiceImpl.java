package serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class TodoServiceImpl implements TodoService {

    @Autowired
    private TodoRepository todoRepository;

    // 할 일 관련 메서드 구현
    @Override
    public ResponseEntity<?> createTodo(TodoRequest todoRequest, String username) {
        // 구현 내용
    }

    @Override
    public ResponseEntity<?> getTodoById(Long todoId, String username) {
        // 구현 내용
    }

    // 나머지 할 일 관련 메서드들 필요
}
