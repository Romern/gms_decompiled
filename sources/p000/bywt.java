package p000;

/* renamed from: bywt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bywt extends GeneratedMessageLite implements bxxd {

    /* renamed from: e */
    public static final bywt f168658e;

    /* renamed from: f */
    private static volatile bxxk f168659f;

    /* renamed from: a */
    public int f168660a;

    /* renamed from: b */
    public String f168661b = "";

    /* renamed from: c */
    public String f168662c = "";

    /* renamed from: d */
    public long f168663d;

    static {
        bywt bywt = new bywt();
        f168658e = bywt;
        GeneratedMessageLite.m124024a(bywt.class, bywt);
    }

    private bywt() {
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
            return GeneratedMessageLite.m124022a(f168658e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဂ\u0002", new Object[]{"a", "b", "c", "d"});
        } else if (i2 == 3) {
            return new bywt();
        } else {
            if (i2 == 4) {
                return new bxvd(f168658e);
            }
            if (i2 == 5) {
                return f168658e;
            }
            bxxk bxxk = f168659f;
            if (bxxk == null) {
                synchronized (bywt.class) {
                    bxxk = f168659f;
                    if (bxxk == null) {
                        bxxk = new bxve(f168658e);
                        f168659f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
