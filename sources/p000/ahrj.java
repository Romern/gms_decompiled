package p000;

import java.io.IOException;

/* renamed from: ahrj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ahrj extends ahlm {

    /* renamed from: b */
    private final aiwb f67878b;

    private ahrj(aiwb aiwb) {
        super(aiwb.f69126a, aiwb.f69925c.getInputStream(), aiwb.f69925c.getOutputStream());
        this.f67878b = aiwb;
    }

    /* renamed from: a */
    public static ahrj m56422a(aiwb aiwb) {
        try {
            return new ahrj(aiwb);
        } catch (IOException e) {
            return null;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final void mo36804f() {
        try {
            this.f67878b.close();
        } catch (IOException e) {
            bnsl bnsl = (bnsl) ahkm.f67363a.mo68390d();
            bnsl.mo68437a(e);
            bnsl.mo68420a("Failed to close underlying socket for WifiDirectEndpointChannel %s", this.f67450a);
        }
    }

    /* renamed from: l */
    public final bvif mo36865l() {
        return bvif.WIFI_DIRECT;
    }
}
