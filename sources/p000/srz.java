package p000;

import android.os.ParcelFileDescriptor;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Arrays;

@Deprecated
/* renamed from: srz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class srz {
    @Deprecated
    /* renamed from: a */
    public static long m36168a(InputStream inputStream, OutputStream outputStream, boolean z) {
        return m36169a(inputStream, outputStream, z, 1024);
    }

    /* renamed from: b */
    public static void m36176b(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException e) {
            }
        }
    }

    @Deprecated
    /* renamed from: a */
    public static long m36169a(InputStream inputStream, OutputStream outputStream, boolean z, int i) {
        byte[] bArr = new byte[i];
        long j = 0;
        while (true) {
            try {
                int read = inputStream.read(bArr, 0, i);
                if (read == -1) {
                    break;
                }
                j += (long) read;
                outputStream.write(bArr, 0, read);
            } catch (Throwable th) {
                if (z) {
                    m36171a((Closeable) inputStream);
                    m36171a(outputStream);
                }
                throw th;
            }
        }
        if (z) {
            m36171a((Closeable) inputStream);
            m36171a(outputStream);
        }
        return j;
    }

    /* renamed from: b */
    private static void m36177b(InputStream inputStream, OutputStream outputStream) {
        sdo.m34959a(inputStream);
        sdo.m34959a(outputStream);
        byte[] bArr = new byte[4096];
        while (true) {
            int read = inputStream.read(bArr);
            if (read != -1) {
                outputStream.write(bArr, 0, read);
            } else {
                return;
            }
        }
    }

    @Deprecated
    /* renamed from: b */
    public static byte[] m36178b(InputStream inputStream) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        m36168a(inputStream, byteArrayOutputStream, true);
        return byteArrayOutputStream.toByteArray();
    }

    /* renamed from: a */
    public static void m36170a(ParcelFileDescriptor parcelFileDescriptor) {
        if (parcelFileDescriptor != null) {
            try {
                parcelFileDescriptor.close();
            } catch (IOException e) {
            }
        }
    }

    /* renamed from: a */
    public static void m36171a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException e) {
            }
        }
    }

    @Deprecated
    /* renamed from: a */
    public static void m36172a(InputStream inputStream, OutputStream outputStream) {
        m36168a(inputStream, outputStream, false);
    }

    /* renamed from: a */
    public static boolean m36173a(byte[] bArr) {
        if (bArr.length > 1) {
            if ((((bArr[1] & 255) << 8) | (bArr[0] & 255)) == 35615) {
                return true;
            }
        }
        return false;
    }

    @Deprecated
    /* renamed from: a */
    public static byte[] m36174a(File file) {
        FileInputStream fileInputStream;
        Throwable th;
        byte[] bArr;
        try {
            fileInputStream = new FileInputStream(new sry(file).f45066a);
            try {
                long size = fileInputStream.getChannel().size();
                if (size <= 2147483647L) {
                    if (size != 0) {
                        int i = (int) size;
                        bArr = new byte[i];
                        int i2 = i;
                        while (true) {
                            if (i2 > 0) {
                                int i3 = i - i2;
                                int read = fileInputStream.read(bArr, i3, i2);
                                if (read == -1) {
                                    bArr = Arrays.copyOf(bArr, i3);
                                    break;
                                }
                                i2 -= read;
                            } else {
                                int read2 = fileInputStream.read();
                                if (read2 != -1) {
                                    srx srx = new srx();
                                    srx.write(read2);
                                    m36177b(fileInputStream, srx);
                                    bArr = Arrays.copyOf(bArr, srx.size() + i);
                                    srx.mo26033a(bArr, i);
                                }
                            }
                        }
                    } else {
                        bArr = m36175a((InputStream) fileInputStream);
                    }
                    m36171a((Closeable) fileInputStream);
                    return bArr;
                }
                StringBuilder sb = new StringBuilder(68);
                sb.append("file is too large to fit in a byte array: ");
                sb.append(size);
                sb.append(" bytes");
                throw new OutOfMemoryError(sb.toString());
            } catch (Throwable th2) {
                th = th2;
                m36171a((Closeable) fileInputStream);
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            fileInputStream = null;
            m36171a((Closeable) fileInputStream);
            throw th;
        }
    }

    @Deprecated
    /* renamed from: a */
    public static byte[] m36175a(InputStream inputStream) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        m36177b(inputStream, byteArrayOutputStream);
        return byteArrayOutputStream.toByteArray();
    }
}
