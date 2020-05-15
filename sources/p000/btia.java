package p000;

/* renamed from: btia */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class btia extends bxvk implements bxxd {

    /* renamed from: f */
    public static final btia f148929f;

    /* renamed from: g */
    private static volatile bxxk f148930g;

    /* renamed from: a */
    public btiq f148931a;

    /* renamed from: b */
    public btio f148932b;

    /* renamed from: c */
    public boolean f148933c;

    /* renamed from: d */
    public boolean f148934d;

    /* renamed from: e */
    public boolean f148935e;

    static {
        btia btia = new btia();
        f148929f = btia;
        bxvk.m124024a(btia.class, btia);
    }

    private btia() {
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
            return bxvk.m124022a(f148929f, "\u0000\u0005\u0000\u0000\u0001\u0007\u0005\u0000\u0000\u0000\u0001\t\u0002\t\u0003\u0007\u0004\u0007\u0007\u0007", new Object[]{"a", "b", "c", "d", "e"});
        } else if (i2 == 3) {
            return new btia();
        } else {
            if (i2 == 4) {
                return new bxvd(f148929f);
            }
            if (i2 == 5) {
                return f148929f;
            }
            bxxk bxxk = f148930g;
            if (bxxk == null) {
                synchronized (btia.class) {
                    bxxk = f148930g;
                    if (bxxk == null) {
                        bxxk = new bxve(f148929f);
                        f148930g = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
