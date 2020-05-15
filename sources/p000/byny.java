package p000;

/* renamed from: byny */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class byny extends GeneratedMessageLite implements bxxd {

    /* renamed from: c */
    public static final byny f167146c;

    /* renamed from: e */
    private static volatile bxxk f167147e;

    /* renamed from: a */
    public int f167148a;

    /* renamed from: b */
    public int f167149b;

    /* renamed from: d */
    private int f167150d;

    static {
        byny byny = new byny();
        f167146c = byny;
        GeneratedMessageLite.m124024a(byny.class, byny);
    }

    private byny() {
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
            return GeneratedMessageLite.m124022a(f167146c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001", new Object[]{"d", "a", "b"});
        } else if (i2 == 3) {
            return new byny();
        } else {
            if (i2 == 4) {
                return new bxvd(f167146c);
            }
            if (i2 == 5) {
                return f167146c;
            }
            bxxk bxxk = f167147e;
            if (bxxk == null) {
                synchronized (byny.class) {
                    bxxk = f167147e;
                    if (bxxk == null) {
                        bxxk = new bxve(f167146c);
                        f167147e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
