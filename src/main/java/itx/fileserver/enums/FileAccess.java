package itx.fileserver.enums;

public enum FileAccess implements Action {
    LIST_DIR,
    DOWNLOAD,
    UPLOAD,
    DELETE,
    CREATE_DIR,
    MOVE
}
