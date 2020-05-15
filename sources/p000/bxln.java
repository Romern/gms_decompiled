package p000;

/* renamed from: bxln */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bxln extends GeneratedMessageLite implements bxxd {

    /* renamed from: e */
    public static final bxln f163863e;

    /* renamed from: f */
    public static final bxvj f163864f;

    /* renamed from: h */
    private static volatile bxxk f163865h;

    /* renamed from: a */
    public String f163866a = "";

    /* renamed from: b */
    public bxvw f163867b = bxwq.f165002b;

    /* renamed from: c */
    public bxlm f163868c;

    /* renamed from: d */
    public bxlh f163869d;

    /* renamed from: g */
    private int f163870g;

    static {
        bxln bxln = new bxln();
        f163863e = bxln;
        GeneratedMessageLite.m124024a(bxln.class, bxln);
        bxcf bxcf = bxcf.f162779a;
        bxln bxln2 = f163863e;
        f163864f = GeneratedMessageLite.m124006a(bxcf, bxln2, bxln2, 121873477, bxzf.MESSAGE);
    }

    private bxln() {
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
            return GeneratedMessageLite.m124022a(f163863e, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u0014\u0003ဉ\u0001\u0004ဉ\u0002", new Object[]{"g", "a", "b", "c", "d"});
        } else if (i2 == 3) {
            return new bxln();
        } else {
            if (i2 == 4) {
                return new bxvd(f163863e);
            }
            if (i2 == 5) {
                return f163863e;
            }
            bxxk bxxk = f163865h;
            if (bxxk == null) {
                synchronized (bxln.class) {
                    bxxk = f163865h;
                    if (bxxk == null) {
                        bxxk = new bxve(f163863e);
                        f163865h = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
