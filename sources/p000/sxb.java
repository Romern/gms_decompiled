package p000;

/* renamed from: sxb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class sxb extends GeneratedMessageLite implements bxxd {

    /* renamed from: d */
    public static final sxb f45325d;

    /* renamed from: f */
    private static volatile bxxk f45326f;

    /* renamed from: a */
    public String f45327a = "";

    /* renamed from: b */
    public bxwc f45328b = bxxn.f165040b;

    /* renamed from: c */
    public bxwc f45329c = bxxn.f165040b;

    /* renamed from: e */
    private int f45330e;

    static {
        sxb sxb = new sxb();
        f45325d = sxb;
        GeneratedMessageLite.m124024a(sxb.class, sxb);
    }

    private sxb() {
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
            return GeneratedMessageLite.m124022a(f45325d, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0002\u0000\u0001ဈ\u0000\u0002\u001b\u0003\u001c", new Object[]{"e", "a", "b", sxe.class, "c"});
        } else if (i2 == 3) {
            return new sxb();
        } else {
            if (i2 == 4) {
                return new bxvd(f45325d);
            }
            if (i2 == 5) {
                return f45325d;
            }
            bxxk bxxk = f45326f;
            if (bxxk == null) {
                synchronized (sxb.class) {
                    bxxk = f45326f;
                    if (bxxk == null) {
                        bxxk = new bxve(f45325d);
                        f45326f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
