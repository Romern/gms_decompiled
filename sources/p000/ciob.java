package p000;

/* renamed from: ciob */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ciob extends GeneratedMessageLite implements bxxd {

    /* renamed from: c */
    public static final ciob f191036c;

    /* renamed from: d */
    private static volatile bxxk f191037d;

    /* renamed from: a */
    public int f191038a;

    /* renamed from: b */
    public cioa f191039b;

    static {
        ciob ciob = new ciob();
        f191036c = ciob;
        GeneratedMessageLite.m124024a(ciob.class, ciob);
    }

    private ciob() {
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
            return GeneratedMessageLite.m124022a(f191036c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"a", "b"});
        } else if (i2 == 3) {
            return new ciob();
        } else {
            if (i2 == 4) {
                return new bxvd(f191036c);
            }
            if (i2 == 5) {
                return f191036c;
            }
            bxxk bxxk = f191037d;
            if (bxxk == null) {
                synchronized (ciob.class) {
                    bxxk = f191037d;
                    if (bxxk == null) {
                        bxxk = new bxve(f191036c);
                        f191037d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
