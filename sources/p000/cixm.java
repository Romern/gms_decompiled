package p000;

/* renamed from: cixm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cixm extends GeneratedMessageLite implements bxxd {

    /* renamed from: d */
    public static final cixm f191686d;

    /* renamed from: e */
    private static volatile bxxk f191687e;

    /* renamed from: a */
    public int f191688a;

    /* renamed from: b */
    public String f191689b = "";

    /* renamed from: c */
    public bxwc f191690c = bxxn.f165040b;

    static {
        cixm cixm = new cixm();
        f191686d = cixm;
        GeneratedMessageLite.m124024a(cixm.class, cixm);
    }

    private cixm() {
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
            return GeneratedMessageLite.m124022a(f191686d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001b", new Object[]{"a", "b", "c", cixk.class});
        } else if (i2 == 3) {
            return new cixm();
        } else {
            if (i2 == 4) {
                return new cixl();
            }
            if (i2 == 5) {
                return f191686d;
            }
            bxxk bxxk = f191687e;
            if (bxxk == null) {
                synchronized (cixm.class) {
                    bxxk = f191687e;
                    if (bxxk == null) {
                        bxxk = new bxve(f191686d);
                        f191687e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
