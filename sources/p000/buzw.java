package p000;

/* renamed from: buzw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class buzw extends GeneratedMessageLite implements bxxd {

    /* renamed from: d */
    public static final buzw f155438d;

    /* renamed from: e */
    private static volatile bxxk f155439e;

    /* renamed from: a */
    public int f155440a;

    /* renamed from: b */
    public ByteString f155441b = ByteString.f164797b;

    /* renamed from: c */
    public String f155442c = "";

    static {
        buzw buzw = new buzw();
        f155438d = buzw;
        GeneratedMessageLite.m124024a(buzw.class, buzw);
    }

    private buzw() {
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
            return GeneratedMessageLite.m124022a(f155438d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ည\u0000\u0002ဈ\u0001", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new buzw();
        } else {
            if (i2 == 4) {
                return new bxvd(f155438d);
            }
            if (i2 == 5) {
                return f155438d;
            }
            bxxk bxxk = f155439e;
            if (bxxk == null) {
                synchronized (buzw.class) {
                    bxxk = f155439e;
                    if (bxxk == null) {
                        bxxk = new bxve(f155438d);
                        f155439e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
