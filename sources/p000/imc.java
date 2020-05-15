package p000;

/* renamed from: imc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class imc extends GeneratedMessageLite implements bxxd {

    /* renamed from: d */
    public static final imc f21341d;

    /* renamed from: e */
    private static volatile bxxk f21342e;

    /* renamed from: a */
    public int f21343a;

    /* renamed from: b */
    public bxwc f21344b = bxxn.f165040b;

    /* renamed from: c */
    public imd f21345c;

    static {
        imc imc = new imc();
        f21341d = imc;
        GeneratedMessageLite.m124024a(imc.class, imc);
    }

    private imc() {
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
            return GeneratedMessageLite.m124022a(f21341d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002ဉ\u0000", new Object[]{"a", "b", C1082ime.class, "c"});
        } else if (i2 == 3) {
            return new imc();
        } else {
            if (i2 == 4) {
                return new bxvd(f21341d);
            }
            if (i2 == 5) {
                return f21341d;
            }
            bxxk bxxk = f21342e;
            if (bxxk == null) {
                synchronized (imc.class) {
                    bxxk = f21342e;
                    if (bxxk == null) {
                        bxxk = new bxve(f21341d);
                        f21342e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }

    /* renamed from: a */
    public final void mo13136a() {
        if (!this.f21344b.mo73666a()) {
            this.f21344b = GeneratedMessageLite.m124021a(this.f21344b);
        }
    }
}
