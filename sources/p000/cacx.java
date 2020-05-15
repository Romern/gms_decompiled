package p000;

/* renamed from: cacx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cacx extends GeneratedMessageLite implements bxxd {

    /* renamed from: c */
    public static final cacx f172639c;

    /* renamed from: d */
    private static volatile bxxk f172640d;

    /* renamed from: a */
    public int f172641a = 0;

    /* renamed from: b */
    public Object f172642b;

    static {
        cacx cacx = new cacx();
        f172639c = cacx;
        GeneratedMessageLite.m124024a(cacx.class, cacx);
    }

    private cacx() {
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
            return GeneratedMessageLite.m124022a(f172639c, "\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001ြ\u0000", new Object[]{"b", "a", cacw.class});
        } else if (i2 == 3) {
            return new cacx();
        } else {
            if (i2 == 4) {
                return new bxvd(f172639c);
            }
            if (i2 == 5) {
                return f172639c;
            }
            bxxk bxxk = f172640d;
            if (bxxk == null) {
                synchronized (cacx.class) {
                    bxxk = f172640d;
                    if (bxxk == null) {
                        bxxk = new bxve(f172639c);
                        f172640d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
