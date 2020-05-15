package p000;

/* renamed from: abec */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class abec extends GeneratedMessageLite implements bxxd {

    /* renamed from: c */
    public static final abec f57171c;

    /* renamed from: d */
    private static volatile bxxk f57172d;

    /* renamed from: a */
    public int f57173a;

    /* renamed from: b */
    public String f57174b = "";

    static {
        abec abec = new abec();
        f57171c = abec;
        GeneratedMessageLite.m124024a(abec.class, abec);
    }

    private abec() {
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
            return GeneratedMessageLite.m124022a(f57171c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"a", "b"});
        } else if (i2 == 3) {
            return new abec();
        } else {
            if (i2 == 4) {
                return new bxvd(f57171c);
            }
            if (i2 == 5) {
                return f57171c;
            }
            bxxk bxxk = f57172d;
            if (bxxk == null) {
                synchronized (abec.class) {
                    bxxk = f57172d;
                    if (bxxk == null) {
                        bxxk = new bxve(f57171c);
                        f57172d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
