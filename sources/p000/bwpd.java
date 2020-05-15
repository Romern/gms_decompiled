package p000;

/* renamed from: bwpd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bwpd extends GeneratedMessageLite implements bxxd {

    /* renamed from: d */
    public static final bwpd f160521d;

    /* renamed from: e */
    private static volatile bxxk f160522e;

    /* renamed from: a */
    public int f160523a;

    /* renamed from: b */
    public long f160524b;

    /* renamed from: c */
    public int f160525c;

    static {
        bwpd bwpd = new bwpd();
        f160521d = bwpd;
        GeneratedMessageLite.m124024a(bwpd.class, bwpd);
    }

    private bwpd() {
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
            return GeneratedMessageLite.m124022a(f160521d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဌ\u0001", new Object[]{"a", "b", "c", bwpb.f160520a});
        } else if (i2 == 3) {
            return new bwpd();
        } else {
            if (i2 == 4) {
                return new bxvd(f160521d);
            }
            if (i2 == 5) {
                return f160521d;
            }
            bxxk bxxk = f160522e;
            if (bxxk == null) {
                synchronized (bwpd.class) {
                    bxxk = f160522e;
                    if (bxxk == null) {
                        bxxk = new bxve(f160521d);
                        f160522e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
