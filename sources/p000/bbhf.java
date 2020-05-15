package p000;

import java.util.Iterator;

/* renamed from: bbhf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class bbhf {
    /* renamed from: a */
    public static bngx m88013a(Iterable iterable, Iterable iterable2) {
        boolean z;
        bngs j = bngx.m109377j();
        Iterator it = iterable.iterator();
        Iterator it2 = iterable2.iterator();
        while (true) {
            if (!it.hasNext() && !it2.hasNext()) {
                return j.mo67664a();
            }
            if (it.hasNext() == it2.hasNext()) {
                z = true;
            } else {
                z = false;
            }
            bmxy.m108601b(z, "Numbers of keys and values are different");
            j.mo67668c(new bbhe(it.next(), it2.next()));
        }
    }

    /* renamed from: a */
    public abstract Object mo56138a();

    /* renamed from: b */
    public abstract Object mo56139b();
}
