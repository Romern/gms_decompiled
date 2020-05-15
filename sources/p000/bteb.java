package p000;

/* renamed from: bteb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bteb extends GeneratedMessageLite implements bxxd {

    /* renamed from: b */
    public static final bteb f148487b;

    /* renamed from: c */
    private static volatile bxxk f148488c;

    /* renamed from: a */
    public int f148489a;

    static {
        bteb bteb = new bteb();
        f148487b = bteb;
        GeneratedMessageLite.m124024a(bteb.class, bteb);
    }

    private bteb() {
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
            return GeneratedMessageLite.m124022a(f148487b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\f", new Object[]{"a"});
        } else if (i2 == 3) {
            return new bteb();
        } else {
            if (i2 == 4) {
                return new bxvd(f148487b);
            }
            if (i2 == 5) {
                return f148487b;
            }
            bxxk bxxk = f148488c;
            if (bxxk == null) {
                synchronized (bteb.class) {
                    bxxk = f148488c;
                    if (bxxk == null) {
                        bxxk = new bxve(f148487b);
                        f148488c = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
