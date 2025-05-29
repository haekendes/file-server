package itx.fileserver.enums;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum FileAccess implements Category {
    NAME("FILE_ACCESS"),
    LIST_DIR("LIST_DIR"),
    DOWNLOAD("DOWNLOAD"),
    UPLOAD("UPLOAD"),
    DELETE("DELETE"),
    CREATE_DIR("CREATE_DIR"),
    MOVE("MOVE");

    private final String value;
}
