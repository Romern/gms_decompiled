package p000;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* renamed from: adql */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class adql {
    /* renamed from: a */
    public static Set m50999a(Set set) {
        HashMap hashMap = new HashMap();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            adqq adqq = (adqq) it.next();
            Long l = adqq.f62514a;
            Long l2 = adqq.f62515b;
            if (!hashMap.containsKey(l)) {
                hashMap.put(l, l2);
            } else if (l2.longValue() > ((Long) hashMap.get(l)).longValue()) {
                hashMap.put(l, l2);
            }
        }
        HashSet hashSet = new HashSet();
        for (Map.Entry entry : hashMap.entrySet()) {
            hashSet.add(new adqq((Long) entry.getKey(), (Long) entry.getValue()));
        }
        return hashSet;
    }
}
