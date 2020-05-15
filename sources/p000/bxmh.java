package p000;

/* renamed from: bxmh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bxmh extends bxvk implements bxxd {

    /* renamed from: c */
    public static final bxmh f163932c;

    /* renamed from: d */
    public static final bxvj f163933d;

    /* renamed from: e */
    private static volatile bxxk f163934e;

    /* renamed from: a */
    public int f163935a;

    /* renamed from: b */
    public int f163936b;

    static {
        bxmh bxmh = new bxmh();
        f163932c = bxmh;
        bxvk.m124024a(bxmh.class, bxmh);
        bxcf bxcf = bxcf.f162779a;
        bxmh bxmh2 = f163932c;
        f163933d = bxvk.m124006a(bxcf, bxmh2, bxmh2, 91835270, bxzf.MESSAGE);
    }

    private bxmh() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 1) {
            return null;
        }
        if (i2 == 2) {
            return bxvk.m124022a(f163932c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"a", "b", bxmf.f163931a});
        } else if (i2 == 3) {
            return new bxmh();
        } else {
            if (i2 == 4) {
                return new bxvd(f163932c);
            }
            if (i2 == 5) {
                return f163932c;
            }
            bxxk bxxk = f163934e;
            if (bxxk == null) {
                synchronized (bxmh.class) {
                    bxxk = f163934e;
                    if (bxxk == null) {
                        bxxk = new bxve(f163932c);
                        f163934e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
