package p000;

/* renamed from: bttf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bttf extends GeneratedMessageLite implements bxxd {

    /* renamed from: e */
    public static final bttf f150335e;

    /* renamed from: f */
    private static volatile bxxk f150336f;

    /* renamed from: a */
    public int f150337a;

    /* renamed from: b */
    public String f150338b = "";

    /* renamed from: c */
    public String f150339c = "";

    /* renamed from: d */
    public bzvu f150340d;

    static {
        bttf bttf = new bttf();
        f150335e = bttf;
        GeneratedMessageLite.m124024a(bttf.class, bttf);
    }

    private bttf() {
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
            return GeneratedMessageLite.m124022a(f150335e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဉ\u0002", new Object[]{"a", "b", "c", "d"});
        } else if (i2 == 3) {
            return new bttf();
        } else {
            if (i2 == 4) {
                return new bxvd(f150335e);
            }
            if (i2 == 5) {
                return f150335e;
            }
            bxxk bxxk = f150336f;
            if (bxxk == null) {
                synchronized (bttf.class) {
                    bxxk = f150336f;
                    if (bxxk == null) {
                        bxxk = new bxve(f150335e);
                        f150336f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
