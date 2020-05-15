package p000;

/* renamed from: bydi */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bydi extends GeneratedMessageLite implements bxxd {

    /* renamed from: b */
    public static final bydi f165792b;

    /* renamed from: c */
    private static volatile bxxk f165793c;

    /* renamed from: a */
    public bxvw f165794a = bxwq.f165002b;

    static {
        bydi bydi = new bydi();
        f165792b = bydi;
        GeneratedMessageLite.m124024a(bydi.class, bydi);
    }

    private bydi() {
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
            return GeneratedMessageLite.m124022a(f165792b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001%", new Object[]{"a"});
        } else if (i2 == 3) {
            return new bydi();
        } else {
            if (i2 == 4) {
                return new bxvd(f165792b);
            }
            if (i2 == 5) {
                return f165792b;
            }
            bxxk bxxk = f165793c;
            if (bxxk == null) {
                synchronized (bydi.class) {
                    bxxk = f165793c;
                    if (bxxk == null) {
                        bxxk = new bxve(f165792b);
                        f165793c = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
