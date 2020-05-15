package p000;

/* renamed from: ltd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ltd extends bxvk implements bxxd {

    /* renamed from: b */
    public static final ltd f32894b;

    /* renamed from: c */
    private static volatile bxxk f32895c;

    /* renamed from: a */
    public bxwc f32896a = bxxn.f165040b;

    static {
        ltd ltd = new ltd();
        f32894b = ltd;
        bxvk.m124024a(ltd.class, ltd);
    }

    private ltd() {
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
            return bxvk.m124022a(f32894b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a", new Object[]{"a"});
        } else if (i2 == 3) {
            return new ltd();
        } else {
            if (i2 == 4) {
                return new bxvd(f32894b);
            }
            if (i2 == 5) {
                return f32894b;
            }
            bxxk bxxk = f32895c;
            if (bxxk == null) {
                synchronized (ltd.class) {
                    bxxk = f32895c;
                    if (bxxk == null) {
                        bxxk = new bxve(f32894b);
                        f32895c = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }

    /* renamed from: a */
    public final void mo19597a() {
        if (!this.f32896a.mo73666a()) {
            this.f32896a = bxvk.m124021a(this.f32896a);
        }
    }
}
