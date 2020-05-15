package p000;

/* renamed from: born */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class born extends GeneratedMessageLite implements bxxd {

    /* renamed from: d */
    public static final born f134457d;

    /* renamed from: e */
    private static volatile bxxk f134458e;

    /* renamed from: a */
    public int f134459a;

    /* renamed from: b */
    public borl f134460b;

    /* renamed from: c */
    public boro f134461c;

    static {
        born born = new born();
        f134457d = born;
        GeneratedMessageLite.m124024a(born.class, born);
    }

    private born() {
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
            return GeneratedMessageLite.m124022a(f134457d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new born();
        } else {
            if (i2 == 4) {
                return new bxvd(f134457d);
            }
            if (i2 == 5) {
                return f134457d;
            }
            bxxk bxxk = f134458e;
            if (bxxk == null) {
                synchronized (born.class) {
                    bxxk = f134458e;
                    if (bxxk == null) {
                        bxxk = new bxve(f134457d);
                        f134458e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
