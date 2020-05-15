package p000;

/* renamed from: bmch */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bmch extends bxvk implements bxxd {

    /* renamed from: h */
    public static final bmch f128678h;

    /* renamed from: i */
    private static volatile bxxk f128679i;

    /* renamed from: a */
    public int f128680a;

    /* renamed from: b */
    public bmdn f128681b;

    /* renamed from: c */
    public bxtx f128682c = bxtx.f164797b;

    /* renamed from: d */
    public bxwc f128683d = bxxn.f165040b;

    /* renamed from: e */
    public long f128684e;

    /* renamed from: f */
    public String f128685f = "";

    /* renamed from: g */
    public bmdb f128686g;

    static {
        bmch bmch = new bmch();
        f128678h = bmch;
        bxvk.m124024a(bmch.class, bmch);
    }

    private bmch() {
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
            return bxvk.m124022a(f128678h, "\u0001\u0006\u0000\u0001\u0001\b\u0006\u0000\u0001\u0000\u0001ဉ\u0000\u0002ည\u0001\u0003\u001b\u0004ဂ\u0002\u0007ဈ\u0004\bဉ\u0005", new Object[]{"a", "b", "c", "d", bsnu.class, "e", "f", "g"});
        } else if (i2 == 3) {
            return new bmch();
        } else {
            if (i2 == 4) {
                return new bxvd(f128678h);
            }
            if (i2 == 5) {
                return f128678h;
            }
            bxxk bxxk = f128679i;
            if (bxxk == null) {
                synchronized (bmch.class) {
                    bxxk = f128679i;
                    if (bxxk == null) {
                        bxxk = new bxve(f128678h);
                        f128679i = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
