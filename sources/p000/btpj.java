package p000;

/* renamed from: btpj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class btpj extends GeneratedMessageLite implements bxxd {

    /* renamed from: c */
    public static final btpj f149850c;

    /* renamed from: d */
    private static volatile bxxk f149851d;

    /* renamed from: a */
    public String f149852a = "";

    /* renamed from: b */
    public bxyk f149853b;

    static {
        btpj btpj = new btpj();
        f149850c = btpj;
        GeneratedMessageLite.m124024a(btpj.class, btpj);
    }

    private btpj() {
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
            return GeneratedMessageLite.m124022a(f149850c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002\t", new Object[]{"a", "b"});
        } else if (i2 == 3) {
            return new btpj();
        } else {
            if (i2 == 4) {
                return new bxvd(f149850c);
            }
            if (i2 == 5) {
                return f149850c;
            }
            bxxk bxxk = f149851d;
            if (bxxk == null) {
                synchronized (btpj.class) {
                    bxxk = f149851d;
                    if (bxxk == null) {
                        bxxk = new bxve(f149850c);
                        f149851d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
