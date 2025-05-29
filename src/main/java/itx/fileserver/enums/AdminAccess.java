package itx.fileserver.enums;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum AdminAccess implements Category {
    NAME("USER_ACCESS"),
    LOGIN("LOGIN"),
    LOGOUT("LOGOUT");

    private final String value;
}
