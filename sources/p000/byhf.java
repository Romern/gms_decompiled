package p000;

/* renamed from: byhf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class byhf extends GeneratedMessageLite implements bxxd {

    /* renamed from: c */
    public static final byhf f166439c;

    /* renamed from: d */
    private static volatile bxxk f166440d;

    /* renamed from: a */
    public int f166441a;

    /* renamed from: b */
    public long f166442b;

    static {
        byhf byhf = new byhf();
        f166439c = byhf;
        GeneratedMessageLite.m124024a(byhf.class, byhf);
    }

    private byhf() {
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
            return GeneratedMessageLite.m124022a(f166439c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001စ\u0000", new Object[]{"a", "b"});
        } else if (i2 == 3) {
            return new byhf();
        } else {
            if (i2 == 4) {
                return new bxvd(f166439c);
            }
            if (i2 == 5) {
                return f166439c;
            }
            bxxk bxxk = f166440d;
            if (bxxk == null) {
                synchronized (byhf.class) {
                    bxxk = f166440d;
                    if (bxxk == null) {
                        bxxk = new bxve(f166439c);
                        f166440d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
