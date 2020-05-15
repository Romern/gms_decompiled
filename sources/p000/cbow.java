package p000;

/* renamed from: cbow */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cbow extends GeneratedMessageLite implements bxxd {

    /* renamed from: c */
    public static final cbow f177871c;

    /* renamed from: d */
    private static volatile bxxk f177872d;

    /* renamed from: a */
    public bxvt f177873a = bxvm.f164965b;

    /* renamed from: b */
    public boolean f177874b;

    static {
        cbow cbow = new cbow();
        f177871c = cbow;
        GeneratedMessageLite.m124024a(cbow.class, cbow);
    }

    private cbow() {
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
            return GeneratedMessageLite.m124022a(f177871c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001'\u0002\u0007", new Object[]{"a", "b"});
        } else if (i2 == 3) {
            return new cbow();
        } else {
            if (i2 == 4) {
                return new bxvd((float[][]) null, (boolean[][][]) null, (byte[]) null);
            }
            if (i2 == 5) {
                return f177871c;
            }
            bxxk bxxk = f177872d;
            if (bxxk == null) {
                synchronized (cbow.class) {
                    bxxk = f177872d;
                    if (bxxk == null) {
                        bxxk = new bxve(f177871c);
                        f177872d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
