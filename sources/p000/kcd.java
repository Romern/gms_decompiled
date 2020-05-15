package p000;

/* renamed from: kcd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class kcd extends bxvk implements bxxd {

    /* renamed from: c */
    public static final kcd f23737c;

    /* renamed from: d */
    private static volatile bxxk f23738d;

    /* renamed from: a */
    public int f23739a = 0;

    /* renamed from: b */
    public Object f23740b;

    static {
        kcd kcd = new kcd();
        f23737c = kcd;
        bxvk.m124024a(kcd.class, kcd);
    }

    private kcd() {
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
            return bxvk.m124022a(f23737c, "\u0000\u0004\u0001\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u00015\u0000\u00027\u0000\u0003Ȼ\u0000\u0004:\u0000", new Object[]{"b", "a"});
        } else if (i2 == 3) {
            return new kcd();
        } else {
            if (i2 == 4) {
                return new bxvd(f23737c);
            }
            if (i2 == 5) {
                return f23737c;
            }
            bxxk bxxk = f23738d;
            if (bxxk == null) {
                synchronized (kcd.class) {
                    bxxk = f23738d;
                    if (bxxk == null) {
                        bxxk = new bxve(f23737c);
                        f23738d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
