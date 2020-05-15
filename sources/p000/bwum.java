package p000;

/* renamed from: bwum */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bwum extends GeneratedMessageLite implements bxxd {

    /* renamed from: e */
    public static final bwum f161045e;

    /* renamed from: g */
    private static volatile bxxk f161046g;

    /* renamed from: a */
    public bxwc f161047a = bxxn.f165040b;

    /* renamed from: b */
    public String f161048b = "";

    /* renamed from: c */
    public boolean f161049c;

    /* renamed from: d */
    public boolean f161050d;

    /* renamed from: f */
    private int f161051f;

    static {
        bwum bwum = new bwum();
        f161045e = bwum;
        GeneratedMessageLite.m124024a(bwum.class, bwum);
    }

    private bwum() {
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
            return GeneratedMessageLite.m124022a(f161045e, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001\u001b\u0002ဈ\u0000\u0003ဇ\u0001\u0004ဇ\u0002", new Object[]{"f", "a", bwul.class, "b", "c", "d"});
        } else if (i2 == 3) {
            return new bwum();
        } else {
            if (i2 == 4) {
                return new bxvd(f161045e);
            }
            if (i2 == 5) {
                return f161045e;
            }
            bxxk bxxk = f161046g;
            if (bxxk == null) {
                synchronized (bwum.class) {
                    bxxk = f161046g;
                    if (bxxk == null) {
                        bxxk = new bxve(f161045e);
                        f161046g = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
