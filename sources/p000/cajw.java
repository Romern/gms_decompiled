package p000;

/* renamed from: cajw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cajw extends bxvk implements bxxd {

    /* renamed from: f */
    public static final cajw f174883f;

    /* renamed from: g */
    private static volatile bxxk f174884g;

    /* renamed from: a */
    public int f174885a;

    /* renamed from: b */
    public double f174886b;

    /* renamed from: c */
    public double f174887c;

    /* renamed from: d */
    public float f174888d;

    /* renamed from: e */
    public long f174889e;

    static {
        cajw cajw = new cajw();
        f174883f = cajw;
        bxvk.m124024a(cajw.class, cajw);
    }

    private cajw() {
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
            return bxvk.m124022a(f174883f, "\u0001\u0004\u0000\u0001\u0001\u0005\u0004\u0000\u0000\u0000\u0001က\u0000\u0002က\u0001\u0003ခ\u0002\u0005ဂ\u0004", new Object[]{"a", "b", "c", "d", "e"});
        } else if (i2 == 3) {
            return new cajw();
        } else {
            if (i2 == 4) {
                return new bxvd(f174883f);
            }
            if (i2 == 5) {
                return f174883f;
            }
            bxxk bxxk = f174884g;
            if (bxxk == null) {
                synchronized (cajw.class) {
                    bxxk = f174884g;
                    if (bxxk == null) {
                        bxxk = new bxve(f174883f);
                        f174884g = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
