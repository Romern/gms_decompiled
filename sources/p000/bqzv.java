package p000;

/* renamed from: bqzv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bqzv extends bxvk implements bxxd {

    /* renamed from: e */
    public static final bqzv f142093e;

    /* renamed from: g */
    private static volatile bxxk f142094g;

    /* renamed from: a */
    public int f142095a;

    /* renamed from: b */
    public qhd f142096b;

    /* renamed from: c */
    public String f142097c = "";

    /* renamed from: d */
    public long f142098d;

    /* renamed from: f */
    private byte f142099f = 2;

    static {
        bqzv bqzv = new bqzv();
        f142093e = bqzv;
        bxvk.m124024a(bqzv.class, bqzv);
    }

    private bqzv() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f142099f);
        }
        byte b = 0;
        if (i2 == 1) {
            if (obj != null) {
                b = 1;
            }
            this.f142099f = b;
            return null;
        } else if (i2 == 2) {
            return bxvk.m124022a(f142093e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0001\u0001ᐉ\u0000\u0002ဈ\u0001\u0003ဂ\u0002", new Object[]{"a", "b", "c", "d"});
        } else if (i2 == 3) {
            return new bqzv();
        } else {
            if (i2 == 4) {
                return new bxvd(f142093e);
            }
            if (i2 == 5) {
                return f142093e;
            }
            bxxk bxxk = f142094g;
            if (bxxk == null) {
                synchronized (bqzv.class) {
                    bxxk = f142094g;
                    if (bxxk == null) {
                        bxxk = new bxve(f142093e);
                        f142094g = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
