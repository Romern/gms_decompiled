package p000;

import java.io.FilterInputStream;
import java.io.InputStream;

/* renamed from: behd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class behd extends FilterInputStream {
    public behd(InputStream inputStream) {
        super(inputStream);
    }

    public int read(byte[] bArr) {
        return this.in.read(bArr);
    }
}
