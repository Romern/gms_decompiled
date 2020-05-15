package p000;

/* renamed from: wzo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class wzo extends GeneratedMessageLite implements bxxd {

    /* renamed from: c */
    public static final wzo f51619c;

    /* renamed from: d */
    private static volatile bxxk f51620d;

    /* renamed from: a */
    public int f51621a;

    /* renamed from: b */
    public int f51622b;

    static {
        wzo wzo = new wzo();
        f51619c = wzo;
        GeneratedMessageLite.m124024a(wzo.class, wzo);
    }

    private wzo() {
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
            return GeneratedMessageLite.m124022a(f51619c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"a", "b", wzn.f51618a});
        } else if (i2 == 3) {
            return new wzo();
        } else {
            if (i2 == 4) {
                return new bxvd(f51619c);
            }
            if (i2 == 5) {
                return f51619c;
            }
            bxxk bxxk = f51620d;
            if (bxxk == null) {
                synchronized (wzo.class) {
                    bxxk = f51620d;
                    if (bxxk == null) {
                        bxxk = new bxve(f51619c);
                        f51620d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
