package p000;

/* renamed from: bsma */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bsma extends GeneratedMessageLite implements bxxd {

    /* renamed from: b */
    public static final bsma f144989b;

    /* renamed from: d */
    private static volatile bxxk f144990d;

    /* renamed from: a */
    public bsmf f144991a;

    /* renamed from: c */
    private int f144992c;

    static {
        bsma bsma = new bsma();
        f144989b = bsma;
        GeneratedMessageLite.m124024a(bsma.class, bsma);
    }

    private bsma() {
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
            return GeneratedMessageLite.m124022a(f144989b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"c", "a"});
        } else if (i2 == 3) {
            return new bsma();
        } else {
            if (i2 == 4) {
                return new bxvd(f144989b);
            }
            if (i2 == 5) {
                return f144989b;
            }
            bxxk bxxk = f144990d;
            if (bxxk == null) {
                synchronized (bsma.class) {
                    bxxk = f144990d;
                    if (bxxk == null) {
                        bxxk = new bxve(f144989b);
                        f144990d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
