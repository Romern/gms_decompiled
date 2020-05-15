package p000;

/* renamed from: bxhd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bxhd extends GeneratedMessageLite implements bxxd {

    /* renamed from: e */
    public static final bxhd f163344e;

    /* renamed from: f */
    private static volatile bxxk f163345f;

    /* renamed from: a */
    public int f163346a;

    /* renamed from: b */
    public String f163347b = "";

    /* renamed from: c */
    public String f163348c = "";

    /* renamed from: d */
    public bxwc f163349d = bxxn.f165040b;

    static {
        bxhd bxhd = new bxhd();
        f163344e = bxhd;
        GeneratedMessageLite.m124024a(bxhd.class, bxhd);
    }

    private bxhd() {
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
            return GeneratedMessageLite.m124022a(f163344e, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0001\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0004\u001b", new Object[]{"a", "b", "c", "d", bxhh.class});
        } else if (i2 == 3) {
            return new bxhd();
        } else {
            if (i2 == 4) {
                return new bxvd((boolean[]) null, (char[][][]) null);
            }
            if (i2 == 5) {
                return f163344e;
            }
            bxxk bxxk = f163345f;
            if (bxxk == null) {
                synchronized (bxhd.class) {
                    bxxk = f163345f;
                    if (bxxk == null) {
                        bxxk = new bxve(f163344e);
                        f163345f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
