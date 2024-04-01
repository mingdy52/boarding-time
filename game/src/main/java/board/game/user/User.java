package board.game.user;

import board.game.com.CommonVO;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class User extends CommonVO {
    private String id;
    private String email;
    private String password;
    private String role;
    private String token;

}
