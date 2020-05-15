package p000;

/* renamed from: btnu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class btnu extends GeneratedMessageLite implements bxxd {

    /* renamed from: b */
    public static final btnu f149686b;

    /* renamed from: c */
    private static volatile bxxk f149687c;

    /* renamed from: a */
    public bxwc f149688a = bxxn.f165040b;

    static {
        btnu btnu = new btnu();
        f149686b = btnu;
        GeneratedMessageLite.m124024a(btnu.class, btnu);
    }

    private btnu() {
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
            return GeneratedMessageLite.m124022a(f149686b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", btpn.class});
        } else if (i2 == 3) {
            return new btnu();
        } else {
            if (i2 == 4) {
                return new bxvd(f149686b);
            }
            if (i2 == 5) {
                return f149686b;
            }
            bxxk bxxk = f149687c;
            if (bxxk == null) {
                synchronized (btnu.class) {
                    bxxk = f149687c;
                    if (bxxk == null) {
                        bxxk = new bxve(f149686b);
                        f149687c = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
