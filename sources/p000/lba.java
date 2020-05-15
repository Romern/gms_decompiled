package p000;

/* renamed from: lba */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class lba extends GeneratedMessageLite implements bxxd {

    /* renamed from: f */
    public static final lba f25675f;

    /* renamed from: g */
    private static volatile bxxk f25676g;

    /* renamed from: a */
    public int f25677a;

    /* renamed from: b */
    public int f25678b;

    /* renamed from: c */
    public bxwc f25679c = bxxn.f165040b;

    /* renamed from: d */
    public String f25680d = "";

    /* renamed from: e */
    public lbg f25681e;

    static {
        lba lba = new lba();
        f25675f = lba;
        GeneratedMessageLite.m124024a(lba.class, lba);
    }

    private lba() {
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
            return GeneratedMessageLite.m124022a(f25675f, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0001\u0000\u0001\u0004\u0002\f\u0003\u001b\u0004Ȉ\u0005\t", new Object[]{"a", "b", "c", lbd.class, "d", "e"});
        } else if (i2 == 3) {
            return new lba();
        } else {
            if (i2 == 4) {
                return new bxvd(f25675f);
            }
            if (i2 == 5) {
                return f25675f;
            }
            bxxk bxxk = f25676g;
            if (bxxk == null) {
                synchronized (lba.class) {
                    bxxk = f25676g;
                    if (bxxk == null) {
                        bxxk = new bxve(f25675f);
                        f25676g = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
