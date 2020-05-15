package p000;

import java.nio.ByteBuffer;

/* renamed from: bqpi */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bqpi implements bqng {

    /* renamed from: a */
    private static final byte[] f141346a = new byte[0];

    /* renamed from: b */
    private final bqsf f141347b;

    /* renamed from: c */
    private final bqng f141348c;

    public bqpi(bqsf bqsf, bqng bqng) {
        this.f141347b = bqsf;
        this.f141348c = bqng;
    }

    /* renamed from: a */
    public final byte[] mo69281a(byte[] bArr, byte[] bArr2) {
        byte[] k = bqok.m113116b(this.f141347b).serializeToBytes();
        byte[] a = this.f141348c.mo69281a(k, f141346a);
        byte[] a2 = ((bqng) bqok.m113107a(this.f141347b.f141516a, k, bqng.class)).mo69281a(bArr, bArr2);
        int length = a.length;
        return ByteBuffer.allocate(length + 4 + a2.length).putInt(length).put(a).put(a2).array();
    }

    /* renamed from: b */
    public final byte[] mo69282b(byte[] bArr, byte[] bArr2) {
        throw null;
    }
}
