package p000;

/* renamed from: bslz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bslz extends GeneratedMessageLite implements bxxd {

    /* renamed from: c */
    public static final bslz f144984c;

    /* renamed from: e */
    private static volatile bxxk f144985e;

    /* renamed from: a */
    public long f144986a;

    /* renamed from: b */
    public long f144987b = Long.MAX_VALUE;

    /* renamed from: d */
    private int f144988d;

    static {
        bslz bslz = new bslz();
        f144984c = bslz;
        GeneratedMessageLite.m124024a(bslz.class, bslz);
    }

    private bslz() {
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
            return GeneratedMessageLite.m124022a(f144984c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဂ\u0001", new Object[]{"d", "a", "b"});
        } else if (i2 == 3) {
            return new bslz();
        } else {
            if (i2 == 4) {
                return new bxvd(f144984c);
            }
            if (i2 == 5) {
                return f144984c;
            }
            bxxk bxxk = f144985e;
            if (bxxk == null) {
                synchronized (bslz.class) {
                    bxxk = f144985e;
                    if (bxxk == null) {
                        bxxk = new bxve(f144984c);
                        f144985e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
