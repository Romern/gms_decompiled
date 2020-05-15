package p000;

/* renamed from: agmu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class agmu extends GeneratedMessageLite implements bxxd {

    /* renamed from: i */
    public static final agmu f65988i;

    /* renamed from: j */
    private static volatile bxxk f65989j;

    /* renamed from: a */
    public int f65990a;

    /* renamed from: b */
    public int f65991b;

    /* renamed from: c */
    public String f65992c = "";

    /* renamed from: d */
    public bxwc f65993d = bxxn.f165040b;

    /* renamed from: e */
    public agmy f65994e;

    /* renamed from: f */
    public boolean f65995f;

    /* renamed from: g */
    public boolean f65996g;

    /* renamed from: h */
    public boolean f65997h;

    static {
        agmu agmu = new agmu();
        f65988i = agmu;
        GeneratedMessageLite.m124024a(agmu.class, agmu);
    }

    private agmu() {
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
            return GeneratedMessageLite.m124022a(f65988i, "\u0001\u0007\u0000\u0001\u0001\b\u0007\u0000\u0001\u0000\u0001င\u0000\u0002ဈ\u0001\u0003\u001b\u0005ဉ\u0003\u0006ဇ\u0004\u0007ဇ\u0005\bဇ\u0006", new Object[]{"a", "b", "c", "d", agmv.class, "e", "f", "g", "h"});
        } else if (i2 == 3) {
            return new agmu();
        } else {
            if (i2 == 4) {
                return new bxvd((int[][][]) null, (float[]) null);
            }
            if (i2 == 5) {
                return f65988i;
            }
            bxxk bxxk = f65989j;
            if (bxxk == null) {
                synchronized (agmu.class) {
                    bxxk = f65989j;
                    if (bxxk == null) {
                        bxxk = new bxve(f65988i);
                        f65989j = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
