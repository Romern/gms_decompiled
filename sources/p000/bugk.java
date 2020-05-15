package p000;

/* renamed from: bugk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bugk extends bxvk implements bxxd {

    /* renamed from: e */
    public static final bugk f153787e;

    /* renamed from: f */
    private static volatile bxxk f153788f;

    /* renamed from: a */
    public int f153789a;

    /* renamed from: b */
    public int f153790b;

    /* renamed from: c */
    public boolean f153791c;

    /* renamed from: d */
    public long f153792d;

    static {
        bugk bugk = new bugk();
        f153787e = bugk;
        bxvk.m124024a(bugk.class, bugk);
    }

    private bugk() {
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
            return bxvk.m124022a(f153787e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဇ\u0001\u0003ဃ\u0002", new Object[]{"a", "b", bugj.f153786a, "c", "d"});
        } else if (i2 == 3) {
            return new bugk();
        } else {
            if (i2 == 4) {
                return new bxvd(f153787e);
            }
            if (i2 == 5) {
                return f153787e;
            }
            bxxk bxxk = f153788f;
            if (bxxk == null) {
                synchronized (bugk.class) {
                    bxxk = f153788f;
                    if (bxxk == null) {
                        bxxk = new bxve(f153787e);
                        f153788f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
