package p000;

/* renamed from: abps */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class abps extends GeneratedMessageLite implements bxxd {

    /* renamed from: c */
    public static final abps f57896c;

    /* renamed from: d */
    private static volatile bxxk f57897d;

    /* renamed from: a */
    public int f57898a;

    /* renamed from: b */
    public String f57899b = "";

    static {
        abps abps = new abps();
        f57896c = abps;
        GeneratedMessageLite.m124024a(abps.class, abps);
    }

    private abps() {
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
            return GeneratedMessageLite.m124022a(f57896c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"a", "b"});
        } else if (i2 == 3) {
            return new abps();
        } else {
            if (i2 == 4) {
                return new bxvd(f57896c);
            }
            if (i2 == 5) {
                return f57896c;
            }
            bxxk bxxk = f57897d;
            if (bxxk == null) {
                synchronized (abps.class) {
                    bxxk = f57897d;
                    if (bxxk == null) {
                        bxxk = new bxve(f57896c);
                        f57897d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
