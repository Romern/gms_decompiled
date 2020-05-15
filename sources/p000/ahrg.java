package p000;

import java.io.IOException;

/* renamed from: ahrg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class ahrg extends ahlm {

    /* renamed from: b */
    private final aivx f67868b;

    private ahrg(aivx aivx) {
        super(aivx.f69126a, aivx.f69913c.getInputStream(), aivx.f69913c.getOutputStream());
        this.f67868b = aivx;
    }

    /* renamed from: a */
    static ahrg m56414a(aivx aivx) {
        try {
            return new ahrg(aivx);
        } catch (IOException e) {
            return null;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final void mo36804f() {
        try {
            this.f67868b.close();
        } catch (IOException e) {
            bnsl bnsl = (bnsl) ahkm.f67363a.mo68390d();
            bnsl.mo68437a(e);
            bnsl.mo68420a("Failed to close underlying Socket for WifiAwareEndpointChannel %s", this.f67450a);
        }
    }

    /* renamed from: l */
    public final bvif mo36865l() {
        return bvif.WIFI_AWARE;
    }
}
