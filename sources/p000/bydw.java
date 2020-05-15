package p000;

/* renamed from: bydw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bydw extends GeneratedMessageLite implements bxxd {

    /* renamed from: b */
    public static final bydw f165865b;

    /* renamed from: c */
    private static volatile bxxk f165866c;

    /* renamed from: a */
    public bydu f165867a;

    static {
        bydw bydw = new bydw();
        f165865b = bydw;
        GeneratedMessageLite.m124024a(bydw.class, bydw);
    }

    private bydw() {
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
            return GeneratedMessageLite.m124022a(f165865b, "\u0000\u0001\u0000\u0000\u0003\u0003\u0001\u0000\u0000\u0000\u0003\t", new Object[]{"a"});
        } else if (i2 == 3) {
            return new bydw();
        } else {
            if (i2 == 4) {
                return new bxvd(f165865b);
            }
            if (i2 == 5) {
                return f165865b;
            }
            bxxk bxxk = f165866c;
            if (bxxk == null) {
                synchronized (bydw.class) {
                    bxxk = f165866c;
                    if (bxxk == null) {
                        bxxk = new bxve(f165865b);
                        f165866c = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
