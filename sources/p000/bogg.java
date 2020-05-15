package p000;

/* renamed from: bogg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bogg extends GeneratedMessageLite implements bxxd {

    /* renamed from: f */
    public static final bogg f132977f;

    /* renamed from: g */
    private static volatile bxxk f132978g;

    /* renamed from: a */
    public int f132979a;

    /* renamed from: b */
    public String f132980b = "";

    /* renamed from: c */
    public String f132981c = "";

    /* renamed from: d */
    public String f132982d = "";

    /* renamed from: e */
    public bxwc f132983e = bxxn.f165040b;

    static {
        bogg bogg = new bogg();
        f132977f = bogg;
        GeneratedMessageLite.m124024a(bogg.class, bogg);
    }

    private bogg() {
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
            return GeneratedMessageLite.m124022a(f132977f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004\u001a", new Object[]{"a", "b", "c", "d", "e"});
        } else if (i2 == 3) {
            return new bogg();
        } else {
            if (i2 == 4) {
                return new bogf();
            }
            if (i2 == 5) {
                return f132977f;
            }
            bxxk bxxk = f132978g;
            if (bxxk == null) {
                synchronized (bogg.class) {
                    bxxk = f132978g;
                    if (bxxk == null) {
                        bxxk = new bxve(f132977f);
                        f132978g = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
