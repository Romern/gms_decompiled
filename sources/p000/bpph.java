package p000;

/* renamed from: bpph */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bpph extends bxvk implements bxxd {

    /* renamed from: f */
    public static final bpph f138620f;

    /* renamed from: g */
    private static volatile bxxk f138621g;

    /* renamed from: a */
    public int f138622a;

    /* renamed from: b */
    public bxvt f138623b = bxvm.f164965b;

    /* renamed from: c */
    public String f138624c;

    /* renamed from: d */
    public boolean f138625d;

    /* renamed from: e */
    public int f138626e;

    static {
        bpph bpph = new bpph();
        f138620f = bpph;
        bxvk.m124024a(bpph.class, bpph);
    }

    private bpph() {
        bxxn bxxn = bxxn.f165040b;
        this.f138624c = "";
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 1) {
            return null;
        }
        if (i2 == 2) {
            return bxvk.m124022a(f138620f, "\u0001\u0004\u0000\u0001\u0001\u0005\u0004\u0000\u0001\u0000\u0001\u0016\u0003ဈ\u0000\u0004ဇ\u0001\u0005ဋ\u0002", new Object[]{"a", "b", "c", "d", "e"});
        } else if (i2 == 3) {
            return new bpph();
        } else {
            if (i2 == 4) {
                return new bxvd((byte[]) null, (float[]) null, (byte[]) null);
            }
            if (i2 == 5) {
                return f138620f;
            }
            bxxk bxxk = f138621g;
            if (bxxk == null) {
                synchronized (bpph.class) {
                    bxxk = f138621g;
                    if (bxxk == null) {
                        bxxk = new bxve(f138620f);
                        f138621g = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
