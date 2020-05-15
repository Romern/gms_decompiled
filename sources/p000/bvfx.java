package p000;

/* renamed from: bvfx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bvfx extends GeneratedMessageLite implements bxxd {

    /* renamed from: c */
    public static final bvfx f155934c;

    /* renamed from: d */
    private static volatile bxxk f155935d;

    /* renamed from: a */
    public int f155936a;

    /* renamed from: b */
    public long f155937b;

    static {
        bvfx bvfx = new bvfx();
        f155934c = bvfx;
        GeneratedMessageLite.m124024a(bvfx.class, bvfx);
    }

    private bvfx() {
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
            return GeneratedMessageLite.m124022a(f155934c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဂ\u0000", new Object[]{"a", "b"});
        } else if (i2 == 3) {
            return new bvfx();
        } else {
            if (i2 == 4) {
                return new bxvd(f155934c);
            }
            if (i2 == 5) {
                return f155934c;
            }
            bxxk bxxk = f155935d;
            if (bxxk == null) {
                synchronized (bvfx.class) {
                    bxxk = f155935d;
                    if (bxxk == null) {
                        bxxk = new bxve(f155934c);
                        f155935d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
