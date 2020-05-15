package p000;

/* renamed from: adhi */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class adhi extends GeneratedMessageLite implements bxxd {

    /* renamed from: c */
    public static final adhi f61706c;

    /* renamed from: d */
    private static volatile bxxk f61707d;

    /* renamed from: a */
    public String f61708a = "";

    /* renamed from: b */
    public int f61709b;

    static {
        adhi adhi = new adhi();
        f61706c = adhi;
        GeneratedMessageLite.m124024a(adhi.class, adhi);
    }

    private adhi() {
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
            return GeneratedMessageLite.m124022a(f61706c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002\u0004", new Object[]{"a", "b"});
        } else if (i2 == 3) {
            return new adhi();
        } else {
            if (i2 == 4) {
                return new bxvd(f61706c);
            }
            if (i2 == 5) {
                return f61706c;
            }
            bxxk bxxk = f61707d;
            if (bxxk == null) {
                synchronized (adhi.class) {
                    bxxk = f61707d;
                    if (bxxk == null) {
                        bxxk = new bxve(f61706c);
                        f61707d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
