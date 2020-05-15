package p000;

/* renamed from: blfk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class blfk extends bxvk implements bxxd {

    /* renamed from: d */
    public static final blfk f126377d;

    /* renamed from: f */
    private static volatile bxxk f126378f;

    /* renamed from: a */
    public int f126379a;

    /* renamed from: b */
    public blfh f126380b;

    /* renamed from: c */
    public blfp f126381c;

    /* renamed from: e */
    private byte f126382e = 2;

    static {
        blfk blfk = new blfk();
        f126377d = blfk;
        bxvk.m124024a(blfk.class, blfk);
    }

    private blfk() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f126382e);
        }
        byte b = 0;
        if (i2 == 1) {
            if (obj != null) {
                b = 1;
            }
            this.f126382e = b;
            return null;
        } else if (i2 == 2) {
            return bxvk.m124022a(f126377d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0001\u0001ᐉ\u0000\u0002ဉ\u0001", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new blfk();
        } else {
            if (i2 == 4) {
                return new bxvd(f126377d);
            }
            if (i2 == 5) {
                return f126377d;
            }
            bxxk bxxk = f126378f;
            if (bxxk == null) {
                synchronized (blfk.class) {
                    bxxk = f126378f;
                    if (bxxk == null) {
                        bxxk = new bxve(f126377d);
                        f126378f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
