package p000;

/* renamed from: czy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public enum czy implements czv {
    BEFORE_GPO_REQUIRED;
    

    /* renamed from: b */
    private final int f12473b = 6;

    private czy(String str) {
        czl.m8003a(true, "bit number must be between 1 and 8, inclusively");
        czl.m8003a(true, "byte number must be higher than 0");
    }

    /* renamed from: a */
    public static czw m8061a(byte b) {
        return new czw(new byte[]{b});
    }

    /* renamed from: a */
    public final int mo8461a() {
        return 0;
    }

    /* renamed from: b */
    public final int mo8462b() {
        return this.f12473b + 1;
    }
}
