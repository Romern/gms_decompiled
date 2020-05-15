package p000;

import java.util.Collection;
import java.util.Collections;
import java.util.Set;

/* renamed from: txq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class txq {
    /* renamed from: a */
    static boolean m37689a(Collection collection, Collection collection2) {
        return !Collections.disjoint(collection, collection2);
    }

    /* renamed from: a */
    static boolean m37690a(tyr tyr, tyl tyl) {
        Set o = tyr.mo26920o();
        if (m37689a(o, tyl.mo26911q())) {
            return true;
        }
        ukk s = tyl.mo26913s();
        if (s == null || !o.contains(s)) {
            return false;
        }
        return true;
    }
}
