package p000;

/* renamed from: bwoh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bwoh extends GeneratedMessageLite implements bxxd {

    /* renamed from: b */
    public static final bwoh f160445b;

    /* renamed from: c */
    public static final bxvj f160446c;

    /* renamed from: f */
    private static volatile bxxk f160447f;

    /* renamed from: a */
    public bwxl f160448a;

    /* renamed from: d */
    private int f160449d;

    /* renamed from: e */
    private byte f160450e = 2;

    static {
        bwoh bwoh = new bwoh();
        f160445b = bwoh;
        GeneratedMessageLite.m124024a(bwoh.class, bwoh);
        bwxl bwxl = bwxl.f161383i;
        bwoh bwoh2 = f160445b;
        f160446c = GeneratedMessageLite.m124006a(bwxl, bwoh2, bwoh2, 260216773, bxzf.MESSAGE);
    }

    private bwoh() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f160450e);
        }
        byte b = 0;
        if (i2 == 1) {
            if (obj != null) {
                b = 1;
            }
            this.f160450e = b;
            return null;
        } else if (i2 == 2) {
            return GeneratedMessageLite.m124022a(f160445b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001ᐉ\u0000", new Object[]{"d", "a"});
        } else if (i2 == 3) {
            return new bwoh();
        } else {
            if (i2 == 4) {
                return new bxvd(f160445b);
            }
            if (i2 == 5) {
                return f160445b;
            }
            bxxk bxxk = f160447f;
            if (bxxk == null) {
                synchronized (bwoh.class) {
                    bxxk = f160447f;
                    if (bxxk == null) {
                        bxxk = new bxve(f160445b);
                        f160447f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
