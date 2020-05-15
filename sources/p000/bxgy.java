package p000;

/* renamed from: bxgy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public enum bxgy implements bxvp {
    UNKNOWN_UPDATE_INTEREST_OPERATION_TYPE(0),
    ADD(1),
    REMOVE(2);
    

    /* renamed from: d */
    public final int f163325d;

    private bxgy(int i) {
        this.f163325d = i;
    }

    /* renamed from: a */
    public static bxgy m122705a(int i) {
        if (i == 0) {
            return UNKNOWN_UPDATE_INTEREST_OPERATION_TYPE;
        }
        if (i == 1) {
            return ADD;
        }
        if (i != 2) {
            return null;
        }
        return REMOVE;
    }

    /* renamed from: b */
    public static bxvr m122706b() {
        return bxgx.f163320a;
    }

    /* renamed from: a */
    public final int mo3214a() {
        return this.f163325d;
    }

    public final String toString() {
        return Integer.toString(this.f163325d);
    }
}
