package p000;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* renamed from: zdm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class zdm {
    /* renamed from: a */
    public static Set m45334a(List list) {
        C1225nr nrVar = new C1225nr();
        m45335a(list, nrVar);
        return nrVar;
    }

    /* renamed from: a */
    public static void m45335a(List list, Collection collection) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            collection.add(Long.valueOf(((cacl) it.next()).f172576e));
        }
    }
}
