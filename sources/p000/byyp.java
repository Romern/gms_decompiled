package p000;

/* renamed from: byyp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class byyp extends bxvg implements bxvh {

    /* renamed from: e */
    public static final byyp f168984e;

    /* renamed from: g */
    private static volatile bxxk f168985g;

    /* renamed from: a */
    public int f168986a;

    /* renamed from: b */
    public long f168987b;

    /* renamed from: c */
    public byyq f168988c;

    /* renamed from: d */
    public byyy f168989d;

    /* renamed from: f */
    private byte f168990f = 2;

    static {
        byyp byyp = new byyp();
        f168984e = byyp;
        bxvk.m124024a(byyp.class, byyp);
    }

    private byyp() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f168990f);
        }
        byte b = 0;
        if (i2 == 1) {
            if (obj != null) {
                b = 1;
            }
            this.f168990f = b;
            return null;
        } else if (i2 == 2) {
            return bxvk.m124022a(f168984e, "\u0001\u0003\u0000\u0001\u0001\u0005\u0003\u0000\u0000\u0001\u0001ဂ\u0000\u0002ᐉ\u0001\u0005ဉ\u0003", new Object[]{"a", "b", "c", "d"});
        } else if (i2 == 3) {
            return new byyp();
        } else {
            if (i2 == 4) {
                return new bxvf(f168984e);
            }
            if (i2 == 5) {
                return f168984e;
            }
            bxxk bxxk = f168985g;
            if (bxxk == null) {
                synchronized (byyp.class) {
                    bxxk = f168985g;
                    if (bxxk == null) {
                        bxxk = new bxve(f168984e);
                        f168985g = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
