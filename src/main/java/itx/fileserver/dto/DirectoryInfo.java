package itx.fileserver.dto;

public record DirectoryInfo(
        String filePath,
        long lastModified) {
}
