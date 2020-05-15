package p000;

/* renamed from: byhx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public enum byhx implements bxvp {
    UNKNOWN(0),
    UPDATE(1),
    RESET(2),
    DELETE(3);
    

    /* renamed from: e */
    public final int f166527e;

    private byhx(int i) {
        this.f166527e = i;
    }

    /* renamed from: a */
    public static byhx m124831a(int i) {
        if (i == 0) {
            return UNKNOWN;
        }
        if (i == 1) {
            return UPDATE;
        }
        if (i == 2) {
            return RESET;
        }
        if (i != 3) {
            return null;
        }
        return DELETE;
    }

    /* renamed from: b */
    public static bxvr m124832b() {
        return byhw.f166521a;
    }

    /* renamed from: a */
    public final int mo3214a() {
        return this.f166527e;
    }

    public final String toString() {
        return Integer.toString(this.f166527e);
    }
}
