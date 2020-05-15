package p000;

import java.nio.ByteBuffer;

/* renamed from: buqe */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class buqe implements buqc {
    /* renamed from: a */
    public final int[] mo37862a(byte[] bArr) {
        ByteBuffer wrap = ByteBuffer.wrap(bnzi.m110902d().mo68722a(bArr).mo68740b());
        int[] iArr = new int[8];
        for (int i = 0; i < 8; i++) {
            iArr[i] = wrap.getInt();
        }
        return iArr;
    }
}
