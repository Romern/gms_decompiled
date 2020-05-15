package p000;

/* renamed from: boff */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class boff extends bxvk implements bxxd {

    /* renamed from: g */
    public static final boff f132884g;

    /* renamed from: h */
    private static volatile bxxk f132885h;

    /* renamed from: a */
    public int f132886a;

    /* renamed from: b */
    public String f132887b = "";

    /* renamed from: c */
    public int f132888c;

    /* renamed from: d */
    public int f132889d;

    /* renamed from: e */
    public bofg f132890e;

    /* renamed from: f */
    public boolean f132891f;

    static {
        boff boff = new boff();
        f132884g = boff;
        bxvk.m124024a(boff.class, boff);
    }

    private boff() {
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
            return bxvk.m124022a(f132884g, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဌ\u0001\u0003င\u0002\u0004ဉ\u0003\u0005ဇ\u0004", new Object[]{"a", "b", "c", bofe.f132883a, "d", "e", "f"});
        } else if (i2 == 3) {
            return new boff();
        } else {
            if (i2 == 4) {
                return new bxvd(f132884g);
            }
            if (i2 == 5) {
                return f132884g;
            }
            bxxk bxxk = f132885h;
            if (bxxk == null) {
                synchronized (boff.class) {
                    bxxk = f132885h;
                    if (bxxk == null) {
                        bxxk = new bxve(f132884g);
                        f132885h = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
