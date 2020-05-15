package p000;

/* renamed from: bmro */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bmro extends GeneratedMessageLite implements bxxd {

    /* renamed from: c */
    public static final bmro f130553c;

    /* renamed from: d */
    private static volatile bxxk f130554d;

    /* renamed from: a */
    public int f130555a;

    /* renamed from: b */
    public bmaj f130556b;

    static {
        bmro bmro = new bmro();
        f130553c = bmro;
        GeneratedMessageLite.m124024a(bmro.class, bmro);
    }

    private bmro() {
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
            return GeneratedMessageLite.m124022a(f130553c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"a", "b"});
        } else if (i2 == 3) {
            return new bmro();
        } else {
            if (i2 == 4) {
                return new bxvd(f130553c);
            }
            if (i2 == 5) {
                return f130553c;
            }
            bxxk bxxk = f130554d;
            if (bxxk == null) {
                synchronized (bmro.class) {
                    bxxk = f130554d;
                    if (bxxk == null) {
                        bxxk = new bxve(f130553c);
                        f130554d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
