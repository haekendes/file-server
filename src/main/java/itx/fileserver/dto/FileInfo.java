package itx.fileserver.dto;

public record FileInfo(
        String filePath,
        long size,
        long lastModified) {
}
