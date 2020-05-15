package p000;

/* renamed from: cwo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public enum cwo implements cwl {
    BEFORE_GPO_REQUIRED;
    

    /* renamed from: b */
    private final int f12268b = 6;

    private cwo(String str) {
        cvx.m7697a(true, "bit number must be between 1 and 8, inclusively");
        cvx.m7697a(true, "byte number must be higher than 0");
    }

    /* renamed from: a */
    public static cwm m7780a(byte b) {
        return new cwm(new byte[]{b});
    }

    /* renamed from: a */
    public final int mo8359a() {
        return 0;
    }

    /* renamed from: b */
    public final int mo8360b() {
        return this.f12268b + 1;
    }
}
