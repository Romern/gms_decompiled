package p000;

/* renamed from: agnk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class agnk extends GeneratedMessageLite implements bxxd {

    /* renamed from: g */
    public static final agnk f66077g;

    /* renamed from: h */
    private static volatile bxxk f66078h;

    /* renamed from: a */
    public int f66079a;

    /* renamed from: b */
    public String f66080b = "";

    /* renamed from: c */
    public String f66081c = "";

    /* renamed from: d */
    public long f66082d;

    /* renamed from: e */
    public double f66083e;

    /* renamed from: f */
    public bxwc f66084f = bxxn.f165040b;

    static {
        agnk agnk = new agnk();
        f66077g = agnk;
        GeneratedMessageLite.m124024a(agnk.class, agnk);
    }

    private agnk() {
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
            return GeneratedMessageLite.m124022a(f66077g, "\u0001\u0005\u0000\u0001\u0001\u0006\u0005\u0000\u0001\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဂ\u0002\u0005က\u0004\u0006\u001b", new Object[]{"a", "b", "c", "d", "e", "f", agnk.class});
        } else if (i2 == 3) {
            return new agnk();
        } else {
            if (i2 == 4) {
                return new bxvd((int[][]) null, (byte[][][]) null);
            }
            if (i2 == 5) {
                return f66077g;
            }
            bxxk bxxk = f66078h;
            if (bxxk == null) {
                synchronized (agnk.class) {
                    bxxk = f66078h;
                    if (bxxk == null) {
                        bxxk = new bxve(f66077g);
                        f66078h = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }

    /* renamed from: a */
    public final void mo35757a() {
        if (!this.f66084f.mo73666a()) {
            this.f66084f = GeneratedMessageLite.m124021a(this.f66084f);
        }
    }
}
