package p000;

import android.hardware.location.ContextHubClient;
import android.hardware.location.ContextHubInfo;
import android.hardware.location.ContextHubManager;
import android.hardware.location.NanoAppMessage;
import java.util.ArrayList;
import java.util.List;

/* renamed from: ecn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ecn {

    /* renamed from: c */
    private static ecn f14684c;

    /* renamed from: a */
    public final List f14685a = new ArrayList();

    /* renamed from: b */
    public boolean f14686b;

    /* renamed from: d */
    private final ContextHubManager f14687d = ((ContextHubManager) dwq.m9662f().getSystemService("contexthub"));

    /* renamed from: e */
    private ContextHubClient f14688e;

    private ecn() {
    }

    /* renamed from: a */
    public static final NanoAppMessage m10109a(int i, byte[] bArr) {
        return NanoAppMessage.createMessageToNanoApp(5147455389092024337L, i, bArr);
    }

    /* renamed from: f */
    private final boolean m10111f() {
        ContextHubManager contextHubManager = this.f14687d;
        if (contextHubManager == null) {
            return false;
        }
        if (this.f14688e != null) {
            return true;
        }
        List contextHubs = contextHubManager.getContextHubs();
        if (contextHubs.isEmpty()) {
            bnsl bnsl = (bnsl) dss.f13961a.mo68387b();
            bnsl.mo68432a("ecn", "f", 166, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68405a("[ShushGestureSensor] Context hub handle not found");
            return false;
        }
        ContextHubClient createClient = this.f14687d.createClient((ContextHubInfo) contextHubs.get(0), new ecm(this));
        this.f14688e = createClient;
        return createClient != null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0042, code lost:
        if (r0 != null) goto L_0x0044;
     */
    /* renamed from: b */
    public final aucb mo9962b() {
        ContextHubManager contextHubManager = this.f14687d;
        if (contextHubManager != null) {
            if (this.f14688e == null) {
                List contextHubs = contextHubManager.getContextHubs();
                if (contextHubs.isEmpty()) {
                    bnsl bnsl = (bnsl) dss.f13961a.mo68387b();
                    bnsl.mo68432a("ecn", "f", 166, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                    bnsl.mo68405a("[ShushGestureSensor] Context hub handle not found");
                } else {
                    ContextHubClient createClient = this.f14687d.createClient((ContextHubInfo) contextHubs.get(0), new ecm(this));
                    this.f14688e = createClient;
                }
            }
            aucf aucf = new aucf();
            this.f14687d.queryNanoApps(this.f14688e.getAttachedHub()).setOnCompleteListener(new eck(aucf), dwq.m9667k().mo9432a(dqy.m9123a("ShushGestureSensor_check_gesture_availability")));
            return aucf.f91388a;
        }
        return aucu.m76778a((Object) false);
    }

    /* renamed from: c */
    public final void mo9963c() {
        ContextHubClient contextHubClient = this.f14688e;
        if (contextHubClient != null) {
            contextHubClient.close();
            this.f14688e = null;
        }
    }

    /* renamed from: d */
    public final void mo9964d() {
        if (!this.f14686b) {
            mo9962b().mo50371a(new ecl(this));
            this.f14686b = true;
        }
    }

    /* renamed from: e */
    public final void mo9965e() {
        if (this.f14686b) {
            this.f14686b = false;
            mo9964d();
        }
    }

    /* renamed from: a */
    public static ecn m10110a() {
        if (f14684c == null) {
            f14684c = new ecn();
        }
        return f14684c;
    }

    /* renamed from: a */
    public final void mo9960a(NanoAppMessage nanoAppMessage) {
        ContextHubClient contextHubClient = this.f14688e;
        if (contextHubClient != null) {
            contextHubClient.sendMessageToNanoApp(nanoAppMessage);
        }
    }

    /* renamed from: a */
    public final void mo9961a(dyj dyj) {
        this.f14685a.remove(dyj);
        if (this.f14685a.isEmpty() && this.f14686b && this.f14688e != null) {
            mo9960a(m10109a(2, new byte[0]));
            mo9963c();
            this.f14686b = false;
        }
    }
}
