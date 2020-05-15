package p000;

import java.io.IOException;

/* renamed from: ahrn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class ahrn extends ahlm {

    /* renamed from: b */
    private final aiwf f67887b;

    private ahrn(aiwf aiwf) {
        super(aiwf.f69126a, aiwf.f69929c.getInputStream(), aiwf.f69929c.getOutputStream());
        this.f67887b = aiwf;
    }

    /* renamed from: a */
    static ahrn m56434a(aiwf aiwf) {
        try {
            return new ahrn(aiwf);
        } catch (IOException e) {
            return null;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final void mo36804f() {
        try {
            this.f67887b.close();
        } catch (IOException e) {
            bnsl bnsl = (bnsl) ahkm.f67363a.mo68390d();
            bnsl.mo68437a(e);
            bnsl.mo68420a("Failed to close underlying socket for WifiLanEndpointChannel %s", this.f67450a);
        }
    }

    /* renamed from: l */
    public final bvif mo36865l() {
        return bvif.WIFI_LAN;
    }
}
