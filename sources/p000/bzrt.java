package p000;

/* renamed from: bzrt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bzrt extends bxvk implements bxxd {

    /* renamed from: e */
    public static final bzrt f171195e;

    /* renamed from: f */
    private static volatile bxxk f171196f;

    /* renamed from: a */
    public float f171197a;

    /* renamed from: b */
    public float f171198b;

    /* renamed from: c */
    public float f171199c;

    /* renamed from: d */
    public bxva f171200d;

    static {
        bzrt bzrt = new bzrt();
        f171195e = bzrt;
        bxvk.m124024a(bzrt.class, bzrt);
    }

    private bzrt() {
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
            return bxvk.m124022a(f171195e, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u0001\u0002\u0001\u0003\u0001\u0004\t", new Object[]{"a", "b", "c", "d"});
        } else if (i2 == 3) {
            return new bzrt();
        } else {
            if (i2 == 4) {
                return new bxvd(f171195e);
            }
            if (i2 == 5) {
                return f171195e;
            }
            bxxk bxxk = f171196f;
            if (bxxk == null) {
                synchronized (bzrt.class) {
                    bxxk = f171196f;
                    if (bxxk == null) {
                        bxxk = new bxve(f171195e);
                        f171196f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
