package p000;

import android.net.wifi.WifiManager;
import java.util.Locale;

/* renamed from: ainm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ainm extends WifiManager.LocalOnlyHotspotCallback {

    /* renamed from: a */
    final /* synthetic */ bqgy f69262a;

    /* renamed from: b */
    final /* synthetic */ aiof f69263b;

    public ainm(aiof aiof, bqgy bqgy) {
        this.f69263b = aiof;
        this.f69262a = bqgy;
    }

    public final void onFailed(int i) {
        String str;
        bqgy bqgy = this.f69262a;
        Object[] objArr = new Object[1];
        if (i != 1) {
            str = i != 2 ? i != 3 ? i != 4 ? "UNKNOWN" : "ERROR_TETHERING_DISALLOWED" : "ERROR_INCOMPATIBLE_MODE" : "ERROR_GENERIC";
        } else {
            str = "ERROR_NO_CHANNEL";
        }
        objArr[0] = String.format(Locale.ENGLISH, "[%d]%s", Integer.valueOf(i), str);
        bqgy.mo69136a((Throwable) new RuntimeException(String.format("Failed to start local only hotspot: %s.", objArr)));
    }

    public final void onStarted(WifiManager.LocalOnlyHotspotReservation localOnlyHotspotReservation) {
        this.f69262a.mo69138b(localOnlyHotspotReservation);
    }

    public final void onStopped() {
        bnsl bnsl = (bnsl) ailf.f69111a.mo68387b();
        bnsl.mo68432a("ainm", "onStopped", 555, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        bnsl.mo68405a("Local only hotspot was stopped manually by the user.");
        this.f69263b.mo37750e();
    }
}
