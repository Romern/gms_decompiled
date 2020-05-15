package p000;

import java.util.Comparator;

/* renamed from: hdt */
final /* synthetic */ class hdt implements Comparator {

    /* renamed from: a */
    private final bmxj f19548a;

    public hdt(bmxj bmxj) {
        this.f19548a = bmxj;
    }

    public final int compare(Object obj, Object obj2) {
        bmxj bmxj = this.f19548a;
        return Integer.compare(((Integer) bmxj.apply(obj)).intValue(), ((Integer) bmxj.apply(obj2)).intValue());
    }
}
