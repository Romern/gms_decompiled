package p000;

import java.util.Collection;

/* renamed from: bqbx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bqbx implements bmxj {
    public final /* bridge */ /* synthetic */ Object apply(Object obj) {
        int i;
        Collection collection = (Collection) obj;
        if (collection instanceof bnhy) {
            bnhy bnhy = (bnhy) collection;
            if (!bnhy.mo67640h()) {
                return bnhy;
            }
        }
        if (collection instanceof bnnn) {
            i = ((bnnn) collection).mo67323d().size();
        } else {
            i = 11;
        }
        bnhv bnhv = new bnhv(i);
        bnhv.mo67742b((Iterable) collection);
        return bnhv.mo67740a();
    }
}
