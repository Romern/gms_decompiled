package p000;

/* renamed from: bxom */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public enum bxom implements bxvp {
    VALUE_ORIGIN_UNKNOWN(0),
    IN_MEMORY_CACHE(1),
    PERSISTENT_CACHE(2),
    CACHE_MISS(3);
    

    /* renamed from: e */
    public final int f164172e;

    private bxom(int i) {
        this.f164172e = i;
    }

    /* renamed from: a */
    public static bxom m122927a(int i) {
        if (i == 0) {
            return VALUE_ORIGIN_UNKNOWN;
        }
        if (i == 1) {
            return IN_MEMORY_CACHE;
        }
        if (i == 2) {
            return PERSISTENT_CACHE;
        }
        if (i != 3) {
            return null;
        }
        return CACHE_MISS;
    }

    /* renamed from: b */
    public static bxvr m122928b() {
        return bxol.f164166a;
    }

    /* renamed from: a */
    public final int mo3214a() {
        return this.f164172e;
    }

    public final String toString() {
        return Integer.toString(this.f164172e);
    }
}
