package p000;

/* renamed from: bxjo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bxjo extends bxvk implements bxxd {

    /* renamed from: c */
    public static final bxjo f163657c;

    /* renamed from: d */
    private static volatile bxxk f163658d;

    /* renamed from: a */
    public int f163659a;

    /* renamed from: b */
    public int f163660b;

    static {
        bxjo bxjo = new bxjo();
        f163657c = bxjo;
        bxvk.m124024a(bxjo.class, bxjo);
    }

    private bxjo() {
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
            return bxvk.m124022a(f163657c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"a", "b", bxjq.m122780b()});
        } else if (i2 == 3) {
            return new bxjo();
        } else {
            if (i2 == 4) {
                return new bxvd(f163657c);
            }
            if (i2 == 5) {
                return f163657c;
            }
            bxxk bxxk = f163658d;
            if (bxxk == null) {
                synchronized (bxjo.class) {
                    bxxk = f163658d;
                    if (bxxk == null) {
                        bxxk = new bxve(f163657c);
                        f163658d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
