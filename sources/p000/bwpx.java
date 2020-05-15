package p000;

/* renamed from: bwpx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bwpx extends GeneratedMessageLite implements bxxd {

    /* renamed from: e */
    public static final bwpx f160614e;

    /* renamed from: f */
    public static final bxvj f160615f;

    /* renamed from: g */
    private static volatile bxxk f160616g;

    /* renamed from: a */
    public int f160617a;

    /* renamed from: b */
    public String f160618b = "";

    /* renamed from: c */
    public bxwc f160619c = bxxn.f165040b;

    /* renamed from: d */
    public int f160620d;

    static {
        bwpx bwpx = new bwpx();
        f160614e = bwpx;
        GeneratedMessageLite.m124024a(bwpx.class, bwpx);
        bwny bwny = bwny.f160414k;
        bwpx bwpx2 = f160614e;
        f160615f = GeneratedMessageLite.m124006a(bwny, bwpx2, bwpx2, 232348703, bxzf.MESSAGE);
    }

    private bwpx() {
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
            return GeneratedMessageLite.m124022a(f160614e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001b\u0003င\u0001", new Object[]{"a", "b", "c", bwpw.class, "d"});
        } else if (i2 == 3) {
            return new bwpx();
        } else {
            if (i2 == 4) {
                return new bxvd(f160614e);
            }
            if (i2 == 5) {
                return f160614e;
            }
            bxxk bxxk = f160616g;
            if (bxxk == null) {
                synchronized (bwpx.class) {
                    bxxk = f160616g;
                    if (bxxk == null) {
                        bxxk = new bxve(f160614e);
                        f160616g = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
