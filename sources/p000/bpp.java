package p000;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.StringWriter;
import java.io.Writer;
import java.math.BigInteger;
import java.util.Map;

/* renamed from: bpp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bpp {
    static {
        citv.m151011a(bpp.class);
    }

    /* renamed from: a */
    public static String m3462a(byte[] bArr) {
        Map map = null;
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
        StringWriter stringWriter = new StringWriter();
        while (byteArrayInputStream.available() > 0) {
            try {
                m3464a(byteArrayInputStream, stringWriter, 0, map);
            } catch (IOException e) {
                int i = cbd.f6383a;
            }
        }
        return stringWriter.toString();
    }

    /* renamed from: b */
    private static String m3465b(byte[] bArr) {
        int length = bArr.length;
        char[] cArr = new char[length];
        for (int i = 0; i != length; i++) {
            cArr[i] = (char) (bArr[i] & 255);
        }
        return new String(cArr);
    }

    /* renamed from: a */
    private static void m3463a(Writer writer, int i, int i2, byte[] bArr, String str) {
        int length;
        if (bArr != null && (length = bArr.length) != 0) {
            int i3 = 1;
            if (i2 > 0) {
                int i4 = length / i2;
                if (length % i2 == 0) {
                    i3 = 0;
                }
                i3 += i4;
            }
            for (int i5 = 0; i5 < i3; i5++) {
                for (int i6 = 0; i6 < i; i6++) {
                    writer.write("   ");
                }
                int length2 = bArr.length;
                if (i2 > 0 && (i5 != i3 - 1 || (length2 = length2 % i2) == 0)) {
                    length2 = i2;
                }
                writer.write(cbm.m3894a(bArr, i5 * i2, length2));
                if (str != null && i5 == 0) {
                    writer.write("\t\t-- ");
                    writer.write(str);
                }
                writer.write("\n");
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0032, code lost:
        if (r5 >= 0) goto L_0x0034;
     */
    /* JADX WARNING: Removed duplicated region for block: B:109:0x0190  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x003d  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0040  */
    /* renamed from: a */
    private static boolean m3464a(InputStream inputStream, Writer writer, int i, Map map) {
        byte[] bArr;
        boolean z;
        String str;
        byte[] bArr2;
        int i2;
        byte[] bArr3;
        String str2;
        byte[] bArr4;
        String str3;
        int length;
        String str4;
        InputStream inputStream2 = inputStream;
        Writer writer2 = writer;
        int i3 = i;
        Map map2 = map;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        int read = inputStream.read();
        if (read >= 0) {
            byteArrayOutputStream.write(read);
            if ((read & 31) == 31) {
                int read2 = inputStream.read();
                byteArrayOutputStream.write(read2);
                while (read2 > 0 && (((byte) read2) & 128) == 128) {
                    read2 = inputStream.read();
                    byteArrayOutputStream.write(read2);
                }
            }
            bArr = byteArrayOutputStream.toByteArray();
            if (bArr != null) {
                z = false;
            } else if (bArr.length != 0) {
                if (map2 != null) {
                    str = (String) map2.get(cbm.m3893a(bArr));
                } else {
                    str = null;
                }
                byte b = bArr[0] & 32;
                ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
                int read3 = inputStream.read();
                if (read3 >= 0) {
                    byteArrayOutputStream2.write(read3);
                    if ((read3 & 128) == 128) {
                        int i4 = read3 & 127;
                        for (int i5 = 0; i5 < i4; i5++) {
                            int read4 = inputStream.read();
                            if (read4 < 0) {
                                break;
                            }
                            byteArrayOutputStream2.write(read4);
                        }
                    }
                    bArr2 = byteArrayOutputStream2.toByteArray();
                } else {
                    bArr2 = null;
                }
                if (bArr2 != null) {
                    int length2 = bArr2.length;
                    if (length2 == 0) {
                        i2 = 0;
                    } else if (length2 == 1) {
                        byte b2 = bArr2[0];
                        i2 = (b2 & 128) != 128 ? b2 & Byte.MAX_VALUE : -1;
                    } else {
                        i2 = 0;
                        for (int i6 = 1; i6 < bArr2.length; i6++) {
                            i2 = (i2 << 8) | (bArr2[i6] & 255);
                        }
                    }
                } else {
                    i2 = 0;
                }
                if (bArr2 != null) {
                    int length3 = bArr.length;
                    int length4 = bArr2.length;
                    bArr3 = new byte[(length3 + length4)];
                    System.arraycopy(bArr, 0, bArr3, 0, length3);
                    System.arraycopy(bArr2, 0, bArr3, length3, length4);
                } else {
                    str = "error: no length found";
                    bArr3 = bArr;
                }
                byte b3 = bArr[0];
                if (str == null) {
                    int i7 = (b3 & 255) >> 6;
                    str = i7 != 0 ? i7 != 1 ? i7 != 2 ? "private" : "context-specific" : "application" : "universal";
                    switch (b3) {
                        case 0:
                            str4 = "EOC";
                            break;
                        case 1:
                            str4 = "BOOLEAN";
                            break;
                        case 2:
                            str4 = "INTEGER";
                            break;
                        case 3:
                            str4 = "BIT STRING";
                            break;
                        case 4:
                            str4 = "OCTET STRING";
                            break;
                        case 5:
                            str4 = "NULL";
                            break;
                        case 6:
                            str4 = "OBJECT IDENTIFIER";
                            break;
                        case 7:
                            str4 = "OBJECT_DESCRIPTOR";
                            break;
                        case 8:
                            str4 = "EXTERNAL";
                            break;
                        case 9:
                            str4 = "REAL";
                            break;
                        case 10:
                            str4 = "ENUMERATED";
                            break;
                        case 11:
                            str4 = "EMBEDDED_PDV";
                            break;
                        case 12:
                            str4 = "UTF8String";
                            break;
                        case 13:
                            str4 = "RELATIVE OID";
                            break;
                        case 14:
                        case 15:
                        default:
                            str4 = null;
                            break;
                        case 16:
                            str4 = "SEQUENCE";
                            break;
                        case 17:
                            str4 = "SET";
                            break;
                        case 18:
                            str4 = "NUMERIC_STRING";
                            break;
                        case 19:
                            str4 = "PrintableString";
                            break;
                        case 20:
                            str4 = "T61String";
                            break;
                        case 21:
                            str4 = "VideoTexString";
                            break;
                        case 22:
                            str4 = "IA5String";
                            break;
                        case 23:
                            str4 = "UTC_TIME";
                            break;
                        case 24:
                            str4 = "GENERALIZED_TIME";
                            break;
                        case 25:
                            str4 = "GRAPHIC_STRING";
                            break;
                        case 26:
                            str4 = "VISIBLE_STRING";
                            break;
                        case 27:
                            str4 = "GENERAL_STRING";
                            break;
                        case 28:
                            str4 = "UNIVERSAL_STRING";
                            break;
                        case 29:
                            str4 = "CHARACTER_STRING";
                            break;
                        case 30:
                            str4 = "BMP_STRING";
                            break;
                    }
                    if (str4 == null) {
                        str2 = str;
                    } else {
                        str2 = str;
                        str = str4;
                    }
                } else {
                    str2 = null;
                }
                if (i2 > 0) {
                    String valueOf = String.valueOf(str);
                    StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 20);
                    sb.append(valueOf);
                    sb.append(" (");
                    sb.append(i2);
                    sb.append(" bytes)");
                    str = sb.toString();
                }
                m3463a(writer2, i3, -1, bArr3, str);
                if (i2 >= 0) {
                    if (i2 > 0) {
                        bArr4 = new byte[i2];
                        int i8 = i2;
                        int i9 = 0;
                        while (true) {
                            int read5 = inputStream2.read(bArr4, i9, i8);
                            if (read5 >= 0 && i8 > 0) {
                                i9 += read5;
                                i8 -= read5;
                            } else if (i9 < i2) {
                                bArr4 = null;
                            }
                        }
                        if (i9 < i2) {
                        }
                    } else {
                        bArr4 = null;
                    }
                    if (b == 0) {
                        if (bArr4 != null && (length = bArr4.length) < i2) {
                            StringBuilder sb2 = new StringBuilder(52);
                            sb2.append("error: found ");
                            sb2.append(length);
                            sb2.append(" insteadof ");
                            sb2.append(i2);
                            sb2.append(" bytes");
                            str3 = sb2.toString();
                        } else if (!"universal".equals(str2)) {
                            str3 = null;
                        } else if (b3 == 2) {
                            str3 = new BigInteger(bArr4).toString();
                        } else if (b3 == 6) {
                            StringBuilder sb3 = new StringBuilder();
                            boolean z2 = true;
                            long j = 0;
                            BigInteger bigInteger = null;
                            for (int i10 = 0; i10 != bArr4.length; i10++) {
                                byte b4 = bArr4[i10] & 255;
                                if (j < 36028797018963968L) {
                                    j = (j * 128) + ((long) (b4 & Byte.MAX_VALUE));
                                    if ((b4 & 128) == 0) {
                                        if (z2) {
                                            int i11 = ((int) j) / 40;
                                            if (i11 == 0) {
                                                sb3.append('0');
                                            } else if (i11 != 1) {
                                                sb3.append('2');
                                                j -= 80;
                                            } else {
                                                sb3.append('1');
                                                j -= 40;
                                            }
                                        }
                                        sb3.append('.');
                                        sb3.append(j);
                                        z2 = false;
                                        j = 0;
                                    }
                                } else {
                                    if (bigInteger == null) {
                                        bigInteger = BigInteger.valueOf(j);
                                    }
                                    bigInteger = bigInteger.shiftLeft(7).or(BigInteger.valueOf((long) (b4 & Byte.MAX_VALUE)));
                                    if ((b4 & 128) == 0) {
                                        sb3.append('.');
                                        sb3.append(bigInteger);
                                        j = 0;
                                        bigInteger = null;
                                    }
                                }
                            }
                            str3 = sb3.toString();
                        } else if (b3 == 22) {
                            str3 = m3465b(bArr4);
                        } else if (b3 == 39) {
                            int length5 = bArr4.length;
                            char[] cArr = new char[length5];
                            for (int i12 = 0; i12 != length5; i12++) {
                                cArr[i12] = (char) (bArr4[i12] & 255);
                            }
                            str3 = new String(cArr);
                        } else if (b3 != 19) {
                            str3 = b3 != 20 ? null : m3465b(bArr4);
                        } else {
                            str3 = m3465b(bArr4);
                        }
                        m3463a(writer2, i3 + 1, 16, bArr4, str3);
                        return (bArr[0] == 0 && i2 == 0) ? false : true;
                    } else if (bArr4 == null) {
                        return false;
                    } else {
                        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr4);
                        while (byteArrayInputStream.available() > 0) {
                            m3464a(byteArrayInputStream, writer2, i3 + 1, map2);
                        }
                        return false;
                    }
                } else if (b == 0) {
                    return false;
                } else {
                    do {
                    } while (m3464a(inputStream2, writer2, i3 + 1, map2));
                    return false;
                }
            } else {
                z = false;
            }
            writer2.write("-- unexpected end of stream\n");
            return z;
        }
        bArr = null;
        if (bArr != null) {
        }
        writer2.write("-- unexpected end of stream\n");
        return z;
    }
}
