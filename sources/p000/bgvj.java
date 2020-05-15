package p000;

/* renamed from: bgvj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bgvj extends GeneratedMessageLite implements bxxd {

    /* renamed from: f */
    public static final bgvj f117660f;

    /* renamed from: g */
    private static volatile bxxk f117661g;

    /* renamed from: a */
    public int f117662a;

    /* renamed from: b */
    public int f117663b;

    /* renamed from: c */
    public int f117664c;

    /* renamed from: d */
    public int f117665d;

    /* renamed from: e */
    public int f117666e;

    static {
        bgvj bgvj = new bgvj();
        f117660f = bgvj;
        GeneratedMessageLite.m124024a(bgvj.class, bgvj);
    }

    private bgvj() {
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
            return GeneratedMessageLite.m124022a(f117660f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဌ\u0000\u0002င\u0001\u0003င\u0002\u0004င\u0003", new Object[]{"a", "b", bgvh.f117659a, "c", "d", "e"});
        } else if (i2 == 3) {
            return new bgvj();
        } else {
            if (i2 == 4) {
                return new bxvd(f117660f);
            }
            if (i2 == 5) {
                return f117660f;
            }
            bxxk bxxk = f117661g;
            if (bxxk == null) {
                synchronized (bgvj.class) {
                    bxxk = f117661g;
                    if (bxxk == null) {
                        bxxk = new bxve(f117660f);
                        f117661g = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
