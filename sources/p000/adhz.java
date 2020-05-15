package p000;

/* renamed from: adhz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class adhz extends GeneratedMessageLite implements bxxd {

    /* renamed from: e */
    public static final adhz f61753e;

    /* renamed from: f */
    private static volatile bxxk f61754f;

    /* renamed from: a */
    public String f61755a = "";

    /* renamed from: b */
    public String f61756b = "";

    /* renamed from: c */
    public String f61757c = "";

    /* renamed from: d */
    public adic f61758d;

    static {
        adhz adhz = new adhz();
        f61753e = adhz;
        GeneratedMessageLite.m124024a(adhz.class, adhz);
    }

    private adhz() {
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
            return GeneratedMessageLite.m124022a(f61753e, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004\t", new Object[]{"a", "b", "c", "d"});
        } else if (i2 == 3) {
            return new adhz();
        } else {
            if (i2 == 4) {
                return new bxvd(f61753e);
            }
            if (i2 == 5) {
                return f61753e;
            }
            bxxk bxxk = f61754f;
            if (bxxk == null) {
                synchronized (adhz.class) {
                    bxxk = f61754f;
                    if (bxxk == null) {
                        bxxk = new bxve(f61753e);
                        f61754f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
