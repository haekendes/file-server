package itx.fileserver.dto;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import itx.fileserver.enums.Category;
import lombok.Getter;

@Getter
public class AuditRecord {

    private final Long timestamp;
    private final Category category;
    private final Category action;
    private final String userId;
    private final String resource;
    private final String message;
    private final String data;

    @JsonCreator
    public AuditRecord(@JsonProperty("timestamp") Long timestamp,
                       @JsonProperty("category") Category category,
                       @JsonProperty("userId") String userId,
                       @JsonProperty("resource") String resource,
                       @JsonProperty("message") String message,
                       @JsonProperty("data") String data) {
        this.timestamp = timestamp;
        this.category = category;
        this.action = category;
        this.userId = userId;
        this.resource = resource;
        this.message = message;
        this.data = data;
    }

}
