package p000;

import java.io.EOFException;
import java.io.InputStream;
import java.util.logging.Logger;

/* renamed from: cbl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cbl {
    static {
        Logger.getLogger(cbl.class.getName());
    }

    private cbl() {
    }

    /* renamed from: a */
    public static byte[] m3891a(InputStream inputStream, int i) {
        byte[] bArr = new byte[i];
        if (i == 0) {
            return bArr;
        }
        int i2 = 0;
        do {
            int read = inputStream.read(bArr, i2, i - i2);
            if (read >= 0) {
                i2 += read;
            } else {
                throw new EOFException();
            }
        } while (i2 < i);
        return bArr;
    }
}
