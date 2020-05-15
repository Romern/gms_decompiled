package org.webrtc;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public enum MediaSource$State {
    INITIALIZING,
    LIVE,
    ENDED,
    MUTED;

    static MediaSource$State fromNativeIndex(int i) {
        return values()[i];
    }
}
