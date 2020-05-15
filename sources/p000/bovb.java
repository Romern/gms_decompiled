package p000;

/* renamed from: bovb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bovb extends GeneratedMessageLite implements bxxd {

    /* renamed from: c */
    public static final bovb f134982c;

    /* renamed from: d */
    private static volatile bxxk f134983d;

    /* renamed from: a */
    public int f134984a;

    /* renamed from: b */
    public long f134985b;

    static {
        bovb bovb = new bovb();
        f134982c = bovb;
        GeneratedMessageLite.m124024a(bovb.class, bovb);
    }

    private bovb() {
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
            return GeneratedMessageLite.m124022a(f134982c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဂ\u0000", new Object[]{"a", "b"});
        } else if (i2 == 3) {
            return new bovb();
        } else {
            if (i2 == 4) {
                return new bxvd(f134982c);
            }
            if (i2 == 5) {
                return f134982c;
            }
            bxxk bxxk = f134983d;
            if (bxxk == null) {
                synchronized (bovb.class) {
                    bxxk = f134983d;
                    if (bxxk == null) {
                        bxxk = new bxve(f134982c);
                        f134983d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
