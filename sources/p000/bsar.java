package p000;

/* renamed from: bsar */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bsar extends bxvk implements bxxd {

    /* renamed from: d */
    public static final bsar f143894d;

    /* renamed from: f */
    private static volatile bxxk f143895f;

    /* renamed from: a */
    public bxvt f143896a = bxvm.f164965b;

    /* renamed from: b */
    public bxvt f143897b = bxvm.f164965b;

    /* renamed from: c */
    public boolean f143898c;

    /* renamed from: e */
    private int f143899e;

    static {
        bsar bsar = new bsar();
        f143894d = bsar;
        bxvk.m124024a(bsar.class, bsar);
    }

    private bsar() {
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
            return bxvk.m124022a(f143894d, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0002\u0000\u0001'\u0002'\u0003ဇ\u0000", new Object[]{"e", "a", "b", "c"});
        } else if (i2 == 3) {
            return new bsar();
        } else {
            if (i2 == 4) {
                return new bxvd(f143894d);
            }
            if (i2 == 5) {
                return f143894d;
            }
            bxxk bxxk = f143895f;
            if (bxxk == null) {
                synchronized (bsar.class) {
                    bxxk = f143895f;
                    if (bxxk == null) {
                        bxxk = new bxve(f143894d);
                        f143895f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
