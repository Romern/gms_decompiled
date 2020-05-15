package p000;

/* renamed from: bwsd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bwsd extends bxvk implements bxxd {

    /* renamed from: d */
    public static final bwsd f160840d;

    /* renamed from: e */
    public static final bxvj f160841e;

    /* renamed from: f */
    private static volatile bxxk f160842f;

    /* renamed from: a */
    public int f160843a = 0;

    /* renamed from: b */
    public Object f160844b;

    /* renamed from: c */
    public bxwc f160845c = bxxn.f165040b;

    static {
        bwsd bwsd = new bwsd();
        f160840d = bwsd;
        bxvk.m124024a(bwsd.class, bwsd);
        bwny bwny = bwny.f160414k;
        bwsd bwsd2 = f160840d;
        f160841e = bxvk.m124006a(bwny, bwsd2, bwsd2, 294483524, bxzf.MESSAGE);
    }

    private bwsd() {
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
            return bxvk.m124022a(f160840d, "\u0001\u0003\u0001\u0000\u0001\u0003\u0003\u0000\u0001\u0000\u0001ြ\u0000\u0002ြ\u0000\u0003\u001a", new Object[]{"b", "a", bwsb.class, bwsg.class, "c"});
        } else if (i2 == 3) {
            return new bwsd();
        } else {
            if (i2 == 4) {
                return new bxvd(f160840d);
            }
            if (i2 == 5) {
                return f160840d;
            }
            bxxk bxxk = f160842f;
            if (bxxk == null) {
                synchronized (bwsd.class) {
                    bxxk = f160842f;
                    if (bxxk == null) {
                        bxxk = new bxve(f160840d);
                        f160842f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
