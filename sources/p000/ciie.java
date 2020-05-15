package p000;

import java.io.InputStream;
import java.io.OutputStream;

/* renamed from: ciie */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ciie {

    /* renamed from: a */
    static volatile bxus f190401a = bxus.m123743b();

    /* renamed from: a */
    public static long m150369a(InputStream inputStream, OutputStream outputStream) {
        bmxy.m108582a(inputStream, "inputStream cannot be null!");
        bmxy.m108582a(outputStream, "outputStream cannot be null!");
        byte[] bArr = new byte[8192];
        long j = 0;
        while (true) {
            int read = inputStream.read(bArr);
            if (read == -1) {
                return j;
            }
            outputStream.write(bArr, 0, read);
            j += (long) read;
        }
    }

    /* renamed from: a */
    public static chtt m150370a(bxxc bxxc) {
        return new ciid(bxxc);
    }
}
