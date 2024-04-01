package board.game.game;

import board.game.com.CommonVO;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Game extends CommonVO {
    private String name;    // 이름
    private String desc;    // 설명
    private Float avgVal;   // 평균 점수

    private int maxPlayer;  // 최대 플레이어 수
    private int minPlayer;  // 최소 플레이어 수

    private String age;     // 연령


}
