package p000;

/* renamed from: btrw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class btrw extends GeneratedMessageLite implements bxxd {

    /* renamed from: c */
    public static final btrw f150162c;

    /* renamed from: d */
    private static volatile bxxk f150163d;

    /* renamed from: a */
    public int f150164a;

    /* renamed from: b */
    public String f150165b = "";

    static {
        btrw btrw = new btrw();
        f150162c = btrw;
        GeneratedMessageLite.m124024a(btrw.class, btrw);
    }

    private btrw() {
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
            return GeneratedMessageLite.m124022a(f150162c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"a", "b"});
        } else if (i2 == 3) {
            return new btrw();
        } else {
            if (i2 == 4) {
                return new bxvd(f150162c);
            }
            if (i2 == 5) {
                return f150162c;
            }
            bxxk bxxk = f150163d;
            if (bxxk == null) {
                synchronized (btrw.class) {
                    bxxk = f150163d;
                    if (bxxk == null) {
                        bxxk = new bxve(f150162c);
                        f150163d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
