package p000;

/* renamed from: btbl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class btbl extends bxvk implements bxxd {

    /* renamed from: e */
    public static final btbl f148152e;

    /* renamed from: f */
    private static volatile bxxk f148153f;

    /* renamed from: a */
    public String f148154a = "";

    /* renamed from: b */
    public String f148155b = "";

    /* renamed from: c */
    public String f148156c = "";

    /* renamed from: d */
    public String f148157d = "";

    static {
        btbl btbl = new btbl();
        f148152e = btbl;
        bxvk.m124024a(btbl.class, btbl);
    }

    private btbl() {
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
            return bxvk.m124022a(f148152e, "\u0000\u0004\u0000\u0000\u0001\u0005\u0004\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0004Ȉ\u0005Ȉ", new Object[]{"a", "b", "c", "d"});
        } else if (i2 == 3) {
            return new btbl();
        } else {
            if (i2 == 4) {
                return new bxvd(f148152e);
            }
            if (i2 == 5) {
                return f148152e;
            }
            bxxk bxxk = f148153f;
            if (bxxk == null) {
                synchronized (btbl.class) {
                    bxxk = f148153f;
                    if (bxxk == null) {
                        bxxk = new bxve(f148152e);
                        f148153f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
