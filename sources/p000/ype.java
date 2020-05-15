package p000;

import java.util.Collection;
import java.util.List;

/* renamed from: ype */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ype implements ypj {

    /* renamed from: a */
    private final bngx f54327a;

    public ype(List list) {
        bmxy.m108588a(!list.isEmpty());
        this.f54327a = bngx.m109368a((Collection) list);
    }

    /* renamed from: a */
    public final Iterable mo30649a(Iterable iterable) {
        bnre i = this.f54327a.listIterator();
        while (i.hasNext()) {
            iterable = ((ypj) i.next()).mo30649a(iterable);
        }
        return iterable;
    }
}
