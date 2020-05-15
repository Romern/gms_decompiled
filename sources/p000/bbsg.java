package p000;

import android.util.Pair;

/* renamed from: bbsg */
final /* synthetic */ class bbsg implements bmxj {

    /* renamed from: a */
    private final bbsh f103289a;

    /* renamed from: b */
    private final bcoh f103290b;

    public bbsg(bbsh bbsh, bcoh bcoh) {
        this.f103289a = bbsh;
        this.f103290b = bcoh;
    }

    public final Object apply(Object obj) {
        bbsh bbsh = this.f103289a;
        bcoh bcoh = this.f103290b;
        Pair pair = (Pair) obj;
        bnre i = ((bngx) pair.first).listIterator();
        while (i.hasNext()) {
            bbsh.f103292b.mo56327b(bcoh, ((bcsp) i.next()).mo57317a()).mo57832f();
        }
        return pair;
    }
}
