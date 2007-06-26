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

package org.sablecc.sablecc.automaton;

import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Set;

import org.sablecc.sablecc.exception.InternalException;

public final class NfaState<T extends Comparable<? super T>> {

    private final String name;

    private Set<NfaTransition<T>> forwardTransitions;

    private Set<NfaTransition<T>> backwardTransitions;

    private boolean isStable;

    public NfaState(
            String name) {

        if (name == null) {
            throw new InternalException("name may not be null");
        }

        this.name = name;
        this.forwardTransitions = new LinkedHashSet<NfaTransition<T>>();
        this.backwardTransitions = new LinkedHashSet<NfaTransition<T>>();
        this.isStable = false;
    }

    public String getName() {

        return this.name;
    }

    public Set<NfaTransition<T>> getForwardTransitions() {

        if (!this.isStable) {
            throw new InternalException("the state is not stable yet");
        }

        return this.forwardTransitions;
    }

    public Set<NfaTransition<T>> getBackwardTransitions() {

        if (!this.isStable) {
            throw new InternalException("the state is not stable yet");
        }

        return this.backwardTransitions;
    }

    @Override
    public String toString() {

        return this.name;
    }

    void addForwardTransition(
            NfaTransition<T> transition) {

        if (transition == null) {
            throw new InternalException("transition may not be null");
        }

        if (transition.getSource() != this) {
            throw new InternalException(
                    "transition source must be this instance");
        }

        if (this.isStable) {
            throw new InternalException("a stable state may not be modified");
        }

        this.forwardTransitions.add(transition);
    }

    void addBackwardTransition(
            NfaTransition<T> transition) {

        if (transition == null) {
            throw new InternalException("transition may not be null");
        }

        if (transition.getDestination() != this) {
            throw new InternalException(
                    "transition destination must be this instance");
        }

        if (this.isStable) {
            throw new InternalException("a stable state may not be modified");
        }

        this.backwardTransitions.add(transition);
    }

    void removeForwardTransition(
            NfaTransition<T> transition) {

        if (transition == null) {
            throw new InternalException("transition may not be null");
        }

        if (transition.getSource() != this) {
            throw new InternalException(
                    "transition source must be this instance");
        }

        if (this.isStable) {
            throw new InternalException("a stable state may not be modified");
        }

        if (!this.forwardTransitions.remove(transition)) {
            throw new InternalException("corrupted data structure");
        }

    }

    void removeBackwardTransition(
            NfaTransition<T> transition) {

        if (transition == null) {
            throw new InternalException("transition may not be null");
        }

        if (transition.getDestination() != this) {
            throw new InternalException(
                    "transition destination must be this instance");
        }

        if (this.isStable) {
            throw new InternalException("a stable state may not be modified");
        }

        if (!this.backwardTransitions.remove(transition)) {
            throw new InternalException("corrupted data structure");
        }
    }

    public void stabilize() {

        if (this.isStable) {
            throw new InternalException("state is already stable");
        }

        this.forwardTransitions = Collections
                .unmodifiableSet(this.forwardTransitions);
        this.backwardTransitions = Collections
                .unmodifiableSet(this.backwardTransitions);
        this.isStable = true;
    }

}