package p000;

/* renamed from: bxsa */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bxsa extends bxvk implements bxxd {

    /* renamed from: b */
    public static final bxsa f164648b;

    /* renamed from: d */
    private static volatile bxxk f164649d;

    /* renamed from: a */
    public boolean f164650a;

    /* renamed from: c */
    private int f164651c;

    static {
        bxsa bxsa = new bxsa();
        f164648b = bxsa;
        bxvk.m124024a(bxsa.class, bxsa);
    }

    private bxsa() {
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
            return bxvk.m124022a(f164648b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဇ\u0000", new Object[]{"c", "a"});
        } else if (i2 == 3) {
            return new bxsa();
        } else {
            if (i2 == 4) {
                return new bxvd(f164648b);
            }
            if (i2 == 5) {
                return f164648b;
            }
            bxxk bxxk = f164649d;
            if (bxxk == null) {
                synchronized (bxsa.class) {
                    bxxk = f164649d;
                    if (bxxk == null) {
                        bxxk = new bxve(f164648b);
                        f164649d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
