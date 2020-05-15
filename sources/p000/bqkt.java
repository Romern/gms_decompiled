package p000;

/* renamed from: bqkt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bqkt extends bxvk implements bxxd {

    /* renamed from: i */
    public static final bqkt f141038i;

    /* renamed from: j */
    private static volatile bxxk f141039j;

    /* renamed from: a */
    public int f141040a;

    /* renamed from: b */
    public int f141041b = 0;

    /* renamed from: c */
    public Object f141042c;

    /* renamed from: d */
    public bxtx f141043d = bxtx.f164797b;

    /* renamed from: e */
    public bxtx f141044e = bxtx.f164797b;

    /* renamed from: f */
    public long f141045f;

    /* renamed from: g */
    public bqkw f141046g;

    /* renamed from: h */
    public String f141047h = "";

    static {
        bqkt bqkt = new bqkt();
        f141038i = bqkt;
        bxvk.m124024a(bqkt.class, bqkt);
    }

    private bqkt() {
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
            return bxvk.m124022a(f141038i, "\u0001\t\u0001\u0001\u0001\n\t\u0000\u0000\u0000\u0001ည\u0000\u0002ဂ\u0002\u0003ြ\u0000\u0004ဉ\u0007\u0006ဈ\t\u0007ြ\u0000\bည\u0001\tြ\u0000\nြ\u0000", new Object[]{"c", "b", "a", "d", "f", bqkn.class, "g", "h", bqkv.class, "e", bqku.class, bqko.class});
        } else if (i2 == 3) {
            return new bqkt();
        } else {
            if (i2 == 4) {
                return new bxvd(f141038i);
            }
            if (i2 == 5) {
                return f141038i;
            }
            bxxk bxxk = f141039j;
            if (bxxk == null) {
                synchronized (bqkt.class) {
                    bxxk = f141039j;
                    if (bxxk == null) {
                        bxxk = new bxve(f141038i);
                        f141039j = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
