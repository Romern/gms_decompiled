package p000;

/* renamed from: bzyd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bzyd extends bxvk implements bxxd {

    /* renamed from: f */
    public static final bzyd f171847f;

    /* renamed from: g */
    private static volatile bxxk f171848g;

    /* renamed from: a */
    public long f171849a;

    /* renamed from: b */
    public String f171850b = "";

    /* renamed from: c */
    public long f171851c;

    /* renamed from: d */
    public int f171852d;

    /* renamed from: e */
    public bzyr f171853e;

    static {
        bzyd bzyd = new bzyd();
        f171847f = bzyd;
        bxvk.m124024a(bzyd.class, bzyd);
    }

    private bzyd() {
        bxxn bxxn = bxxn.f165040b;
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
            return bxvk.m124022a(f171847f, "\u0000\u0005\u0000\u0000\u0001\u0006\u0005\u0000\u0000\u0000\u0001\u0002\u0002Ȉ\u0004\u0002\u0005\u0004\u0006\t", new Object[]{"a", "b", "c", "d", "e"});
        } else if (i2 == 3) {
            return new bzyd();
        } else {
            if (i2 == 4) {
                return new bxvd(f171847f);
            }
            if (i2 == 5) {
                return f171847f;
            }
            bxxk bxxk = f171848g;
            if (bxxk == null) {
                synchronized (bzyd.class) {
                    bxxk = f171848g;
                    if (bxxk == null) {
                        bxxk = new bxve(f171847f);
                        f171848g = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
