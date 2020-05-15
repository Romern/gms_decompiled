package com.google.android.gms.ads.cache.policy;

import com.google.android.gms.ads.cache.C0201g;
import com.google.android.gms.ads.cache.C0217p;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: com.google.android.gms.ads.cache.policy.f */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class C0223f {

    /* renamed from: a */
    public final Set f7923a;

    public C0223f(Set set) {
        this.f7923a = set;
    }

    /* renamed from: a */
    public static Map m5088a(List list) {
        C1223np npVar = new C1223np();
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                C0217p pVar = (C0217p) it.next();
                npVar.put(new C0201g(pVar).f7853a, pVar);
            }
        }
        return npVar;
    }
}
