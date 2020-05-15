package p000;

/* renamed from: btbf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class btbf extends GeneratedMessageLite implements bxxd {

    /* renamed from: j */
    public static final btbf f148118j;

    /* renamed from: k */
    private static volatile bxxk f148119k;

    /* renamed from: a */
    public bygc f148120a;

    /* renamed from: b */
    public int f148121b;

    /* renamed from: c */
    public int f148122c;

    /* renamed from: d */
    public byge f148123d;

    /* renamed from: e */
    public String f148124e = "";

    /* renamed from: f */
    public int f148125f;

    /* renamed from: g */
    public bxyk f148126g;

    /* renamed from: h */
    public long f148127h;

    /* renamed from: i */
    public int f148128i;

    static {
        btbf btbf = new btbf();
        f148118j = btbf;
        GeneratedMessageLite.m124024a(btbf.class, btbf);
    }

    private btbf() {
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
            return GeneratedMessageLite.m124022a(f148118j, "\u0000\t\u0000\u0000\u0001\t\t\u0000\u0000\u0000\u0001\t\u0002\f\u0003\f\u0004\t\u0005Ȉ\u0006\u000b\u0007\t\b\u0002\t\u0004", new Object[]{"a", "b", "c", "d", "e", "f", "g", "h", "i"});
        } else if (i2 == 3) {
            return new btbf();
        } else {
            if (i2 == 4) {
                return new bxvd(f148118j);
            }
            if (i2 == 5) {
                return f148118j;
            }
            bxxk bxxk = f148119k;
            if (bxxk == null) {
                synchronized (btbf.class) {
                    bxxk = f148119k;
                    if (bxxk == null) {
                        bxxk = new bxve(f148118j);
                        f148119k = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
