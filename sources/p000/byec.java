package p000;

/* renamed from: byec */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class byec extends GeneratedMessageLite implements bxxd {

    /* renamed from: b */
    public static final byec f165890b;

    /* renamed from: c */
    private static volatile bxxk f165891c;

    /* renamed from: a */
    public long f165892a;

    static {
        byec byec = new byec();
        f165890b = byec;
        GeneratedMessageLite.m124024a(byec.class, byec);
    }

    private byec() {
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
            return GeneratedMessageLite.m124022a(f165890b, "\u0000\u0001\u0000\u0000\u0002\u0002\u0001\u0000\u0000\u0000\u0002\u0002", new Object[]{"a"});
        } else if (i2 == 3) {
            return new byec();
        } else {
            if (i2 == 4) {
                return new bxvd(f165890b);
            }
            if (i2 == 5) {
                return f165890b;
            }
            bxxk bxxk = f165891c;
            if (bxxk == null) {
                synchronized (byec.class) {
                    bxxk = f165891c;
                    if (bxxk == null) {
                        bxxk = new bxve(f165890b);
                        f165891c = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
