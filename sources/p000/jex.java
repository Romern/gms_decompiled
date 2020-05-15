package p000;

/* renamed from: jex */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class jex extends bxvk implements bxxd {

    /* renamed from: d */
    public static final jex f22316d;

    /* renamed from: h */
    private static volatile bxxk f22317h;

    /* renamed from: a */
    public bxwc f22318a = bxxn.f165040b;

    /* renamed from: b */
    public int f22319b;

    /* renamed from: c */
    public String f22320c = "";

    /* renamed from: e */
    private int f22321e;

    /* renamed from: f */
    private jez f22322f;

    /* renamed from: g */
    private byte f22323g = 2;

    static {
        jex jex = new jex();
        f22316d = jex;
        bxvk.m124024a(jex.class, jex);
    }

    private jex() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f22323g);
        }
        byte b = 0;
        if (i2 == 1) {
            if (obj != null) {
                b = 1;
            }
            this.f22323g = b;
            return null;
        } else if (i2 == 2) {
            return bxvk.m124022a(f22316d, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0002\u0001ᔉ\u0000\u0002Л\u0003ဌ\u0001\u0004ဈ\u0002", new Object[]{"e", "f", "a", jfd.class, "b", jev.f22315a, "c"});
        } else if (i2 == 3) {
            return new jex();
        } else {
            if (i2 == 4) {
                return new bxvd(f22316d);
            }
            if (i2 == 5) {
                return f22316d;
            }
            bxxk bxxk = f22317h;
            if (bxxk == null) {
                synchronized (jex.class) {
                    bxxk = f22317h;
                    if (bxxk == null) {
                        bxxk = new bxve(f22316d);
                        f22317h = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
