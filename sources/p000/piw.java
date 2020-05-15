package p000;

import java.util.Collection;

/* renamed from: piw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class piw {

    /* renamed from: a */
    public final /* synthetic */ pjc f39256a;

    public piw(pjc pjc) {
        this.f39256a = pjc;
    }

    /* renamed from: a */
    public final void mo23226a() {
        prc[] prcArr;
        pjc pjc = this.f39256a;
        if (pjc.f39318g != null) {
            poj poj = pjc.f39335x;
            String a = pjc.f39230a.mo17494a();
            prb prb = this.f39256a.f39318g;
            synchronized (prb.f40094b) {
                Collection values = prb.f40094b.values();
                prcArr = (prc[]) values.toArray(new prc[values.size()]);
            }
            new pow(poj.f39918b, poj.f39919c, a, prcArr).mo23522a();
        }
    }
}
