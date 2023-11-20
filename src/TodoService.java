public interface TodoService {
    ResponseEntity<?> createTodo(TodoRequest todoRequest, String username);
    ResponseEntity<?> getTodoById(Long todoId, String username);
    ResponseEntity<?> getAllTodos(String username);
    ResponseEntity<?> updateTodo(Long todoId, TodoRequest todoRequest, String username);
    ResponseEntity<?> completeTodo(Long todoId, String username);
    // 추가적인 할 일 관련 메서드들 필요
}
