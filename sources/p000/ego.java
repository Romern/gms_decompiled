package p000;

import android.util.SparseArray;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* renamed from: ego */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ego extends SparseArray implements Iterable {
    /* renamed from: a */
    public final int mo10098a(int i, Object obj) {
        if (obj != null) {
            Set set = (Set) get(i);
            if (set == null) {
                HashSet hashSet = new HashSet();
                append(i, hashSet);
                hashSet.add(obj);
                return 2;
            } else if (set.add(obj)) {
                return 1;
            }
        }
        return 0;
    }

    /* renamed from: b */
    public final int mo10100b(int i, Object obj) {
        Set set = (Set) get(i);
        if (set == null || !set.remove(obj)) {
            return 0;
        }
        if (!set.isEmpty()) {
            return 3;
        }
        remove(i);
        return 4;
    }

    public final Iterator iterator() {
        return new egn(this);
    }

    /* renamed from: a */
    public final boolean mo10099a() {
        return size() == 0;
    }
}
