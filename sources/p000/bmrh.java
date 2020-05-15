package p000;

/* renamed from: bmrh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bmrh extends GeneratedMessageLite implements bxxd {

    /* renamed from: d */
    public static final bmrh f130490d;

    /* renamed from: e */
    private static volatile bxxk f130491e;

    /* renamed from: a */
    public int f130492a;

    /* renamed from: b */
    public bmaj f130493b;

    /* renamed from: c */
    public bmrg f130494c;

    static {
        bmrh bmrh = new bmrh();
        f130490d = bmrh;
        GeneratedMessageLite.m124024a(bmrh.class, bmrh);
    }

    private bmrh() {
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
            return GeneratedMessageLite.m124022a(f130490d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new bmrh();
        } else {
            if (i2 == 4) {
                return new bxvd(f130490d);
            }
            if (i2 == 5) {
                return f130490d;
            }
            bxxk bxxk = f130491e;
            if (bxxk == null) {
                synchronized (bmrh.class) {
                    bxxk = f130491e;
                    if (bxxk == null) {
                        bxxk = new bxve(f130490d);
                        f130491e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
