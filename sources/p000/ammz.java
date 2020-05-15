package p000;

/* renamed from: ammz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public enum ammz implements bxvp {
    UNSPECIFIED(0),
    INSERT(1),
    UPDATE(2),
    REMOVE(3);
    

    /* renamed from: e */
    public final int f75412e;

    private ammz(int i) {
        this.f75412e = i;
    }

    /* renamed from: a */
    public static ammz m63079a(int i) {
        if (i == 0) {
            return UNSPECIFIED;
        }
        if (i == 1) {
            return INSERT;
        }
        if (i == 2) {
            return UPDATE;
        }
        if (i != 3) {
            return null;
        }
        return REMOVE;
    }

    /* renamed from: b */
    public static bxvr m63080b() {
        return ammy.f75406a;
    }

    /* renamed from: a */
    public final int mo3214a() {
        return this.f75412e;
    }

    public final String toString() {
        return Integer.toString(this.f75412e);
    }
}
