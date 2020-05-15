package p000;

/* renamed from: bqme */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bqme extends GeneratedMessageLite implements bxxd {

    /* renamed from: d */
    public static final bqme f141196d;

    /* renamed from: e */
    private static volatile bxxk f141197e;

    /* renamed from: a */
    public String f141198a = "";

    /* renamed from: b */
    public bxwc f141199b = bxxn.f165040b;

    /* renamed from: c */
    public ByteString f141200c = ByteString.f164797b;

    static {
        bqme bqme = new bqme();
        f141196d = bqme;
        GeneratedMessageLite.m124024a(bqme.class, bqme);
    }

    private bqme() {
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
            return GeneratedMessageLite.m124022a(f141196d, "\u0000\u0003\u0000\u0000\u0001\u0005\u0003\u0000\u0001\u0000\u0001Ȉ\u0002\u001c\u0005\n", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new bqme();
        } else {
            if (i2 == 4) {
                return new bqmd();
            }
            if (i2 == 5) {
                return f141196d;
            }
            bxxk bxxk = f141197e;
            if (bxxk == null) {
                synchronized (bqme.class) {
                    bxxk = f141197e;
                    if (bxxk == null) {
                        bxxk = new bxve(f141196d);
                        f141197e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
