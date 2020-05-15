package p000;

/* renamed from: bwac */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bwac extends bxvk implements bxxd {

    /* renamed from: d */
    public static final bwac f158609d;

    /* renamed from: h */
    private static volatile bxxk f158610h;

    /* renamed from: a */
    public int f158611a;

    /* renamed from: b */
    public bvzz f158612b;

    /* renamed from: c */
    public bvzy f158613c;

    /* renamed from: e */
    private bwaa f158614e;

    /* renamed from: f */
    private bwab f158615f;

    /* renamed from: g */
    private byte f158616g = 2;

    static {
        bwac bwac = new bwac();
        f158609d = bwac;
        bxvk.m124024a(bwac.class, bwac);
    }

    private bwac() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f158616g);
        }
        byte b = 0;
        if (i2 == 1) {
            if (obj != null) {
                b = 1;
            }
            this.f158616g = b;
            return null;
        } else if (i2 == 2) {
            return bxvk.m124022a(f158609d, "\u0000\u0005\u0000\u0000\u0010f\u0005\u0000\u0000\u0002\u0010ЉGЉP\fV\tf\t", new Object[]{"e", "f", "a", "b", "c"});
        } else if (i2 == 3) {
            return new bwac();
        } else {
            if (i2 == 4) {
                return new bxvd(f158609d);
            }
            if (i2 == 5) {
                return f158609d;
            }
            bxxk bxxk = f158610h;
            if (bxxk == null) {
                synchronized (bwac.class) {
                    bxxk = f158610h;
                    if (bxxk == null) {
                        bxxk = new bxve(f158609d);
                        f158610h = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
