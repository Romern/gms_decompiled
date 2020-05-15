package p000;

/* renamed from: cboo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cboo extends GeneratedMessageLite implements bxxd {

    /* renamed from: c */
    public static final cboo f177842c;

    /* renamed from: d */
    private static volatile bxxk f177843d;

    /* renamed from: a */
    public String f177844a = "";

    /* renamed from: b */
    public String f177845b = "";

    static {
        cboo cboo = new cboo();
        f177842c = cboo;
        GeneratedMessageLite.m124024a(cboo.class, cboo);
    }

    private cboo() {
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
            return GeneratedMessageLite.m124022a(f177842c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ", new Object[]{"a", "b"});
        } else if (i2 == 3) {
            return new cboo();
        } else {
            if (i2 == 4) {
                return new bxvd(f177842c);
            }
            if (i2 == 5) {
                return f177842c;
            }
            bxxk bxxk = f177843d;
            if (bxxk == null) {
                synchronized (cboo.class) {
                    bxxk = f177843d;
                    if (bxxk == null) {
                        bxxk = new bxve(f177842c);
                        f177843d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
