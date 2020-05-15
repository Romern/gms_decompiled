package p000;

/* renamed from: adhh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class adhh extends GeneratedMessageLite implements bxxd {

    /* renamed from: d */
    public static final adhh f61701d;

    /* renamed from: e */
    private static volatile bxxk f61702e;

    /* renamed from: a */
    public String f61703a = "";

    /* renamed from: b */
    public int f61704b;

    /* renamed from: c */
    public int f61705c;

    static {
        adhh adhh = new adhh();
        f61701d = adhh;
        GeneratedMessageLite.m124024a(adhh.class, adhh);
    }

    private adhh() {
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
            return GeneratedMessageLite.m124022a(f61701d, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\f\u0003\u0004", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new adhh();
        } else {
            if (i2 == 4) {
                return new bxvd(f61701d);
            }
            if (i2 == 5) {
                return f61701d;
            }
            bxxk bxxk = f61702e;
            if (bxxk == null) {
                synchronized (adhh.class) {
                    bxxk = f61702e;
                    if (bxxk == null) {
                        bxxk = new bxve(f61701d);
                        f61702e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
