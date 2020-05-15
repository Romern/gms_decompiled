package p000;

/* renamed from: bwyz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bwyz extends GeneratedMessageLite implements bxxd {

    /* renamed from: h */
    public static final bwyz f161561h;

    /* renamed from: j */
    private static volatile bxxk f161562j;

    /* renamed from: a */
    public int f161563a;

    /* renamed from: b */
    public bwxl f161564b;

    /* renamed from: c */
    public bxwc f161565c = bxxn.f165040b;

    /* renamed from: d */
    public bxwc f161566d = bxxn.f165040b;

    /* renamed from: e */
    public bwzd f161567e;

    /* renamed from: f */
    public String f161568f = "";

    /* renamed from: g */
    public bxwc f161569g = bxxn.f165040b;

    /* renamed from: i */
    private byte f161570i = 2;

    static {
        bwyz bwyz = new bwyz();
        f161561h = bwyz;
        GeneratedMessageLite.m124024a(bwyz.class, bwyz);
    }

    private bwyz() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f161570i);
        }
        byte b = 0;
        if (i2 == 1) {
            if (obj != null) {
                b = 1;
            }
            this.f161570i = b;
            return null;
        } else if (i2 == 2) {
            return GeneratedMessageLite.m124022a(f161561h, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0003\u0003\u0001ᐉ\u0000\u0002Л\u0003Л\u0004ဉ\u0001\u0005ဈ\u0002\u0006\u001b", new Object[]{"a", "b", "c", bwxl.class, "d", bwny.class, "e", "f", "g", bxaz.class});
        } else if (i2 == 3) {
            return new bwyz();
        } else {
            if (i2 == 4) {
                return new bwyy();
            }
            if (i2 == 5) {
                return f161561h;
            }
            bxxk bxxk = f161562j;
            if (bxxk == null) {
                synchronized (bwyz.class) {
                    bxxk = f161562j;
                    if (bxxk == null) {
                        bxxk = new bxve(f161561h);
                        f161562j = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }

    /* renamed from: a */
    public final void mo73546a() {
        if (!this.f161566d.mo73666a()) {
            this.f161566d = GeneratedMessageLite.m124021a(this.f161566d);
        }
    }
}
