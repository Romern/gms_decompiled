package p000;

/* renamed from: bmvj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bmvj extends GeneratedMessageLite implements bxxd {

    /* renamed from: c */
    public static final bmvj f131053c;

    /* renamed from: d */
    private static volatile bxxk f131054d;

    /* renamed from: a */
    public int f131055a;

    /* renamed from: b */
    public bmvc f131056b;

    static {
        bmvj bmvj = new bmvj();
        f131053c = bmvj;
        GeneratedMessageLite.m124024a(bmvj.class, bmvj);
    }

    private bmvj() {
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
            return GeneratedMessageLite.m124022a(f131053c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"a", "b"});
        } else if (i2 == 3) {
            return new bmvj();
        } else {
            if (i2 == 4) {
                return new bxvd(f131053c);
            }
            if (i2 == 5) {
                return f131053c;
            }
            bxxk bxxk = f131054d;
            if (bxxk == null) {
                synchronized (bmvj.class) {
                    bxxk = f131054d;
                    if (bxxk == null) {
                        bxxk = new bxve(f131053c);
                        f131054d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
