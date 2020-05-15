package p000;

/* renamed from: cbih */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cbih extends GeneratedMessageLite implements bxxd {

    /* renamed from: h */
    public static final cbih f177242h;

    /* renamed from: i */
    private static volatile bxxk f177243i;

    /* renamed from: a */
    public String f177244a = "";

    /* renamed from: b */
    public String f177245b = "";

    /* renamed from: c */
    public String f177246c = "";

    /* renamed from: d */
    public String f177247d = "";

    /* renamed from: e */
    public cbio f177248e;

    /* renamed from: f */
    public String f177249f = "";

    /* renamed from: g */
    public bxte f177250g;

    static {
        cbih cbih = new cbih();
        f177242h = cbih;
        GeneratedMessageLite.m124024a(cbih.class, cbih);
    }

    private cbih() {
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
            return GeneratedMessageLite.m124022a(f177242h, "\u0000\u0007\u0000\u0000\u0001\u0007\u0007\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004Ȉ\u0005\t\u0006Ȉ\u0007\t", new Object[]{"a", "b", "c", "d", "e", "f", "g"});
        } else if (i2 == 3) {
            return new cbih();
        } else {
            if (i2 == 4) {
                return new bxvd(f177242h);
            }
            if (i2 == 5) {
                return f177242h;
            }
            bxxk bxxk = f177243i;
            if (bxxk == null) {
                synchronized (cbih.class) {
                    bxxk = f177243i;
                    if (bxxk == null) {
                        bxxk = new bxve(f177242h);
                        f177243i = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
