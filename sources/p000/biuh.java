package p000;

/* renamed from: biuh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class biuh extends GeneratedMessageLite implements bxxd {

    /* renamed from: c */
    public static final biuh f121785c;

    /* renamed from: f */
    private static volatile bxxk f121786f;

    /* renamed from: a */
    public int f121787a;

    /* renamed from: b */
    public int f121788b;

    /* renamed from: d */
    private int f121789d;

    /* renamed from: e */
    private byte f121790e = 2;

    static {
        biuh biuh = new biuh();
        f121785c = biuh;
        GeneratedMessageLite.m124024a(biuh.class, biuh);
    }

    private biuh() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f121790e);
        }
        byte b = 0;
        if (i2 == 1) {
            if (obj != null) {
                b = 1;
            }
            this.f121790e = b;
            return null;
        } else if (i2 == 2) {
            return GeneratedMessageLite.m124022a(f121785c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0002\u0001ᔋ\u0000\u0002ᔄ\u0001", new Object[]{"d", "a", "b"});
        } else if (i2 == 3) {
            return new biuh();
        } else {
            if (i2 == 4) {
                return new bxvd(f121785c);
            }
            if (i2 == 5) {
                return f121785c;
            }
            bxxk bxxk = f121786f;
            if (bxxk == null) {
                synchronized (biuh.class) {
                    bxxk = f121786f;
                    if (bxxk == null) {
                        bxxk = new bxve(f121785c);
                        f121786f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
