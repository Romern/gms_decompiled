package p000;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* renamed from: kfu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class kfu implements kfw {

    /* renamed from: a */
    private final kck f24008a;

    /* renamed from: b */
    private final bnic f24009b;

    public kfu(kck kck, bnic bnic) {
        this.f24008a = kck;
        this.f24009b = bnic;
    }

    /* renamed from: a */
    public final bnic mo14450a() {
        HashSet hashSet = new HashSet();
        hashSet.addAll(this.f24009b);
        hashSet.add(this.f24008a);
        return bnic.m109495a((Collection) hashSet);
    }

    /* renamed from: a */
    public final bnic mo14451a(List list, kcv kcv) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            bnic bnic = (bnic) it.next();
            if (bnic.contains(kcv)) {
                return bnic;
            }
        }
        return null;
    }

    /* renamed from: a */
    public final String mo14452a(List list) {
        return kfx.m17785a(bnic.m109488a((Iterable) bnfi.m109238b(list)));
    }
}
