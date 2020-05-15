package p000;

/* renamed from: btdb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class btdb extends GeneratedMessageLite implements bxxd {

    /* renamed from: b */
    public static final btdb f148370b;

    /* renamed from: d */
    private static volatile bxxk f148371d;

    /* renamed from: a */
    public bxwc f148372a = bxxn.f165040b;

    /* renamed from: c */
    private byte f148373c = 2;

    static {
        btdb btdb = new btdb();
        f148370b = btdb;
        GeneratedMessageLite.m124024a(btdb.class, btdb);
    }

    private btdb() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f148373c);
        }
        byte b = 0;
        if (i2 == 1) {
            if (obj != null) {
                b = 1;
            }
            this.f148373c = b;
            return null;
        } else if (i2 == 2) {
            return GeneratedMessageLite.m124022a(f148370b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001Л", new Object[]{"a", btec.class});
        } else if (i2 == 3) {
            return new btdb();
        } else {
            if (i2 == 4) {
                return new btda();
            }
            if (i2 == 5) {
                return f148370b;
            }
            bxxk bxxk = f148371d;
            if (bxxk == null) {
                synchronized (btdb.class) {
                    bxxk = f148371d;
                    if (bxxk == null) {
                        bxxk = new bxve(f148370b);
                        f148371d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }

    /* renamed from: a */
    public final void mo70744a() {
        if (!this.f148372a.mo73666a()) {
            this.f148372a = GeneratedMessageLite.m124021a(this.f148372a);
        }
    }
}
