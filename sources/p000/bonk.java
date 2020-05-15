package p000;

/* renamed from: bonk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bonk extends GeneratedMessageLite implements bxxd {

    /* renamed from: e */
    public static final bonk f133815e;

    /* renamed from: f */
    public static final bxvj f133816f;

    /* renamed from: g */
    private static volatile bxxk f133817g;

    /* renamed from: a */
    public int f133818a;

    /* renamed from: b */
    public bxwc f133819b = bxxn.f165040b;

    /* renamed from: c */
    public String f133820c = "";

    /* renamed from: d */
    public String f133821d = "";

    static {
        bonk bonk = new bonk();
        f133815e = bonk;
        GeneratedMessageLite.m124024a(bonk.class, bonk);
        bygn bygn = bygn.f166357a;
        bonk bonk2 = f133815e;
        f133816f = GeneratedMessageLite.m124006a(bygn, bonk2, bonk2, 78432438, bxzf.MESSAGE);
    }

    private bonk() {
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
            return GeneratedMessageLite.m124022a(f133815e, "\u0001\u0003\u0000\u0001\u0001\u0006\u0003\u0000\u0001\u0000\u0001\u001b\u0002ဈ\u0000\u0006ဈ\u0001", new Object[]{"a", "b", boni.class, "c", "d"});
        } else if (i2 == 3) {
            return new bonk();
        } else {
            if (i2 == 4) {
                return new bonj();
            }
            if (i2 == 5) {
                return f133815e;
            }
            bxxk bxxk = f133817g;
            if (bxxk == null) {
                synchronized (bonk.class) {
                    bxxk = f133817g;
                    if (bxxk == null) {
                        bxxk = new bxve(f133815e);
                        f133817g = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
