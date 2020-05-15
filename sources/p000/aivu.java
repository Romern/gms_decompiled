package p000;

import android.net.wifi.aware.DiscoverySession;
import java.util.concurrent.ExecutionException;

/* renamed from: aivu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aivu extends airo {

    /* renamed from: a */
    public aivx f69898a;

    /* renamed from: b */
    private final aivn f69899b;

    /* renamed from: c */
    private final aiug f69900c;

    /* renamed from: d */
    private final aivw f69901d;

    /* renamed from: e */
    private final String f69902e;

    /* renamed from: f */
    private final ahfk f69903f;

    public aivu(aivn aivn, aiug aiug, aivw aivw, String str, ahfk ahfk) {
        super(53, ahfk);
        this.f69899b = aivn;
        this.f69900c = aiug;
        this.f69901d = aivw;
        this.f69902e = str;
        this.f69903f = ahfk;
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x00a7  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x00ae A[RETURN] */
    /* renamed from: b */
    public final int mo37568b() {
        aivx aivx;
        aitq aitq;
        aivg a = this.f69899b.mo38120a(this.f69901d);
        aiug aiug = this.f69900c;
        String str = this.f69902e;
        ahfk ahfk = this.f69903f;
        short a2 = bqct.m112601a(a.f69865a.f69912d);
        DiscoverySession discoverySession = a.f69865a.f69911c;
        if (aiug.f69783f.mo38043b(a2)) {
            srn srn = ailf.f69111a;
            ails.m57438a(aiug.f69778a.mo38105d());
            aivx = null;
        } else {
            aiug.f69783f.mo38041a(a2, a);
            bqgy c = bqgy.m112818c();
            aiug.f69780c.execute(new aitt(aiug, a, ahfk, str, a2, c));
            try {
                aiug.f69779b.mo38012a(discoverySession);
                aivx aivx2 = (aivx) c.get();
                aiug.f69779b.mo38021b(discoverySession);
                aivx = aivx2;
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                bnsl bnsl = (bnsl) ailf.f69111a.mo68387b();
                bnsl.mo68432a("aiug", "a", 432, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl.mo68405a("Interrupted while waiting to connect to WiFi Aware network");
                aitq = aiug.f69779b;
            } catch (ExecutionException e2) {
                bnsl bnsl2 = (bnsl) ailf.f69111a.mo68387b();
                bnsl2.mo68437a(e2);
                bnsl2.mo68432a("aiug", "a", 434, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl2.mo68405a("Failed to connect to WiFi Aware network");
                aitq = aiug.f69779b;
            } catch (Throwable th) {
                aiug.f69779b.mo38021b(discoverySession);
                throw th;
            }
        }
        this.f69898a = aivx;
        if (aivx == null) {
            return mo37899a(54);
        }
        return 3;
        aitq.mo38021b(discoverySession);
        aiug.f69783f.mo38045d(a2);
        aivx = null;
        this.f69898a = aivx;
        if (aivx == null) {
        }
    }
}
