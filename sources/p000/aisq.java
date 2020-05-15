package p000;

import org.webrtc.SdpObserver;
import org.webrtc.SessionDescription;

/* renamed from: aisq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class aisq implements SdpObserver {
    public void onCreateFailure(String str) {
        bnsl bnsl = (bnsl) ailf.f69111a.mo68388c();
        bnsl.mo68432a("aisq", "onCreateFailure", 22, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        bnsl.mo68420a("SdpObserver.onCreateFailure %s.", str);
    }

    public void onCreateSuccess(SessionDescription sessionDescription) {
        bnsl bnsl = (bnsl) ailf.f69111a.mo68390d();
        bnsl.mo68432a("aisq", "onCreateSuccess", 12, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        bnsl.mo68420a("SdpObserver.onCreateSuccess %s.", sessionDescription.f192048a);
    }

    public void onSetFailure(String str) {
        bnsl bnsl = (bnsl) ailf.f69111a.mo68388c();
        bnsl.mo68432a("aisq", "onSetFailure", 27, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        bnsl.mo68420a("SdpObserver.onSetFailure %s.", str);
    }

    public void onSetSuccess() {
        bnsl bnsl = (bnsl) ailf.f69111a.mo68390d();
        bnsl.mo68432a("aisq", "onSetSuccess", 17, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        bnsl.mo68405a("SdpObserver.onSetSuccess.");
    }
}
