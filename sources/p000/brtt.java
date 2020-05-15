package p000;

/* renamed from: brtt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class brtt extends GeneratedMessageLite implements bxxd {

    /* renamed from: f */
    public static final brtt f143337f;

    /* renamed from: g */
    private static volatile bxxk f143338g;

    /* renamed from: a */
    public int f143339a;

    /* renamed from: b */
    public int f143340b;

    /* renamed from: c */
    public String f143341c = "";

    /* renamed from: d */
    public bxwc f143342d;

    /* renamed from: e */
    public int f143343e;

    static {
        brtt brtt = new brtt();
        f143337f = brtt;
        GeneratedMessageLite.m124024a(brtt.class, brtt);
    }

    private brtt() {
        bxxn bxxn = bxxn.f165040b;
        this.f143342d = bxxn.f165040b;
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
            return GeneratedMessageLite.m124022a(f143337f, "\u0001\u0004\u0000\u0001\u0001\u0007\u0004\u0000\u0001\u0000\u0001ဌ\u0000\u0002ဈ\u0001\u0005\u001b\u0007င\u0002", new Object[]{"a", "b", brts.f143336a, "c", "d", brtv.class, "e"});
        } else if (i2 == 3) {
            return new brtt();
        } else {
            if (i2 == 4) {
                return new brtr();
            }
            if (i2 == 5) {
                return f143337f;
            }
            bxxk bxxk = f143338g;
            if (bxxk == null) {
                synchronized (brtt.class) {
                    bxxk = f143338g;
                    if (bxxk == null) {
                        bxxk = new bxve(f143337f);
                        f143338g = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }

    /* renamed from: a */
    public final void mo69939a() {
        if (!this.f143342d.mo73666a()) {
            this.f143342d = GeneratedMessageLite.m124021a(this.f143342d);
        }
    }
}
