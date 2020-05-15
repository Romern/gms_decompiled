package p000;

/* renamed from: bmhm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bmhm extends GeneratedMessageLite implements bxxd {

    /* renamed from: c */
    public static final bmhm f129451c;

    /* renamed from: e */
    private static volatile bxxk f129452e;

    /* renamed from: a */
    public bxwc f129453a = bxxn.f165040b;

    /* renamed from: b */
    public String f129454b = "";

    /* renamed from: d */
    private int f129455d;

    static {
        bmhm bmhm = new bmhm();
        f129451c = bmhm;
        GeneratedMessageLite.m124024a(bmhm.class, bmhm);
    }

    private bmhm() {
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
            return GeneratedMessageLite.m124022a(f129451c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002ဈ\u0000", new Object[]{"d", "a", bmhr.class, "b"});
        } else if (i2 == 3) {
            return new bmhm();
        } else {
            if (i2 == 4) {
                return new bxvd(f129451c);
            }
            if (i2 == 5) {
                return f129451c;
            }
            bxxk bxxk = f129452e;
            if (bxxk == null) {
                synchronized (bmhm.class) {
                    bxxk = f129452e;
                    if (bxxk == null) {
                        bxxk = new bxve(f129451c);
                        f129452e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
