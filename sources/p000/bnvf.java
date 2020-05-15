package p000;

import java.io.IOException;
import java.io.InputStream;

/* renamed from: bnvf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bnvf {
    /* renamed from: a */
    static byte m110486a(InputStream inputStream) {
        int read = inputStream.read();
        if (read >= 0) {
            return (byte) (read & 255);
        }
        throw new IOException("EOF");
    }
}
