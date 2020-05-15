package p000;

/* renamed from: byzr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class byzr extends bxvg implements bxvh {

    /* renamed from: h */
    public static final byzr f169150h;

    /* renamed from: j */
    private static volatile bxxk f169151j;

    /* renamed from: a */
    public int f169152a;

    /* renamed from: b */
    public bxwc f169153b = bxxn.f165040b;

    /* renamed from: c */
    public byze f169154c;

    /* renamed from: d */
    public bxwc f169155d = bxxn.f165040b;

    /* renamed from: e */
    public bxwc f169156e = bxxn.f165040b;

    /* renamed from: f */
    public String f169157f = "";

    /* renamed from: g */
    public byzu f169158g;

    /* renamed from: i */
    private byte f169159i = 2;

    static {
        byzr byzr = new byzr();
        f169150h = byzr;
        bxvk.m124024a(byzr.class, byzr);
    }

    private byzr() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f169159i);
        }
        byte b = 0;
        if (i2 == 1) {
            if (obj != null) {
                b = 1;
            }
            this.f169159i = b;
            return null;
        } else if (i2 == 2) {
            return bxvk.m124022a(f169150h, "\u0001\u0006\u0000\u0001\u0001\t\u0006\u0000\u0003\u0001\u0001\u001a\u0002ဉ\u0000\u0006Л\u0007ဈ\u0002\b\u001a\tဉ\u0003", new Object[]{"a", "b", "c", "d", byys.class, "f", "e", "g"});
        } else if (i2 == 3) {
            return new byzr();
        } else {
            if (i2 == 4) {
                return new bxvf(f169150h);
            }
            if (i2 == 5) {
                return f169150h;
            }
            bxxk bxxk = f169151j;
            if (bxxk == null) {
                synchronized (byzr.class) {
                    bxxk = f169151j;
                    if (bxxk == null) {
                        bxxk = new bxve(f169150h);
                        f169151j = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }

    /* renamed from: e */
    public final void mo74514e() {
        if (!this.f169153b.mo73666a()) {
            this.f169153b = bxvk.m124021a(this.f169153b);
        }
    }
}
