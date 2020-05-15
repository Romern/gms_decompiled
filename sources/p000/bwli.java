package p000;

/* renamed from: bwli */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bwli extends GeneratedMessageLite implements bxxd {

    /* renamed from: g */
    public static final bwli f160128g;

    /* renamed from: i */
    private static volatile bxxk f160129i;

    /* renamed from: a */
    public int f160130a;

    /* renamed from: b */
    public bmav f160131b;

    /* renamed from: c */
    public bmaq f160132c;

    /* renamed from: d */
    public bwlf f160133d;

    /* renamed from: e */
    public int f160134e;

    /* renamed from: f */
    public bmar f160135f;

    /* renamed from: h */
    private byte f160136h = 2;

    static {
        bwli bwli = new bwli();
        f160128g = bwli;
        GeneratedMessageLite.m124024a(bwli.class, bwli);
    }

    private bwli() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f160136h);
        }
        byte b = 0;
        if (i2 == 1) {
            if (obj != null) {
                b = 1;
            }
            this.f160136h = b;
            return null;
        } else if (i2 == 2) {
            return GeneratedMessageLite.m124022a(f160128g, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0001\u0001ဉ\u0000\u0002ဉ\u0001\u0003ᐉ\u0002\u0004ဌ\u0003\u0005ဉ\u0004", new Object[]{"a", "b", "c", "d", "e", bwgz.m121953b(), "f"});
        } else if (i2 == 3) {
            return new bwli();
        } else {
            if (i2 == 4) {
                return new bxvd(f160128g);
            }
            if (i2 == 5) {
                return f160128g;
            }
            bxxk bxxk = f160129i;
            if (bxxk == null) {
                synchronized (bwli.class) {
                    bxxk = f160129i;
                    if (bxxk == null) {
                        bxxk = new bxve(f160128g);
                        f160129i = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
