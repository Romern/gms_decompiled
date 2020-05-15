package p000;

import android.content.Context;
import com.google.android.gms.common.Feature;
import com.google.android.gms.smartdevice.d2d.ConnectionRequest;

/* renamed from: arba */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class arba extends rjx {

    /* renamed from: a */
    public final arjk f87260a = arjk.m73009a();

    public arba(Context context) {
        super(context, aqxa.f87024b, (rjk) null, rjw.f43159a);
    }

    /* renamed from: a */
    public final ariq mo48358a(arar arar) {
        return new arip(new arla(this, arar));
    }

    /* renamed from: b */
    public final void mo48363b() {
        mo48364n("source-bootstrap-scan");
        roz b = rpa.m34196b();
        b.f43472a = arkk.f87816a;
        mo24732b(b.mo24977a());
    }

    /* renamed from: n */
    public final void mo48364n(String str) {
        this.f87260a.mo48610b(this, str);
    }

    /* renamed from: a */
    public final aucb mo48359a() {
        mo48364n("source-bootstrap-api");
        roz b = rpa.m34196b();
        b.f43472a = arkd.f87803a;
        return mo24732b(b.mo24977a());
    }

    /* renamed from: a */
    public final aucb mo48360a(ConnectionRequest connectionRequest, arar arar) {
        roz b = rpa.m34196b();
        b.f43473b = new Feature[]{aqwz.f87016d};
        b.f43472a = new arkn(this, connectionRequest, arar);
        aucb b2 = mo24732b(b.mo24977a());
        b2.mo50373a(new arko(this));
        return b2;
    }

    /* renamed from: a */
    public final void mo48361a(ardt ardt) {
        roz b = rpa.m34196b();
        b.f43472a = new arkc(ardt);
        mo24732b(b.mo24977a()).mo50373a(new arkj(this));
    }

    /* renamed from: a */
    public final void mo48362a(String str) {
        aucb aucb;
        if (this.f87260a.mo48609a(str)) {
            aucb = this.f87260a.mo48610b(this, str);
        } else {
            aucb = aucu.m76778a((Object) null);
        }
        aucb.mo50371a(new arki(this, str));
    }
}
