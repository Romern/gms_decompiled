package p000;

/* renamed from: bvph */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bvph extends GeneratedMessageLite implements bxxd {

    /* renamed from: d */
    public static final bvph f157293d;

    /* renamed from: e */
    private static volatile bxxk f157294e;

    /* renamed from: a */
    public int f157295a;

    /* renamed from: b */
    public int f157296b;

    /* renamed from: c */
    public int f157297c;

    static {
        bvph bvph = new bvph();
        f157293d = bvph;
        GeneratedMessageLite.m124024a(bvph.class, bvph);
    }

    private bvph() {
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
            return GeneratedMessageLite.m124022a(f157293d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဋ\u0000\u0002ဋ\u0001", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new bvph();
        } else {
            if (i2 == 4) {
                return new bxvd(f157293d);
            }
            if (i2 == 5) {
                return f157293d;
            }
            bxxk bxxk = f157294e;
            if (bxxk == null) {
                synchronized (bvph.class) {
                    bxxk = f157294e;
                    if (bxxk == null) {
                        bxxk = new bxve(f157293d);
                        f157294e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
