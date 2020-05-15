package p000;

/* renamed from: bkyv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bkyv extends GeneratedMessageLite implements bxxd {

    /* renamed from: d */
    public static final bkyv f125513d;

    /* renamed from: e */
    private static volatile bxxk f125514e;

    /* renamed from: a */
    public int f125515a;

    /* renamed from: b */
    public long f125516b;

    /* renamed from: c */
    public long f125517c;

    static {
        bkyv bkyv = new bkyv();
        f125513d = bkyv;
        GeneratedMessageLite.m124024a(bkyv.class, bkyv);
    }

    private bkyv() {
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
            return GeneratedMessageLite.m124022a(f125513d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဃ\u0000\u0002ဃ\u0001", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new bkyv();
        } else {
            if (i2 == 4) {
                return new bxvd(f125513d);
            }
            if (i2 == 5) {
                return f125513d;
            }
            bxxk bxxk = f125514e;
            if (bxxk == null) {
                synchronized (bkyv.class) {
                    bxxk = f125514e;
                    if (bxxk == null) {
                        bxxk = new bxve(f125513d);
                        f125514e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
