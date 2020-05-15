package p000;

/* renamed from: bslx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bslx extends GeneratedMessageLite implements bxxd {

    /* renamed from: c */
    public static final bslx f144975c;

    /* renamed from: e */
    private static volatile bxxk f144976e;

    /* renamed from: a */
    public bxwc f144977a = bxxn.f165040b;

    /* renamed from: b */
    public bslz f144978b;

    /* renamed from: d */
    private int f144979d;

    static {
        bslx bslx = new bslx();
        f144975c = bslx;
        GeneratedMessageLite.m124024a(bslx.class, bslx);
    }

    private bslx() {
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
            return GeneratedMessageLite.m124022a(f144975c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002ဉ\u0000", new Object[]{"d", "a", bsmf.class, "b"});
        } else if (i2 == 3) {
            return new bslx();
        } else {
            if (i2 == 4) {
                return new bxvd(f144975c);
            }
            if (i2 == 5) {
                return f144975c;
            }
            bxxk bxxk = f144976e;
            if (bxxk == null) {
                synchronized (bslx.class) {
                    bxxk = f144976e;
                    if (bxxk == null) {
                        bxxk = new bxve(f144975c);
                        f144976e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
