package p000;

/* renamed from: abss */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class abss extends bxvk implements bxxd {

    /* renamed from: d */
    public static final abss f58154d;

    /* renamed from: e */
    private static volatile bxxk f58155e;

    /* renamed from: a */
    public int f58156a;

    /* renamed from: b */
    public absr f58157b;

    /* renamed from: c */
    public absy f58158c;

    static {
        abss abss = new abss();
        f58154d = abss;
        bxvk.m124024a(abss.class, abss);
    }

    private abss() {
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
            return bxvk.m124022a(f58154d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new abss();
        } else {
            if (i2 == 4) {
                return new bxvd(f58154d);
            }
            if (i2 == 5) {
                return f58154d;
            }
            bxxk bxxk = f58155e;
            if (bxxk == null) {
                synchronized (abss.class) {
                    bxxk = f58155e;
                    if (bxxk == null) {
                        bxxk = new bxve(f58154d);
                        f58155e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
