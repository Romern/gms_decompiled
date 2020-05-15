package p000;

/* renamed from: alvf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public enum alvf implements bxvp {
    UNKNOWN_OPERATION(0),
    INSERT(1),
    UPDATE(2),
    REMOVE(3),
    BULK_INSERT(4);
    

    /* renamed from: f */
    private final int f74367f;

    private alvf(int i) {
        this.f74367f = i;
    }

    /* renamed from: a */
    public static alvf m61938a(int i) {
        if (i == 0) {
            return UNKNOWN_OPERATION;
        }
        if (i == 1) {
            return INSERT;
        }
        if (i == 2) {
            return UPDATE;
        }
        if (i == 3) {
            return REMOVE;
        }
        if (i != 4) {
            return null;
        }
        return BULK_INSERT;
    }

    /* renamed from: b */
    public static bxvr m61939b() {
        return alve.f74360a;
    }

    /* renamed from: a */
    public final int mo3214a() {
        return this.f74367f;
    }

    public final String toString() {
        return Integer.toString(this.f74367f);
    }
}
