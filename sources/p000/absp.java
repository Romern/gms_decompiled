package p000;

/* renamed from: absp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class absp extends GeneratedMessageLite implements bxxd {

    /* renamed from: b */
    public static final absp f58126b;

    /* renamed from: c */
    private static volatile bxxk f58127c;

    /* renamed from: a */
    public bxvw f58128a = bxwq.f165002b;

    static {
        absp absp = new absp();
        f58126b = absp;
        GeneratedMessageLite.m124024a(absp.class, absp);
    }

    private absp() {
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
            return GeneratedMessageLite.m124022a(f58126b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u0014", new Object[]{"a"});
        } else if (i2 == 3) {
            return new absp();
        } else {
            if (i2 == 4) {
                return new bxvd(f58126b);
            }
            if (i2 == 5) {
                return f58126b;
            }
            bxxk bxxk = f58127c;
            if (bxxk == null) {
                synchronized (absp.class) {
                    bxxk = f58127c;
                    if (bxxk == null) {
                        bxxk = new bxve(f58126b);
                        f58127c = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
