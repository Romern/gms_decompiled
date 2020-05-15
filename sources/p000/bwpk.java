package p000;

/* renamed from: bwpk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bwpk extends GeneratedMessageLite implements bxxd {

    /* renamed from: d */
    public static final bwpk f160557d;

    /* renamed from: e */
    public static final bxvj f160558e;

    /* renamed from: g */
    private static volatile bxxk f160559g;

    /* renamed from: a */
    public String f160560a = "";

    /* renamed from: b */
    public String f160561b = "";

    /* renamed from: c */
    public int f160562c;

    /* renamed from: f */
    private int f160563f;

    static {
        bwpk bwpk = new bwpk();
        f160557d = bwpk;
        GeneratedMessageLite.m124024a(bwpk.class, bwpk);
        bwny bwny = bwny.f160414k;
        bwpk bwpk2 = f160557d;
        f160558e = GeneratedMessageLite.m124006a(bwny, bwpk2, bwpk2, 287212047, bxzf.MESSAGE);
    }

    private bwpk() {
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
            return GeneratedMessageLite.m124022a(f160557d, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဌ\u0002", new Object[]{"f", "a", "b", "c", bwpi.f160556a});
        } else if (i2 == 3) {
            return new bwpk();
        } else {
            if (i2 == 4) {
                return new bxvd(f160557d);
            }
            if (i2 == 5) {
                return f160557d;
            }
            bxxk bxxk = f160559g;
            if (bxxk == null) {
                synchronized (bwpk.class) {
                    bxxk = f160559g;
                    if (bxxk == null) {
                        bxxk = new bxve(f160557d);
                        f160559g = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
