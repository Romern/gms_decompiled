package p000;

/* renamed from: bmoa */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bmoa extends GeneratedMessageLite implements bxxd {

    /* renamed from: c */
    public static final bmoa f130200c;

    /* renamed from: e */
    private static volatile bxxk f130201e;

    /* renamed from: a */
    public String f130202a = "";

    /* renamed from: b */
    public long f130203b;

    /* renamed from: d */
    private int f130204d;

    static {
        bmoa bmoa = new bmoa();
        f130200c = bmoa;
        GeneratedMessageLite.m124024a(bmoa.class, bmoa);
    }

    private bmoa() {
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
            return GeneratedMessageLite.m124022a(f130200c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဂ\u0001", new Object[]{"d", "a", "b"});
        } else if (i2 == 3) {
            return new bmoa();
        } else {
            if (i2 == 4) {
                return new bxvd(f130200c);
            }
            if (i2 == 5) {
                return f130200c;
            }
            bxxk bxxk = f130201e;
            if (bxxk == null) {
                synchronized (bmoa.class) {
                    bxxk = f130201e;
                    if (bxxk == null) {
                        bxxk = new bxve(f130200c);
                        f130201e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
