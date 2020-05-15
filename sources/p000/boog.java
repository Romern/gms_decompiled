package p000;

/* renamed from: boog */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class boog extends GeneratedMessageLite implements bxxd {

    /* renamed from: g */
    public static final boog f133908g;

    /* renamed from: h */
    private static volatile bxxk f133909h;

    /* renamed from: a */
    public int f133910a;

    /* renamed from: b */
    public boolean f133911b;

    /* renamed from: c */
    public int f133912c;

    /* renamed from: d */
    public String f133913d = "";

    /* renamed from: e */
    public int f133914e;

    /* renamed from: f */
    public int f133915f;

    static {
        boog boog = new boog();
        f133908g = boog;
        GeneratedMessageLite.m124024a(boog.class, boog);
    }

    private boog() {
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
            return GeneratedMessageLite.m124022a(f133908g, "\u0000\u0006\u0000\u0000\u0001\u0006\u0006\u0000\u0000\u0000\u0001\f\u0002\u0007\u0003\u000b\u0004Ȉ\u0005\u000b\u0006\u000b", new Object[]{"a", "b", "c", "d", "e", "f"});
        } else if (i2 == 3) {
            return new boog();
        } else {
            if (i2 == 4) {
                return new bxvd(f133908g);
            }
            if (i2 == 5) {
                return f133908g;
            }
            bxxk bxxk = f133909h;
            if (bxxk == null) {
                synchronized (boog.class) {
                    bxxk = f133909h;
                    if (bxxk == null) {
                        bxxk = new bxve(f133908g);
                        f133909h = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
