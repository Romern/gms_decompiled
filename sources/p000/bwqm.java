package p000;

/* renamed from: bwqm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bwqm extends bxvk implements bxxd {

    /* renamed from: d */
    public static final bwqm f160680d;

    /* renamed from: e */
    public static final bxvj f160681e;

    /* renamed from: g */
    private static volatile bxxk f160682g;

    /* renamed from: a */
    public String f160683a = "";

    /* renamed from: b */
    public String f160684b = "";

    /* renamed from: c */
    public long f160685c;

    /* renamed from: f */
    private int f160686f;

    static {
        bwqm bwqm = new bwqm();
        f160680d = bwqm;
        bxvk.m124024a(bwqm.class, bwqm);
        bwny bwny = bwny.f160414k;
        bwqm bwqm2 = f160680d;
        f160681e = bxvk.m124006a(bwny, bwqm2, bwqm2, 290848974, bxzf.MESSAGE);
    }

    private bwqm() {
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
            return bxvk.m124022a(f160680d, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဂ\u0002", new Object[]{"f", "a", "b", "c"});
        } else if (i2 == 3) {
            return new bwqm();
        } else {
            if (i2 == 4) {
                return new bxvd(f160680d);
            }
            if (i2 == 5) {
                return f160680d;
            }
            bxxk bxxk = f160682g;
            if (bxxk == null) {
                synchronized (bwqm.class) {
                    bxxk = f160682g;
                    if (bxxk == null) {
                        bxxk = new bxve(f160680d);
                        f160682g = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
