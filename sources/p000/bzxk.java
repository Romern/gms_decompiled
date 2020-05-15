package p000;

/* renamed from: bzxk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bzxk extends GeneratedMessageLite implements bxxd {

    /* renamed from: c */
    public static final bzxk f171762c;

    /* renamed from: e */
    private static volatile bxxk f171763e;

    /* renamed from: a */
    public String f171764a = "";

    /* renamed from: b */
    public bxwc f171765b = bxxn.f165040b;

    /* renamed from: d */
    private int f171766d;

    static {
        bzxk bzxk = new bzxk();
        f171762c = bzxk;
        GeneratedMessageLite.m124024a(bzxk.class, bzxk);
    }

    private bzxk() {
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
            return GeneratedMessageLite.m124022a(f171762c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001a", new Object[]{"d", "a", "b"});
        } else if (i2 == 3) {
            return new bzxk();
        } else {
            if (i2 == 4) {
                return new bxvd(f171762c);
            }
            if (i2 == 5) {
                return f171762c;
            }
            bxxk bxxk = f171763e;
            if (bxxk == null) {
                synchronized (bzxk.class) {
                    bxxk = f171763e;
                    if (bxxk == null) {
                        bxxk = new bxve(f171762c);
                        f171763e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
