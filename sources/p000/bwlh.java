package p000;

/* renamed from: bwlh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bwlh extends GeneratedMessageLite implements bxxd {

    /* renamed from: d */
    public static final bwlh f160123d;

    /* renamed from: e */
    private static volatile bxxk f160124e;

    /* renamed from: a */
    public int f160125a;

    /* renamed from: b */
    public bmaj f160126b;

    /* renamed from: c */
    public bwlg f160127c;

    static {
        bwlh bwlh = new bwlh();
        f160123d = bwlh;
        GeneratedMessageLite.m124024a(bwlh.class, bwlh);
    }

    private bwlh() {
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
            return GeneratedMessageLite.m124022a(f160123d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new bwlh();
        } else {
            if (i2 == 4) {
                return new bxvd(f160123d);
            }
            if (i2 == 5) {
                return f160123d;
            }
            bxxk bxxk = f160124e;
            if (bxxk == null) {
                synchronized (bwlh.class) {
                    bxxk = f160124e;
                    if (bxxk == null) {
                        bxxk = new bxve(f160123d);
                        f160124e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
