package p000;

import java.util.Iterator;
import java.util.List;

/* renamed from: zty */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class zty {
    /* renamed from: a */
    static bngx m46420a(List list) {
        bngs b = bngx.m109371b(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            cadn cadn = (cadn) it.next();
            if (yyq.m45053a(cadn) == null) {
                b.mo67668c(cadn);
            }
        }
        return b.mo67664a();
    }

    /* renamed from: a */
    public static cadp m46421a(cadp cadp) {
        caae caae = cadp.f172713b;
        if (caae == null) {
            caae = caae.f172323i;
        }
        cado b = yyl.m45033b(caae);
        b.mo74617a(m46420a(cadp.f172714c));
        return (cadp) b.mo74062i();
    }
}
