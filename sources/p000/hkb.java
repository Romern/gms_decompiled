package p000;

import android.content.Context;

/* renamed from: hkb */
final /* synthetic */ class hkb implements bqeh {

    /* renamed from: a */
    private final hkh f19928a;

    /* renamed from: b */
    private final hez f19929b;

    public hkb(hkh hkh, hez hez) {
        this.f19928a = hkh;
        this.f19929b = hez;
    }

    /* renamed from: a */
    public final bqgg mo6375a(Object obj) {
        hkh hkh = this.f19928a;
        hez hez = this.f19929b;
        bngx bngx = (bngx) obj;
        if (bngx.isEmpty()) {
            throw adbe.m50106a(28433);
        } else if (!hkh.f19940d.f10213b.f10216a) {
            return bqga.m112775a((Object) bngx.m109376e());
        } else {
            Context context = hkh.f19938b;
            String str = hkh.f19939c;
            allp allp = new allp();
            allp.f73626a = 80;
            return new hph(context, allr.m61237d(context, allp.mo40491a()), str, bngx).mo12291a(hez);
        }
    }
}
