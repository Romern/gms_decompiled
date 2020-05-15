package p000;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;

/* renamed from: bxe */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bxe {
    /* renamed from: a */
    public static void m3749a(InputStream inputStream, byte[] bArr) {
        int length = bArr.length;
        if (length > 0) {
            try {
                int read = inputStream.read(bArr);
                if (length != read) {
                    StringBuilder sb = new StringBuilder(46);
                    sb.append("Byte read ");
                    sb.append(read);
                    sb.append(" but expected ");
                    sb.append(length);
                    throw new IOException(sb.toString());
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

    /* renamed from: a */
    public static void m3750a(OutputStream outputStream, byte[] bArr) {
        int length = bArr.length;
        ByteBuffer allocate = ByteBuffer.allocate(length + 4);
        allocate.putInt(length);
        allocate.put(bArr);
        try {
            outputStream.write(allocate.array());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: a */
    public static byte[] m3751a(InputStream inputStream) {
        byte[] bArr = new byte[4];
        m3749a(inputStream, bArr);
        try {
            int available = inputStream.available();
            int i = ByteBuffer.wrap(bArr).getInt();
            if (i <= available) {
                byte[] bArr2 = new byte[i];
                m3749a(inputStream, bArr2);
                return bArr2;
            }
            throw new IllegalArgumentException();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
