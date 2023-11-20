package serviceImpl;

public interface CommentServiceImpl {
    ResponseEntity<?> createComment(CommentRequest commentRequest, Long todoId, String username);
    ResponseEntity<?> updateComment(Long commentId, CommentRequest commentRequest, String username);
    ResponseEntity<?> deleteComment(Long commentId, String username);
    // 추가적인 댓글 관련 메서드들 필요
}
