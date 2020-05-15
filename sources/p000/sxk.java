package p000;

/* renamed from: sxk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class sxk extends bxvk implements bxxd {

    /* renamed from: d */
    public static final sxk f45367d;

    /* renamed from: e */
    private static volatile bxxk f45368e;

    /* renamed from: a */
    public int f45369a;

    /* renamed from: b */
    public String f45370b = "";

    /* renamed from: c */
    public String f45371c = "";

    static {
        sxk sxk = new sxk();
        f45367d = sxk;
        bxvk.m124024a(sxk.class, sxk);
    }

    private sxk() {
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
            return bxvk.m124022a(f45367d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new sxk();
        } else {
            if (i2 == 4) {
                return new bxvd(f45367d);
            }
            if (i2 == 5) {
                return f45367d;
            }
            bxxk bxxk = f45368e;
            if (bxxk == null) {
                synchronized (sxk.class) {
                    bxxk = f45368e;
                    if (bxxk == null) {
                        bxxk = new bxve(f45367d);
                        f45368e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
