package p000;

/* renamed from: bbjt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bbjt extends GeneratedMessageLite implements bxxd {

    /* renamed from: d */
    public static final bbjt f102784d;

    /* renamed from: f */
    private static volatile bxxk f102785f;

    /* renamed from: a */
    public int f102786a;

    /* renamed from: b */
    public btdb f102787b;

    /* renamed from: c */
    public bbjs f102788c;

    /* renamed from: e */
    private byte f102789e = 2;

    static {
        bbjt bbjt = new bbjt();
        f102784d = bbjt;
        GeneratedMessageLite.m124024a(bbjt.class, bbjt);
    }

    private bbjt() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f102789e);
        }
        byte b = 0;
        if (i2 == 1) {
            if (obj != null) {
                b = 1;
            }
            this.f102789e = b;
            return null;
        } else if (i2 == 2) {
            return GeneratedMessageLite.m124022a(f102784d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0001\u0001ᐉ\u0000\u0002ဉ\u0001", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new bbjt();
        } else {
            if (i2 == 4) {
                return new bxvd(f102784d);
            }
            if (i2 == 5) {
                return f102784d;
            }
            bxxk bxxk = f102785f;
            if (bxxk == null) {
                synchronized (bbjt.class) {
                    bxxk = f102785f;
                    if (bxxk == null) {
                        bxxk = new bxve(f102784d);
                        f102785f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
