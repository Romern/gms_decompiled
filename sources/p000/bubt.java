package p000;

/* renamed from: bubt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bubt extends GeneratedMessageLite implements bxxd {

    /* renamed from: g */
    public static final bubt f153275g;

    /* renamed from: h */
    private static volatile bxxk f153276h;

    /* renamed from: a */
    public int f153277a;

    /* renamed from: b */
    public int f153278b;

    /* renamed from: c */
    public int f153279c;

    /* renamed from: d */
    public bxwc f153280d = bxxn.f165040b;

    /* renamed from: e */
    public bubq f153281e;

    /* renamed from: f */
    public buco f153282f;

    static {
        bubt bubt = new bubt();
        f153275g = bubt;
        GeneratedMessageLite.m124024a(bubt.class, bubt);
    }

    private bubt() {
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
            return GeneratedMessageLite.m124022a(f153275g, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0000\u0001ဌ\u0000\u0002ဋ\u0001\u0003\u001b\u0004ဉ\u0002\u0005ဉ\u0003", new Object[]{"a", "b", bubs.m119303b(), "c", "d", bucb.class, "e", "f"});
        } else if (i2 == 3) {
            return new bubt();
        } else {
            if (i2 == 4) {
                return new bxvd((short[][]) null);
            }
            if (i2 == 5) {
                return f153275g;
            }
            bxxk bxxk = f153276h;
            if (bxxk == null) {
                synchronized (bubt.class) {
                    bxxk = f153276h;
                    if (bxxk == null) {
                        bxxk = new bxve(f153275g);
                        f153276h = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
