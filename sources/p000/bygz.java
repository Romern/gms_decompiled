package p000;

/* renamed from: bygz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bygz extends GeneratedMessageLite implements bxxd {

    /* renamed from: c */
    public static final bygz f166410c;

    /* renamed from: d */
    private static volatile bxxk f166411d;

    /* renamed from: a */
    public int f166412a = 0;

    /* renamed from: b */
    public Object f166413b;

    static {
        bygz bygz = new bygz();
        f166410c = bygz;
        GeneratedMessageLite.m124024a(bygz.class, bygz);
    }

    private bygz() {
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
            return GeneratedMessageLite.m124022a(f166410c, "\u0001\u0003\u0001\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001ြ\u0000\u0002ြ\u0000\u0003ြ\u0000", new Object[]{"b", "a", byjr.class, byhn.class, byiq.class});
        } else if (i2 == 3) {
            return new bygz();
        } else {
            if (i2 == 4) {
                return new bxvd(f166410c);
            }
            if (i2 == 5) {
                return f166410c;
            }
            bxxk bxxk = f166411d;
            if (bxxk == null) {
                synchronized (bygz.class) {
                    bxxk = f166411d;
                    if (bxxk == null) {
                        bxxk = new bxve(f166410c);
                        f166411d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
