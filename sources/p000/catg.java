package p000;

import java.security.MessageDigest;
import java.util.Iterator;
import java.util.List;

/* renamed from: catg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class catg {
    /* renamed from: a */
    public static void m127157a(byte[] bArr, long j) {
        bArr[0] = (byte) ((int) ((j >> 24) & 255));
        bArr[1] = (byte) ((int) ((j >> 16) & 255));
        bArr[2] = (byte) ((int) ((j >> 8) & 255));
        bArr[3] = (byte) ((int) (j & 255));
    }

    /* renamed from: a */
    public static boolean m127158a(byte b) {
        byte b2 = b & 15;
        return b2 == 3 || b2 == 6;
    }

    /* renamed from: b */
    public static int m127163b(byte b) {
        return (((b & 240) >> 4) * 10) + (b & 15);
    }

    /* renamed from: c */
    public static void m127166c(byte[] bArr) {
        if (bArr != null) {
            int length = bArr.length;
            for (int i = 0; i < length; i++) {
                bArr[i] = 0;
            }
        }
    }

    /* renamed from: d */
    public static boolean m127168d(byte[] bArr) {
        if (bArr != null) {
            for (byte b : bArr) {
                if (b != 0) {
                    return false;
                }
            }
            return true;
        }
        throw new NullPointerException("Input data is null in isZero(...)");
    }

    /* renamed from: e */
    public static byte[] m127169e(byte[] bArr) {
        MessageDigest instance = MessageDigest.getInstance("SHA-1");
        instance.update(bArr);
        return instance.digest();
    }

    /* renamed from: b */
    public static String m127164b(byte[] bArr) {
        return new String(boan.f132472f.mo68794a(bArr)).toUpperCase();
    }

    /* renamed from: c */
    public static boolean m127167c(List list) {
        return list.contains(cash.MISSING_CD_CVM) || list.contains(cash.INSUFFICIENT_CD_CVM) || list.contains(cash.CREDENTIALS_NOT_ACCESSIBLE_WITHOUT_CVM);
    }

    /* renamed from: a */
    public static byte[] m127159a(int i) {
        byte[] bArr = new byte[i];
        System.arraycopy(new byte[0], 0, bArr, i, 0);
        return bArr;
    }

    /* renamed from: b */
    public static void m127165b(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            m127166c((byte[]) it.next());
        }
    }

    /* renamed from: a */
    public static byte[] m127160a(String str) {
        if (str == null || str.isEmpty() || str.equals("0x")) {
            return new byte[0];
        }
        if (str.startsWith("0x")) {
            str = str.substring(2);
        }
        if (str.length() % 2 != 0) {
            String valueOf = String.valueOf(str);
            str = valueOf.length() == 0 ? new String("0") : "0".concat(valueOf);
        }
        return boan.f132472f.mo68796b(str);
    }

    /* renamed from: a */
    public static byte[] m127161a(List list) {
        Iterator it = list.iterator();
        int i = 0;
        while (it.hasNext()) {
            i += ((byte[]) it.next()).length;
        }
        byte[] bArr = new byte[i];
        Iterator it2 = list.iterator();
        int i2 = 0;
        while (it2.hasNext()) {
            byte[] bArr2 = (byte[]) it2.next();
            int length = bArr2.length;
            System.arraycopy(bArr2, 0, bArr, i2, length);
            i2 += length;
        }
        return bArr;
    }

    /* renamed from: a */
    public static final byte[] m127162a(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        int length = bArr.length;
        byte[] bArr2 = new byte[length];
        System.arraycopy(bArr, 0, bArr2, 0, length);
        return bArr2;
    }
}
