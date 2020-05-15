package p000;

/* renamed from: bipp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bipp extends bxvk implements bxxd {

    /* renamed from: d */
    public static final bipp f121194d;

    /* renamed from: f */
    private static volatile bxxk f121195f;

    /* renamed from: a */
    public int f121196a;

    /* renamed from: b */
    public int f121197b;

    /* renamed from: c */
    public int f121198c;

    /* renamed from: e */
    private byte f121199e = 2;

    static {
        bipp bipp = new bipp();
        f121194d = bipp;
        bxvk.m124024a(bipp.class, bipp);
    }

    private bipp() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f121199e);
        }
        byte b = 0;
        if (i2 == 1) {
            if (obj != null) {
                b = 1;
            }
            this.f121199e = b;
            return null;
        } else if (i2 == 2) {
            return bxvk.m124022a(f121194d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0002\u0001ᔏ\u0000\u0002ᔄ\u0001", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new bipp();
        } else {
            if (i2 == 4) {
                return new bxvd(f121194d);
            }
            if (i2 == 5) {
                return f121194d;
            }
            bxxk bxxk = f121195f;
            if (bxxk == null) {
                synchronized (bipp.class) {
                    bxxk = f121195f;
                    if (bxxk == null) {
                        bxxk = new bxve(f121194d);
                        f121195f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
