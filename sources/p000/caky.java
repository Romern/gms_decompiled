package p000;

/* renamed from: caky */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class caky extends bxvk implements bxxd {

    /* renamed from: f */
    public static final caky f175084f;

    /* renamed from: g */
    private static volatile bxxk f175085g;

    /* renamed from: a */
    public int f175086a;

    /* renamed from: b */
    public int f175087b;

    /* renamed from: c */
    public long f175088c;

    /* renamed from: d */
    public long f175089d;

    /* renamed from: e */
    public int f175090e;

    static {
        caky caky = new caky();
        f175084f = caky;
        bxvk.m124024a(caky.class, caky);
    }

    private caky() {
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
            return bxvk.m124022a(f175084f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001င\u0000\u0002ဂ\u0001\u0003ဂ\u0002\u0004င\u0003", new Object[]{"a", "b", "c", "d", "e"});
        } else if (i2 == 3) {
            return new caky();
        } else {
            if (i2 == 4) {
                return new bxvd(f175084f);
            }
            if (i2 == 5) {
                return f175084f;
            }
            bxxk bxxk = f175085g;
            if (bxxk == null) {
                synchronized (caky.class) {
                    bxxk = f175085g;
                    if (bxxk == null) {
                        bxxk = new bxve(f175084f);
                        f175085g = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
