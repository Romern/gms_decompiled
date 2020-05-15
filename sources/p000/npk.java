package p000;

import java.io.PrintWriter;
import java.util.concurrent.ExecutorService;

/* renamed from: npk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class npk implements okh, ojn {

    /* renamed from: a */
    public static final bnsn f36331a = odk.m28481a("CAR.WIFI_PROJ");

    /* renamed from: b */
    public oki f36332b;

    /* renamed from: c */
    volatile boolean f36333c;

    /* renamed from: d */
    public String f36334d;

    /* renamed from: e */
    public final oln f36335e;

    /* renamed from: f */
    public volatile nnn f36336f;

    public npk(oln oln) {
        this.f36335e = oln;
    }

    /* renamed from: a */
    public final ofs mo20914a(bivb bivb) {
        if ((bivb.f121923a & 8192) == 0) {
            return null;
        }
        biwu biwu = bivb.f121933k;
        if (biwu == null) {
            biwu = biwu.f122129b;
        }
        this.f36334d = biwu.f122131a;
        return this;
    }

    /* renamed from: a */
    public final void mo20649a(PrintWriter printWriter) {
        throw null;
    }

    /* renamed from: c */
    public final void mo20658c() {
        throw null;
    }

    /* renamed from: a */
    public final ojh mo20646a(ojm ojm) {
        return new oki(this, ojm);
    }

    /* renamed from: a */
    public final void mo21420a() {
        this.f36335e.mo22280d();
        if (this.f36333c) {
            oki oki = this.f36332b;
            if (oki == null) {
                bnsi c = f36331a.mo68388c();
                c.mo68432a("npk", "a", 98, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                c.mo68405a("Tried to send a wifi credentials request before the end point was ready.");
            } else if (!oki.f37852b) {
                bnsi d = oki.f37850a.mo68390d();
                d.mo68432a("oki", "c", 89, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                d.mo68405a("sendWifiCredentialsRequest on closed channel");
            } else {
                oki.mo22206a(32769, biws.f122120a);
            }
        } else {
            throw new IllegalStateException("CarNotConnected");
        }
    }

    /* renamed from: a */
    public final void mo21421a(String str, String str2, biww biww, int[] iArr) {
        if (this.f36336f == null) {
            bnsi c = f36331a.mo68388c();
            c.mo68432a("npk", "a", 115, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            c.mo68405a("no listener set for onWifiCredentialsResponse event");
            return;
        }
        nnn nnn = this.f36336f;
        ExecutorService ax = noj.m26951ax();
        ax.execute(new nnm(nnn, str, str2, biww));
        ax.shutdown();
    }

    /* renamed from: a */
    public final void mo20651a(ojh ojh) {
        this.f36332b = (oki) ojh;
        this.f36333c = true;
    }
}
