package p000;

/* renamed from: mcq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class mcq extends GeneratedMessageLite implements bxxd {

    /* renamed from: d */
    public static final mcq f33439d;

    /* renamed from: e */
    private static volatile bxxk f33440e;

    /* renamed from: a */
    public int f33441a;

    /* renamed from: b */
    public bxvt f33442b = bxvm.f164965b;

    /* renamed from: c */
    public ByteString f33443c = ByteString.f164797b;

    static {
        mcq mcq = new mcq();
        f33439d = mcq;
        GeneratedMessageLite.m124024a(mcq.class, mcq);
    }

    private mcq() {
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
            return GeneratedMessageLite.m124022a(f33439d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001'\u0002ည\u0000", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new mcq();
        } else {
            if (i2 == 4) {
                return new bxvd(f33439d);
            }
            if (i2 == 5) {
                return f33439d;
            }
            bxxk bxxk = f33440e;
            if (bxxk == null) {
                synchronized (mcq.class) {
                    bxxk = f33440e;
                    if (bxxk == null) {
                        bxxk = new bxve(f33439d);
                        f33440e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
