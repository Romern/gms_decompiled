package p000;

/* renamed from: bwgt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bwgt extends GeneratedMessageLite implements bxxd {

    /* renamed from: d */
    public static final bwgt f159260d;

    /* renamed from: e */
    private static volatile bxxk f159261e;

    /* renamed from: a */
    public int f159262a;

    /* renamed from: b */
    public String f159263b = "";

    /* renamed from: c */
    public String f159264c = "";

    static {
        bwgt bwgt = new bwgt();
        f159260d = bwgt;
        GeneratedMessageLite.m124024a(bwgt.class, bwgt);
    }

    private bwgt() {
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
            return GeneratedMessageLite.m124022a(f159260d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new bwgt();
        } else {
            if (i2 == 4) {
                return new bxvd(f159260d);
            }
            if (i2 == 5) {
                return f159260d;
            }
            bxxk bxxk = f159261e;
            if (bxxk == null) {
                synchronized (bwgt.class) {
                    bxxk = f159261e;
                    if (bxxk == null) {
                        bxxk = new bxve(f159260d);
                        f159261e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
