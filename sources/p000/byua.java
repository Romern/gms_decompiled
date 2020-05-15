package p000;

/* renamed from: byua */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class byua extends bxvk implements bxxd {

    /* renamed from: h */
    public static final byua f167744h;

    /* renamed from: i */
    private static volatile bxxk f167745i;

    /* renamed from: a */
    public int f167746a;

    /* renamed from: b */
    public boolean f167747b;

    /* renamed from: c */
    public int f167748c;

    /* renamed from: d */
    public String f167749d = "";

    /* renamed from: e */
    public boolean f167750e;

    /* renamed from: f */
    public boolean f167751f;

    /* renamed from: g */
    public boolean f167752g;

    static {
        byua byua = new byua();
        f167744h = byua;
        bxvk.m124024a(byua.class, byua);
    }

    private byua() {
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
            return bxvk.m124022a(f167744h, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဈ\u0002\u0003ဇ\u0003\u0004င\u0001\u0005ဇ\u0005\u0006ဇ\u0004", new Object[]{"a", "b", "d", "e", "c", "g", "f"});
        } else if (i2 == 3) {
            return new byua();
        } else {
            if (i2 == 4) {
                return new bxvd(f167744h);
            }
            if (i2 == 5) {
                return f167744h;
            }
            bxxk bxxk = f167745i;
            if (bxxk == null) {
                synchronized (byua.class) {
                    bxxk = f167745i;
                    if (bxxk == null) {
                        bxxk = new bxve(f167744h);
                        f167745i = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
