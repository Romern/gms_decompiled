package p000;

/* renamed from: bmth */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bmth extends bxvk implements bxxd {

    /* renamed from: c */
    public static final bmth f130840c;

    /* renamed from: d */
    private static volatile bxxk f130841d;

    /* renamed from: a */
    public int f130842a;

    /* renamed from: b */
    public int f130843b;

    static {
        bmth bmth = new bmth();
        f130840c = bmth;
        bxvk.m124024a(bmth.class, bmth);
    }

    private bmth() {
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
            return bxvk.m124022a(f130840c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0004\u0002\u0004", new Object[]{"a", "b"});
        } else if (i2 == 3) {
            return new bmth();
        } else {
            if (i2 == 4) {
                return new bxvd(f130840c);
            }
            if (i2 == 5) {
                return f130840c;
            }
            bxxk bxxk = f130841d;
            if (bxxk == null) {
                synchronized (bmth.class) {
                    bxxk = f130841d;
                    if (bxxk == null) {
                        bxxk = new bxve(f130840c);
                        f130841d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
