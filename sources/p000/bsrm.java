package p000;

/* renamed from: bsrm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bsrm extends GeneratedMessageLite implements bxxd {

    /* renamed from: c */
    public static final bsrm f146776c;

    /* renamed from: d */
    private static volatile bxxk f146777d;

    /* renamed from: a */
    public int f146778a;

    /* renamed from: b */
    public bssl f146779b;

    static {
        bsrm bsrm = new bsrm();
        f146776c = bsrm;
        GeneratedMessageLite.m124024a(bsrm.class, bsrm);
    }

    private bsrm() {
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
            return GeneratedMessageLite.m124022a(f146776c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"a", "b"});
        } else if (i2 == 3) {
            return new bsrm();
        } else {
            if (i2 == 4) {
                return new bxvd(f146776c);
            }
            if (i2 == 5) {
                return f146776c;
            }
            bxxk bxxk = f146777d;
            if (bxxk == null) {
                synchronized (bsrm.class) {
                    bxxk = f146777d;
                    if (bxxk == null) {
                        bxxk = new bxve(f146776c);
                        f146777d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
