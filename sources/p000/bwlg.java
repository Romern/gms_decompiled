package p000;

/* renamed from: bwlg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bwlg extends GeneratedMessageLite implements bxxd {

    /* renamed from: e */
    public static final bwlg f160117e;

    /* renamed from: f */
    private static volatile bxxk f160118f;

    /* renamed from: a */
    public int f160119a;

    /* renamed from: b */
    public bxwc f160120b = bxxn.f165040b;

    /* renamed from: c */
    public bxwc f160121c = bxxn.f165040b;

    /* renamed from: d */
    public ByteString f160122d = ByteString.f164797b;

    static {
        bwlg bwlg = new bwlg();
        f160117e = bwlg;
        GeneratedMessageLite.m124024a(bwlg.class, bwlg);
    }

    private bwlg() {
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
            return GeneratedMessageLite.m124022a(f160117e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0002\u0000\u0001\u001b\u0002ည\u0000\u0003\u001b", new Object[]{"a", "b", bmed.class, "d", "c", bmog.class});
        } else if (i2 == 3) {
            return new bwlg();
        } else {
            if (i2 == 4) {
                return new bxvd((boolean[][][]) null, (char[]) null);
            }
            if (i2 == 5) {
                return f160117e;
            }
            bxxk bxxk = f160118f;
            if (bxxk == null) {
                synchronized (bwlg.class) {
                    bxxk = f160118f;
                    if (bxxk == null) {
                        bxxk = new bxve(f160117e);
                        f160118f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
