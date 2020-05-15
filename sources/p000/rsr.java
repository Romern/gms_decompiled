package p000;

import java.util.HashSet;
import java.util.Set;

/* renamed from: rsr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class rsr {
    /* renamed from: a */
    public static Set m34360a(Set set, Set set2) {
        sdo.m34959a(set);
        sdo.m34959a(set2);
        HashSet hashSet = new HashSet(set);
        hashSet.addAll(set2);
        return hashSet;
    }

    /* renamed from: b */
    public static Set m34361b(Set set, Set set2) {
        sdo.m34959a(set);
        sdo.m34959a(set2);
        HashSet hashSet = new HashSet();
        for (Object obj : set) {
            if (!set2.contains(obj)) {
                hashSet.add(obj);
            }
        }
        return hashSet;
    }
}
