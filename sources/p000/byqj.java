package p000;

import java.nio.ByteBuffer;
import javax.crypto.Mac;

/* renamed from: byqj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class byqj {

    /* renamed from: a */
    public static final byqi f167381a = new byqg();

    /* renamed from: b */
    private final Mac f167382b;

    /* renamed from: c */
    private final int f167383c;

    /* renamed from: d */
    private final byqi f167384d;

    public byqj(Mac mac, int i, byqi byqi) {
        this.f167382b = mac;
        this.f167383c = i;
        this.f167384d = byqi;
    }

    /* renamed from: a */
    private static byte[] m125125a(long j) {
        return ByteBuffer.allocate(8).putLong(j).array();
    }

    /* renamed from: a */
    public final String mo74470a(long j, long j2, int i, byte[] bArr) {
        byte[] bArr2;
        byte[][] bArr3 = new byte[4][];
        bArr3[0] = m125125a(j);
        bArr3[1] = m125125a(j2);
        if (i != 0) {
            bArr2 = m125125a((long) (i - 1));
        } else {
            bArr2 = null;
        }
        bArr3[2] = bArr2;
        bArr3[3] = bArr;
        for (int i2 = 0; i2 < 4; i2++) {
            byte[] bArr4 = bArr3[i2];
            if (bArr4 != null) {
                this.f167382b.update(bArr4);
            }
        }
        return this.f167384d.mo74469a(this.f167383c, this.f167382b.doFinal());
    }
}
