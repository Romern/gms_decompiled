package p000;

/* renamed from: bmyd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public enum bmyd implements bmxz {
    ALWAYS_TRUE,
    ALWAYS_FALSE,
    IS_NULL,
    NOT_NULL;

    /* renamed from: a */
    public final /* synthetic */ boolean mo6527a(Object obj) {
        int ordinal = ordinal();
        if (ordinal == 0) {
            return true;
        }
        if (ordinal == 1) {
            return false;
        }
        if (ordinal == 2) {
            return obj == null;
        }
        if (ordinal == 3) {
            return obj != null;
        }
        throw null;
    }

    public final /* synthetic */ String toString() {
        int ordinal = ordinal();
        return ordinal != 0 ? ordinal != 1 ? ordinal != 2 ? ordinal != 3 ? super.toString() : "Predicates.notNull()" : "Predicates.isNull()" : "Predicates.alwaysFalse()" : "Predicates.alwaysTrue()";
    }
}
