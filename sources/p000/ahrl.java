package p000;

import java.io.IOException;

/* renamed from: ahrl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class ahrl extends ahlm {

    /* renamed from: b */
    private final ahov f67882b;

    /* renamed from: c */
    private final aiwd f67883c;

    public ahrl(ahov ahov, aiwd aiwd) {
        super(aiwd.f69126a, aiwd.f69926c.getInputStream(), aiwd.f69926c.getOutputStream());
        this.f67882b = ahov;
        this.f67883c = aiwd;
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final void mo36804f() {
        ahov ahov;
        try {
            this.f67883c.close();
            ahov = this.f67882b;
        } catch (IOException e) {
            bnsl bnsl = (bnsl) ahkm.f67363a.mo68390d();
            bnsl.mo68437a(e);
            bnsl.mo68420a("Failed to close underlying socket for WifiHotspotEndpointChannel %s", this.f67450a);
            ahov = this.f67882b;
        } catch (Throwable th) {
            this.f67882b.mo36927d();
            throw th;
        }
        ahov.mo36927d();
    }

    /* renamed from: l */
    public final bvif mo36865l() {
        return bvif.WIFI_HOTSPOT;
    }
}
