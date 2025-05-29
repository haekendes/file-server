package itx.fileserver.dto;

public record FileAccessFilter(
        String path,
        AccessType accessType) {
}
