package p000;

/* renamed from: bsqb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bsqb extends GeneratedMessageLite implements bxxd {

    /* renamed from: d */
    public static final bsqb f146615d;

    /* renamed from: e */
    private static volatile bxxk f146616e;

    /* renamed from: a */
    public int f146617a;

    /* renamed from: b */
    public String f146618b = "";

    /* renamed from: c */
    public int f146619c;

    static {
        bsqb bsqb = new bsqb();
        f146615d = bsqb;
        GeneratedMessageLite.m124024a(bsqb.class, bsqb);
    }

    private bsqb() {
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
            return GeneratedMessageLite.m124022a(f146615d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဌ\u0001", new Object[]{"a", "b", "c", bsqa.f146614a});
        } else if (i2 == 3) {
            return new bsqb();
        } else {
            if (i2 == 4) {
                return new bxvd(f146615d);
            }
            if (i2 == 5) {
                return f146615d;
            }
            bxxk bxxk = f146616e;
            if (bxxk == null) {
                synchronized (bsqb.class) {
                    bxxk = f146616e;
                    if (bxxk == null) {
                        bxxk = new bxve(f146615d);
                        f146616e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
