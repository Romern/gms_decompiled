package p000;

/* renamed from: ajnh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ajnh extends bxvk implements bxxd {

    /* renamed from: g */
    public static final ajnh f70965g;

    /* renamed from: h */
    private static volatile bxxk f70966h;

    /* renamed from: a */
    public int f70967a;

    /* renamed from: b */
    public String f70968b = "";

    /* renamed from: c */
    public int f70969c;

    /* renamed from: d */
    public long f70970d;

    /* renamed from: e */
    public long f70971e;

    /* renamed from: f */
    public String f70972f = "application/octet-stream";

    static {
        ajnh ajnh = new ajnh();
        f70965g = ajnh;
        bxvk.m124024a(ajnh.class, ajnh);
    }

    private ajnh() {
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
            return bxvk.m124022a(f70965g, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဌ\u0001\u0003ဂ\u0002\u0004ဂ\u0003\u0005ဈ\u0004", new Object[]{"a", "b", "c", ajnf.f70964a, "d", "e", "f"});
        } else if (i2 == 3) {
            return new ajnh();
        } else {
            if (i2 == 4) {
                return new bxvd(f70965g);
            }
            if (i2 == 5) {
                return f70965g;
            }
            bxxk bxxk = f70966h;
            if (bxxk == null) {
                synchronized (ajnh.class) {
                    bxxk = f70966h;
                    if (bxxk == null) {
                        bxxk = new bxve(f70965g);
                        f70966h = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
