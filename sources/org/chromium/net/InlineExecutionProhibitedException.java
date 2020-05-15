package org.chromium.net;

import java.util.concurrent.RejectedExecutionException;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class InlineExecutionProhibitedException extends RejectedExecutionException {
    public InlineExecutionProhibitedException() {
        super("Inline execution is prohibited for this request");
    }
}
