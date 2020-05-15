package p000;

/* renamed from: cbpl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cbpl extends bxvk implements bxxd {

    /* renamed from: d */
    public static final cbpl f177933d;

    /* renamed from: e */
    private static volatile bxxk f177934e;

    /* renamed from: a */
    public int f177935a;

    /* renamed from: b */
    public int f177936b;

    /* renamed from: c */
    public int f177937c;

    static {
        cbpl cbpl = new cbpl();
        f177933d = cbpl;
        bxvk.m124024a(cbpl.class, cbpl);
    }

    private cbpl() {
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
            return bxvk.m124022a(f177933d, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\f\u0002\f\u0003\f", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new cbpl();
        } else {
            if (i2 == 4) {
                return new bxvd(f177933d);
            }
            if (i2 == 5) {
                return f177933d;
            }
            bxxk bxxk = f177934e;
            if (bxxk == null) {
                synchronized (cbpl.class) {
                    bxxk = f177934e;
                    if (bxxk == null) {
                        bxxk = new bxve(f177933d);
                        f177934e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
