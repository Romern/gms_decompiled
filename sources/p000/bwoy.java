package p000;

/* renamed from: bwoy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bwoy extends GeneratedMessageLite implements bxxd {

    /* renamed from: d */
    public static final bwoy f160503d;

    /* renamed from: g */
    private static volatile bxxk f160504g;

    /* renamed from: a */
    public int f160505a = 0;

    /* renamed from: b */
    public Object f160506b;

    /* renamed from: c */
    public int f160507c;

    /* renamed from: e */
    private int f160508e;

    /* renamed from: f */
    private byte f160509f = 2;

    static {
        bwoy bwoy = new bwoy();
        f160503d = bwoy;
        GeneratedMessageLite.m124024a(bwoy.class, bwoy);
    }

    private bwoy() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f160509f);
        }
        byte b = 0;
        if (i2 == 1) {
            if (obj != null) {
                b = 1;
            }
            this.f160509f = b;
            return null;
        } else if (i2 == 2) {
            return GeneratedMessageLite.m124022a(f160503d, "\u0001\u0003\u0001\u0001\u0001\u0003\u0003\u0000\u0000\u0002\u0001ဌ\u0000\u0002ᐼ\u0000\u0003ᐼ\u0000", new Object[]{"b", "a", "e", "c", bwow.f160502a, bwoz.class, bwpa.class});
        } else if (i2 == 3) {
            return new bwoy();
        } else {
            if (i2 == 4) {
                return new bxvd(f160503d);
            }
            if (i2 == 5) {
                return f160503d;
            }
            bxxk bxxk = f160504g;
            if (bxxk == null) {
                synchronized (bwoy.class) {
                    bxxk = f160504g;
                    if (bxxk == null) {
                        bxxk = new bxve(f160503d);
                        f160504g = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
