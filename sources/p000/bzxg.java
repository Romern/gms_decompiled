package p000;

/* renamed from: bzxg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public enum bzxg implements bxvp {
    UNKNOWN(0),
    SUCCESS(1),
    INVALID_BAD_ID(2),
    INVALID_BAD_CLIENT(3),
    INVALID_CHANGED_RECENTLY(4),
    INVALID_SERVER_ERROR(5);
    

    /* renamed from: g */
    public final int f171748g;

    private bzxg(int i) {
        this.f171748g = i;
    }

    /* renamed from: a */
    public static bzxg m126293a(int i) {
        if (i == 0) {
            return UNKNOWN;
        }
        if (i == 1) {
            return SUCCESS;
        }
        if (i == 2) {
            return INVALID_BAD_ID;
        }
        if (i == 3) {
            return INVALID_BAD_CLIENT;
        }
        if (i == 4) {
            return INVALID_CHANGED_RECENTLY;
        }
        if (i != 5) {
            return null;
        }
        return INVALID_SERVER_ERROR;
    }

    /* renamed from: b */
    public static bxvr m126294b() {
        return bzxf.f171740a;
    }

    /* renamed from: a */
    public final int mo3214a() {
        return this.f171748g;
    }

    public final String toString() {
        return Integer.toString(this.f171748g);
    }
}
