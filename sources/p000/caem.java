package p000;

/* renamed from: caem */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class caem extends GeneratedMessageLite implements bxxd {

    /* renamed from: c */
    public static final caem f172833c;

    /* renamed from: e */
    private static volatile bxxk f172834e;

    /* renamed from: a */
    public int f172835a;

    /* renamed from: b */
    public int f172836b;

    /* renamed from: d */
    private int f172837d;

    static {
        caem caem = new caem();
        f172833c = caem;
        GeneratedMessageLite.m124024a(caem.class, caem);
    }

    private caem() {
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
            return GeneratedMessageLite.m124022a(f172833c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001", new Object[]{"d", "a", "b"});
        } else if (i2 == 3) {
            return new caem();
        } else {
            if (i2 == 4) {
                return new bxvd(f172833c);
            }
            if (i2 == 5) {
                return f172833c;
            }
            bxxk bxxk = f172834e;
            if (bxxk == null) {
                synchronized (caem.class) {
                    bxxk = f172834e;
                    if (bxxk == null) {
                        bxxk = new bxve(f172833c);
                        f172834e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
