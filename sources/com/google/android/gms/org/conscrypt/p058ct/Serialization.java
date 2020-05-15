package com.google.android.gms.org.conscrypt.p058ct;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;

/* renamed from: com.google.android.gms.org.conscrypt.ct.Serialization */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class Serialization {
    private static final int DER_LENGTH_LONG_FORM_FLAG = 128;
    private static final int DER_TAG_MASK = 63;
    private static final int DER_TAG_OCTET_STRING = 4;

    private Serialization() {
    }

    public static byte readByte(InputStream inputStream) {
        try {
            int read = inputStream.read();
            if (read != -1) {
                return (byte) read;
            }
            throw new SerializationException("Premature end of input, could not read byte.");
        } catch (IOException e) {
            throw new SerializationException(e);
        }
    }

    public static byte[] readDEROctetString(InputStream inputStream) {
        byte readByte = readByte(inputStream) & 63;
        if (readByte == 4) {
            int readNumber = readNumber(inputStream, 1);
            if ((readNumber & 128) != 0) {
                readNumber = readNumber(inputStream, readNumber & -129);
            }
            return readFixedBytes(inputStream, readNumber);
        }
        StringBuilder sb = new StringBuilder(53);
        sb.append("Wrong DER tag, expected OCTET STRING, got ");
        sb.append((int) readByte);
        throw new SerializationException(sb.toString());
    }

    public static byte[] readFixedBytes(InputStream inputStream, int i) {
        if (i >= 0) {
            try {
                byte[] bArr = new byte[i];
                int read = inputStream.read(bArr);
                if (read >= i) {
                    return bArr;
                }
                StringBuilder sb = new StringBuilder(73);
                sb.append("Premature end of input, expected ");
                sb.append(i);
                sb.append(" bytes, only read ");
                sb.append(read);
                throw new SerializationException(sb.toString());
            } catch (IOException e) {
                throw new SerializationException(e);
            }
        } else {
            StringBuilder sb2 = new StringBuilder(28);
            sb2.append("Negative length: ");
            sb2.append(i);
            throw new SerializationException(sb2.toString());
        }
    }

    public static byte[][] readList(InputStream inputStream, int i, int i2) {
        ArrayList arrayList = new ArrayList();
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(readVariableBytes(inputStream, i));
        while (byteArrayInputStream.available() > 0) {
            try {
                arrayList.add(readVariableBytes(byteArrayInputStream, i2));
            } catch (IOException e) {
                throw new SerializationException(e);
            }
        }
        return (byte[][]) arrayList.toArray(new byte[arrayList.size()][]);
    }

    public static long readLong(InputStream inputStream, int i) {
        if (i > 8 || i < 0) {
            StringBuilder sb = new StringBuilder(26);
            sb.append("Invalid width: ");
            sb.append(i);
            throw new IllegalArgumentException(sb.toString());
        }
        long j = 0;
        for (int i2 = 0; i2 < i; i2++) {
            j = (j << 8) | ((long) (readByte(inputStream) & 255));
        }
        return j;
    }

    public static int readNumber(InputStream inputStream, int i) {
        if (i > 4 || i < 0) {
            StringBuilder sb = new StringBuilder(26);
            sb.append("Invalid width: ");
            sb.append(i);
            throw new SerializationException(sb.toString());
        }
        byte b = 0;
        for (int i2 = 0; i2 < i; i2++) {
            b = (b << 8) | (readByte(inputStream) & 255);
        }
        return b;
    }

    public static byte[] readVariableBytes(InputStream inputStream, int i) {
        return readFixedBytes(inputStream, readNumber(inputStream, i));
    }

    public static void writeFixedBytes(OutputStream outputStream, byte[] bArr) {
        try {
            outputStream.write(bArr);
        } catch (IOException e) {
            throw new SerializationException(e);
        }
    }

    public static void writeNumber(OutputStream outputStream, long j, int i) {
        if (i < 0) {
            StringBuilder sb = new StringBuilder(27);
            sb.append("Negative width: ");
            sb.append(i);
            throw new SerializationException(sb.toString());
        } else if (i >= 8 || j < (1 << (i * 8))) {
            while (i > 0) {
                i--;
                long j2 = ((long) i) * 8;
                if (j2 < 64) {
                    try {
                        outputStream.write((byte) ((int) ((j >> ((int) j2)) & 255)));
                    } catch (IOException e) {
                        throw new SerializationException(e);
                    }
                } else {
                    outputStream.write(0);
                }
            }
        } else {
            StringBuilder sb2 = new StringBuilder(72);
            sb2.append("Number too large, ");
            sb2.append(j);
            sb2.append(" does not fit in ");
            sb2.append(i);
            sb2.append(" bytes");
            throw new SerializationException(sb2.toString());
        }
    }

    public static void writeVariableBytes(OutputStream outputStream, byte[] bArr, int i) {
        writeNumber(outputStream, (long) bArr.length, i);
        writeFixedBytes(outputStream, bArr);
    }

    public static byte[][] readList(byte[] bArr, int i, int i2) {
        return readList(new ByteArrayInputStream(bArr), i, i2);
    }

    public static byte[] readDEROctetString(byte[] bArr) {
        return readDEROctetString(new ByteArrayInputStream(bArr));
    }
}
