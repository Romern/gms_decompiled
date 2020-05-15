package p000;

/* renamed from: btms */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class btms extends GeneratedMessageLite implements bxxd {

    /* renamed from: b */
    public static final btms f149543b;

    /* renamed from: c */
    private static volatile bxxk f149544c;

    /* renamed from: a */
    public btiy f149545a;

    static {
        btms btms = new btms();
        f149543b = btms;
        GeneratedMessageLite.m124024a(btms.class, btms);
    }

    private btms() {
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
            return GeneratedMessageLite.m124022a(f149543b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\t", new Object[]{"a"});
        } else if (i2 == 3) {
            return new btms();
        } else {
            if (i2 == 4) {
                return new bxvd(f149543b);
            }
            if (i2 == 5) {
                return f149543b;
            }
            bxxk bxxk = f149544c;
            if (bxxk == null) {
                synchronized (btms.class) {
                    bxxk = f149544c;
                    if (bxxk == null) {
                        bxxk = new bxve(f149543b);
                        f149544c = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
