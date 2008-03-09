/* This file is part of SableCC ( http://sablecc.org ).
 *
 * See the NOTICE file distributed with this work for copyright information.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.sablecc.sablecc.exception;

import org.sablecc.sablecc.syntax3.node.Token;

/**
 * A semantic exception is thrown when a logic error is found in a grammar.
 */
public class SemanticException
        extends Exception {

    /** Serial version identifier for serialization */
    private static final long serialVersionUID = 155544165804671040L;

    /** The token of this semantic exception. */
    private Token token;

    /**
     * Constructs a semantic exception with the provided error message and
     * token.
     */
    public SemanticException(
            String message,
            Token token) {

        super("[" + token.getLine() + "," + token.getPos() + "] " + message);

        if (message == null) {
            throw new InternalException("message may not be null");
        }

        if (token == null) {
            throw new InternalException("token may not be null");
        }

        this.token = token;
    }

    /**
     * Constructs a semantic exception with the provided error message, token
     * and cause.
     */
    public SemanticException(
            String message,
            Token token,
            Throwable cause) {

        super("[" + token.getLine() + "," + token.getPos() + "] " + message,
                cause);

        if (message == null) {
            throw new InternalException("message may not be null");
        }

        if (token == null) {
            throw new InternalException("token may not be null");
        }

        if (cause == null) {
            throw new InternalException("cause may not be null");
        }

        this.token = token;
    }

    /**
     * Returns the token of this semantic exception.
     */
    public Token getToken() {

        return this.token;
    }
}
