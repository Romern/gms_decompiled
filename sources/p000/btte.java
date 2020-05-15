package p000;

/* renamed from: btte */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class btte extends GeneratedMessageLite implements bxxd {

    /* renamed from: d */
    public static final btte f150329d;

    /* renamed from: f */
    private static volatile bxxk f150330f;

    /* renamed from: a */
    public int f150331a;

    /* renamed from: b */
    public btsh f150332b;

    /* renamed from: c */
    public btrt f150333c;

    /* renamed from: e */
    private byte f150334e = 2;

    static {
        btte btte = new btte();
        f150329d = btte;
        GeneratedMessageLite.m124024a(btte.class, btte);
    }

    private btte() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f150334e);
        }
        byte b = 0;
        if (i2 == 1) {
            if (obj != null) {
                b = 1;
            }
            this.f150334e = b;
            return null;
        } else if (i2 == 2) {
            return GeneratedMessageLite.m124022a(f150329d, "\u0001\u0002\u0000\u0001\u0001\u0003\u0002\u0000\u0000\u0001\u0001ᐉ\u0000\u0003ဉ\u0002", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new btte();
        } else {
            if (i2 == 4) {
                return new bxvd(f150329d);
            }
            if (i2 == 5) {
                return f150329d;
            }
            bxxk bxxk = f150330f;
            if (bxxk == null) {
                synchronized (btte.class) {
                    bxxk = f150330f;
                    if (bxxk == null) {
                        bxxk = new bxve(f150329d);
                        f150330f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
