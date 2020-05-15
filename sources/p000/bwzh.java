package p000;

/* renamed from: bwzh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bwzh extends GeneratedMessageLite implements bxxd {

    /* renamed from: d */
    public static final bwzh f161606d;

    /* renamed from: g */
    private static volatile bxxk f161607g;

    /* renamed from: a */
    public bwmh f161608a;

    /* renamed from: b */
    public bwoy f161609b;

    /* renamed from: c */
    public bwmi f161610c;

    /* renamed from: e */
    private int f161611e;

    /* renamed from: f */
    private byte f161612f = 2;

    static {
        bwzh bwzh = new bwzh();
        f161606d = bwzh;
        GeneratedMessageLite.m124024a(bwzh.class, bwzh);
    }

    private bwzh() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f161612f);
        }
        byte b = 0;
        if (i2 == 1) {
            if (obj != null) {
                b = 1;
            }
            this.f161612f = b;
            return null;
        } else if (i2 == 2) {
            return GeneratedMessageLite.m124022a(f161606d, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0002\u0001ᐉ\u0000\u0002ᐉ\u0001\u0003ဉ\u0002", new Object[]{"e", "a", "b", "c"});
        } else if (i2 == 3) {
            return new bwzh();
        } else {
            if (i2 == 4) {
                return new bxvd(f161606d);
            }
            if (i2 == 5) {
                return f161606d;
            }
            bxxk bxxk = f161607g;
            if (bxxk == null) {
                synchronized (bwzh.class) {
                    bxxk = f161607g;
                    if (bxxk == null) {
                        bxxk = new bxve(f161606d);
                        f161607g = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
