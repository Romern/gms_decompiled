package org.webrtc;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public interface SdpObserver {
    void onCreateFailure(String str);

    void onCreateSuccess(SessionDescription sessionDescription);

    void onSetFailure(String str);

    void onSetSuccess();
}
