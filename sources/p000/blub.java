package p000;

/* renamed from: blub */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class blub extends bxvk implements bxxd {

    /* renamed from: e */
    public static final blub f127773e;

    /* renamed from: f */
    private static volatile bxxk f127774f;

    /* renamed from: a */
    public int f127775a;

    /* renamed from: b */
    public String f127776b = "";

    /* renamed from: c */
    public int f127777c;

    /* renamed from: d */
    public int f127778d = 2400;

    static {
        blub blub = new blub();
        f127773e = blub;
        bxvk.m124024a(blub.class, blub);
    }

    private blub() {
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
            return bxvk.m124022a(f127773e, "\u0001\u0003\u0000\u0001\u0002\u0004\u0003\u0000\u0000\u0000\u0002င\u0001\u0003ဈ\u0000\u0004င\u0002", new Object[]{"a", "c", "b", "d"});
        } else if (i2 == 3) {
            return new blub();
        } else {
            if (i2 == 4) {
                return new bxvd(f127773e);
            }
            if (i2 == 5) {
                return f127773e;
            }
            bxxk bxxk = f127774f;
            if (bxxk == null) {
                synchronized (blub.class) {
                    bxxk = f127774f;
                    if (bxxk == null) {
                        bxxk = new bxve(f127773e);
                        f127774f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
