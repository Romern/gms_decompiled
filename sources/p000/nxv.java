package p000;

import android.os.Build;
import android.telephony.PhoneStateListener;
import com.felicanetworks.sdu.ErrorInfo;

/* renamed from: nxv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class nxv extends PhoneStateListener {

    /* renamed from: a */
    final /* synthetic */ nxw f36899a;

    public nxv(nxw nxw) {
        this.f36899a = nxw;
    }

    public final void onCallStateChanged(int i, String str) {
        bnsi d = nxw.f36900a.mo68390d();
        d.mo68432a("nxv", "onCallStateChanged", 24, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        d.mo68409a("Call state change: %d", i);
        if (i == 0) {
            boolean z = this.f36899a.f36902c;
            this.f36899a.f36902c = false;
            if (z) {
                njj njj = this.f36899a.f36904e.f35795a;
                if (ccuf.f179931a.mo6606a().mo76786B()) {
                    int i2 = Build.VERSION.SDK_INT;
                    if (ccsh.f179839a.mo6606a().mo76714d()) {
                        bnsi d2 = njj.f35801a.mo68390d();
                        d2.mo68432a("njj", "g", 119, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                        d2.mo68405a("Skip audio capture reset in Q and above");
                        int streamMaxVolume = njj.f35812l.getStreamMaxVolume(3);
                        bnsi d3 = njj.f35801a.mo68390d();
                        d3.mo68432a("njj", "f", 110, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                        d3.mo68409a("Setting volume of STREAM_MUSIC to maximum: %d", streamMaxVolume);
                        njj.f35812l.setStreamVolume(3, streamMaxVolume, 0);
                        return;
                    }
                    int i3 = Build.VERSION.SDK_INT;
                    int i4 = Build.VERSION.SDK_INT;
                    bnsi d4 = njj.f35801a.mo68390d();
                    d4.mo68432a("njj", "e", (int) ErrorInfo.TYPE_SDU_COMMUNICATIONERROR, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                    d4.mo68405a("Reset audio capture after telephone abandons focus.");
                    njj.f35810j.mo20876a(0);
                    return;
                }
                return;
            }
            return;
        }
        this.f36899a.f36902c = true;
    }
}
