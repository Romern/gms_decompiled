package p000;

/* renamed from: ayes */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ayes extends bxvk implements bxxd {

    /* renamed from: f */
    public static final ayes f97358f;

    /* renamed from: h */
    private static volatile bxxk f97359h;

    /* renamed from: a */
    public int f97360a;

    /* renamed from: b */
    public String f97361b = "";

    /* renamed from: c */
    public String f97362c = "";

    /* renamed from: d */
    public String f97363d = "";

    /* renamed from: e */
    public boolean f97364e;

    /* renamed from: g */
    private byte f97365g = 2;

    static {
        ayes ayes = new ayes();
        f97358f = ayes;
        bxvk.m124024a(ayes.class, ayes);
    }

    private ayes() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f97365g);
        }
        byte b = 0;
        if (i2 == 1) {
            if (obj != null) {
                b = 1;
            }
            this.f97365g = b;
            return null;
        } else if (i2 == 2) {
            return bxvk.m124022a(f97358f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0003\u0001ᔈ\u0000\u0002ᔈ\u0002\u0003ဇ\u0003\u0004ᔈ\u0001", new Object[]{"a", "b", "d", "e", "c"});
        } else if (i2 == 3) {
            return new ayes();
        } else {
            if (i2 == 4) {
                return new bxvd(f97358f);
            }
            if (i2 == 5) {
                return f97358f;
            }
            bxxk bxxk = f97359h;
            if (bxxk == null) {
                synchronized (ayes.class) {
                    bxxk = f97359h;
                    if (bxxk == null) {
                        bxxk = new bxve(f97358f);
                        f97359h = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
