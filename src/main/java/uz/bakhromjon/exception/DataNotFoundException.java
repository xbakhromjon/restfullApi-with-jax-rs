package uz.bakhromjon.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.glassfish.jersey.server.model.RuntimeResource;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class DataNotFoundException extends RuntimeException {

    public DataNotFoundException(String message) {
        super(message);
    }
}
