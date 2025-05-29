package itx.fileserver.dto;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import itx.fileserver.enums.Action;
import lombok.Getter;

@Getter
public class AuditRecord {

    private final Long timestamp;
    private final Class<? extends Action> category;
    private final Action action;
    private final String userId;
    private final String resource;
    private final String message;
    private final String data;

    @JsonCreator
    public AuditRecord(@JsonProperty("timestamp") Long timestamp,
                       @JsonProperty("action") Action action,
                       @JsonProperty("userId") String userId,
                       @JsonProperty("resource") String resource,
                       @JsonProperty("message") String message,
                       @JsonProperty("data") String data) {
        this.timestamp = timestamp;
        this.category = action.getClass();
        this.action = action;
        this.userId = userId;
        this.resource = resource;
        this.message = message;
        this.data = data;
    }

}
