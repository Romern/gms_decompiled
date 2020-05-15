package p000;

/* renamed from: box */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public enum box {
    LOOP_DETECTED(1),
    UNKNOWN_CHECK_TYPE(2),
    ERROR_EXTRACTING_GPO_DATA(3),
    UNEXPECTED_ERROR(4);
    

    /* renamed from: e */
    private final int f5298e;

    private box(int i) {
        this.f5298e = i;
    }

    public final String toString() {
        return getClass().getSimpleName() + "{code=" + this.f5298e + "name=" + name() + '}';
    }
}
