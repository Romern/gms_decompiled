package p000;

/* renamed from: kwi */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class kwi extends bxvk implements bxxd {

    /* renamed from: b */
    public static final kwi f25265b;

    /* renamed from: c */
    private static volatile bxxk f25266c;

    /* renamed from: a */
    public bxwc f25267a = bxxn.f165040b;

    static {
        kwi kwi = new kwi();
        f25265b = kwi;
        bxvk.m124024a(kwi.class, kwi);
    }

    private kwi() {
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
            return bxvk.m124022a(f25265b, "\u0000\u0001\u0000\u0000\u0002\u0002\u0001\u0000\u0001\u0000\u0002\u001b", new Object[]{"a", kwh.class});
        } else if (i2 == 3) {
            return new kwi();
        } else {
            if (i2 == 4) {
                return new bxvd(f25265b);
            }
            if (i2 == 5) {
                return f25265b;
            }
            bxxk bxxk = f25266c;
            if (bxxk == null) {
                synchronized (kwi.class) {
                    bxxk = f25266c;
                    if (bxxk == null) {
                        bxxk = new bxve(f25265b);
                        f25266c = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }

    /* renamed from: a */
    public final void mo14897a() {
        if (!this.f25267a.mo73666a()) {
            this.f25267a = bxvk.m124021a(this.f25267a);
        }
    }
}
