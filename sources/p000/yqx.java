package p000;

import java.util.Collection;
import java.util.Set;

/* renamed from: yqx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class yqx {

    /* renamed from: a */
    private static final bngx f54455a = bngx.m109358a(yqy.f54456a, yqz.f54461a, yra.f54467a);

    /* renamed from: a */
    public static bngx m44621a(Collection collection) {
        bngs b = bngx.m109371b(collection.size());
        bnre i = f54455a.listIterator();
        while (i.hasNext()) {
            yqo yqo = (yqo) i.next();
            if (collection.contains(yqo.mo30673a())) {
                b.mo67668c(yqo);
            }
        }
        return b.mo67664a();
    }

    /* renamed from: b */
    public static bnic m44623b(Set set) {
        bnia j = bnic.m109500j();
        bnre i = m44621a((Collection) set).listIterator();
        while (i.hasNext()) {
            j.mo67752b((Iterable) ((yqo) i.next()).mo30679f());
        }
        return j.mo67751a();
    }

    /* renamed from: a */
    public static bnic m44622a(Set set) {
        bnia j = bnic.m109500j();
        bnre i = f54455a.listIterator();
        while (i.hasNext()) {
            yqo yqo = (yqo) i.next();
            if (set.containsAll(yqo.mo30675b())) {
                j.mo67629b(yqo);
            }
        }
        return j.mo67751a();
    }
}
