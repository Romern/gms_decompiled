package p000;

/* renamed from: btjt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class btjt extends GeneratedMessageLite implements bxxd {

    /* renamed from: b */
    public static final btjt f149177b;

    /* renamed from: c */
    private static volatile bxxk f149178c;

    /* renamed from: a */
    public String f149179a = "";

    static {
        btjt btjt = new btjt();
        f149177b = btjt;
        GeneratedMessageLite.m124024a(btjt.class, btjt);
    }

    private btjt() {
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
            return GeneratedMessageLite.m124022a(f149177b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"a"});
        } else if (i2 == 3) {
            return new btjt();
        } else {
            if (i2 == 4) {
                return new bxvd(f149177b);
            }
            if (i2 == 5) {
                return f149177b;
            }
            bxxk bxxk = f149178c;
            if (bxxk == null) {
                synchronized (btjt.class) {
                    bxxk = f149178c;
                    if (bxxk == null) {
                        bxxk = new bxve(f149177b);
                        f149178c = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
