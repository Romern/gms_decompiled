package p000;

import java.util.Collection;
import java.util.List;
import java.util.RandomAccess;
import java.util.Set;
import java.util.SortedSet;

/* renamed from: bnqh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bnqh {
    /* renamed from: a */
    public static Collection m110112a(Collection collection, Object obj) {
        return new bnpy(collection, obj);
    }

    /* renamed from: b */
    public static Collection m110116b(Collection collection, Object obj) {
        if (collection instanceof SortedSet) {
            return m110115a((SortedSet) collection, obj);
        }
        if (collection instanceof Set) {
            return m110114a((Set) collection, obj);
        }
        if (collection instanceof List) {
            return m110113a((List) collection, obj);
        }
        return m110112a(collection, obj);
    }

    /* renamed from: a */
    public static List m110113a(List list, Object obj) {
        return list instanceof RandomAccess ? new bnqe(list, obj) : new bnpz(list, obj);
    }

    /* renamed from: a */
    static Set m110114a(Set set, Object obj) {
        return new bnqf(set, obj);
    }

    /* renamed from: a */
    public static SortedSet m110115a(SortedSet sortedSet, Object obj) {
        return new bnqg(sortedSet, obj);
    }
}
