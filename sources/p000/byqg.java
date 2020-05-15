package p000;

import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.IOException;

/* renamed from: byqg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class byqg implements byqi {

    /* renamed from: a */
    private static final int[] f167380a = {1, 10, 100, 1000, 10000, 100000, 1000000, 10000000, 100000000, 1000000000};

    /* renamed from: a */
    public final String mo74469a(int i, byte[] bArr) {
        int length = bArr.length;
        byte b = bArr[length - 1] & 15;
        try {
            String num = Integer.toString((new DataInputStream(new ByteArrayInputStream(bArr, b, length - b)).readInt() & Integer.MAX_VALUE) % f167380a[i]);
            for (int length2 = num.length(); length2 < i; length2++) {
                String valueOf = String.valueOf(num);
                num = valueOf.length() == 0 ? new String("0") : "0".concat(valueOf);
            }
            return num;
        } catch (IOException e) {
            throw new IllegalStateException(e);
        }
    }
}
