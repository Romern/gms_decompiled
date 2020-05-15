package p000;

/* renamed from: btbe */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class btbe extends bxvk implements bxxd {

    /* renamed from: j */
    public static final btbe f148105j;

    /* renamed from: m */
    private static volatile bxxk f148106m;

    /* renamed from: a */
    public long f148107a;

    /* renamed from: b */
    public String f148108b = "";

    /* renamed from: c */
    public String f148109c = "";

    /* renamed from: d */
    public String f148110d = "";

    /* renamed from: e */
    public bxvt f148111e = bxvm.f164965b;

    /* renamed from: f */
    public btas f148112f;

    /* renamed from: g */
    public int f148113g;

    /* renamed from: h */
    public long f148114h;

    /* renamed from: i */
    public boolean f148115i;

    /* renamed from: k */
    private bxbg f148116k;

    /* renamed from: l */
    private byte f148117l = 2;

    static {
        btbe btbe = new btbe();
        f148105j = btbe;
        bxvk.m124024a(btbe.class, btbe);
    }

    private btbe() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f148117l);
        }
        byte b = 0;
        if (i2 == 1) {
            if (obj != null) {
                b = 1;
            }
            this.f148117l = b;
            return null;
        } else if (i2 == 2) {
            return bxvk.m124022a(f148105j, "\u0000\n\u0000\u0000\u0001\r\n\u0000\u0001\u0001\u0001\u0002\u0002Ȉ\u0003Ȉ\u0004Ȉ\u0006,\t\t\n\f\u000b\u0002\f\u0007\rЉ", new Object[]{"a", "b", "c", "d", "e", "f", "g", "h", "i", "k"});
        } else if (i2 == 3) {
            return new btbe();
        } else {
            if (i2 == 4) {
                return new btbd();
            }
            if (i2 == 5) {
                return f148105j;
            }
            bxxk bxxk = f148106m;
            if (bxxk == null) {
                synchronized (btbe.class) {
                    bxxk = f148106m;
                    if (bxxk == null) {
                        bxxk = new bxve(f148105j);
                        f148106m = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
