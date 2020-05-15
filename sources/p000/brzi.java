package p000;

/* renamed from: brzi */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class brzi extends GeneratedMessageLite implements bxxd {

    /* renamed from: d */
    public static final brzi f143740d;

    /* renamed from: e */
    private static volatile bxxk f143741e;

    /* renamed from: a */
    public int f143742a;

    /* renamed from: b */
    public double f143743b;

    /* renamed from: c */
    public long f143744c;

    static {
        brzi brzi = new brzi();
        f143740d = brzi;
        GeneratedMessageLite.m124024a(brzi.class, brzi);
    }

    private brzi() {
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
            return GeneratedMessageLite.m124022a(f143740d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001က\u0000\u0002ဂ\u0001", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new brzi();
        } else {
            if (i2 == 4) {
                return new bxvd(f143740d);
            }
            if (i2 == 5) {
                return f143740d;
            }
            bxxk bxxk = f143741e;
            if (bxxk == null) {
                synchronized (brzi.class) {
                    bxxk = f143741e;
                    if (bxxk == null) {
                        bxxk = new bxve(f143740d);
                        f143741e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
