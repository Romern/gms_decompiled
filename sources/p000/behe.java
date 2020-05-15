package p000;

import java.io.FilterOutputStream;
import java.io.OutputStream;

/* renamed from: behe */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class behe extends FilterOutputStream {
    public behe(OutputStream outputStream) {
        super(outputStream);
    }

    public void write(byte[] bArr) {
        this.out.write(bArr);
    }

    public void write(byte[] bArr, int i, int i2) {
        this.out.write(bArr, i, i2);
    }
}
