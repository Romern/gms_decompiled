package p000;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: czm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class czm {

    /* renamed from: a */
    private static final char[] f12450a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* renamed from: b */
    private static final byte[] f12451b = new byte[0];

    /* renamed from: c */
    private static final Charset f12452c = Charset.forName("US-ASCII");

    /* renamed from: a */
    public static byte m8005a(byte b, int i, boolean z) {
        int i2 = 1 << (i - 1);
        return (byte) (!z ? b & (i2 ^ -1) : b | i2);
    }

    /* renamed from: a */
    public static Object m8008a(Object obj, Object obj2) {
        return obj == null ? obj2 : obj;
    }

    /* renamed from: b */
    public static byte m8018b(int i) {
        return (byte) (i & 255);
    }

    /* renamed from: c */
    public static byte m8023c(int i) {
        return (byte) ((i >> 8) & 255);
    }

    /* renamed from: d */
    public static byte[] m8026d(String str) {
        if (str == null) {
            return null;
        }
        if (str.length() % 2 == 0) {
            return m8012a(str);
        }
        return m8012a(str.length() == 0 ? new String("0") : "0".concat(str));
    }

    /* renamed from: e */
    public static byte[] m8028e(byte[] bArr) {
        if (bArr != null) {
            return (byte[]) bArr.clone();
        }
        return null;
    }

    /* renamed from: a */
    private static int m8006a(char c, int i) {
        int digit = Character.digit(c, 16);
        if (digit != -1) {
            return digit;
        }
        StringBuilder sb = new StringBuilder(52);
        sb.append("Illegal hexadecimal character ");
        sb.append(c);
        sb.append(" at index ");
        sb.append(i);
        throw new RuntimeException(sb.toString());
    }

    /* renamed from: b */
    public static String m8019b(byte... bArr) {
        int length = bArr.length;
        char[] cArr = new char[(length + length)];
        int i = 0;
        for (int i2 = 0; i2 < length; i2++) {
            int i3 = i + 1;
            char[] cArr2 = f12450a;
            cArr[i] = cArr2[(bArr[i2] & 240) >>> 4];
            i = i3 + 1;
            cArr[i3] = cArr2[bArr[i2] & 15];
        }
        return new String(cArr);
    }

    /* renamed from: c */
    public static int m8024c(byte... bArr) {
        return (bArr[3] & 255) | ((bArr[0] & 255) << 24) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8);
    }

    /* renamed from: c */
    public static byte[] m8025c(String str) {
        if (str == null) {
            return null;
        }
        if (str.length() % 2 == 0) {
            return m8012a(str);
        }
        return m8012a(str.concat("F"));
    }

    /* renamed from: d */
    public static byte[] m8027d(byte[] bArr) {
        if (bArr != null) {
            int length = bArr.length;
            byte[] bArr2 = new byte[length];
            System.arraycopy(bArr, 0, bArr2, 0, length);
            return bArr2;
        }
        throw new IllegalArgumentException("Argument 'array2Copy' cannot be null");
    }

    /* renamed from: a */
    public static int m8007a(InputStream inputStream) {
        int read = inputStream.read();
        if ((read & 128) == 0) {
            return read;
        }
        int i = read & 3;
        if (i == 1) {
            return inputStream.read();
        }
        if (i == 2) {
            return (inputStream.read() << 8) | inputStream.read();
        }
        StringBuilder sb = new StringBuilder(30);
        sb.append("Len ");
        sb.append(i);
        sb.append(" not supported.");
        throw new RuntimeException(sb.toString());
    }

    /* renamed from: b */
    public static byte[] m8020b(String str) {
        if (str != null) {
            return str.getBytes(f12452c);
        }
        return null;
    }

    /* renamed from: b */
    public static byte[] m8021b(Object... objArr) {
        byte[] a = m8016a(objArr);
        return m8022b(new byte[]{m8018b(a.length)}, a);
    }

    /* renamed from: b */
    public static byte[] m8022b(byte[]... bArr) {
        int length = bArr.length;
        int i = 0;
        for (int i2 = 0; i2 < length; i2++) {
            byte[] bArr2 = bArr[i2];
            i += bArr2 != null ? bArr2.length : 0;
        }
        if (i == 0) {
            return f12451b;
        }
        int length2 = bArr.length;
        if (length2 == 1) {
            return bArr[0];
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(i);
        for (byte[] bArr3 : bArr) {
            if (bArr3 != null) {
                try {
                    byteArrayOutputStream.write(bArr3);
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
        return byteArrayOutputStream.toByteArray();
    }

    /* renamed from: a */
    public static String m8009a(byte[] bArr) {
        if (bArr != null) {
            return new String(bArr, f12452c);
        }
        return null;
    }

    /* renamed from: a */
    public static boolean m8010a(byte b, int i) {
        if (i > 0 && i <= 8) {
            return ((b >>> (i + -1)) & 1) == 1;
        }
        StringBuilder sb = new StringBuilder(62);
        sb.append("parameter 'bitPos' must be between 1 and 8. bitPos=");
        sb.append(i);
        throw new IllegalArgumentException(sb.toString());
    }

    /* renamed from: a */
    public static byte[] m8011a(int i) {
        return i <= 0 ? f12451b : new byte[i];
    }

    /* renamed from: a */
    public static byte[] m8012a(String str) {
        char[] charArray = str.toCharArray();
        int length = charArray.length;
        if ((length & 1) == 0) {
            byte[] bArr = new byte[(length >> 1)];
            int i = 0;
            int i2 = 0;
            while (i < length) {
                int i3 = i + 1;
                bArr[i2] = (byte) (((m8006a(charArray[i], i) << 4) | m8006a(charArray[i3], i3)) & 255);
                i2++;
                i = i3 + 1;
            }
            return bArr;
        }
        throw new RuntimeException("Odd number of characters.");
    }

    /* renamed from: a */
    public static byte[] m8013a(List list) {
        int size = list.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            byte[] bArr = (byte[]) list.get(i2);
            i += bArr != null ? bArr.length : 0;
        }
        if (i == 0) {
            return f12451b;
        }
        if (list.size() == 1) {
            return (byte[]) list.get(0);
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(i);
        int size2 = list.size();
        for (int i3 = 0; i3 < size2; i3++) {
            byte[] bArr2 = (byte[]) list.get(i3);
            if (bArr2 != null) {
                try {
                    byteArrayOutputStream.write(bArr2);
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
        return byteArrayOutputStream.toByteArray();
    }

    /* renamed from: a */
    public static byte[] m8014a(byte[] bArr, int i) {
        byte[][] bArr2 = new byte[2][];
        int i2 = 0;
        bArr2[0] = bArr;
        int length = bArr.length;
        if (length < i) {
            i2 = i - length;
        }
        bArr2[1] = m8011a(i2);
        return m8022b(bArr2);
    }

    /* renamed from: a */
    public static byte[] m8015a(int... iArr) {
        byte[] bArr = new byte[(iArr.length * 4)];
        for (int i = 0; i < iArr.length; i++) {
            int i2 = iArr[i];
            int i3 = i * 4;
            bArr[i3] = (byte) ((i2 >> 24) & 255);
            bArr[i3 + 1] = (byte) ((i2 >> 16) & 255);
            bArr[i3 + 2] = m8023c(i2);
            bArr[i3 + 3] = m8018b(i2);
        }
        return bArr;
    }

    /* renamed from: a */
    public static byte[] m8016a(Object... objArr) {
        int length = objArr.length;
        ArrayList arrayList = new ArrayList(length);
        for (Object obj : objArr) {
            if (obj != null) {
                if (obj instanceof Byte) {
                    arrayList.add(new byte[]{((Byte) obj).byteValue()});
                } else if (obj instanceof Short) {
                    short shortValue = ((Short) obj).shortValue();
                    arrayList.add(new byte[]{m8023c(shortValue), m8018b(shortValue)});
                } else if (obj instanceof Integer) {
                    arrayList.add(m8015a(((Integer) obj).intValue()));
                } else if (obj instanceof Long) {
                    long longValue = ((Long) obj).longValue();
                    arrayList.add(new byte[]{(byte) ((int) ((longValue >> 56) & 255)), (byte) ((int) ((longValue >> 48) & 255)), (byte) ((int) ((longValue >> 40) & 255)), (byte) ((int) ((longValue >> 32) & 255)), (byte) ((int) ((longValue >> 24) & 255)), (byte) ((int) ((longValue >> 16) & 255)), (byte) ((int) ((longValue >> 8) & 255)), (byte) ((int) (longValue & 255))});
                } else if (obj instanceof String) {
                    arrayList.add(m8012a((String) obj));
                } else if (obj instanceof List) {
                    Iterator it = ((List) obj).iterator();
                    while (it.hasNext()) {
                        arrayList.add(m8016a(it.next()));
                    }
                } else if (obj instanceof byte[]) {
                    arrayList.add((byte[]) obj);
                } else if (obj.getClass().isArray()) {
                    arrayList.add(m8016a((Object[]) obj));
                } else if (obj instanceof InputStream) {
                    arrayList.add(m8016a((InputStream) obj));
                } else {
                    String valueOf = String.valueOf(obj.getClass());
                    StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 28);
                    sb.append("Object of ");
                    sb.append(valueOf);
                    sb.append(" is not supported.");
                    throw new IllegalArgumentException(sb.toString());
                }
            }
        }
        return m8013a(arrayList);
    }

    /* renamed from: a */
    public static byte[] m8017a(byte[]... bArr) {
        int length = bArr.length;
        if (length == 0) {
            return f12451b;
        }
        byte[] bArr2 = new byte[bArr[0].length];
        int i = 0;
        while (i < length) {
            byte[] bArr3 = bArr[i];
            int length2 = bArr2.length;
            int length3 = bArr3.length;
            if (length2 == length3) {
                byte[] bArr4 = new byte[length2];
                for (int i2 = 0; i2 < bArr2.length; i2++) {
                    bArr4[i2] = (byte) (bArr2[i2] ^ bArr3[i2]);
                }
                i++;
                bArr2 = bArr4;
            } else {
                throw new IllegalArgumentException(String.format("Arrays lengths are not equal %d != %d", Integer.valueOf(length2), Integer.valueOf(length3)));
            }
        }
        return bArr2;
    }
}
