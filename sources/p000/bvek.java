package p000;

/* renamed from: bvek */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bvek extends bxvk implements bxxd {

    /* renamed from: d */
    public static final bvek f155741d;

    /* renamed from: e */
    private static volatile bxxk f155742e;

    /* renamed from: a */
    public int f155743a;

    /* renamed from: b */
    public int f155744b;

    /* renamed from: c */
    public long f155745c;

    static {
        bvek bvek = new bvek();
        f155741d = bvek;
        bxvk.m124024a(bvek.class, bvek);
    }

    private bvek() {
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
            return bxvk.m124022a(f155741d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဂ\u0001", new Object[]{"a", "b", bvif.m121137b(), "c"});
        } else if (i2 == 3) {
            return new bvek();
        } else {
            if (i2 == 4) {
                return new bxvd(f155741d);
            }
            if (i2 == 5) {
                return f155741d;
            }
            bxxk bxxk = f155742e;
            if (bxxk == null) {
                synchronized (bvek.class) {
                    bxxk = f155742e;
                    if (bxxk == null) {
                        bxxk = new bxve(f155741d);
                        f155742e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
