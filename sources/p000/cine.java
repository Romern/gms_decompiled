package p000;

/* renamed from: cine */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cine extends bxvg implements bxvh {

    /* renamed from: g */
    public static final cine f190919g;

    /* renamed from: i */
    private static volatile bxxk f190920i;

    /* renamed from: a */
    public int f190921a;

    /* renamed from: b */
    public cinc f190922b;

    /* renamed from: c */
    public ciob f190923c;

    /* renamed from: d */
    public int f190924d;

    /* renamed from: e */
    public cinb f190925e;

    /* renamed from: f */
    public String f190926f = "";

    /* renamed from: h */
    private byte f190927h = 2;

    static {
        cine cine = new cine();
        f190919g = cine;
        bxvk.m124024a(cine.class, cine);
    }

    private cine() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f190927h);
        }
        byte b = 0;
        if (i2 == 1) {
            if (obj != null) {
                b = 1;
            }
            this.f190927h = b;
            return null;
        } else if (i2 == 2) {
            return bxvk.m124022a(f190919g, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဌ\u0002\u0004ဉ\u0003\u0005ဈ\u0004", new Object[]{"a", "b", "c", "d", cind.f190918a, "e", "f"});
        } else if (i2 == 3) {
            return new cine();
        } else {
            if (i2 == 4) {
                return new bxvf(f190919g);
            }
            if (i2 == 5) {
                return f190919g;
            }
            bxxk bxxk = f190920i;
            if (bxxk == null) {
                synchronized (cine.class) {
                    bxxk = f190920i;
                    if (bxxk == null) {
                        bxxk = new bxve(f190919g);
                        f190920i = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
