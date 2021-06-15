package dm.dev.curriculum.model;

import lombok.Data;

@Data
public class UploadDetail {
    private long fileSize;
    private String fileName;
    private String uploadStatus;

}