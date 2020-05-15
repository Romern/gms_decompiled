package p000;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: cvz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cvz {

    /* renamed from: a */
    private static final char[] f12216a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* renamed from: b */
    private static final byte[] f12217b = new byte[0];

    /* renamed from: c */
    private static final Charset f12218c = Charset.forName("US-ASCII");

    /* renamed from: a */
    public static byte m7699a(byte b, int i, boolean z) {
        if (i <= 0 || i > 8) {
            StringBuilder sb = new StringBuilder(62);
            sb.append("parameter 'bitPos' must be between 1 and 8. bitPos=");
            sb.append(i);
            throw new IllegalArgumentException(sb.toString());
        }
        int i2 = 1 << (i - 1);
        return (byte) (!z ? b & (i2 ^ -1) : b | i2);
    }

    /* renamed from: a */
    public static byte m7700a(int i) {
        return (byte) (i & 255);
    }

    /* renamed from: a */
    public static Object m7703a(Object obj, Object obj2) {
        return obj == null ? obj2 : obj;
    }

    /* renamed from: a */
    public static boolean m7707a(byte b, byte b2) {
        return (b & b2) != 0;
    }

    /* renamed from: b */
    public static byte m7717b(int i) {
        return (byte) ((i >> 8) & 255);
    }

    /* renamed from: c */
    public static int m7724c(byte... bArr) {
        return (bArr[3] & 255) | ((bArr[0] & 255) << 24) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8);
    }

    /* renamed from: d */
    public static long m7727d(byte... bArr) {
        return (((long) (bArr[0] & 255)) << 56) | (((long) (bArr[1] & 255)) << 48) | (((long) (bArr[2] & 255)) << 40) | (((long) (bArr[3] & 255)) << 32) | (((long) (bArr[4] & 255)) << 24) | (((long) (bArr[5] & 255)) << 16) | (((long) (bArr[6] & 255)) << 8) | ((long) (bArr[7] & 255));
    }

    /* renamed from: e */
    public static int m7729e(byte... bArr) {
        int length = bArr.length;
        if (length == 2) {
            return m7718b(bArr);
        }
        return length >= 2 ? m7718b(m7713a(bArr, length - 2, 2)) : m7718b(m7712a(bArr, 2));
    }

    /* renamed from: f */
    public static int m7731f(byte... bArr) {
        int length = bArr.length;
        return length == 4 ? m7724c(bArr) : length >= 4 ? m7724c(m7713a(bArr, length - 4, 4)) : m7724c(m7712a(bArr, 4));
    }

    /* renamed from: g */
    public static long m7732g(byte... bArr) {
        int length = bArr.length;
        return length == 8 ? m7727d(bArr) : length >= 8 ? m7727d(m7713a(bArr, length - 8, 8)) : m7727d(m7712a(bArr, 8));
    }

    /* renamed from: h */
    public static String m7733h(byte[] bArr) {
        int indexOf;
        if (bArr == null) {
            return null;
        }
        String a = m7704a(bArr);
        return (cwd.m7751a(a) || (indexOf = a.indexOf("F")) == -1) ? a : a.substring(0, indexOf);
    }

    /* renamed from: i */
    public static byte[] m7734i(byte[] bArr) {
        if (bArr != null) {
            return m7713a(bArr, 0, bArr.length);
        }
        throw new IllegalArgumentException("Argument 'array2Copy' cannot be null");
    }

    /* renamed from: j */
    public static byte[] m7735j(byte[] bArr) {
        if (bArr != null) {
            return (byte[]) bArr.clone();
        }
        return null;
    }

    /* renamed from: b */
    public static int m7718b(byte... bArr) {
        return (bArr[1] & 255) | ((bArr[0] & 255) << 8);
    }

    /* renamed from: c */
    public static byte[] m7725c(String str) {
        if (str != null) {
            return str.getBytes(f12218c);
        }
        return null;
    }

    /* renamed from: d */
    public static byte[] m7728d(String str) {
        if (str == null) {
            return null;
        }
        if (str.length() % 2 == 0) {
            return m7720b(str);
        }
        return m7720b(str.length() == 0 ? new String("0") : "0".concat(str));
    }

    /* renamed from: e */
    public static Byte m7730e(String str) {
        if (!cwd.m7751a((CharSequence) str)) {
            return Byte.valueOf(m7720b(cwd.m7754c(str, 2))[0]);
        }
        return null;
    }

    /* renamed from: a */
    private static int m7701a(char c, int i) {
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
    public static Map.Entry m7719b(Object obj, Object obj2) {
        return new cvy(obj, obj2);
    }

    /* renamed from: c */
    public static byte[] m7726c(Object... objArr) {
        byte[] b = m7722b(objArr);
        return m7723b(new byte[]{m7700a(b.length)}, b);
    }

    /* renamed from: b */
    public static byte[] m7720b(String str) {
        char[] charArray = str.toCharArray();
        int length = charArray.length;
        if ((length & 1) == 0) {
            byte[] bArr = new byte[(length >> 1)];
            int i = 0;
            int i2 = 0;
            while (i < length) {
                int i3 = i + 1;
                bArr[i2] = (byte) (((m7701a(charArray[i], i) << 4) | m7701a(charArray[i3], i3)) & 255);
                i2++;
                i = i3 + 1;
            }
            return bArr;
        }
        throw new RuntimeException("Odd number of characters.");
    }

    /* renamed from: a */
    public static int m7702a(InputStream inputStream) {
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

    /* renamed from: a */
    public static String m7704a(byte... bArr) {
        int length = bArr.length;
        char[] cArr = new char[(length + length)];
        int i = 0;
        for (int i2 = 0; i2 < length; i2++) {
            int i3 = i + 1;
            char[] cArr2 = f12216a;
            cArr[i] = cArr2[(bArr[i2] & 240) >>> 4];
            i = i3 + 1;
            cArr[i3] = cArr2[bArr[i2] & 15];
        }
        return new String(cArr);
    }

    /* renamed from: b */
    public static byte[] m7721b(byte[] bArr, int i) {
        byte[][] bArr2 = new byte[2][];
        bArr2[0] = bArr;
        int length = bArr.length;
        bArr2[1] = m7709a(length < i ? i - length : 0, (byte) 0);
        return m7723b(bArr2);
    }

    /* renamed from: b */
    public static byte[] m7722b(Object... objArr) {
        int length = objArr.length;
        ArrayList arrayList = new ArrayList(length);
        for (Object obj : objArr) {
            if (obj != null) {
                if (obj instanceof Byte) {
                    arrayList.add(new byte[]{((Byte) obj).byteValue()});
                } else if (obj instanceof Short) {
                    short shortValue = ((Short) obj).shortValue();
                    arrayList.add(new byte[]{m7717b(shortValue), m7700a(shortValue)});
                } else if (obj instanceof Integer) {
                    arrayList.add(m7714a(((Integer) obj).intValue()));
                } else if (obj instanceof Long) {
                    arrayList.add(m7715a(((Long) obj).longValue()));
                } else if (obj instanceof String) {
                    arrayList.add(m7720b((String) obj));
                } else if (obj instanceof List) {
                    Iterator it = ((List) obj).iterator();
                    while (it.hasNext()) {
                        arrayList.add(m7722b(it.next()));
                    }
                } else if (obj instanceof byte[]) {
                    arrayList.add((byte[]) obj);
                } else if (obj.getClass().isArray()) {
                    arrayList.add(m7722b((Object[]) obj));
                } else if (obj instanceof InputStream) {
                    arrayList.add(m7722b((InputStream) obj));
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
        return m7711a(arrayList);
    }

    @SafeVarargs
    /* renamed from: a */
    public static List m7705a(Object... objArr) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : objArr) {
            if (obj != null) {
                arrayList.add(obj);
            }
        }
        return Collections.unmodifiableList(arrayList);
    }

    @SafeVarargs
    /* renamed from: a */
    public static Map m7706a(Map.Entry... entryArr) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : entryArr) {
            if (entry != null) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        return linkedHashMap;
    }

    /* renamed from: b */
    public static byte[] m7723b(byte[]... bArr) {
        int length = bArr.length;
        int i = 0;
        for (int i2 = 0; i2 < length; i2++) {
            byte[] bArr2 = bArr[i2];
            i += bArr2 != null ? bArr2.length : 0;
        }
        if (i == 0) {
            return f12217b;
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
    public static boolean m7708a(byte b, int i) {
        if (i > 0 && i <= 8) {
            return ((b >>> (i + -1)) & 1) == 1;
        }
        StringBuilder sb = new StringBuilder(62);
        sb.append("parameter 'bitPos' must be between 1 and 8. bitPos=");
        sb.append(i);
        throw new IllegalArgumentException(sb.toString());
    }

    /* renamed from: a */
    public static byte[] m7709a(int i, byte b) {
        byte[] bArr;
        if (i <= 0) {
            bArr = f12217b;
        } else {
            bArr = new byte[i];
        }
        if (b != 0) {
            for (int i2 = 0; i2 < i; i2++) {
                bArr[i2] = b;
            }
        }
        return bArr;
    }

    /* renamed from: a */
    public static byte[] m7710a(String str) {
        if (str.length() % 2 == 0) {
            return m7720b(str);
        }
        String valueOf = String.valueOf(str);
        return m7720b(valueOf.length() == 0 ? new String("0") : "0".concat(valueOf));
    }

    /* renamed from: a */
    public static byte[] m7711a(List list) {
        int size = list.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            byte[] bArr = (byte[]) list.get(i2);
            i += bArr != null ? bArr.length : 0;
        }
        if (i == 0) {
            return f12217b;
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
    public static byte[] m7712a(byte[] bArr, int i) {
        byte[][] bArr2 = new byte[2][];
        int length = bArr.length;
        bArr2[0] = m7709a(length < i ? i - length : 0, (byte) 0);
        bArr2[1] = bArr;
        return m7723b(bArr2);
    }

    /* renamed from: a */
    public static byte[] m7713a(byte[] bArr, int i, int i2) {
        if (bArr != null) {
            int length = bArr.length;
            if (length >= i + i2) {
                byte[] bArr2 = new byte[i2];
                System.arraycopy(bArr, i, bArr2, 0, i2);
                return bArr2;
            }
            StringBuilder sb = new StringBuilder(73);
            sb.append("startPos(");
            sb.append(i);
            sb.append(")+length(");
            sb.append(i2);
            sb.append(") > byteArray.length(");
            sb.append(length);
            sb.append(")");
            throw new IllegalArgumentException(sb.toString());
        }
        throw new IllegalArgumentException("Argument 'array2Copy' cannot be null");
    }

    /* renamed from: a */
    public static byte[] m7714a(int... iArr) {
        byte[] bArr = new byte[(iArr.length * 4)];
        for (int i = 0; i < iArr.length; i++) {
            int i2 = iArr[i];
            int i3 = i * 4;
            bArr[i3] = (byte) ((i2 >> 24) & 255);
            bArr[i3 + 1] = (byte) ((i2 >> 16) & 255);
            bArr[i3 + 2] = m7717b(i2);
            bArr[i3 + 3] = m7700a(i2);
        }
        return bArr;
    }

    /* renamed from: a */
    public static byte[] m7715a(long... jArr) {
        byte[] bArr = new byte[(jArr.length * 8)];
        for (int i = 0; i < jArr.length; i++) {
            long j = jArr[i];
            int i2 = i * 8;
            bArr[i2] = (byte) ((int) ((j >> 56) & 255));
            bArr[i2 + 1] = (byte) ((int) ((j >> 48) & 255));
            bArr[i2 + 2] = (byte) ((int) ((j >> 40) & 255));
            bArr[i2 + 3] = (byte) ((int) ((j >> 32) & 255));
            bArr[i2 + 4] = (byte) ((int) ((j >> 24) & 255));
            bArr[i2 + 5] = (byte) ((int) ((j >> 16) & 255));
            bArr[i2 + 6] = (byte) ((int) ((j >> 8) & 255));
            bArr[i2 + 7] = (byte) ((int) (j & 255));
        }
        return bArr;
    }

    /* renamed from: a */
    public static byte[] m7716a(byte[]... bArr) {
        int length = bArr.length;
        if (length == 0) {
            return f12217b;
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
