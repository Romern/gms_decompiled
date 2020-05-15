package p000;

/* renamed from: bxlh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bxlh extends GeneratedMessageLite implements bxxd {

    /* renamed from: b */
    public static final bxlh f163848b;

    /* renamed from: c */
    private static volatile bxxk f163849c;

    /* renamed from: a */
    public bxwc f163850a = bxxn.f165040b;

    static {
        bxlh bxlh = new bxlh();
        f163848b = bxlh;
        GeneratedMessageLite.m124024a(bxlh.class, bxlh);
    }

    private bxlh() {
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
            return GeneratedMessageLite.m124022a(f163848b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", bxlg.class});
        } else if (i2 == 3) {
            return new bxlh();
        } else {
            if (i2 == 4) {
                return new bxvd(f163848b);
            }
            if (i2 == 5) {
                return f163848b;
            }
            bxxk bxxk = f163849c;
            if (bxxk == null) {
                synchronized (bxlh.class) {
                    bxxk = f163849c;
                    if (bxxk == null) {
                        bxxk = new bxve(f163848b);
                        f163849c = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
