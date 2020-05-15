package p000;

import java.io.IOException;

/* renamed from: ahow */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class ahow extends ahlm {

    /* renamed from: b */
    private final airy f67676b;

    private ahow(airy airy) {
        super(airy.f69126a, airy.f69607d, airy.f69608e);
        this.f67676b = airy;
    }

    /* renamed from: a */
    static ahow m56298a(airy airy) {
        try {
            return new ahow(airy);
        } catch (IOException e) {
            return null;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final void mo36804f() {
        try {
            this.f67676b.close();
        } catch (IOException e) {
            bnsl bnsl = (bnsl) ahkm.f67363a.mo68390d();
            bnsl.mo68437a(e);
            bnsl.mo68420a("Failed to close underlying socket for NearFieldCommunicationEndpointChannel %s", this.f67450a);
        }
    }

    /* renamed from: k */
    public final int mo36809k() {
        return (int) cfnv.f184625a.mo6606a().mo81789av();
    }

    /* renamed from: l */
    public final bvif mo36865l() {
        return bvif.NFC;
    }
}
