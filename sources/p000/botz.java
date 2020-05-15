package p000;

/* renamed from: botz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class botz extends bxvg implements bxvh {

    /* renamed from: c */
    public static final botz f134902c;

    /* renamed from: e */
    private static volatile bxxk f134903e;

    /* renamed from: a */
    public int f134904a;

    /* renamed from: b */
    public String f134905b = "";

    /* renamed from: d */
    private byte f134906d = 2;

    static {
        botz botz = new botz();
        f134902c = botz;
        GeneratedMessageLite.m124024a(botz.class, botz);
    }

    private botz() {
        bxxn bxxn = bxxn.f165040b;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f134906d);
        }
        byte b = 0;
        if (i2 == 1) {
            if (obj != null) {
                b = 1;
            }
            this.f134906d = b;
            return null;
        } else if (i2 == 2) {
            return GeneratedMessageLite.m124022a(f134902c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"a", "b"});
        } else if (i2 == 3) {
            return new botz();
        } else {
            if (i2 == 4) {
                return new bxvf(f134902c);
            }
            if (i2 == 5) {
                return f134902c;
            }
            bxxk bxxk = f134903e;
            if (bxxk == null) {
                synchronized (botz.class) {
                    bxxk = f134903e;
                    if (bxxk == null) {
                        bxxk = new bxve(f134902c);
                        f134903e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
