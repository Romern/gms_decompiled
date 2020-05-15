package p000;

/* renamed from: acqo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class acqo extends GeneratedMessageLite implements bxxd {

    /* renamed from: c */
    public static final acqo f60510c;

    /* renamed from: e */
    private static volatile bxxk f60511e;

    /* renamed from: a */
    public int f60512a;

    /* renamed from: b */
    public acqr f60513b;

    /* renamed from: d */
    private byte f60514d = 2;

    static {
        acqo acqo = new acqo();
        f60510c = acqo;
        GeneratedMessageLite.m124024a(acqo.class, acqo);
    }

    private acqo() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f60514d);
        }
        byte b = 0;
        if (i2 == 1) {
            if (obj != null) {
                b = 1;
            }
            this.f60514d = b;
            return null;
        } else if (i2 == 2) {
            return GeneratedMessageLite.m124022a(f60510c, "\u0001\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0000\u0002ဉ\u0001", new Object[]{"a", "b"});
        } else if (i2 == 3) {
            return new acqo();
        } else {
            if (i2 == 4) {
                return new bxvd(f60510c);
            }
            if (i2 == 5) {
                return f60510c;
            }
            bxxk bxxk = f60511e;
            if (bxxk == null) {
                synchronized (acqo.class) {
                    bxxk = f60511e;
                    if (bxxk == null) {
                        bxxk = new bxve(f60510c);
                        f60511e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
