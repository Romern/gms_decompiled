package p000;

import java.io.IOException;

/* renamed from: ahmp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class ahmp extends ahlm {

    /* renamed from: b */
    private final aiqc f67562b;

    private ahmp(aiqc aiqc) {
        super(aiqc.f69126a, aiqc.mo37636a(), aiqc.mo37638b());
        this.f67562b = aiqc;
    }

    /* renamed from: a */
    static ahmp m56181a(aiqc aiqc) {
        try {
            return new ahmp(aiqc);
        } catch (IOException e) {
            return null;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final void mo36804f() {
        try {
            this.f67562b.close();
        } catch (IOException e) {
            bnsl bnsl = (bnsl) ahkm.f67363a.mo68390d();
            bnsl.mo68437a(e);
            bnsl.mo68420a("Failed to close underlying socket for BleEndpointChannel %s", this.f67450a);
        }
    }

    /* renamed from: k */
    public final int mo36809k() {
        return this.f67562b.mo37842e();
    }

    /* renamed from: l */
    public final bvif mo36865l() {
        return bvif.BLE;
    }
}
