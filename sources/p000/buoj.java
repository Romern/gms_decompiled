package p000;

/* renamed from: buoj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class buoj extends GeneratedMessageLite implements bxxd {

    /* renamed from: c */
    public static final buoj f154537c;

    /* renamed from: d */
    private static volatile bxxk f154538d;

    /* renamed from: a */
    public buov f154539a;

    /* renamed from: b */
    public buoi f154540b;

    static {
        buoj buoj = new buoj();
        f154537c = buoj;
        GeneratedMessageLite.m124024a(buoj.class, buoj);
    }

    private buoj() {
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
            return GeneratedMessageLite.m124022a(f154537c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\t\u0002\t", new Object[]{"a", "b"});
        } else if (i2 == 3) {
            return new buoj();
        } else {
            if (i2 == 4) {
                return new bxvd(f154537c);
            }
            if (i2 == 5) {
                return f154537c;
            }
            bxxk bxxk = f154538d;
            if (bxxk == null) {
                synchronized (buoj.class) {
                    bxxk = f154538d;
                    if (bxxk == null) {
                        bxxk = new bxve(f154537c);
                        f154538d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
