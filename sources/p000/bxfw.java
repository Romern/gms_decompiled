package p000;

/* renamed from: bxfw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public enum bxfw implements bxvp {
    UNKNOWN_ACCESS_TYPE(0),
    READ_ONLY(1),
    WRITE_ONLY(2),
    READ_WRITE(3),
    LISTEN_ONLY(4),
    INJECT_ONLY(5),
    LISTEN_WRITE(6),
    LISTEN_INJECT(7),
    READ_INJECT(8);
    

    /* renamed from: j */
    public final int f163209j;

    private bxfw(int i) {
        this.f163209j = i;
    }

    /* renamed from: a */
    public static bxfw m122671a(int i) {
        switch (i) {
            case 0:
                return UNKNOWN_ACCESS_TYPE;
            case 1:
                return READ_ONLY;
            case 2:
                return WRITE_ONLY;
            case 3:
                return READ_WRITE;
            case 4:
                return LISTEN_ONLY;
            case 5:
                return INJECT_ONLY;
            case 6:
                return LISTEN_WRITE;
            case 7:
                return LISTEN_INJECT;
            case 8:
                return READ_INJECT;
            default:
                return null;
        }
    }

    /* renamed from: b */
    public static bxvr m122672b() {
        return bxfv.f163198a;
    }

    /* renamed from: a */
    public final int mo3214a() {
        return this.f163209j;
    }

    public final String toString() {
        return Integer.toString(this.f163209j);
    }
}
