package p000;

import java.util.List;

/* renamed from: cwy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cwy {

    /* renamed from: a */
    public final cwv f12299a;

    /* renamed from: b */
    public final int f12300b;

    /* renamed from: c */
    public final byte[] f12301c;

    /* renamed from: d */
    public final cwx f12302d;

    /* renamed from: e */
    public final byte[] f12303e;

    /* renamed from: f */
    public final List f12304f;

    /* renamed from: g */
    public final cww f12305g;

    /* renamed from: h */
    public final cww f12306h;

    public cwy(cwv cwv, int i, byte[] bArr, cwx cwx, byte[] bArr2, List list, cww cww, cww cww2) {
        this.f12299a = cwv;
        this.f12300b = i;
        this.f12301c = bArr;
        this.f12302d = cwx;
        this.f12303e = bArr2;
        this.f12304f = list;
        this.f12305g = cww;
        this.f12306h = cww2;
    }

    /* renamed from: a */
    public static int m7798a(byte b) {
        return b & 15;
    }

    /* renamed from: a */
    public static byte[] m7799a(byte[] bArr, byte[] bArr2) {
        byte[] bArr3 = new byte[bArr.length];
        for (int i = 0; i < bArr.length; i++) {
            bArr3[i] = (byte) (bArr[i] & bArr2[i]);
        }
        return bArr3;
    }
}
