package p000;

/* renamed from: brbl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class brbl extends bxvk implements bxxd {

    /* renamed from: d */
    public static final brbl f142279d;

    /* renamed from: g */
    private static volatile bxxk f142280g;

    /* renamed from: a */
    public bral f142281a;

    /* renamed from: b */
    public bxwc f142282b = bxxn.f165040b;

    /* renamed from: c */
    public bxwc f142283c = bxxn.f165040b;

    /* renamed from: e */
    private int f142284e;

    /* renamed from: f */
    private byte f142285f = 2;

    static {
        brbl brbl = new brbl();
        f142279d = brbl;
        bxvk.m124024a(brbl.class, brbl);
    }

    private brbl() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f142285f);
        }
        byte b = 0;
        if (i2 == 1) {
            if (obj != null) {
                b = 1;
            }
            this.f142285f = b;
            return null;
        } else if (i2 == 2) {
            return bxvk.m124022a(f142279d, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0002\u0001\u0001ဉ\u0000\u0002Л\u0003\u001b", new Object[]{"e", "a", "b", brdk.class, "c", brca.class});
        } else if (i2 == 3) {
            return new brbl();
        } else {
            if (i2 == 4) {
                return new bxvd(f142279d);
            }
            if (i2 == 5) {
                return f142279d;
            }
            bxxk bxxk = f142280g;
            if (bxxk == null) {
                synchronized (brbl.class) {
                    bxxk = f142280g;
                    if (bxxk == null) {
                        bxxk = new bxve(f142279d);
                        f142280g = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
