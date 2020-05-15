package p000;

/* renamed from: bwqj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bwqj extends GeneratedMessageLite implements bxxd {

    /* renamed from: d */
    public static final bwqj f160665d;

    /* renamed from: e */
    public static final bxvj f160666e;

    /* renamed from: g */
    private static volatile bxxk f160667g;

    /* renamed from: a */
    public int f160668a = 0;

    /* renamed from: b */
    public Object f160669b;

    /* renamed from: c */
    public int f160670c;

    /* renamed from: f */
    private int f160671f;

    static {
        bwqj bwqj = new bwqj();
        f160665d = bwqj;
        GeneratedMessageLite.m124024a(bwqj.class, bwqj);
        bwoq bwoq = bwoq.f160480d;
        bwqj bwqj2 = f160665d;
        f160666e = GeneratedMessageLite.m124006a(bwoq, bwqj2, bwqj2, 279356603, bxzf.MESSAGE);
    }

    private bwqj() {
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
            return GeneratedMessageLite.m124022a(f160665d, "\u0001\u0002\u0001\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ြ\u0000", new Object[]{"b", "a", "f", "c", bwqh.f160664a, bwql.class});
        } else if (i2 == 3) {
            return new bwqj();
        } else {
            if (i2 == 4) {
                return new bxvd(f160665d);
            }
            if (i2 == 5) {
                return f160665d;
            }
            bxxk bxxk = f160667g;
            if (bxxk == null) {
                synchronized (bwqj.class) {
                    bxxk = f160667g;
                    if (bxxk == null) {
                        bxxk = new bxve(f160665d);
                        f160667g = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
