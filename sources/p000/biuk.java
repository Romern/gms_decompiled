package p000;

/* renamed from: biuk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class biuk extends GeneratedMessageLite implements bxxd {

    /* renamed from: f */
    public static final biuk f121800f;

    /* renamed from: h */
    private static volatile bxxk f121801h;

    /* renamed from: a */
    public int f121802a;

    /* renamed from: b */
    public int f121803b;

    /* renamed from: c */
    public boolean f121804c;

    /* renamed from: d */
    public boolean f121805d;

    /* renamed from: e */
    public boolean f121806e;

    /* renamed from: g */
    private byte f121807g = 2;

    static {
        biuk biuk = new biuk();
        f121800f = biuk;
        GeneratedMessageLite.m124024a(biuk.class, biuk);
    }

    private biuk() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f121807g);
        }
        byte b = 0;
        if (i2 == 1) {
            if (obj != null) {
                b = 1;
            }
            this.f121807g = b;
            return null;
        } else if (i2 == 2) {
            return GeneratedMessageLite.m124022a(f121800f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0004\u0001ᔄ\u0000\u0002ᔇ\u0001\u0003ᔇ\u0002\u0004ᔇ\u0003", new Object[]{"a", "b", "c", "d", "e"});
        } else if (i2 == 3) {
            return new biuk();
        } else {
            if (i2 == 4) {
                return new bxvd(f121800f);
            }
            if (i2 == 5) {
                return f121800f;
            }
            bxxk bxxk = f121801h;
            if (bxxk == null) {
                synchronized (biuk.class) {
                    bxxk = f121801h;
                    if (bxxk == null) {
                        bxxk = new bxve(f121800f);
                        f121801h = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
