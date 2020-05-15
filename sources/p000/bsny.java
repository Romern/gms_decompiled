package p000;

/* renamed from: bsny */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bsny extends GeneratedMessageLite implements bxxd {

    /* renamed from: c */
    public static final bsny f146346c;

    /* renamed from: d */
    private static volatile bxxk f146347d;

    /* renamed from: a */
    public int f146348a;

    /* renamed from: b */
    public String f146349b = "";

    static {
        bsny bsny = new bsny();
        f146346c = bsny;
        GeneratedMessageLite.m124024a(bsny.class, bsny);
    }

    private bsny() {
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
            return GeneratedMessageLite.m124022a(f146346c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"a", "b"});
        } else if (i2 == 3) {
            return new bsny();
        } else {
            if (i2 == 4) {
                return new bxvd(f146346c);
            }
            if (i2 == 5) {
                return f146346c;
            }
            bxxk bxxk = f146347d;
            if (bxxk == null) {
                synchronized (bsny.class) {
                    bxxk = f146347d;
                    if (bxxk == null) {
                        bxxk = new bxve(f146346c);
                        f146347d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
