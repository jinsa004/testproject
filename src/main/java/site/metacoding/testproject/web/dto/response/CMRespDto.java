package site.metacoding.testproject.web.dto.response;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Getter
public class CMRespDto<T> {
    private Integer code;
    private String msg;
    private T data;
}
