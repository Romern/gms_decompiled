package p000;

/* renamed from: bpso */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bpso extends bxvk implements bxxd {

    /* renamed from: c */
    public static final bpso f138990c;

    /* renamed from: d */
    private static volatile bxxk f138991d;

    /* renamed from: a */
    public int f138992a;

    /* renamed from: b */
    public long f138993b;

    static {
        bpso bpso = new bpso();
        f138990c = bpso;
        bxvk.m124024a(bpso.class, bpso);
    }

    private bpso() {
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
            return bxvk.m124022a(f138990c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဂ\u0000", new Object[]{"a", "b"});
        } else if (i2 == 3) {
            return new bpso();
        } else {
            if (i2 == 4) {
                return new bxvd(f138990c);
            }
            if (i2 == 5) {
                return f138990c;
            }
            bxxk bxxk = f138991d;
            if (bxxk == null) {
                synchronized (bpso.class) {
                    bxxk = f138991d;
                    if (bxxk == null) {
                        bxxk = new bxve(f138990c);
                        f138991d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
