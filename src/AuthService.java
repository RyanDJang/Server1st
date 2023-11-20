import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class AuthService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    public void registerUser(RegisterRequest registerRequest) {
        // username 중복확인
        if (userRepository.existsByUsername(registerRequest.getUsername())) {
            throw new RuntimeException("중복된 username 입니다.");
        }

        // 비밀번호를 데이터베이스에 저장하기 전 Encode
        String encodedPassword = passwordEncoder.encode(registerRequest.getPassword());

        User user = new User();
        user.setUsername(registerRequest.getUsername());
        user.setPassword(encodedPassword);

        userRepository.save(user);
    }

    public String loginUser(LoginRequest loginRequest) {
        User user = userRepository.findByUsername(loginRequest.getUsername())
                .orElseThrow(() -> new RuntimeException("회원을 찾을 수 없습니다."));

        // 비밀번호가 일치하는지 확인
        if (!passwordEncoder.matches(loginRequest.getPassword(), user.getPassword())) {
            throw new RuntimeException("회원을 찾을 수 없습니다.");
        }

        // 성공적인 로그인일시 JWT토큰 반환
        return "generated_jwt_token";
    }
}
