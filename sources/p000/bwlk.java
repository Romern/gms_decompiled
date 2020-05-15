package p000;

/* renamed from: bwlk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bwlk extends bxvk implements bxxd {

    /* renamed from: f */
    public static final bwlk f160142f;

    /* renamed from: h */
    private static volatile bxxk f160143h;

    /* renamed from: a */
    public int f160144a;

    /* renamed from: b */
    public bmav f160145b;

    /* renamed from: c */
    public bmaq f160146c;

    /* renamed from: d */
    public int f160147d;

    /* renamed from: e */
    public bwll f160148e;

    /* renamed from: g */
    private byte f160149g = 2;

    static {
        bwlk bwlk = new bwlk();
        f160142f = bwlk;
        bxvk.m124024a(bwlk.class, bwlk);
    }

    private bwlk() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f160149g);
        }
        byte b = 0;
        if (i2 == 1) {
            if (obj != null) {
                b = 1;
            }
            this.f160149g = b;
            return null;
        } else if (i2 == 2) {
            return bxvk.m124022a(f160142f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0001\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဌ\u0002\u0004ᐉ\u0003", new Object[]{"a", "b", "c", "d", bwgz.m121953b(), "e"});
        } else if (i2 == 3) {
            return new bwlk();
        } else {
            if (i2 == 4) {
                return new bxvd(f160142f);
            }
            if (i2 == 5) {
                return f160142f;
            }
            bxxk bxxk = f160143h;
            if (bxxk == null) {
                synchronized (bwlk.class) {
                    bxxk = f160143h;
                    if (bxxk == null) {
                        bxxk = new bxve(f160142f);
                        f160143h = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
