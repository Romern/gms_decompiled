package p000;

import java.util.Iterator;

/* renamed from: pcr */
final /* synthetic */ class pcr implements bmxj {

    /* renamed from: a */
    private final bmxj f38843a;

    public pcr(bmxj bmxj) {
        this.f38843a = bmxj;
    }

    public final Object apply(Object obj) {
        bmxj bmxj = this.f38843a;
        Iterator it = bmyx.m108640a(':').mo66920b().mo66918a((CharSequence) ((String) obj)).iterator();
        return new pct((String) it.next(), (Iterable) bmxj.apply((String) it.next()));
    }
}
