package p000;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* renamed from: zdl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class zdl {
    /* renamed from: a */
    public static List m45331a(List list) {
        ArrayList arrayList = new ArrayList();
        m45332a(list, arrayList);
        return arrayList;
    }

    /* renamed from: b */
    public static Set m45333b(List list) {
        C1225nr nrVar = new C1225nr();
        m45332a(list, nrVar);
        return nrVar;
    }

    /* renamed from: a */
    private static void m45332a(List list, Collection collection) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            collection.add(Long.valueOf(((cabc) it.next()).f172418f));
        }
    }
}
