package p000;

/* renamed from: bkxw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bkxw extends GeneratedMessageLite implements bxxd {

    /* renamed from: e */
    public static final bkxw f125425e;

    /* renamed from: f */
    private static volatile bxxk f125426f;

    /* renamed from: a */
    public int f125427a;

    /* renamed from: b */
    public String f125428b = "";

    /* renamed from: c */
    public long f125429c;

    /* renamed from: d */
    public int f125430d;

    static {
        bkxw bkxw = new bkxw();
        f125425e = bkxw;
        GeneratedMessageLite.m124024a(bkxw.class, bkxw);
    }

    private bkxw() {
        ByteString bxtx = bxtx.f164797b;
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
            return GeneratedMessageLite.m124022a(f125425e, "\u0001\u0003\u0000\u0001\u0001\u0006\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဂ\u0001\u0006ဌ\u0005", new Object[]{"a", "b", "c", "d", bkxx.f125431a});
        } else if (i2 == 3) {
            return new bkxw();
        } else {
            if (i2 == 4) {
                return new bxvd(f125425e);
            }
            if (i2 == 5) {
                return f125425e;
            }
            bxxk bxxk = f125426f;
            if (bxxk == null) {
                synchronized (bkxw.class) {
                    bxxk = f125426f;
                    if (bxxk == null) {
                        bxxk = new bxve(f125425e);
                        f125426f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
