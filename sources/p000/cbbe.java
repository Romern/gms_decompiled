package p000;

/* renamed from: cbbe */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cbbe extends GeneratedMessageLite implements bxxd {

    /* renamed from: f */
    public static final cbbe f176543f;

    /* renamed from: g */
    private static volatile bxxk f176544g;

    /* renamed from: a */
    public String f176545a = "";

    /* renamed from: b */
    public String f176546b = "";

    /* renamed from: c */
    public String f176547c = "";

    /* renamed from: d */
    public String f176548d = "";

    /* renamed from: e */
    public long f176549e;

    static {
        cbbe cbbe = new cbbe();
        f176543f = cbbe;
        GeneratedMessageLite.m124024a(cbbe.class, cbbe);
    }

    private cbbe() {
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
            return GeneratedMessageLite.m124022a(f176543f, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004Ȉ\u0005\u0002", new Object[]{"a", "b", "c", "d", "e"});
        } else if (i2 == 3) {
            return new cbbe();
        } else {
            if (i2 == 4) {
                return new bxvd(f176543f);
            }
            if (i2 == 5) {
                return f176543f;
            }
            bxxk bxxk = f176544g;
            if (bxxk == null) {
                synchronized (cbbe.class) {
                    bxxk = f176544g;
                    if (bxxk == null) {
                        bxxk = new bxve(f176543f);
                        f176544g = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
