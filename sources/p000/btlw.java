package p000;

/* renamed from: btlw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class btlw extends GeneratedMessageLite implements bxxd {

    /* renamed from: g */
    public static final btlw f149442g;

    /* renamed from: i */
    private static volatile bxxk f149443i;

    /* renamed from: a */
    public String f149444a = "";

    /* renamed from: b */
    public String f149445b = "";

    /* renamed from: c */
    public String f149446c = "";

    /* renamed from: d */
    public String f149447d = "";

    /* renamed from: e */
    public String f149448e = "";

    /* renamed from: f */
    public btmr f149449f;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public boolean f149450h;

    static {
        btlw btlw = new btlw();
        f149442g = btlw;
        GeneratedMessageLite.m124024a(btlw.class, btlw);
    }

    private btlw() {
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
            return GeneratedMessageLite.m124022a(f149442g, "\u0000\u0007\u0000\u0000\u0001\u0007\u0007\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004\t\u0005\u0007\u0006Ȉ\u0007Ȉ", new Object[]{"a", "b", "c", "f", "h", "d", "e"});
        } else if (i2 == 3) {
            return new btlw();
        } else {
            if (i2 == 4) {
                return new bxvd(f149442g);
            }
            if (i2 == 5) {
                return f149442g;
            }
            bxxk bxxk = f149443i;
            if (bxxk == null) {
                synchronized (btlw.class) {
                    bxxk = f149443i;
                    if (bxxk == null) {
                        bxxk = new bxve(f149442g);
                        f149443i = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
