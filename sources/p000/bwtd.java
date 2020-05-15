package p000;

/* renamed from: bwtd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bwtd extends bxvk implements bxxd {

    /* renamed from: d */
    public static final bwtd f160938d;

    /* renamed from: f */
    private static volatile bxxk f160939f;

    /* renamed from: a */
    public int f160940a = 0;

    /* renamed from: b */
    public Object f160941b;

    /* renamed from: c */
    public String f160942c = "";

    /* renamed from: e */
    private int f160943e;

    static {
        bwtd bwtd = new bwtd();
        f160938d = bwtd;
        bxvk.m124024a(bwtd.class, bwtd);
    }

    private bwtd() {
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
            return bxvk.m124022a(f160938d, "\u0001\u0006\u0001\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဈ\u0000\u0002ြ\u0000\u0003့\u0000\u0004ျ\u0000\u0005ျ\u0000\u0006ဿ\u0000", new Object[]{"b", "a", "e", "c", boae.class, bwta.f160937a});
        } else if (i2 == 3) {
            return new bwtd();
        } else {
            if (i2 == 4) {
                return new bxvd(f160938d);
            }
            if (i2 == 5) {
                return f160938d;
            }
            bxxk bxxk = f160939f;
            if (bxxk == null) {
                synchronized (bwtd.class) {
                    bxxk = f160939f;
                    if (bxxk == null) {
                        bxxk = new bxve(f160938d);
                        f160939f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
