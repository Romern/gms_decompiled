package p000;

/* renamed from: btkz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class btkz extends GeneratedMessageLite implements bxxd {

    /* renamed from: b */
    public static final btkz f149330b;

    /* renamed from: c */
    private static volatile bxxk f149331c;

    /* renamed from: a */
    public String f149332a = "";

    static {
        btkz btkz = new btkz();
        f149330b = btkz;
        GeneratedMessageLite.m124024a(btkz.class, btkz);
    }

    private btkz() {
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
            return GeneratedMessageLite.m124022a(f149330b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"a"});
        } else if (i2 == 3) {
            return new btkz();
        } else {
            if (i2 == 4) {
                return new bxvd(f149330b);
            }
            if (i2 == 5) {
                return f149330b;
            }
            bxxk bxxk = f149331c;
            if (bxxk == null) {
                synchronized (btkz.class) {
                    bxxk = f149331c;
                    if (bxxk == null) {
                        bxxk = new bxve(f149330b);
                        f149331c = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
