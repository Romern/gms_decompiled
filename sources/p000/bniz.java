package p000;

import java.util.Iterator;
import java.util.List;

/* renamed from: bniz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bniz extends bnfi {

    /* renamed from: a */
    final /* synthetic */ Iterable f131687a;

    /* renamed from: b */
    final /* synthetic */ int f131688b;

    public bniz(Iterable iterable, int i) {
        this.f131687a = iterable;
        this.f131688b = i;
    }

    public final Iterator iterator() {
        Iterable iterable = this.f131687a;
        if (iterable instanceof List) {
            List list = (List) iterable;
            return list.subList(Math.min(list.size(), this.f131688b), list.size()).iterator();
        }
        Iterator it = iterable.iterator();
        bnjr.m109607a(it, this.f131688b);
        return new bniy(it);
    }
}
