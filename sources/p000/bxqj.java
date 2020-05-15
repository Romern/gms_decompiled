package p000;

/* renamed from: bxqj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bxqj extends bxvk implements bxxd {

    /* renamed from: e */
    public static final bxqj f164389e;

    /* renamed from: g */
    private static volatile bxxk f164390g;

    /* renamed from: a */
    public int f164391a;

    /* renamed from: b */
    public bxpo f164392b;

    /* renamed from: c */
    public bxqh f164393c;

    /* renamed from: d */
    public int f164394d;

    /* renamed from: f */
    private byte f164395f = 2;

    static {
        bxqj bxqj = new bxqj();
        f164389e = bxqj;
        bxvk.m124024a(bxqj.class, bxqj);
    }

    private bxqj() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f164395f);
        }
        byte b = 0;
        if (i2 == 1) {
            if (obj != null) {
                b = 1;
            }
            this.f164395f = b;
            return null;
        } else if (i2 == 2) {
            return bxvk.m124022a(f164389e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0002\u0001ᐉ\u0000\u0002ᐉ\u0001\u0003ဌ\u0002", new Object[]{"a", "b", "c", "d", bxqi.f164388a});
        } else if (i2 == 3) {
            return new bxqj();
        } else {
            if (i2 == 4) {
                return new bxvd(f164389e);
            }
            if (i2 == 5) {
                return f164389e;
            }
            bxxk bxxk = f164390g;
            if (bxxk == null) {
                synchronized (bxqj.class) {
                    bxxk = f164390g;
                    if (bxxk == null) {
                        bxxk = new bxve(f164389e);
                        f164390g = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
