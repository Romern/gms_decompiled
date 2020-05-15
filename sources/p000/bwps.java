package p000;

/* renamed from: bwps */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bwps extends bxvk implements bxxd {

    /* renamed from: d */
    public static final bwps f160596d;

    /* renamed from: e */
    public static final bxvj f160597e;

    /* renamed from: g */
    private static volatile bxxk f160598g;

    /* renamed from: a */
    public int f160599a;

    /* renamed from: b */
    public int f160600b;

    /* renamed from: c */
    public String f160601c = "";

    /* renamed from: f */
    private int f160602f;

    static {
        bwps bwps = new bwps();
        f160596d = bwps;
        bxvk.m124024a(bwps.class, bwps);
        bwny bwny = bwny.f160414k;
        bwps bwps2 = f160596d;
        f160597e = bxvk.m124006a(bwny, bwps2, bwps2, 232057537, bxzf.MESSAGE);
    }

    private bwps() {
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
            return bxvk.m124022a(f160596d, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဌ\u0000\u0002င\u0001\u0003ဈ\u0002", new Object[]{"f", "a", bwpq.f160595a, "b", "c"});
        } else if (i2 == 3) {
            return new bwps();
        } else {
            if (i2 == 4) {
                return new bxvd(f160596d);
            }
            if (i2 == 5) {
                return f160596d;
            }
            bxxk bxxk = f160598g;
            if (bxxk == null) {
                synchronized (bwps.class) {
                    bxxk = f160598g;
                    if (bxxk == null) {
                        bxxk = new bxve(f160596d);
                        f160598g = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
