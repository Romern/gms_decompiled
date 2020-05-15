package p000;

/* renamed from: bzxd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bzxd extends GeneratedMessageLite implements bxxd {

    /* renamed from: c */
    public static final bzxd f171731c;

    /* renamed from: d */
    private static volatile bxxk f171732d;

    /* renamed from: a */
    public int f171733a;

    /* renamed from: b */
    public String f171734b = "";

    static {
        bzxd bzxd = new bzxd();
        f171731c = bzxd;
        GeneratedMessageLite.m124024a(bzxd.class, bzxd);
    }

    private bzxd() {
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
            return GeneratedMessageLite.m124022a(f171731c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"a", "b"});
        } else if (i2 == 3) {
            return new bzxd();
        } else {
            if (i2 == 4) {
                return new bxvd(f171731c);
            }
            if (i2 == 5) {
                return f171731c;
            }
            bxxk bxxk = f171732d;
            if (bxxk == null) {
                synchronized (bzxd.class) {
                    bxxk = f171732d;
                    if (bxxk == null) {
                        bxxk = new bxve(f171731c);
                        f171732d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
