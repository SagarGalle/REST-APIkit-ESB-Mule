
package org.mule.leagues.exceptions;

import org.mule.module.apikit.MuleRestException;

public class ConflictException extends MuleRestException {

    private static final long serialVersionUID = 3387516993124229969L;

    public ConflictException(String message) {
        super(message);
    }
}
