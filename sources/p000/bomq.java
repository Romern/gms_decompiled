package p000;

/* renamed from: bomq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bomq extends bxvk implements bxxd {

    /* renamed from: c */
    public static final bomq f133696c;

    /* renamed from: d */
    private static volatile bxxk f133697d;

    /* renamed from: a */
    public int f133698a;

    /* renamed from: b */
    public bomw f133699b;

    static {
        bomq bomq = new bomq();
        f133696c = bomq;
        bxvk.m124024a(bomq.class, bomq);
    }

    private bomq() {
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
            return bxvk.m124022a(f133696c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"a", "b"});
        } else if (i2 == 3) {
            return new bomq();
        } else {
            if (i2 == 4) {
                return new bxvd(f133696c);
            }
            if (i2 == 5) {
                return f133696c;
            }
            bxxk bxxk = f133697d;
            if (bxxk == null) {
                synchronized (bomq.class) {
                    bxxk = f133697d;
                    if (bxxk == null) {
                        bxxk = new bxve(f133696c);
                        f133697d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
