package p000;

/* renamed from: bvwm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bvwm extends GeneratedMessageLite implements bxxd {

    /* renamed from: j */
    public static final bvwm f157965j;

    /* renamed from: k */
    private static volatile bxxk f157966k;

    /* renamed from: a */
    public int f157967a;

    /* renamed from: b */
    public long f157968b;

    /* renamed from: c */
    public bvxf f157969c;

    /* renamed from: d */
    public bvwl f157970d;

    /* renamed from: e */
    public bxwc f157971e = bxxn.f165040b;

    /* renamed from: f */
    public int f157972f = -1;

    /* renamed from: g */
    public int f157973g = -1;

    /* renamed from: h */
    public long f157974h;

    /* renamed from: i */
    public boolean f157975i;

    static {
        bvwm bvwm = new bvwm();
        f157965j = bvwm;
        GeneratedMessageLite.m124024a(bvwm.class, bvwm);
    }

    private bvwm() {
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
            return GeneratedMessageLite.m124022a(f157965j, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0001\u0000\u0001ဂ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004\u001b\u0005င\u0003\u0006င\u0004\u0007ဂ\u0005\bဇ\u0006", new Object[]{"a", "b", "c", "d", "e", bvwi.class, "f", "g", "h", "i"});
        } else if (i2 == 3) {
            return new bvwm();
        } else {
            if (i2 == 4) {
                return new bxvd((boolean[][]) null, (float[][][]) null);
            }
            if (i2 == 5) {
                return f157965j;
            }
            bxxk bxxk = f157966k;
            if (bxxk == null) {
                synchronized (bvwm.class) {
                    bxxk = f157966k;
                    if (bxxk == null) {
                        bxxk = new bxve(f157965j);
                        f157966k = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }

    /* renamed from: a */
    public final void mo73393a() {
        if (!this.f157971e.mo73666a()) {
            this.f157971e = GeneratedMessageLite.m124021a(this.f157971e);
        }
    }
}
