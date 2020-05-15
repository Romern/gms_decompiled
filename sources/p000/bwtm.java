package p000;

/* renamed from: bwtm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bwtm extends bxvk implements bxxd {

    /* renamed from: c */
    public static final bwtm f160969c;

    /* renamed from: e */
    private static volatile bxxk f160970e;

    /* renamed from: a */
    public String f160971a = "";

    /* renamed from: b */
    public int f160972b;

    /* renamed from: d */
    private int f160973d;

    static {
        bwtm bwtm = new bwtm();
        f160969c = bwtm;
        bxvk.m124024a(bwtm.class, bwtm);
    }

    private bwtm() {
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
            return bxvk.m124022a(f160969c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဌ\u0001", new Object[]{"d", "a", "b", bwtk.f160968a});
        } else if (i2 == 3) {
            return new bwtm();
        } else {
            if (i2 == 4) {
                return new bxvd(f160969c);
            }
            if (i2 == 5) {
                return f160969c;
            }
            bxxk bxxk = f160970e;
            if (bxxk == null) {
                synchronized (bwtm.class) {
                    bxxk = f160970e;
                    if (bxxk == null) {
                        bxxk = new bxve(f160969c);
                        f160970e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
