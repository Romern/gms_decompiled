package p000;

/* renamed from: bome */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bome extends GeneratedMessageLite implements bxxd {

    /* renamed from: h */
    public static final bome f133636h;

    /* renamed from: i */
    private static volatile bxxk f133637i;

    /* renamed from: a */
    public int f133638a;

    /* renamed from: b */
    public int f133639b;

    /* renamed from: c */
    public long f133640c;

    /* renamed from: d */
    public int f133641d;

    /* renamed from: e */
    public int f133642e;

    /* renamed from: f */
    public int f133643f;

    /* renamed from: g */
    public int f133644g;

    static {
        bome bome = new bome();
        f133636h = bome;
        GeneratedMessageLite.m124024a(bome.class, bome);
    }

    private bome() {
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
            return GeneratedMessageLite.m124022a(f133636h, "\u0000\u0007\u0000\u0000\u0001\b\u0007\u0000\u0000\u0000\u0001\f\u0002\f\u0003\u0002\u0004\u0004\u0005\u0004\u0006\u0004\b\u0004", new Object[]{"a", "b", "c", "d", "e", "f", "g"});
        } else if (i2 == 3) {
            return new bome();
        } else {
            if (i2 == 4) {
                return new bxvd(f133636h);
            }
            if (i2 == 5) {
                return f133636h;
            }
            bxxk bxxk = f133637i;
            if (bxxk == null) {
                synchronized (bome.class) {
                    bxxk = f133637i;
                    if (bxxk == null) {
                        bxxk = new bxve(f133636h);
                        f133637i = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
