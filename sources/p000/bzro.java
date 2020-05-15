package p000;

/* renamed from: bzro */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bzro extends GeneratedMessageLite implements bxxd {

    /* renamed from: c */
    public static final bzro f171175c;

    /* renamed from: d */
    private static volatile bxxk f171176d;

    /* renamed from: a */
    public int f171177a;

    /* renamed from: b */
    public String f171178b = "";

    static {
        bzro bzro = new bzro();
        f171175c = bzro;
        GeneratedMessageLite.m124024a(bzro.class, bzro);
    }

    private bzro() {
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
            return GeneratedMessageLite.m124022a(f171175c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0004\u0002Ȉ", new Object[]{"a", "b"});
        } else if (i2 == 3) {
            return new bzro();
        } else {
            if (i2 == 4) {
                return new bxvd(f171175c);
            }
            if (i2 == 5) {
                return f171175c;
            }
            bxxk bxxk = f171176d;
            if (bxxk == null) {
                synchronized (bzro.class) {
                    bxxk = f171176d;
                    if (bxxk == null) {
                        bxxk = new bxve(f171175c);
                        f171176d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
