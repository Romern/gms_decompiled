package p000;

import java.io.IOException;

/* renamed from: ahrc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class ahrc extends ahlm {

    /* renamed from: b */
    private final aisv f67858b;

    private ahrc(aisv aisv) {
        super(aisv.f69126a, aisv.f69657e, aisv.f69659g);
        this.f67858b = aisv;
    }

    /* renamed from: a */
    static ahrc m56404a(aisv aisv) {
        return new ahrc(aisv);
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final void mo36804f() {
        try {
            this.f67858b.close();
        } catch (IOException e) {
            bnsl bnsl = (bnsl) ahkm.f67363a.mo68390d();
            bnsl.mo68437a(e);
            bnsl.mo68420a("Failed to close underlying socket for WebRtcEndpointChannel %s", this.f67450a);
        }
    }

    /* renamed from: l */
    public final bvif mo36865l() {
        return bvif.WEB_RTC;
    }
}
