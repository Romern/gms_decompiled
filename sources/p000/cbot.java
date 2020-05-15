package p000;

/* renamed from: cbot */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cbot extends GeneratedMessageLite implements bxxd {

    /* renamed from: b */
    public static final cbot f177861b;

    /* renamed from: c */
    private static volatile bxxk f177862c;

    /* renamed from: a */
    public bxwc f177863a = bxxn.f165040b;

    static {
        cbot cbot = new cbot();
        f177861b = cbot;
        GeneratedMessageLite.m124024a(cbot.class, cbot);
    }

    private cbot() {
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
            return GeneratedMessageLite.m124022a(f177861b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", cbor.class});
        } else if (i2 == 3) {
            return new cbot();
        } else {
            if (i2 == 4) {
                return new bxvd(f177861b);
            }
            if (i2 == 5) {
                return f177861b;
            }
            bxxk bxxk = f177862c;
            if (bxxk == null) {
                synchronized (cbot.class) {
                    bxxk = f177862c;
                    if (bxxk == null) {
                        bxxk = new bxve(f177861b);
                        f177862c = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
