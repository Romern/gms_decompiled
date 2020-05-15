package p000;

/* renamed from: btpp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class btpp extends GeneratedMessageLite implements bxxd {

    /* renamed from: f */
    public static final btpp f149872f;

    /* renamed from: g */
    private static volatile bxxk f149873g;

    /* renamed from: a */
    public long f149874a;

    /* renamed from: b */
    public long f149875b;

    /* renamed from: c */
    public bxwc f149876c = bxxn.f165040b;

    /* renamed from: d */
    public String f149877d = "";

    /* renamed from: e */
    public int f149878e;

    static {
        btpp btpp = new btpp();
        f149872f = btpp;
        GeneratedMessageLite.m124024a(btpp.class, btpp);
    }

    private btpp() {
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
            return GeneratedMessageLite.m124022a(f149872f, "\u0000\u0005\u0000\u0000\u0003\u0007\u0005\u0000\u0001\u0000\u0003\u0002\u0004\u0002\u0005Ț\u0006Ȉ\u0007\f", new Object[]{"a", "b", "c", "d", "e"});
        } else if (i2 == 3) {
            return new btpp();
        } else {
            if (i2 == 4) {
                return new bxvd(f149872f);
            }
            if (i2 == 5) {
                return f149872f;
            }
            bxxk bxxk = f149873g;
            if (bxxk == null) {
                synchronized (btpp.class) {
                    bxxk = f149873g;
                    if (bxxk == null) {
                        bxxk = new bxve(f149872f);
                        f149873g = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
