package p000;

/* renamed from: bwla */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bwla extends GeneratedMessageLite implements bxxd {

    /* renamed from: c */
    public static final bwla f160076c;

    /* renamed from: e */
    private static volatile bxxk f160077e;

    /* renamed from: a */
    public int f160078a;

    /* renamed from: b */
    public bwid f160079b;

    /* renamed from: d */
    private bmav f160080d;

    static {
        bwla bwla = new bwla();
        f160076c = bwla;
        GeneratedMessageLite.m124024a(bwla.class, bwla);
    }

    private bwla() {
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
            return GeneratedMessageLite.m124022a(f160076c, "\u0001\u0002\u0000\u0001\u0001\u0004\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0004ဉ\u0003", new Object[]{"a", "d", "b"});
        } else if (i2 == 3) {
            return new bwla();
        } else {
            if (i2 == 4) {
                return new bxvd(f160076c);
            }
            if (i2 == 5) {
                return f160076c;
            }
            bxxk bxxk = f160077e;
            if (bxxk == null) {
                synchronized (bwla.class) {
                    bxxk = f160077e;
                    if (bxxk == null) {
                        bxxk = new bxve(f160076c);
                        f160077e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
