package p000;

/* renamed from: bvyc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bvyc extends GeneratedMessageLite implements bxxd {

    /* renamed from: c */
    public static final bvyc f158134c;

    /* renamed from: d */
    private static volatile bxxk f158135d;

    /* renamed from: a */
    public int f158136a;

    /* renamed from: b */
    public bvxn f158137b;

    static {
        bvyc bvyc = new bvyc();
        f158134c = bvyc;
        GeneratedMessageLite.m124024a(bvyc.class, bvyc);
    }

    private bvyc() {
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
            return GeneratedMessageLite.m124022a(f158134c, "\u0001\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0000\u0002ဉ\u0000", new Object[]{"a", "b"});
        } else if (i2 == 3) {
            return new bvyc();
        } else {
            if (i2 == 4) {
                return new bxvd(f158134c);
            }
            if (i2 == 5) {
                return f158134c;
            }
            bxxk bxxk = f158135d;
            if (bxxk == null) {
                synchronized (bvyc.class) {
                    bxxk = f158135d;
                    if (bxxk == null) {
                        bxxk = new bxve(f158134c);
                        f158135d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
