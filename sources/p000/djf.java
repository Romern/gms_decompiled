package p000;

/* renamed from: djf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class djf extends GeneratedMessageLite implements bxxd {

    /* renamed from: b */
    public static final djf f13322b;

    /* renamed from: c */
    private static volatile bxxk f13323c;

    /* renamed from: a */
    public bxwc f13324a = bxxn.f165040b;

    static {
        djf djf = new djf();
        f13322b = djf;
        GeneratedMessageLite.m124024a(djf.class, djf);
    }

    private djf() {
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
            return GeneratedMessageLite.m124022a(f13322b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", djc.class});
        } else if (i2 == 3) {
            return new djf();
        } else {
            if (i2 == 4) {
                return new bxvd(f13322b);
            }
            if (i2 == 5) {
                return f13322b;
            }
            bxxk bxxk = f13323c;
            if (bxxk == null) {
                synchronized (djf.class) {
                    bxxk = f13323c;
                    if (bxxk == null) {
                        bxxk = new bxve(f13322b);
                        f13323c = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }

    /* renamed from: a */
    public final void mo9124a() {
        if (!this.f13324a.mo73666a()) {
            this.f13324a = GeneratedMessageLite.m124021a(this.f13324a);
        }
    }
}
