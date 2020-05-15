package p000;

import android.database.Cursor;
import android.util.Pair;

/* renamed from: bcdg */
final /* synthetic */ class bcdg implements bmxj {

    /* renamed from: a */
    private final bmxj f103995a;

    public bcdg(bmxj bmxj) {
        this.f103995a = bmxj;
    }

    public final Object apply(Object obj) {
        return Pair.create((bngx) this.f103995a.apply((Cursor) obj), false);
    }
}
