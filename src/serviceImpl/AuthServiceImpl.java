package serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class CommentServiceImpl implements CommentService {

    @Autowired
    private CommentRepository commentRepository;

    // 댓글 관련 메서드 구현
    @Override
    public ResponseEntity<?> createComment(CommentRequest commentRequest, Long todoId, String username) {
        // 구현 내용
    }

    @Override
    public ResponseEntity<?> updateComment(Long commentId, CommentRequest commentRequest, String username) {
        // 구현 내용
    }

    // 나머지 댓글 관련 메서드들...
}
