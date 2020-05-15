package p000;

/* renamed from: iew */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class iew extends GeneratedMessageLite implements bxxd {

    /* renamed from: b */
    public static final iew f20831b;

    /* renamed from: c */
    private static volatile bxxk f20832c;

    /* renamed from: a */
    public bxww f20833a = bxww.f165013b;

    static {
        iew iew = new iew();
        f20831b = iew;
        GeneratedMessageLite.m124024a(iew.class, iew);
    }

    private iew() {
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
            return GeneratedMessageLite.m124022a(f20831b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"a", iev.f20830a});
        } else if (i2 == 3) {
            return new iew();
        } else {
            if (i2 == 4) {
                return new bxvd(f20831b);
            }
            if (i2 == 5) {
                return f20831b;
            }
            bxxk bxxk = f20832c;
            if (bxxk == null) {
                synchronized (iew.class) {
                    bxxk = f20832c;
                    if (bxxk == null) {
                        bxxk = new bxve(f20831b);
                        f20832c = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
