package p000;

import java.nio.ByteBuffer;
import java.util.Locale;

/* renamed from: byqh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class byqh implements byqi {
    /* renamed from: a */
    public final String mo74469a(int i, byte[] bArr) {
        if (i != 9) {
            throw new IllegalArgumentException("Code length must be 9");
        } else if (bArr.length == 32) {
            ByteBuffer wrap = ByteBuffer.wrap(bArr);
            int i2 = 0;
            for (int i3 = 0; i3 < 32; i3 += 4) {
                i2 = wrap.getInt(i3);
                if ((i2 & 1073741823) < 1000000000) {
                    break;
                }
            }
            return String.format(Locale.US, "%09d", Integer.valueOf((i2 & 1073741823) % 1000000000));
        } else {
            throw new IllegalArgumentException("Signed challenge length must be exactly 32 bytes");
        }
    }
}
