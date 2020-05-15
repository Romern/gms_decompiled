package p000;

/* renamed from: bgfc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bgfc extends GeneratedMessageLite implements bxxd {

    /* renamed from: f */
    public static final bgfc f116334f;

    /* renamed from: h */
    private static volatile bxxk f116335h;

    /* renamed from: a */
    public int f116336a;

    /* renamed from: b */
    public long f116337b;

    /* renamed from: c */
    public bxwc f116338c = bxxn.f165040b;

    /* renamed from: d */
    public byyr f116339d;

    /* renamed from: e */
    public boolean f116340e;

    /* renamed from: g */
    private byte f116341g = 2;

    static {
        bgfc bgfc = new bgfc();
        f116334f = bgfc;
        GeneratedMessageLite.m124024a(bgfc.class, bgfc);
    }

    private bgfc() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f116341g);
        }
        byte b = 0;
        if (i2 == 1) {
            if (obj != null) {
                b = 1;
            }
            this.f116341g = b;
            return null;
        } else if (i2 == 2) {
            return GeneratedMessageLite.m124022a(f116334f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0002\u0001ဂ\u0000\u0002Л\u0003ᐉ\u0001\u0004ဇ\u0002", new Object[]{"a", "b", "c", byzr.class, "d", "e"});
        } else if (i2 == 3) {
            return new bgfc();
        } else {
            if (i2 == 4) {
                return new bxvd((short[][][]) null, (boolean[][]) null, (byte[]) null);
            }
            if (i2 == 5) {
                return f116334f;
            }
            bxxk bxxk = f116335h;
            if (bxxk == null) {
                synchronized (bgfc.class) {
                    bxxk = f116335h;
                    if (bxxk == null) {
                        bxxk = new bxve(f116334f);
                        f116335h = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
