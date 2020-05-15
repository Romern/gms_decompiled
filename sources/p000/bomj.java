package p000;

/* renamed from: bomj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bomj extends bxvk implements bxxd {

    /* renamed from: e */
    public static final bomj f133659e;

    /* renamed from: g */
    private static volatile bxxk f133660g;

    /* renamed from: a */
    public int f133661a = 0;

    /* renamed from: b */
    public Object f133662b;

    /* renamed from: c */
    public int f133663c = 0;

    /* renamed from: d */
    public Object f133664d;

    /* renamed from: f */
    private byte f133665f = 2;

    static {
        bomj bomj = new bomj();
        f133659e = bomj;
        bxvk.m124024a(bomj.class, bomj);
    }

    private bomj() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f133665f);
        }
        byte b = 0;
        if (i2 == 1) {
            if (obj != null) {
                b = 1;
            }
            this.f133665f = b;
            return null;
        } else if (i2 == 2) {
            return bxvk.m124022a(f133659e, "\u0001\u0005\u0002\u0000\u0001\u0005\u0005\u0000\u0000\u0003\u0001ᐼ\u0000\u0002ᐼ\u0001\u0003ᐼ\u0000\u0004ျ\u0000\u0005ျ\u0001", new Object[]{"b", "a", "d", "c", bptw.class, bptu.class, bptv.class});
        } else if (i2 == 3) {
            return new bomj();
        } else {
            if (i2 == 4) {
                return new bxvd(f133659e);
            }
            if (i2 == 5) {
                return f133659e;
            }
            bxxk bxxk = f133660g;
            if (bxxk == null) {
                synchronized (bomj.class) {
                    bxxk = f133660g;
                    if (bxxk == null) {
                        bxxk = new bxve(f133659e);
                        f133660g = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
