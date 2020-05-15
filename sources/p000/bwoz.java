package p000;

/* renamed from: bwoz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bwoz extends GeneratedMessageLite implements bxxd {

    /* renamed from: b */
    public static final bwoz f160510b;

    /* renamed from: e */
    private static volatile bxxk f160511e;

    /* renamed from: a */
    public bwyz f160512a;

    /* renamed from: c */
    private int f160513c;

    /* renamed from: d */
    private byte f160514d = 2;

    static {
        bwoz bwoz = new bwoz();
        f160510b = bwoz;
        GeneratedMessageLite.m124024a(bwoz.class, bwoz);
    }

    private bwoz() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f160514d);
        }
        byte b = 0;
        if (i2 == 1) {
            if (obj != null) {
                b = 1;
            }
            this.f160514d = b;
            return null;
        } else if (i2 == 2) {
            return GeneratedMessageLite.m124022a(f160510b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001ᐉ\u0000", new Object[]{"c", "a"});
        } else if (i2 == 3) {
            return new bwoz();
        } else {
            if (i2 == 4) {
                return new bxvd(f160510b);
            }
            if (i2 == 5) {
                return f160510b;
            }
            bxxk bxxk = f160511e;
            if (bxxk == null) {
                synchronized (bwoz.class) {
                    bxxk = f160511e;
                    if (bxxk == null) {
                        bxxk = new bxve(f160510b);
                        f160511e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
