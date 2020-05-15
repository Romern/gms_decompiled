package p000;

/* renamed from: bxaf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bxaf extends bxvk implements bxxd {

    /* renamed from: d */
    public static final bxaf f161681d;

    /* renamed from: e */
    public static final bxvj f161682e;

    /* renamed from: g */
    private static volatile bxxk f161683g;

    /* renamed from: a */
    public int f161684a;

    /* renamed from: b */
    public bwxl f161685b;

    /* renamed from: c */
    public bwxl f161686c;

    /* renamed from: f */
    private byte f161687f = 2;

    static {
        bxaf bxaf = new bxaf();
        f161681d = bxaf;
        bxvk.m124024a(bxaf.class, bxaf);
        bwxl bwxl = bwxl.f161383i;
        bxaf bxaf2 = f161681d;
        f161682e = bxvk.m124006a(bwxl, bxaf2, bxaf2, 62783159, bxzf.MESSAGE);
    }

    private bxaf() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f161687f);
        }
        byte b = 0;
        if (i2 == 1) {
            if (obj != null) {
                b = 1;
            }
            this.f161687f = b;
            return null;
        } else if (i2 == 2) {
            return bxvk.m124022a(f161681d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0002\u0001ᐉ\u0000\u0002ᐉ\u0001", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new bxaf();
        } else {
            if (i2 == 4) {
                return new bxvd(f161681d);
            }
            if (i2 == 5) {
                return f161681d;
            }
            bxxk bxxk = f161683g;
            if (bxxk == null) {
                synchronized (bxaf.class) {
                    bxxk = f161683g;
                    if (bxxk == null) {
                        bxxk = new bxve(f161681d);
                        f161683g = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
