package p000;

/* renamed from: bwle */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bwle extends GeneratedMessageLite implements bxxd {

    /* renamed from: g */
    public static final bwle f160097g;

    /* renamed from: i */
    private static volatile bxxk f160098i;

    /* renamed from: a */
    public int f160099a;

    /* renamed from: b */
    public bmav f160100b;

    /* renamed from: c */
    public bmaq f160101c;

    /* renamed from: d */
    public bwlf f160102d;

    /* renamed from: e */
    public int f160103e;

    /* renamed from: f */
    public bmar f160104f;

    /* renamed from: h */
    private byte f160105h = 2;

    static {
        bwle bwle = new bwle();
        f160097g = bwle;
        GeneratedMessageLite.m124024a(bwle.class, bwle);
    }

    private bwle() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f160105h);
        }
        byte b = 0;
        if (i2 == 1) {
            if (obj != null) {
                b = 1;
            }
            this.f160105h = b;
            return null;
        } else if (i2 == 2) {
            return GeneratedMessageLite.m124022a(f160097g, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0001\u0001ဉ\u0000\u0002ဉ\u0001\u0003ᐉ\u0002\u0004ဌ\u0003\u0005ဉ\u0004", new Object[]{"a", "b", "c", "d", "e", bwgz.m121953b(), "f"});
        } else if (i2 == 3) {
            return new bwle();
        } else {
            if (i2 == 4) {
                return new bxvd(f160097g);
            }
            if (i2 == 5) {
                return f160097g;
            }
            bxxk bxxk = f160098i;
            if (bxxk == null) {
                synchronized (bwle.class) {
                    bxxk = f160098i;
                    if (bxxk == null) {
                        bxxk = new bxve(f160097g);
                        f160098i = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
