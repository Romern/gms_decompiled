package p000;

import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.concurrent.TimeUnit;

/* renamed from: bedr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bedr {
    /* renamed from: a */
    public static final beds m91834a(bedk bedk, byte[] bArr) {
        boolean z;
        int length = bArr.length;
        if (length == 16) {
            byte[] bArr2 = new byte[4];
            ByteBuffer wrap = ByteBuffer.wrap(becu.m91797a(bedk.f106973b.f106977a, bArr));
            wrap.get(bArr2);
            if (Arrays.equals(bArr2, beds.f106982a)) {
                long a = bqcx.m112609a(wrap.getInt());
                long millis = TimeUnit.SECONDS.toMillis(bqcx.m112609a(wrap.getInt()));
                byte[] bArr3 = new byte[3];
                wrap.get(bArr3);
                if (Arrays.equals(bArr3, beds.f106983b)) {
                    byte b = wrap.get();
                    if ((b & 252) == 0) {
                        byte b2 = b & 1;
                        boolean z2 = false;
                        if ((b & 2) != 0) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (b2 != 0) {
                            z2 = true;
                        }
                        return new beds(bedk, new bedn(a, z2, z), millis);
                    }
                    throw new bedq("Unexpected flags are set.");
                }
                throw new bedq("Reserved bytes should be 0.");
            }
            throw new bedq("Ephemeral ID doesn't match provided device.");
        }
        StringBuilder sb = new StringBuilder(29);
        sb.append("Incorrect length: ");
        sb.append(length);
        throw new bedq(sb.toString());
    }
}
