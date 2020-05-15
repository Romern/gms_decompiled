package p000;

import java.io.IOException;

/* renamed from: ahms */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class ahms extends ahlm {

    /* renamed from: b */
    private final aipa f67571b;

    private ahms(aipa aipa) {
        super(aipa.f69126a, aipa.f69407c.getInputStream(), aipa.f69407c.getOutputStream());
        this.f67571b = aipa;
    }

    /* renamed from: a */
    static ahms m56191a(aipa aipa) {
        try {
            return new ahms(aipa);
        } catch (IOException e) {
            return null;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final void mo36804f() {
        try {
            this.f67571b.close();
        } catch (IOException e) {
            bnsl bnsl = (bnsl) ahkm.f67363a.mo68390d();
            bnsl.mo68437a(e);
            bnsl.mo68420a("Failed to close underlying socket for BluetoothEndpointChannel %s", this.f67450a);
        }
    }

    /* renamed from: k */
    public final int mo36809k() {
        return (int) cfnv.f184625a.mo6606a().mo81850r();
    }

    /* renamed from: l */
    public final bvif mo36865l() {
        return bvif.BLUETOOTH;
    }
}
