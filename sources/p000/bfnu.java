package p000;

/* renamed from: bfnu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bfnu {

    /* renamed from: a */
    private final long f114511a;

    /* renamed from: b */
    private final byte[] f114512b;

    /* renamed from: c */
    private int f114513c = 0;

    public bfnu(long j, int i) {
        this.f114511a = j;
        byte[] bArr = new byte[((i * 9) + 9)];
        this.f114512b = bArr;
        bArr[0] = 0;
        bfnv.m97364a(j, bArr, 1, 8);
        this.f114513c += 9;
    }

    /* renamed from: a */
    public final bfnv mo62001a(bfnz[] bfnzArr, boolean z) {
        int i = this.f114513c;
        byte[] bArr = this.f114512b;
        int length = bArr.length;
        if (i == length) {
            return new bfnv(bArr, bfnzArr, z);
        }
        StringBuilder sb = new StringBuilder(90);
        sb.append("Too few addDevice() calls? Byte array not filled: ");
        sb.append(i);
        sb.append(" of ");
        sb.append(length);
        sb.append(" bytes written");
        throw new IllegalStateException(sb.toString());
    }

    /* renamed from: a */
    public final void mo62002a(long j, byte b, int i, long j2) {
        bfnv.m97364a(j, this.f114512b, this.f114513c, 6);
        int i2 = this.f114513c + 6;
        byte[] bArr = this.f114512b;
        int i3 = i2 + 1;
        this.f114513c = i3;
        bArr[i2] = b;
        this.f114513c = i3 + 1;
        bArr[i3] = (byte) (bupz.m120218a(i) - 128);
        long j3 = (this.f114511a - j2) / 100;
        if (j3 > 127) {
            byte[] bArr2 = this.f114512b;
            int i4 = this.f114513c;
            this.f114513c = i4 + 1;
            bArr2[i4] = Byte.MAX_VALUE;
            return;
        }
        byte[] bArr3 = this.f114512b;
        int i5 = this.f114513c;
        this.f114513c = i5 + 1;
        bArr3[i5] = (byte) ((int) j3);
    }
}
