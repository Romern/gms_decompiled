package p000;

/* renamed from: bxbb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bxbb extends GeneratedMessageLite implements bxxd {

    /* renamed from: c */
    public static final bxvu f161771c = new bxba();

    /* renamed from: d */
    public static final bxbb f161772d;

    /* renamed from: f */
    private static volatile bxxk f161773f;

    /* renamed from: a */
    public int f161774a;

    /* renamed from: b */
    public bxvt f161775b = bxvm.f164965b;

    /* renamed from: e */
    private int f161776e;

    static {
        bxbb bxbb = new bxbb();
        f161772d = bxbb;
        GeneratedMessageLite.m124024a(bxbb.class, bxbb);
    }

    private bxbb() {
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
            return GeneratedMessageLite.m124022a(f161772d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001င\u0000\u0002\u001e", new Object[]{"e", "a", "b", bqbo.m112518b()});
        } else if (i2 == 3) {
            return new bxbb();
        } else {
            if (i2 == 4) {
                return new bxvd(f161772d);
            }
            if (i2 == 5) {
                return f161772d;
            }
            bxxk bxxk = f161773f;
            if (bxxk == null) {
                synchronized (bxbb.class) {
                    bxxk = f161773f;
                    if (bxxk == null) {
                        bxxk = new bxve(f161772d);
                        f161773f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
