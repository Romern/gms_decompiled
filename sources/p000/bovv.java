package p000;

/* renamed from: bovv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bovv extends GeneratedMessageLite implements bxxd {

    /* renamed from: d */
    public static final bovv f135058d;

    /* renamed from: e */
    private static volatile bxxk f135059e;

    /* renamed from: a */
    public int f135060a;

    /* renamed from: b */
    public int f135061b;

    /* renamed from: c */
    public int f135062c;

    static {
        bovv bovv = new bovv();
        f135058d = bovv;
        GeneratedMessageLite.m124024a(bovv.class, bovv);
    }

    private bovv() {
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
            return GeneratedMessageLite.m124022a(f135058d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဌ\u0001", new Object[]{"a", "b", bowj.f135142a, "c", bovu.f135057a});
        } else if (i2 == 3) {
            return new bovv();
        } else {
            if (i2 == 4) {
                return new bxvd(f135058d);
            }
            if (i2 == 5) {
                return f135058d;
            }
            bxxk bxxk = f135059e;
            if (bxxk == null) {
                synchronized (bovv.class) {
                    bxxk = f135059e;
                    if (bxxk == null) {
                        bxxk = new bxve(f135058d);
                        f135059e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
