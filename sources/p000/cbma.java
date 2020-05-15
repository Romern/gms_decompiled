package p000;

/* renamed from: cbma */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cbma extends GeneratedMessageLite implements bxxd {

    /* renamed from: f */
    public static final cbma f177591f;

    /* renamed from: g */
    private static volatile bxxk f177592g;

    /* renamed from: a */
    public int f177593a;

    /* renamed from: b */
    public String f177594b = "";

    /* renamed from: c */
    public String f177595c = "";

    /* renamed from: d */
    public String f177596d = "";

    /* renamed from: e */
    public cbmd f177597e;

    static {
        cbma cbma = new cbma();
        f177591f = cbma;
        GeneratedMessageLite.m124024a(cbma.class, cbma);
    }

    private cbma() {
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
            return GeneratedMessageLite.m124022a(f177591f, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001\f\u0002Ȉ\u0003Ȉ\u0004Ȉ\u0005\t", new Object[]{"a", "b", "c", "d", "e"});
        } else if (i2 == 3) {
            return new cbma();
        } else {
            if (i2 == 4) {
                return new bxvd(f177591f);
            }
            if (i2 == 5) {
                return f177591f;
            }
            bxxk bxxk = f177592g;
            if (bxxk == null) {
                synchronized (cbma.class) {
                    bxxk = f177592g;
                    if (bxxk == null) {
                        bxxk = new bxve(f177591f);
                        f177592g = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
