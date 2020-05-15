package p000;

/* renamed from: jtp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class jtp extends bxvk implements bxxd {

    /* renamed from: d */
    public static final jtp f23191d;

    /* renamed from: e */
    private static volatile bxxk f23192e;

    /* renamed from: a */
    public bxtx f23193a = bxtx.f164797b;

    /* renamed from: b */
    public String f23194b = "";

    /* renamed from: c */
    public bxwc f23195c = bxxn.f165040b;

    static {
        jtp jtp = new jtp();
        f23191d = jtp;
        bxvk.m124024a(jtp.class, jtp);
    }

    private jtp() {
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
            return bxvk.m124022a(f23191d, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0001\u0000\u0001\n\u0002Ȉ\u0003\u001b", new Object[]{"a", "b", "c", jto.class});
        } else if (i2 == 3) {
            return new jtp();
        } else {
            if (i2 == 4) {
                return new bxvd(f23191d);
            }
            if (i2 == 5) {
                return f23191d;
            }
            bxxk bxxk = f23192e;
            if (bxxk == null) {
                synchronized (jtp.class) {
                    bxxk = f23192e;
                    if (bxxk == null) {
                        bxxk = new bxve(f23191d);
                        f23192e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
