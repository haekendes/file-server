package itx.fileserver.dto;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

import java.util.ArrayList;
import java.util.List;


@Getter
@RequiredArgsConstructor
public class FileList {

    private final String path;
    private final List<FileInfo> fileInfo = new ArrayList<>();
    private final List<DirectoryInfo> directoryInfo = new ArrayList<>();

    public void add(FileInfo fileInfo) {
        this.fileInfo.add(fileInfo);
    }

    public void add(DirectoryInfo directoryInfo) {
        this.directoryInfo.add(directoryInfo);
    }

}
