package p000;

/* renamed from: blgs */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public enum blgs {
    SHIFT_AFTER_DELETE(0),
    SHIFT_BEFORE_DELETE(1),
    SHIFT_TO_INVALID(2),
    UNRECOGNIZED(-1);
    

    /* renamed from: e */
    public final int f126471e;

    private blgs(int i) {
        this.f126471e = i;
    }

    /* renamed from: a */
    public static final blgs m107148a(int i) {
        return i != 0 ? i != 1 ? i != 2 ? UNRECOGNIZED : SHIFT_TO_INVALID : SHIFT_BEFORE_DELETE : SHIFT_AFTER_DELETE;
    }
}
