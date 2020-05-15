package p000;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.EOFException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

/* renamed from: boav */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class boav {

    /* renamed from: a */
    public static final OutputStream f132480a = new boar();

    /* renamed from: a */
    public static long m111013a(InputStream inputStream, OutputStream outputStream) {
        bmxy.m108581a(inputStream);
        bmxy.m108581a(outputStream);
        byte[] a = m111019a();
        long j = 0;
        while (true) {
            int read = inputStream.read(a);
            if (read == -1) {
                return j;
            }
            outputStream.write(a, 0, read);
            j += (long) read;
        }
    }

    /* renamed from: b */
    public static boat m111024b() {
        return m111016a(new ByteArrayOutputStream());
    }

    /* renamed from: b */
    public static InputStream m111025b(InputStream inputStream, long j) {
        return new boau(inputStream, j);
    }

    /* renamed from: b */
    public static void m111026b(InputStream inputStream) {
        do {
        } while (((long) inputStream.read(m111019a())) != -1);
    }

    /* renamed from: a */
    public static boas m111014a(byte[] bArr, int i) {
        int length = bArr.length;
        bmxy.m108599b(i, length);
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr, i, length - i);
        bmxy.m108581a(byteArrayInputStream);
        return new boas(byteArrayInputStream);
    }

    /* renamed from: a */
    public static boat m111015a(int i) {
        if (i >= 0) {
            return m111016a(new ByteArrayOutputStream(i));
        }
        throw new IllegalArgumentException(String.format("Invalid size: %s", Integer.valueOf(i)));
    }

    /* renamed from: a */
    public static boat m111016a(ByteArrayOutputStream byteArrayOutputStream) {
        bmxy.m108581a(byteArrayOutputStream);
        return new boat(byteArrayOutputStream);
    }

    /* renamed from: a */
    public static void m111017a(InputStream inputStream, byte[] bArr) {
        m111018a(inputStream, bArr, 0, bArr.length);
    }

    /* renamed from: a */
    public static void m111018a(InputStream inputStream, byte[] bArr, int i, int i2) {
        bmxy.m108581a(inputStream);
        bmxy.m108581a(bArr);
        int i3 = 0;
        if (i2 >= 0) {
            bmxy.m108585a(i, i + i2, bArr.length);
            while (i3 < i2) {
                int read = inputStream.read(bArr, i + i3, i2 - i3);
                if (read == -1) {
                    break;
                }
                i3 += read;
            }
            if (i3 != i2) {
                StringBuilder sb = new StringBuilder(81);
                sb.append("reached end of stream after reading ");
                sb.append(i3);
                sb.append(" bytes; ");
                sb.append(i2);
                sb.append(" bytes expected");
                throw new EOFException(sb.toString());
            }
            return;
        }
        throw new IndexOutOfBoundsException(String.format("len (%s) cannot be negative", Integer.valueOf(i2)));
    }

    /* renamed from: a */
    static byte[] m111019a() {
        return new byte[8192];
    }

    /* renamed from: a */
    public static byte[] m111020a(InputStream inputStream) {
        bmxy.m108581a(inputStream);
        return m111022a(inputStream, new ArrayDeque(20), 0);
    }

    /* renamed from: a */
    static byte[] m111021a(InputStream inputStream, long j) {
        boolean z;
        if (j >= 0) {
            z = true;
        } else {
            z = false;
        }
        bmxy.m108593a(z, "expectedSize (%s) must be non-negative", j);
        if (j <= 2147483639) {
            int i = (int) j;
            byte[] bArr = new byte[i];
            int i2 = i;
            while (i2 > 0) {
                int i3 = i - i2;
                int read = inputStream.read(bArr, i3, i2);
                if (read == -1) {
                    return Arrays.copyOf(bArr, i3);
                }
                i2 -= read;
            }
            int read2 = inputStream.read();
            if (read2 == -1) {
                return bArr;
            }
            ArrayDeque arrayDeque = new ArrayDeque(22);
            arrayDeque.add(bArr);
            arrayDeque.add(new byte[]{(byte) read2});
            return m111022a(inputStream, arrayDeque, i + 1);
        }
        StringBuilder sb = new StringBuilder(62);
        sb.append(j);
        sb.append(" bytes is too large to fit in a byte array");
        throw new OutOfMemoryError(sb.toString());
    }

    /* renamed from: a */
    private static byte[] m111022a(InputStream inputStream, Deque deque, int i) {
        int i2 = 8192;
        while (i < 2147483639) {
            int min = Math.min(i2, 2147483639 - i);
            byte[] bArr = new byte[min];
            deque.add(bArr);
            int i3 = 0;
            while (i3 < min) {
                int read = inputStream.read(bArr, i3, min - i3);
                if (read == -1) {
                    return m111023a(deque, i);
                }
                i3 += read;
                i += read;
            }
            long j = (long) i2;
            i2 = bqcn.m112585b(j + j);
        }
        if (inputStream.read() == -1) {
            return m111023a(deque, 2147483639);
        }
        throw new OutOfMemoryError("input is too large to fit in a byte array");
    }

    /* renamed from: a */
    private static byte[] m111023a(Deque deque, int i) {
        byte[] bArr = new byte[i];
        int i2 = i;
        while (i2 > 0) {
            byte[] bArr2 = (byte[]) deque.removeFirst();
            int min = Math.min(i2, bArr2.length);
            System.arraycopy(bArr2, 0, bArr, i - i2, min);
            i2 -= min;
        }
        return bArr;
    }
}
