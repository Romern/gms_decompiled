package p000;

/* renamed from: brh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class brh extends bwz {

    /* renamed from: a */
    public static final byte[] f5442a = {0};

    /* renamed from: b */
    public static final bzx f5443b = bzx.CHIP;

    /* renamed from: c */
    public static final bzu f5444c;

    /* renamed from: d */
    public static final int f5445d = 3;

    /* renamed from: e */
    public static final int f5446e = 1;

    /* renamed from: f */
    public static final int f5447f = 3;

    /* renamed from: g */
    public static final int f5448g = 3;

    /* renamed from: h */
    public static final int f5449h = 4;

    /* renamed from: i */
    public static final int f5450i = 5;
    private static final long serialVersionUID = 1;

    static {
        bzv bzv = new bzv();
        bzv.f6286a = "Card Transaction Qualifiers";
        bzv.f6287b = "Card Transaction Qualifiers";
        bzv.f6293h = f5445d;
        bzv.f6294i = f5446e;
        bzv.f6290e = f5443b;
        bzv.f6289d = 1;
        bzv.f6295j = f5447f;
        bzv.f6296k = f5448g;
        bzv.f6297l = f5450i;
        bzv.f6298m = f5449h;
        f5444c = bzv.mo3629a();
    }

    public brh() {
        super(f5442a, f5444c);
    }

    /* renamed from: a */
    public final void mo3445a(brg brg) {
        byte[] bArr = this.f5930l;
        byte b = (byte) (bArr[0] & -16);
        bArr[0] = b;
        bArr[0] = (byte) (brg.f5441e | b);
    }

    public brh(byte[] bArr) {
        super(bArr, f5444c);
    }

    /* renamed from: a */
    public final void mo3446a(boolean z) {
        if (!z) {
            byte[] bArr = this.f5930l;
            bArr[0] = (byte) (bArr[0] & -129);
            return;
        }
        byte[] bArr2 = this.f5930l;
        bArr2[0] = (byte) (bArr2[0] | 128);
    }
}
