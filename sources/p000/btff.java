package p000;

/* renamed from: btff */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class btff extends bxvk implements bxxd {

    /* renamed from: h */
    public static final btff f148636h;

    /* renamed from: i */
    private static volatile bxxk f148637i;

    /* renamed from: a */
    public String f148638a = "";

    /* renamed from: b */
    public String f148639b = "";

    /* renamed from: c */
    public int f148640c;

    /* renamed from: d */
    public long f148641d;

    /* renamed from: e */
    public int f148642e;

    /* renamed from: f */
    public boolean f148643f;

    /* renamed from: g */
    public boolean f148644g;

    static {
        btff btff = new btff();
        f148636h = btff;
        bxvk.m124024a(btff.class, btff);
    }

    private btff() {
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
            return bxvk.m124022a(f148636h, "\u0000\u0007\u0000\u0000\u0001\u0007\u0007\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003\u0004\u0004\u0003\u0005\u0004\u0006\u0007\u0007\u0007", new Object[]{"a", "b", "c", "d", "e", "f", "g"});
        } else if (i2 == 3) {
            return new btff();
        } else {
            if (i2 == 4) {
                return new bxvd(f148636h);
            }
            if (i2 == 5) {
                return f148636h;
            }
            bxxk bxxk = f148637i;
            if (bxxk == null) {
                synchronized (btff.class) {
                    bxxk = f148637i;
                    if (bxxk == null) {
                        bxxk = new bxve(f148636h);
                        f148637i = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
