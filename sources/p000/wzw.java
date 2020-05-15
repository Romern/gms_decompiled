package p000;

/* renamed from: wzw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class wzw extends GeneratedMessageLite implements bxxd {

    /* renamed from: b */
    public static final wzw f51655b;

    /* renamed from: c */
    private static volatile bxxk f51656c;

    /* renamed from: a */
    public bxvt f51657a = bxvm.f164965b;

    static {
        wzw wzw = new wzw();
        f51655b = wzw;
        GeneratedMessageLite.m124024a(wzw.class, wzw);
    }

    private wzw() {
        ByteString bxtx = bxtx.f164797b;
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
            return GeneratedMessageLite.m124022a(f51655b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001e", new Object[]{"a", xan.m42568b()});
        } else if (i2 == 3) {
            return new wzw();
        } else {
            if (i2 == 4) {
                return new bxvd((char[][]) null, (byte[][][]) null, (byte[]) null);
            }
            if (i2 == 5) {
                return f51655b;
            }
            bxxk bxxk = f51656c;
            if (bxxk == null) {
                synchronized (wzw.class) {
                    bxxk = f51656c;
                    if (bxxk == null) {
                        bxxk = new bxve(f51655b);
                        f51656c = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
