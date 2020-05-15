package p000;

/* renamed from: btfm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class btfm extends GeneratedMessageLite implements bxxd {

    /* renamed from: b */
    public static final btfm f148710b;

    /* renamed from: c */
    private static volatile bxxk f148711c;

    /* renamed from: a */
    public String f148712a = "";

    static {
        btfm btfm = new btfm();
        f148710b = btfm;
        GeneratedMessageLite.m124024a(btfm.class, btfm);
    }

    private btfm() {
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
            return GeneratedMessageLite.m124022a(f148710b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"a"});
        } else if (i2 == 3) {
            return new btfm();
        } else {
            if (i2 == 4) {
                return new bxvd(f148710b);
            }
            if (i2 == 5) {
                return f148710b;
            }
            bxxk bxxk = f148711c;
            if (bxxk == null) {
                synchronized (btfm.class) {
                    bxxk = f148711c;
                    if (bxxk == null) {
                        bxxk = new bxve(f148710b);
                        f148711c = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
