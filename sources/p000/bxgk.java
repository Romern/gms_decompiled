package p000;

/* renamed from: bxgk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bxgk extends bxvk implements bxxd {

    /* renamed from: c */
    public static final bxgk f163264c;

    /* renamed from: d */
    private static volatile bxxk f163265d;

    /* renamed from: a */
    public int f163266a;

    /* renamed from: b */
    public int f163267b;

    static {
        bxgk bxgk = new bxgk();
        f163264c = bxgk;
        bxvk.m124024a(bxgk.class, bxgk);
    }

    private bxgk() {
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
            return bxvk.m124022a(f163264c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"a", "b", bxco.m122578b()});
        } else if (i2 == 3) {
            return new bxgk();
        } else {
            if (i2 == 4) {
                return new bxvd(f163264c);
            }
            if (i2 == 5) {
                return f163264c;
            }
            bxxk bxxk = f163265d;
            if (bxxk == null) {
                synchronized (bxgk.class) {
                    bxxk = f163265d;
                    if (bxxk == null) {
                        bxxk = new bxve(f163264c);
                        f163265d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
