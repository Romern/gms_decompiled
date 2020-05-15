package p000;

import com.google.android.gms.auth.api.identity.SavePasswordRequest;

/* renamed from: hgm */
final /* synthetic */ class hgm implements C1247om {

    /* renamed from: a */
    private final hhe f19722a;

    public hgm(hhe hhe) {
        this.f19722a = hhe;
    }

    /* renamed from: a */
    public final Object mo12294a() {
        hhe hhe = this.f19722a;
        hhe.f19759n.f19740a.start();
        hvd hvd = hhe.f19756k;
        SavePasswordRequest savePasswordRequest = hhe.f19752g;
        String str = hhe.f19749d;
        sdo.m34959a(savePasswordRequest);
        sdo.m34959a((Object) str);
        roz b = rpa.m34196b();
        b.f43472a = new hxb(savePasswordRequest, str);
        return bqdx.m112674a(adbb.m50100a(((rjx) hvd).mo24701a(b.mo24977a())), new hgv(hhe), hhe.f19753h);
    }
}
