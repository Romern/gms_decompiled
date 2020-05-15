package p000;

/* renamed from: bwsn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bwsn extends GeneratedMessageLite implements bxxd {

    /* renamed from: f */
    public static final bwsn f160885f;

    /* renamed from: g */
    public static final bxvj f160886g;

    /* renamed from: h */
    private static volatile bxxk f160887h;

    /* renamed from: a */
    public int f160888a;

    /* renamed from: b */
    public int f160889b = 0;

    /* renamed from: c */
    public Object f160890c;

    /* renamed from: d */
    public String f160891d = "";

    /* renamed from: e */
    public String f160892e = "";

    static {
        bwsn bwsn = new bwsn();
        f160885f = bwsn;
        GeneratedMessageLite.m124024a(bwsn.class, bwsn);
        bwog bwog = bwog.f160437f;
        bwsn bwsn2 = f160885f;
        f160886g = GeneratedMessageLite.m124006a(bwog, bwsn2, bwsn2, 254667697, bxzf.MESSAGE);
    }

    private bwsn() {
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
            return GeneratedMessageLite.m124022a(f160885f, "\u0001\u0004\u0001\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ျ\u0000\u0002ျ\u0000\u0003ဈ\u0002\u0004ဈ\u0003", new Object[]{"c", "b", "a", "d", "e"});
        } else if (i2 == 3) {
            return new bwsn();
        } else {
            if (i2 == 4) {
                return new bxvd(f160885f);
            }
            if (i2 == 5) {
                return f160885f;
            }
            bxxk bxxk = f160887h;
            if (bxxk == null) {
                synchronized (bwsn.class) {
                    bxxk = f160887h;
                    if (bxxk == null) {
                        bxxk = new bxve(f160885f);
                        f160887h = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
