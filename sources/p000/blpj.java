package p000;

/* renamed from: blpj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class blpj extends GeneratedMessageLite implements bxxd {

    /* renamed from: c */
    public static final blpj f127234c;

    /* renamed from: d */
    private static volatile bxxk f127235d;

    /* renamed from: a */
    public int f127236a;

    /* renamed from: b */
    public bloy f127237b;

    static {
        blpj blpj = new blpj();
        f127234c = blpj;
        GeneratedMessageLite.m124024a(blpj.class, blpj);
    }

    private blpj() {
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
            return GeneratedMessageLite.m124022a(f127234c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"a", "b"});
        } else if (i2 == 3) {
            return new blpj();
        } else {
            if (i2 == 4) {
                return new bxvd(f127234c);
            }
            if (i2 == 5) {
                return f127234c;
            }
            bxxk bxxk = f127235d;
            if (bxxk == null) {
                synchronized (blpj.class) {
                    bxxk = f127235d;
                    if (bxxk == null) {
                        bxxk = new bxve(f127234c);
                        f127235d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
