package p000;

import java.util.Iterator;

/* renamed from: bnnm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bnnm {
    /* renamed from: a */
    public static bngz m109864a(Iterable iterable, bmxj bmxj) {
        Iterator it = iterable.iterator();
        bmxy.m108581a(bmxj);
        bngy a = bngz.m109387a();
        while (it.hasNext()) {
            Object next = it.next();
            bmxy.m108582a(next, it);
            a.mo67690a(bmxj.apply(next), next);
        }
        return a.mo67689a();
    }

    /* renamed from: a */
    public static bnkd m109865a(bnkd bnkd) {
        return new bnqa(bnkd);
    }
}
