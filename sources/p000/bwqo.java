package p000;

/* renamed from: bwqo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bwqo extends GeneratedMessageLite implements bxxd {

    /* renamed from: f */
    public static final bwqo f160692f;

    /* renamed from: g */
    public static final bxvj f160693g;

    /* renamed from: i */
    private static volatile bxxk f160694i;

    /* renamed from: a */
    public int f160695a = 0;

    /* renamed from: b */
    public Object f160696b;

    /* renamed from: c */
    public String f160697c = "";

    /* renamed from: d */
    public String f160698d = "";

    /* renamed from: e */
    public long f160699e;

    /* renamed from: h */
    private int f160700h;

    static {
        bwqo bwqo = new bwqo();
        f160692f = bwqo;
        GeneratedMessageLite.m124024a(bwqo.class, bwqo);
        bwny bwny = bwny.f160414k;
        bwqo bwqo2 = f160692f;
        f160693g = GeneratedMessageLite.m124006a(bwny, bwqo2, bwqo2, 290848975, bxzf.MESSAGE);
    }

    private bwqo() {
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
            return GeneratedMessageLite.m124022a(f160692f, "\u0001\u0005\u0001\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ျ\u0000\u0004ဵ\u0000\u0005ဂ\u0004", new Object[]{"b", "a", "h", "c", "d", "e"});
        } else if (i2 == 3) {
            return new bwqo();
        } else {
            if (i2 == 4) {
                return new bxvd(f160692f);
            }
            if (i2 == 5) {
                return f160692f;
            }
            bxxk bxxk = f160694i;
            if (bxxk == null) {
                synchronized (bwqo.class) {
                    bxxk = f160694i;
                    if (bxxk == null) {
                        bxxk = new bxve(f160692f);
                        f160694i = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
