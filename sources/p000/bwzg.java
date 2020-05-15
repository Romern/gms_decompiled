package p000;

/* renamed from: bwzg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bwzg extends GeneratedMessageLite implements bxxd {

    /* renamed from: e */
    public static final bwzg f161599e;

    /* renamed from: g */
    private static volatile bxxk f161600g;

    /* renamed from: a */
    public int f161601a;

    /* renamed from: b */
    public bwmg f161602b;

    /* renamed from: c */
    public bxwc f161603c = bxxn.f165040b;

    /* renamed from: d */
    public bwxl f161604d;

    /* renamed from: f */
    private byte f161605f = 2;

    static {
        bwzg bwzg = new bwzg();
        f161599e = bwzg;
        GeneratedMessageLite.m124024a(bwzg.class, bwzg);
    }

    private bwzg() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f161605f);
        }
        byte b = 0;
        if (i2 == 1) {
            if (obj != null) {
                b = 1;
            }
            this.f161605f = b;
            return null;
        } else if (i2 == 2) {
            return GeneratedMessageLite.m124022a(f161599e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0003\u0001ᐉ\u0000\u0002Л\u0003ᐉ\u0001", new Object[]{"a", "b", "c", bwog.class, "d"});
        } else if (i2 == 3) {
            return new bwzg();
        } else {
            if (i2 == 4) {
                return new bxvd((short[][][]) null, (float[][][]) null, (byte[]) null);
            }
            if (i2 == 5) {
                return f161599e;
            }
            bxxk bxxk = f161600g;
            if (bxxk == null) {
                synchronized (bwzg.class) {
                    bxxk = f161600g;
                    if (bxxk == null) {
                        bxxk = new bxve(f161599e);
                        f161600g = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
