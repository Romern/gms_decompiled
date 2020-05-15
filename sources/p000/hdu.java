package p000;

import java.util.Comparator;

/* renamed from: hdu */
public final /* synthetic */ class hdu implements Comparator {

    /* renamed from: a */
    private final bmxj f19549a;

    public hdu(bmxj bmxj) {
        this.f19549a = bmxj;
    }

    public final int compare(Object obj, Object obj2) {
        bmxj bmxj = this.f19549a;
        return (((Long) bmxj.apply(obj)).longValue() > ((Long) bmxj.apply(obj2)).longValue() ? 1 : (((Long) bmxj.apply(obj)).longValue() == ((Long) bmxj.apply(obj2)).longValue() ? 0 : -1));
    }
}
