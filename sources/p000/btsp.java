package p000;

/* renamed from: btsp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class btsp extends GeneratedMessageLite implements bxxd {

    /* renamed from: d */
    public static final btsp f150248d;

    /* renamed from: e */
    private static volatile bxxk f150249e;

    /* renamed from: a */
    public int f150250a;

    /* renamed from: b */
    public bzvu f150251b;

    /* renamed from: c */
    public String f150252c = "";

    static {
        btsp btsp = new btsp();
        f150248d = btsp;
        GeneratedMessageLite.m124024a(btsp.class, btsp);
    }

    private btsp() {
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
            return GeneratedMessageLite.m124022a(f150248d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဈ\u0001", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new btsp();
        } else {
            if (i2 == 4) {
                return new bxvd(f150248d);
            }
            if (i2 == 5) {
                return f150248d;
            }
            bxxk bxxk = f150249e;
            if (bxxk == null) {
                synchronized (btsp.class) {
                    bxxk = f150249e;
                    if (bxxk == null) {
                        bxxk = new bxve(f150248d);
                        f150249e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
