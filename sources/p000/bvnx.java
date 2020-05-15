package p000;

/* renamed from: bvnx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bvnx extends bxvk implements bxxd {

    /* renamed from: c */
    public static final bvnx f156978c;

    /* renamed from: f */
    private static volatile bxxk f156979f;

    /* renamed from: a */
    public int f156980a;

    /* renamed from: b */
    public bvni f156981b;

    /* renamed from: d */
    private String f156982d = "";

    /* renamed from: e */
    private byte f156983e = 2;

    static {
        bvnx bvnx = new bvnx();
        f156978c = bvnx;
        bxvk.m124024a(bvnx.class, bvnx);
    }

    private bvnx() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f156983e);
        }
        byte b = 0;
        if (i2 == 1) {
            if (obj != null) {
                b = 1;
            }
            this.f156983e = b;
            return null;
        } else if (i2 == 2) {
            return bxvk.m124022a(f156978c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0001\u0001ᐉ\u0000\u0002ဈ\u0001", new Object[]{"a", "b", "d"});
        } else if (i2 == 3) {
            return new bvnx();
        } else {
            if (i2 == 4) {
                return new bxvd(f156978c);
            }
            if (i2 == 5) {
                return f156978c;
            }
            bxxk bxxk = f156979f;
            if (bxxk == null) {
                synchronized (bvnx.class) {
                    bxxk = f156979f;
                    if (bxxk == null) {
                        bxxk = new bxve(f156978c);
                        f156979f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
