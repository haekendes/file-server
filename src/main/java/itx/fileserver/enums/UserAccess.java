package itx.fileserver.enums;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum UserAccess {
    NAME("ADMIN_ACCESS"),
    GET_USERS("GET_USERS"),
    CREATE_USER("CREATE_USER"),
    DELETE_USER("DELETE_USER"),
    GET_ACCESS_FILTERS("GET_ACCESS_FILTERS"),
    CREATE_ACCESS_FILTER("CREATE_ACCESS_FILTER"),
    DELETE_ACCESS_FILTER("DELETE_ACCESS_FILTER");

    private final String value;
}
