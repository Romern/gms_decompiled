package p000;

/* renamed from: bzxe */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bzxe extends GeneratedMessageLite implements bxxd {

    /* renamed from: d */
    public static final bzxe f171735d;

    /* renamed from: e */
    private static volatile bxxk f171736e;

    /* renamed from: a */
    public int f171737a;

    /* renamed from: b */
    public String f171738b = "";

    /* renamed from: c */
    public bzxd f171739c;

    static {
        bzxe bzxe = new bzxe();
        f171735d = bzxe;
        GeneratedMessageLite.m124024a(bzxe.class, bzxe);
    }

    private bzxe() {
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
            return GeneratedMessageLite.m124022a(f171735d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဉ\u0001", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new bzxe();
        } else {
            if (i2 == 4) {
                return new bxvd(f171735d);
            }
            if (i2 == 5) {
                return f171735d;
            }
            bxxk bxxk = f171736e;
            if (bxxk == null) {
                synchronized (bzxe.class) {
                    bxxk = f171736e;
                    if (bxxk == null) {
                        bxxk = new bxve(f171735d);
                        f171736e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
