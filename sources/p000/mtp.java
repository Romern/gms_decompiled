package p000;

/* renamed from: mtp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class mtp extends bxvk implements bxxd {

    /* renamed from: g */
    public static final mtp f34688g;

    /* renamed from: h */
    private static volatile bxxk f34689h;

    /* renamed from: a */
    public int f34690a;

    /* renamed from: b */
    public String f34691b = "";

    /* renamed from: c */
    public int f34692c;

    /* renamed from: d */
    public int f34693d;

    /* renamed from: e */
    public int f34694e;

    /* renamed from: f */
    public int f34695f;

    static {
        mtp mtp = new mtp();
        f34688g = mtp;
        bxvk.m124024a(mtp.class, mtp);
    }

    private mtp() {
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
            return bxvk.m124022a(f34688g, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဈ\u0000\u0002င\u0001\u0003ဌ\u0002\u0004င\u0003\u0005င\u0004", new Object[]{"a", "b", "c", "d", mto.f34687a, "e", "f"});
        } else if (i2 == 3) {
            return new mtp();
        } else {
            if (i2 == 4) {
                return new bxvd(f34688g);
            }
            if (i2 == 5) {
                return f34688g;
            }
            bxxk bxxk = f34689h;
            if (bxxk == null) {
                synchronized (mtp.class) {
                    bxxk = f34689h;
                    if (bxxk == null) {
                        bxxk = new bxve(f34688g);
                        f34689h = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
