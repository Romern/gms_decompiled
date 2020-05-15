package p000;

import java.util.Arrays;

/* renamed from: astc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class astc extends asth {

    /* renamed from: a */
    public static final astc f89631a = new astc(new byte[]{50, 80, 65, 89, 46, 83, 89, 83, 46, 68, 68, 70, 48, 49});

    /* renamed from: b */
    public static final astc f89632b = new astc(new byte[]{-96, 0, 0, 0, 4});

    /* renamed from: c */
    public static final astc f89633c = new astc(new byte[]{-96, 0, 0, 0, 3});

    /* renamed from: d */
    public static final astc f89634d = new astc(new byte[]{-96, 0, 0, 3, 36});

    /* renamed from: e */
    public static final astc f89635e = new astc(new byte[]{-96, 0, 0, 1, 82});

    /* renamed from: f */
    public static final astc f89636f = new astc(new byte[]{-96, 0, 0, 0, 37});

    /* renamed from: g */
    public static final astc f89637g = new astc(bqce.m112562a(f89634d.f89685k, new byte[]{16, 16}));

    /* renamed from: h */
    public static final astc f89638h = new astc(bqce.m112562a(f89635e.f89685k, new byte[]{48, 16}));

    /* renamed from: i */
    public static final astc f89639i = new astc(bqce.m112562a(f89635e.f89685k, new byte[]{64, 16}));

    /* renamed from: j */
    public static final astc f89640j = new astc(bqce.m112562a(f89636f.f89685k, new byte[]{2}));

    static {
        new astc(bqce.m112562a(f89633c.f89685k, new byte[]{16, 16}));
        new astc(new byte[]{-96, 0, 0, 0, -104, 8, 64});
        new astc(bqce.m112562a(f89632b.f89685k, new byte[]{16, 16}));
        new astc(bqce.m112562a(f89636f.f89685k, new byte[]{1, 16, 1}));
        new astc(new byte[]{-96, 0, 0, 4, -123, 16, 1, 1, 1});
    }

    private astc(byte[] bArr) {
        super(bArr);
    }

    /* renamed from: a */
    public static astc m74747a(byte[] bArr) {
        boolean z;
        int length = bArr.length;
        if (length < 5 || length > 16) {
            z = false;
        } else {
            z = true;
        }
        sdo.m34976b(z, "Illegal length for AID: %s", Integer.valueOf(length));
        return new astc(bArr);
    }

    /* renamed from: b */
    public static astc m74748b(byte[] bArr) {
        if (bArr[0] == 0 && bArr[1] == -92 && bArr[2] == 4 && (bArr[3] & -4) == 0) {
            return m74747a(Arrays.copyOfRange(bArr, 5, bArr[4] + 5));
        }
        return null;
    }

    public final String toString() {
        return asti.m74760a(this.f89685k);
    }

    /* renamed from: a */
    public final int mo49453a() {
        return this.f89685k.length;
    }

    /* renamed from: a */
    public final boolean mo49454a(astc astc) {
        byte[] bArr = astc.f89685k;
        int length = bArr.length;
        byte[] bArr2 = this.f89685k;
        return bArr2.length >= length && Arrays.equals(Arrays.copyOf(bArr2, length), bArr);
    }
}
