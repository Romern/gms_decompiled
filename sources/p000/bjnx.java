package p000;

import android.os.Bundle;

/* renamed from: bjnx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bjnx extends bjgd {

    /* renamed from: l */
    private bwsr f123039l;

    public bjnx(bjgv bjgv, bwny bwny, Bundle bundle) {
        super(bjgv, bwny, bundle);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo65100a(bwny bwny, bwny bwny2) {
        bxvj bxvj = bwsr.f160911c;
        bwny2.mo74135a(bxvj);
        Object b = bwny2.f164952m.mo73913b(bxvj.f164958d);
        if (b == null) {
            b = bxvj.f164956b;
        } else {
            bxvj.mo74139a(b);
        }
        this.f123039l = (bwsr) b;
    }

    /* renamed from: h */
    public final String mo65122h() {
        bjhh bjhh = this.f122639a.f122692a.f122731h;
        int i = this.f123039l.f160913a;
        bjhm bjhm = (bjhm) bjhh;
        bmxy.m108582a(bjhm.f122741g, "should set googleAccountStateSnapshot before calling getAccount");
        boolean z = false;
        if (i >= 0 && i < bjhm.f122741g.f151759a.length) {
            z = true;
        }
        bmxy.m108589a(z, "should provide valid index");
        return bjhm.f122741g.f151759a[i].name;
    }
}
