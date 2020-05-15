package p000;

/* renamed from: brzg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class brzg extends GeneratedMessageLite implements bxxd {

    /* renamed from: c */
    public static final brzg f143731c;

    /* renamed from: d */
    private static volatile bxxk f143732d;

    /* renamed from: a */
    public int f143733a;

    /* renamed from: b */
    public String f143734b = "";

    static {
        brzg brzg = new brzg();
        f143731c = brzg;
        GeneratedMessageLite.m124024a(brzg.class, brzg);
    }

    private brzg() {
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
            return GeneratedMessageLite.m124022a(f143731c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"a", "b"});
        } else if (i2 == 3) {
            return new brzg();
        } else {
            if (i2 == 4) {
                return new bxvd(f143731c);
            }
            if (i2 == 5) {
                return f143731c;
            }
            bxxk bxxk = f143732d;
            if (bxxk == null) {
                synchronized (brzg.class) {
                    bxxk = f143732d;
                    if (bxxk == null) {
                        bxxk = new bxve(f143731c);
                        f143732d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
