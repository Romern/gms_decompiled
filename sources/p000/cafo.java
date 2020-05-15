package p000;

/* renamed from: cafo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cafo extends bxvk implements bxxd {

    /* renamed from: c */
    public static final cafo f172931c;

    /* renamed from: e */
    private static volatile bxxk f172932e;

    /* renamed from: a */
    public String f172933a = "";

    /* renamed from: b */
    public int f172934b;

    /* renamed from: d */
    private int f172935d;

    static {
        cafo cafo = new cafo();
        f172931c = cafo;
        bxvk.m124024a(cafo.class, cafo);
    }

    private cafo() {
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
            return bxvk.m124022a(f172931c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002င\u0001", new Object[]{"d", "a", "b"});
        } else if (i2 == 3) {
            return new cafo();
        } else {
            if (i2 == 4) {
                return new bxvd(f172931c);
            }
            if (i2 == 5) {
                return f172931c;
            }
            bxxk bxxk = f172932e;
            if (bxxk == null) {
                synchronized (cafo.class) {
                    bxxk = f172932e;
                    if (bxxk == null) {
                        bxxk = new bxve(f172931c);
                        f172932e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
