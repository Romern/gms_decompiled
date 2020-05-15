package p000;

/* renamed from: aiab */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aiab extends GeneratedMessageLite implements bxxd {

    /* renamed from: d */
    public static final aiab f68539d;

    /* renamed from: e */
    private static volatile bxxk f68540e;

    /* renamed from: a */
    public int f68541a;

    /* renamed from: b */
    public byzm f68542b;

    /* renamed from: c */
    public long f68543c;

    static {
        aiab aiab = new aiab();
        f68539d = aiab;
        GeneratedMessageLite.m124024a(aiab.class, aiab);
    }

    private aiab() {
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
            return GeneratedMessageLite.m124022a(f68539d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဂ\u0001", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new aiab();
        } else {
            if (i2 == 4) {
                return new bxvd(f68539d);
            }
            if (i2 == 5) {
                return f68539d;
            }
            bxxk bxxk = f68540e;
            if (bxxk == null) {
                synchronized (aiab.class) {
                    bxxk = f68540e;
                    if (bxxk == null) {
                        bxxk = new bxve(f68539d);
                        f68540e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
