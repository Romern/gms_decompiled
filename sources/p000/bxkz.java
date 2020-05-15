package p000;

/* renamed from: bxkz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bxkz extends bxvk implements bxxd {

    /* renamed from: c */
    public static final bxvu f163817c = new bxky();

    /* renamed from: d */
    public static final bxkz f163818d;

    /* renamed from: f */
    private static volatile bxxk f163819f;

    /* renamed from: a */
    public bxkx f163820a;

    /* renamed from: b */
    public bxvt f163821b = bxvm.f164965b;

    /* renamed from: e */
    private int f163822e;

    static {
        bxkz bxkz = new bxkz();
        f163818d = bxkz;
        bxvk.m124024a(bxkz.class, bxkz);
    }

    private bxkz() {
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
            return bxvk.m124022a(f163818d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဉ\u0000\u0002\u001e", new Object[]{"e", "a", "b", bxll.m122838b()});
        } else if (i2 == 3) {
            return new bxkz();
        } else {
            if (i2 == 4) {
                return new bxvd(f163818d);
            }
            if (i2 == 5) {
                return f163818d;
            }
            bxxk bxxk = f163819f;
            if (bxxk == null) {
                synchronized (bxkz.class) {
                    bxxk = f163819f;
                    if (bxxk == null) {
                        bxxk = new bxve(f163818d);
                        f163819f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
