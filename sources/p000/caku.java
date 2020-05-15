package p000;

/* renamed from: caku */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class caku extends GeneratedMessageLite implements bxxd {

    /* renamed from: g */
    public static final caku f175056g;

    /* renamed from: h */
    private static volatile bxxk f175057h;

    /* renamed from: a */
    public int f175058a;

    /* renamed from: b */
    public String f175059b = "";

    /* renamed from: c */
    public int f175060c;

    /* renamed from: d */
    public String f175061d = "";

    /* renamed from: e */
    public int f175062e;

    /* renamed from: f */
    public int f175063f;

    static {
        caku caku = new caku();
        f175056g = caku;
        GeneratedMessageLite.m124024a(caku.class, caku);
    }

    private caku() {
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
            return GeneratedMessageLite.m124022a(f175056g, "\u0001\u0005\u0000\u0001\u0001\u0006\u0005\u0000\u0000\u0000\u0001ဈ\u0000\u0002င\u0001\u0003ဈ\u0002\u0005င\u0004\u0006င\u0005", new Object[]{"a", "b", "c", "d", "e", "f"});
        } else if (i2 == 3) {
            return new caku();
        } else {
            if (i2 == 4) {
                return new bxvd(f175056g);
            }
            if (i2 == 5) {
                return f175056g;
            }
            bxxk bxxk = f175057h;
            if (bxxk == null) {
                synchronized (caku.class) {
                    bxxk = f175057h;
                    if (bxxk == null) {
                        bxxk = new bxve(f175056g);
                        f175057h = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
