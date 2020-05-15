package p000;

/* renamed from: boke */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class boke extends GeneratedMessageLite implements bxxd {

    /* renamed from: f */
    public static final boke f133392f;

    /* renamed from: g */
    private static volatile bxxk f133393g;

    /* renamed from: a */
    public int f133394a;

    /* renamed from: b */
    public int f133395b;

    /* renamed from: c */
    public int f133396c;

    /* renamed from: d */
    public boolean f133397d;

    /* renamed from: e */
    public int f133398e;

    static {
        boke boke = new boke();
        f133392f = boke;
        GeneratedMessageLite.m124024a(boke.class, boke);
    }

    private boke() {
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
            return GeneratedMessageLite.m124022a(f133392f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001င\u0000\u0002ဌ\u0001\u0003ဇ\u0002\u0004င\u0003", new Object[]{"a", "b", "c", bokf.f133399a, "d", "e"});
        } else if (i2 == 3) {
            return new boke();
        } else {
            if (i2 == 4) {
                return new bxvd(f133392f);
            }
            if (i2 == 5) {
                return f133392f;
            }
            bxxk bxxk = f133393g;
            if (bxxk == null) {
                synchronized (boke.class) {
                    bxxk = f133393g;
                    if (bxxk == null) {
                        bxxk = new bxve(f133392f);
                        f133393g = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
