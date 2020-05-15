package p000;

/* renamed from: bxmi */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bxmi extends bxvk implements bxxd {

    /* renamed from: c */
    public static final bxmi f163937c;

    /* renamed from: e */
    private static volatile bxxk f163938e;

    /* renamed from: a */
    public int f163939a;

    /* renamed from: b */
    public float f163940b;

    /* renamed from: d */
    private int f163941d;

    static {
        bxmi bxmi = new bxmi();
        f163937c = bxmi;
        bxvk.m124024a(bxmi.class, bxmi);
    }

    private bxmi() {
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
            return bxvk.m124022a(f163937c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002ခ\u0001", new Object[]{"d", "a", "b"});
        } else if (i2 == 3) {
            return new bxmi();
        } else {
            if (i2 == 4) {
                return new bxvd(f163937c);
            }
            if (i2 == 5) {
                return f163937c;
            }
            bxxk bxxk = f163938e;
            if (bxxk == null) {
                synchronized (bxmi.class) {
                    bxxk = f163938e;
                    if (bxxk == null) {
                        bxxk = new bxve(f163937c);
                        f163938e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
