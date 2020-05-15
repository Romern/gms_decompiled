package p000;

/* renamed from: bofp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bofp extends GeneratedMessageLite implements bxxd {

    /* renamed from: c */
    public static final bofp f132931c;

    /* renamed from: d */
    private static volatile bxxk f132932d;

    /* renamed from: a */
    public int f132933a;

    /* renamed from: b */
    public int f132934b;

    static {
        bofp bofp = new bofp();
        f132931c = bofp;
        GeneratedMessageLite.m124024a(bofp.class, bofp);
    }

    private bofp() {
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
            return GeneratedMessageLite.m124022a(f132931c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"a", "b", bofo.f132930a});
        } else if (i2 == 3) {
            return new bofp();
        } else {
            if (i2 == 4) {
                return new bxvd(f132931c);
            }
            if (i2 == 5) {
                return f132931c;
            }
            bxxk bxxk = f132932d;
            if (bxxk == null) {
                synchronized (bofp.class) {
                    bxxk = f132932d;
                    if (bxxk == null) {
                        bxxk = new bxve(f132931c);
                        f132932d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
