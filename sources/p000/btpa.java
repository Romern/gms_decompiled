package p000;

/* renamed from: btpa */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class btpa extends GeneratedMessageLite implements bxxd {

    /* renamed from: b */
    public static final btpa f149822b;

    /* renamed from: c */
    private static volatile bxxk f149823c;

    /* renamed from: a */
    public ByteString f149824a = ByteString.f164797b;

    static {
        btpa btpa = new btpa();
        f149822b = btpa;
        GeneratedMessageLite.m124024a(btpa.class, btpa);
    }

    private btpa() {
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
            return GeneratedMessageLite.m124022a(f149822b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\n", new Object[]{"a"});
        } else if (i2 == 3) {
            return new btpa();
        } else {
            if (i2 == 4) {
                return new bxvd(f149822b);
            }
            if (i2 == 5) {
                return f149822b;
            }
            bxxk bxxk = f149823c;
            if (bxxk == null) {
                synchronized (btpa.class) {
                    bxxk = f149823c;
                    if (bxxk == null) {
                        bxxk = new bxve(f149822b);
                        f149823c = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
