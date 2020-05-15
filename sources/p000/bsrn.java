package p000;

/* renamed from: bsrn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bsrn extends GeneratedMessageLite implements bxxd {

    /* renamed from: d */
    public static final bsrn f146780d;

    /* renamed from: e */
    private static volatile bxxk f146781e;

    /* renamed from: a */
    public int f146782a;

    /* renamed from: b */
    public bssl f146783b;

    /* renamed from: c */
    public String f146784c = "";

    static {
        bsrn bsrn = new bsrn();
        f146780d = bsrn;
        GeneratedMessageLite.m124024a(bsrn.class, bsrn);
    }

    private bsrn() {
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
            return GeneratedMessageLite.m124022a(f146780d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဈ\u0001", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new bsrn();
        } else {
            if (i2 == 4) {
                return new bxvd(f146780d);
            }
            if (i2 == 5) {
                return f146780d;
            }
            bxxk bxxk = f146781e;
            if (bxxk == null) {
                synchronized (bsrn.class) {
                    bxxk = f146781e;
                    if (bxxk == null) {
                        bxxk = new bxve(f146780d);
                        f146781e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
