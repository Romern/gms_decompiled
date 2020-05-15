package p000;

/* renamed from: bldh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bldh extends GeneratedMessageLite implements bxxd {

    /* renamed from: l */
    public static final bldh f126066l;

    /* renamed from: o */
    private static volatile bxxk f126067o;

    /* renamed from: a */
    public int f126068a;

    /* renamed from: b */
    public bleu f126069b;

    /* renamed from: c */
    public String f126070c = "";

    /* renamed from: d */
    public String f126071d = "";

    /* renamed from: e */
    public String f126072e = "";

    /* renamed from: f */
    public String f126073f = "";

    /* renamed from: g */
    public String f126074g = "";

    /* renamed from: h */
    public String f126075h = "";

    /* renamed from: i */
    public String f126076i = "";

    /* renamed from: j */
    public String f126077j = "";

    /* renamed from: k */
    public String f126078k = "";

    /* renamed from: m */
    private blez f126079m;

    /* renamed from: n */
    private byte f126080n = 2;

    static {
        bldh bldh = new bldh();
        f126066l = bldh;
        GeneratedMessageLite.m124024a(bldh.class, bldh);
    }

    private bldh() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f126080n);
        }
        byte b = 0;
        if (i2 == 1) {
            if (obj != null) {
                b = 1;
            }
            this.f126080n = b;
            return null;
        } else if (i2 == 2) {
            return GeneratedMessageLite.m124022a(f126066l, "\u0001\u000b\u0000\u0001\u0001\u000e\u000b\u0000\u0000\u0001\u0001ဉ\u0000\u0002ဈ\u0001\u0003ဈ\u0003\u0004ဈ\u0004\u0005ဈ\u0005\u0006ဈ\u0007\u0007ဈ\b\bဈ\t\tဈ\n\fဈ\u0006\u000eᐉ\r", new Object[]{"a", "b", "c", "d", "e", "f", "h", "i", "j", "k", "g", "m"});
        } else if (i2 == 3) {
            return new bldh();
        } else {
            if (i2 == 4) {
                return new bxvd(f126066l);
            }
            if (i2 == 5) {
                return f126066l;
            }
            bxxk bxxk = f126067o;
            if (bxxk == null) {
                synchronized (bldh.class) {
                    bxxk = f126067o;
                    if (bxxk == null) {
                        bxxk = new bxve(f126066l);
                        f126067o = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
