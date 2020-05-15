package p000;

/* renamed from: bxbp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bxbp extends GeneratedMessageLite implements bxxd {

    /* renamed from: e */
    public static final bxbp f162718e;

    /* renamed from: i */
    private static volatile bxxk f162719i;

    /* renamed from: a */
    public int f162720a;

    /* renamed from: b */
    public int f162721b;

    /* renamed from: c */
    public int f162722c;

    /* renamed from: d */
    public bygn f162723d;

    /* renamed from: f */
    private bptw f162724f;

    /* renamed from: g */
    private bptw f162725g;

    /* renamed from: h */
    private byte f162726h = 2;

    static {
        bxbp bxbp = new bxbp();
        f162718e = bxbp;
        GeneratedMessageLite.m124024a(bxbp.class, bxbp);
    }

    private bxbp() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f162726h);
        }
        byte b = 0;
        if (i2 == 1) {
            if (obj != null) {
                b = 1;
            }
            this.f162726h = b;
            return null;
        } else if (i2 == 2) {
            return GeneratedMessageLite.m124022a(f162718e, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0003\u0001ᐉ\u0005\u0002ᐉ\u0003\u0003င\u0000\u0004င\u0001\u0005ᐉ\u0004", new Object[]{"a", "d", "f", "b", "c", "g"});
        } else if (i2 == 3) {
            return new bxbp();
        } else {
            if (i2 == 4) {
                return new bxvd(f162718e);
            }
            if (i2 == 5) {
                return f162718e;
            }
            bxxk bxxk = f162719i;
            if (bxxk == null) {
                synchronized (bxbp.class) {
                    bxxk = f162719i;
                    if (bxxk == null) {
                        bxxk = new bxve(f162718e);
                        f162719i = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
