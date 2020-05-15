package p000;

/* renamed from: bwzo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bwzo extends GeneratedMessageLite implements bxxd {

    /* renamed from: c */
    public static final bwzo f161627c;

    /* renamed from: d */
    public static final bxvj f161628d;

    /* renamed from: f */
    private static volatile bxxk f161629f;

    /* renamed from: a */
    public int f161630a;

    /* renamed from: b */
    public bwxl f161631b;

    /* renamed from: e */
    private byte f161632e = 2;

    static {
        bwzo bwzo = new bwzo();
        f161627c = bwzo;
        GeneratedMessageLite.m124024a(bwzo.class, bwzo);
        bwxl bwxl = bwxl.f161383i;
        bwzo bwzo2 = f161627c;
        f161628d = GeneratedMessageLite.m124006a(bwxl, bwzo2, bwzo2, 229613734, bxzf.MESSAGE);
    }

    private bwzo() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f161632e);
        }
        byte b = 0;
        if (i2 == 1) {
            if (obj != null) {
                b = 1;
            }
            this.f161632e = b;
            return null;
        } else if (i2 == 2) {
            return GeneratedMessageLite.m124022a(f161627c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001ᐉ\u0000", new Object[]{"a", "b"});
        } else if (i2 == 3) {
            return new bwzo();
        } else {
            if (i2 == 4) {
                return new bxvd(f161627c);
            }
            if (i2 == 5) {
                return f161627c;
            }
            bxxk bxxk = f161629f;
            if (bxxk == null) {
                synchronized (bwzo.class) {
                    bxxk = f161629f;
                    if (bxxk == null) {
                        bxxk = new bxve(f161627c);
                        f161629f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
