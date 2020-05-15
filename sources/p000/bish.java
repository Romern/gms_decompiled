package p000;

/* renamed from: bish */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bish extends bxvk implements bxxd {

    /* renamed from: d */
    public static final bish f121557d;

    /* renamed from: f */
    private static volatile bxxk f121558f;

    /* renamed from: a */
    public int f121559a;

    /* renamed from: b */
    public int f121560b;

    /* renamed from: c */
    public int f121561c;

    /* renamed from: e */
    private byte f121562e = 2;

    static {
        bish bish = new bish();
        f121557d = bish;
        bxvk.m124024a(bish.class, bish);
    }

    private bish() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f121562e);
        }
        byte b = 0;
        if (i2 == 1) {
            if (obj != null) {
                b = 1;
            }
            this.f121562e = b;
            return null;
        } else if (i2 == 2) {
            return bxvk.m124022a(f121557d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0001\u0001ᔄ\u0000\u0002င\u0001", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new bish();
        } else {
            if (i2 == 4) {
                return new bxvd(f121557d);
            }
            if (i2 == 5) {
                return f121557d;
            }
            bxxk bxxk = f121558f;
            if (bxxk == null) {
                synchronized (bish.class) {
                    bxxk = f121558f;
                    if (bxxk == null) {
                        bxxk = new bxve(f121557d);
                        f121558f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
