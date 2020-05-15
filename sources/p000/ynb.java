package p000;

import java.util.Collection;
import java.util.List;

/* renamed from: ynb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ynb implements ync {

    /* renamed from: a */
    private final bngx f54119a;

    public ynb(List list) {
        this.f54119a = bngx.m109368a((Collection) list);
    }

    /* renamed from: a */
    public final Iterable mo30501a(Iterable iterable, yhx yhx) {
        bnre i = this.f54119a.listIterator();
        while (i.hasNext()) {
            iterable = ((ync) i.next()).mo30501a(iterable, yhx);
        }
        return iterable;
    }
}
