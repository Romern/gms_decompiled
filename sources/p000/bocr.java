package p000;

/* renamed from: bocr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bocr extends GeneratedMessageLite implements bxxd {

    /* renamed from: c */
    public static final bocr f132595c;

    /* renamed from: d */
    private static volatile bxxk f132596d;

    /* renamed from: a */
    public int f132597a;

    /* renamed from: b */
    public boer f132598b;

    static {
        bocr bocr = new bocr();
        f132595c = bocr;
        GeneratedMessageLite.m124024a(bocr.class, bocr);
    }

    private bocr() {
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
            return GeneratedMessageLite.m124022a(f132595c, "\u0001\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0000\u0002ဉ\u0001", new Object[]{"a", "b"});
        } else if (i2 == 3) {
            return new bocr();
        } else {
            if (i2 == 4) {
                return new bxvd(f132595c);
            }
            if (i2 == 5) {
                return f132595c;
            }
            bxxk bxxk = f132596d;
            if (bxxk == null) {
                synchronized (bocr.class) {
                    bxxk = f132596d;
                    if (bxxk == null) {
                        bxxk = new bxve(f132595c);
                        f132596d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
