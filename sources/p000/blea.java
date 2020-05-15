package p000;

/* renamed from: blea */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class blea extends bxvk implements bxxd {

    /* renamed from: d */
    public static final blea f126162d;

    /* renamed from: e */
    private static volatile bxxk f126163e;

    /* renamed from: a */
    public int f126164a;

    /* renamed from: b */
    public bleu f126165b;

    /* renamed from: c */
    public String f126166c = "";

    static {
        blea blea = new blea();
        f126162d = blea;
        bxvk.m124024a(blea.class, blea);
    }

    private blea() {
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
            return bxvk.m124022a(f126162d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဈ\u0001", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new blea();
        } else {
            if (i2 == 4) {
                return new bxvd(f126162d);
            }
            if (i2 == 5) {
                return f126162d;
            }
            bxxk bxxk = f126163e;
            if (bxxk == null) {
                synchronized (blea.class) {
                    bxxk = f126163e;
                    if (bxxk == null) {
                        bxxk = new bxve(f126162d);
                        f126163e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
