package p000;

/* renamed from: bwjv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bwjv extends bxvk implements bxxd {

    /* renamed from: c */
    public static final bwjv f159878c;

    /* renamed from: d */
    private static volatile bxxk f159879d;

    /* renamed from: a */
    public int f159880a;

    /* renamed from: b */
    public String f159881b = "";

    static {
        bwjv bwjv = new bwjv();
        f159878c = bwjv;
        bxvk.m124024a(bwjv.class, bwjv);
    }

    private bwjv() {
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
            return bxvk.m124022a(f159878c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"a", "b"});
        } else if (i2 == 3) {
            return new bwjv();
        } else {
            if (i2 == 4) {
                return new bxvd(f159878c);
            }
            if (i2 == 5) {
                return f159878c;
            }
            bxxk bxxk = f159879d;
            if (bxxk == null) {
                synchronized (bwjv.class) {
                    bxxk = f159879d;
                    if (bxxk == null) {
                        bxxk = new bxve(f159878c);
                        f159879d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
