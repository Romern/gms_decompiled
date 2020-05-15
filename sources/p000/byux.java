package p000;

/* renamed from: byux */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class byux extends GeneratedMessageLite implements bxxd {

    /* renamed from: e */
    public static final byux f168392e;

    /* renamed from: f */
    private static volatile bxxk f168393f;

    /* renamed from: a */
    public int f168394a;

    /* renamed from: b */
    public String f168395b = "";

    /* renamed from: c */
    public String f168396c = "";

    /* renamed from: d */
    public String f168397d = "";

    static {
        byux byux = new byux();
        f168392e = byux;
        GeneratedMessageLite.m124024a(byux.class, byux);
    }

    private byux() {
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
            return GeneratedMessageLite.m124022a(f168392e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002", new Object[]{"a", "b", "c", "d"});
        } else if (i2 == 3) {
            return new byux();
        } else {
            if (i2 == 4) {
                return new bxvd(f168392e);
            }
            if (i2 == 5) {
                return f168392e;
            }
            bxxk bxxk = f168393f;
            if (bxxk == null) {
                synchronized (byux.class) {
                    bxxk = f168393f;
                    if (bxxk == null) {
                        bxxk = new bxve(f168392e);
                        f168393f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
