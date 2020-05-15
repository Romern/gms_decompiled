package p000;

/* renamed from: ajih */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ajih extends bxvk implements bxxd {

    /* renamed from: b */
    public static final ajih f70707b;

    /* renamed from: c */
    private static volatile bxxk f70708c;

    /* renamed from: a */
    public bxwc f70709a = bxxn.f165040b;

    static {
        ajih ajih = new ajih();
        f70707b = ajih;
        bxvk.m124024a(ajih.class, ajih);
    }

    private ajih() {
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
            return bxvk.m124022a(f70707b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", ajif.class});
        } else if (i2 == 3) {
            return new ajih();
        } else {
            if (i2 == 4) {
                return new ajig();
            }
            if (i2 == 5) {
                return f70707b;
            }
            bxxk bxxk = f70708c;
            if (bxxk == null) {
                synchronized (ajih.class) {
                    bxxk = f70708c;
                    if (bxxk == null) {
                        bxxk = new bxve(f70707b);
                        f70708c = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }

    /* renamed from: a */
    public final void mo38675a() {
        if (!this.f70709a.mo73666a()) {
            this.f70709a = bxvk.m124021a(this.f70709a);
        }
    }
}
