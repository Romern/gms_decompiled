package p000;

/* renamed from: bmts */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bmts extends GeneratedMessageLite implements bxxd {

    /* renamed from: c */
    public static final bmts f130908c;

    /* renamed from: d */
    private static volatile bxxk f130909d;

    /* renamed from: a */
    public bmtp f130910a;

    /* renamed from: b */
    public bmtk f130911b;

    static {
        bmts bmts = new bmts();
        f130908c = bmts;
        GeneratedMessageLite.m124024a(bmts.class, bmts);
    }

    private bmts() {
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
            return GeneratedMessageLite.m124022a(f130908c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\t\u0002\t", new Object[]{"a", "b"});
        } else if (i2 == 3) {
            return new bmts();
        } else {
            if (i2 == 4) {
                return new bxvd(f130908c);
            }
            if (i2 == 5) {
                return f130908c;
            }
            bxxk bxxk = f130909d;
            if (bxxk == null) {
                synchronized (bmts.class) {
                    bxxk = f130909d;
                    if (bxxk == null) {
                        bxxk = new bxve(f130908c);
                        f130909d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
