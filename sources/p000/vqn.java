package p000;

import java.util.Set;

/* renamed from: vqn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
enum vqn implements bmwc {
    IS_EMPTY,
    CONTAINS;

    /* renamed from: a */
    public final /* synthetic */ boolean mo28751a(Object obj, Object obj2) {
        int ordinal = ordinal();
        if (ordinal == 0) {
            Long l = (Long) obj2;
            return ((Set) obj).isEmpty();
        } else if (ordinal == 1) {
            return ((Set) obj).contains((Long) obj2);
        } else {
            throw null;
        }
    }
}
