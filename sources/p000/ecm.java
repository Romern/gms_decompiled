package p000;

import android.hardware.location.ContextHubClient;
import android.hardware.location.ContextHubClientCallback;
import android.hardware.location.NanoAppMessage;
import java.util.List;

/* renamed from: ecm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class ecm extends ContextHubClientCallback {

    /* renamed from: a */
    final /* synthetic */ ecn f14683a;

    public ecm(ecn ecn) {
        this.f14683a = ecn;
    }

    public final void onHubReset(ContextHubClient contextHubClient) {
        this.f14683a.mo9965e();
    }

    public final void onMessageFromNanoApp(ContextHubClient contextHubClient, NanoAppMessage nanoAppMessage) {
        if (nanoAppMessage.getNanoAppId() == 5147455389092024337L) {
            new Object[1][0] = nanoAppMessage.toString();
            int messageType = nanoAppMessage.getMessageType();
            if (messageType != 3 && messageType != 4) {
                if (messageType == 5) {
                    List list = this.f14683a.f14685a;
                    int size = list.size();
                    for (int i = 0; i < size; i++) {
                        ((dyj) list.get(i)).mo9870a(true);
                    }
                } else if (messageType != 6) {
                    bnsl bnsl = (bnsl) dss.f13961a.mo68388c();
                    bnsl.mo68432a("ecm", "onMessageFromNanoApp", 297, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                    bnsl.mo68405a("[ShushGestureSensor] Unrecognized nano app message.");
                } else {
                    List list2 = this.f14683a.f14685a;
                    int size2 = list2.size();
                    for (int i2 = 0; i2 < size2; i2++) {
                        ((dyj) list2.get(i2)).mo9870a(false);
                    }
                }
            }
        }
    }

    public final void onNanoAppLoaded(ContextHubClient contextHubClient, long j) {
        new Object[1][0] = Long.valueOf(j);
        if (j == 5147455389092024337L) {
            this.f14683a.mo9965e();
        }
    }
}
