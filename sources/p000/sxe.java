package p000;

/* renamed from: sxe */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class sxe extends GeneratedMessageLite implements bxxd {

    /* renamed from: e */
    public static final sxe f45332e;

    /* renamed from: g */
    private static volatile bxxk f45333g;

    /* renamed from: a */
    public String f45334a = "";

    /* renamed from: b */
    public String f45335b = "";

    /* renamed from: c */
    public bxwc f45336c = bxxn.f165040b;

    /* renamed from: d */
    public int f45337d;

    /* renamed from: f */
    private int f45338f;

    static {
        sxe sxe = new sxe();
        f45332e = sxe;
        GeneratedMessageLite.m124024a(sxe.class, sxe);
    }

    private sxe() {
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
            return GeneratedMessageLite.m124022a(f45332e, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003\u001b\u0004ဌ\u0002", new Object[]{"f", "a", "b", "c", sxj.class, "d", sxc.f45331a});
        } else if (i2 == 3) {
            return new sxe();
        } else {
            if (i2 == 4) {
                return new bxvd(f45332e);
            }
            if (i2 == 5) {
                return f45332e;
            }
            bxxk bxxk = f45333g;
            if (bxxk == null) {
                synchronized (sxe.class) {
                    bxxk = f45333g;
                    if (bxxk == null) {
                        bxxk = new bxve(f45332e);
                        f45333g = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
