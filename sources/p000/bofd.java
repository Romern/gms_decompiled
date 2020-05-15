package p000;

/* renamed from: bofd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bofd extends bxvk implements bxxd {

    /* renamed from: b */
    public static final bofd f132880b;

    /* renamed from: c */
    private static volatile bxxk f132881c;

    /* renamed from: a */
    public bxwc f132882a = bxxn.f165040b;

    static {
        bofd bofd = new bofd();
        f132880b = bofd;
        bxvk.m124024a(bofd.class, bofd);
    }

    private bofd() {
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
            return bxvk.m124022a(f132880b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", bofc.class});
        } else if (i2 == 3) {
            return new bofd();
        } else {
            if (i2 == 4) {
                return new boez();
            }
            if (i2 == 5) {
                return f132880b;
            }
            bxxk bxxk = f132881c;
            if (bxxk == null) {
                synchronized (bofd.class) {
                    bxxk = f132881c;
                    if (bxxk == null) {
                        bxxk = new bxve(f132880b);
                        f132881c = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }

    /* renamed from: a */
    public final void mo68905a() {
        if (!this.f132882a.mo73666a()) {
            this.f132882a = bxvk.m124021a(this.f132882a);
        }
    }
}
