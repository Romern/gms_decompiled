package p000;

/* renamed from: bmnv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bmnv extends GeneratedMessageLite implements bxxd {

    /* renamed from: b */
    public static final bmnv f130179b;

    /* renamed from: c */
    private static volatile bxxk f130180c;

    /* renamed from: a */
    public bxwc f130181a = bxxn.f165040b;

    static {
        bmnv bmnv = new bmnv();
        f130179b = bmnv;
        GeneratedMessageLite.m124024a(bmnv.class, bmnv);
    }

    private bmnv() {
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
            return GeneratedMessageLite.m124022a(f130179b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", bmnx.class});
        } else if (i2 == 3) {
            return new bmnv();
        } else {
            if (i2 == 4) {
                return new bxvd(f130179b);
            }
            if (i2 == 5) {
                return f130179b;
            }
            bxxk bxxk = f130180c;
            if (bxxk == null) {
                synchronized (bmnv.class) {
                    bxxk = f130180c;
                    if (bxxk == null) {
                        bxxk = new bxve(f130179b);
                        f130180c = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
