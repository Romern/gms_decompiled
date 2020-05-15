package p000;

/* renamed from: bzvj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bzvj extends GeneratedMessageLite implements bxxd {

    /* renamed from: d */
    public static final bzvj f171518d;

    /* renamed from: e */
    private static volatile bxxk f171519e;

    /* renamed from: a */
    public int f171520a;

    /* renamed from: b */
    public boolean f171521b;

    /* renamed from: c */
    public bzvs f171522c;

    static {
        bzvj bzvj = new bzvj();
        f171518d = bzvj;
        GeneratedMessageLite.m124024a(bzvj.class, bzvj);
    }

    private bzvj() {
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
            return GeneratedMessageLite.m124022a(f171518d, "\u0001\u0002\u0000\u0001\u0002\u0004\u0002\u0000\u0000\u0000\u0002ဇ\u0000\u0004ဉ\u0001", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new bzvj();
        } else {
            if (i2 == 4) {
                return new bxvd(f171518d);
            }
            if (i2 == 5) {
                return f171518d;
            }
            bxxk bxxk = f171519e;
            if (bxxk == null) {
                synchronized (bzvj.class) {
                    bxxk = f171519e;
                    if (bxxk == null) {
                        bxxk = new bxve(f171518d);
                        f171519e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
