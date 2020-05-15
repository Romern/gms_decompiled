package p000;

/* renamed from: caig */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class caig extends GeneratedMessageLite implements bxxd {

    /* renamed from: k */
    public static final caig f174681k;

    /* renamed from: l */
    private static volatile bxxk f174682l;

    /* renamed from: a */
    public int f174683a;

    /* renamed from: b */
    public int f174684b;

    /* renamed from: c */
    public cahp f174685c;

    /* renamed from: d */
    public bxwc f174686d = bxxn.f165040b;

    /* renamed from: e */
    public caie f174687e;

    /* renamed from: f */
    public caih f174688f;

    /* renamed from: g */
    public cahz f174689g;

    /* renamed from: h */
    public caid f174690h;

    /* renamed from: i */
    public caib f174691i;

    /* renamed from: j */
    public bxwc f174692j = bxxn.f165040b;

    static {
        caig caig = new caig();
        f174681k = caig;
        GeneratedMessageLite.m124024a(caig.class, caig);
    }

    private caig() {
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
            return GeneratedMessageLite.m124022a(f174681k, "\u0001\t\u0000\u0001\u0001\f\t\u0000\u0002\u0000\u0001ဉ\u0001\u0004\u001b\u0006ဉ\u0004\u0007ဉ\u0003\bဉ\u0005\tဉ\u0006\nင\u0000\u000bဉ\u0007\f\u001b", new Object[]{"a", "c", "d", cahp.class, "f", "e", "g", "h", "b", "i", "j", cahq.class});
        } else if (i2 == 3) {
            return new caig();
        } else {
            if (i2 == 4) {
                return new bxvd((int[][][]) null, (short[]) null, (char[]) null);
            }
            if (i2 == 5) {
                return f174681k;
            }
            bxxk bxxk = f174682l;
            if (bxxk == null) {
                synchronized (caig.class) {
                    bxxk = f174682l;
                    if (bxxk == null) {
                        bxxk = new bxve(f174681k);
                        f174682l = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }

    /* renamed from: c */
    public final void mo74651c() {
        if (!this.f174692j.mo73666a()) {
            this.f174692j = GeneratedMessageLite.m124021a(this.f174692j);
        }
    }
}
