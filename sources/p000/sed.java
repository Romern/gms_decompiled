package p000;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

/* renamed from: sed */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class sed {
    /* renamed from: A */
    public static String[] m34989A(Parcel parcel, int i) {
        int a = m34997a(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (a == 0) {
            return null;
        }
        String[] createStringArray = parcel.createStringArray();
        parcel.setDataPosition(dataPosition + a);
        return createStringArray;
    }

    /* renamed from: B */
    public static ArrayList m34990B(Parcel parcel, int i) {
        int a = m34997a(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (a == 0) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        int readInt = parcel.readInt();
        for (int i2 = 0; i2 < readInt; i2++) {
            arrayList.add(Integer.valueOf(parcel.readInt()));
        }
        parcel.setDataPosition(dataPosition + a);
        return arrayList;
    }

    /* renamed from: C */
    public static ArrayList m34991C(Parcel parcel, int i) {
        int a = m34997a(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (a == 0) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        int readInt = parcel.readInt();
        for (int i2 = 0; i2 < readInt; i2++) {
            arrayList.add(Long.valueOf(parcel.readLong()));
        }
        parcel.setDataPosition(dataPosition + a);
        return arrayList;
    }

    /* renamed from: D */
    public static ArrayList m34992D(Parcel parcel, int i) {
        int a = m34997a(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (a == 0) {
            return null;
        }
        ArrayList<String> createStringArrayList = parcel.createStringArrayList();
        parcel.setDataPosition(dataPosition + a);
        return createStringArrayList;
    }

    /* renamed from: E */
    public static Parcel m34993E(Parcel parcel, int i) {
        int a = m34997a(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (a == 0) {
            return null;
        }
        Parcel obtain = Parcel.obtain();
        obtain.appendFrom(parcel, dataPosition, a);
        parcel.setDataPosition(dataPosition + a);
        return obtain;
    }

    /* renamed from: F */
    public static void m34994F(Parcel parcel, int i) {
        if (parcel.dataPosition() != i) {
            StringBuilder sb = new StringBuilder(37);
            sb.append("Overread allowed size end=");
            sb.append(i);
            throw new sec(sb.toString(), parcel);
        }
    }

    /* renamed from: a */
    public static int m34995a(int i) {
        return (char) i;
    }

    /* renamed from: c */
    public static ArrayList m35005c(Parcel parcel, int i, Parcelable.Creator creator) {
        int a = m34997a(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (a == 0) {
            return null;
        }
        ArrayList createTypedArrayList = parcel.createTypedArrayList(creator);
        parcel.setDataPosition(dataPosition + a);
        return createTypedArrayList;
    }

    /* renamed from: d */
    public static Boolean m35007d(Parcel parcel, int i) {
        int a = m34997a(parcel, i);
        if (a == 0) {
            return null;
        }
        m35003b(parcel, a, 4);
        return Boolean.valueOf(parcel.readInt() != 0);
    }

    /* renamed from: e */
    public static byte m35008e(Parcel parcel, int i) {
        m34999a(parcel, i, 4);
        return (byte) parcel.readInt();
    }

    /* renamed from: f */
    public static short m35009f(Parcel parcel, int i) {
        m34999a(parcel, i, 4);
        return (short) parcel.readInt();
    }

    /* renamed from: g */
    public static int m35010g(Parcel parcel, int i) {
        m34999a(parcel, i, 4);
        return parcel.readInt();
    }

    /* renamed from: h */
    public static Integer m35011h(Parcel parcel, int i) {
        int a = m34997a(parcel, i);
        if (a == 0) {
            return null;
        }
        m35003b(parcel, a, 4);
        return Integer.valueOf(parcel.readInt());
    }

    /* renamed from: i */
    public static long m35012i(Parcel parcel, int i) {
        m34999a(parcel, i, 8);
        return parcel.readLong();
    }

    /* renamed from: j */
    public static Long m35013j(Parcel parcel, int i) {
        int a = m34997a(parcel, i);
        if (a == 0) {
            return null;
        }
        m35003b(parcel, a, 8);
        return Long.valueOf(parcel.readLong());
    }

    /* renamed from: k */
    public static BigInteger m35014k(Parcel parcel, int i) {
        int a = m34997a(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (a == 0) {
            return null;
        }
        byte[] createByteArray = parcel.createByteArray();
        parcel.setDataPosition(dataPosition + a);
        return new BigInteger(createByteArray);
    }

    /* renamed from: l */
    public static float m35015l(Parcel parcel, int i) {
        m34999a(parcel, i, 4);
        return parcel.readFloat();
    }

    /* renamed from: m */
    public static Float m35016m(Parcel parcel, int i) {
        int a = m34997a(parcel, i);
        if (a == 0) {
            return null;
        }
        m35003b(parcel, a, 4);
        return Float.valueOf(parcel.readFloat());
    }

    /* renamed from: n */
    public static double m35017n(Parcel parcel, int i) {
        m34999a(parcel, i, 8);
        return parcel.readDouble();
    }

    /* renamed from: o */
    public static Double m35018o(Parcel parcel, int i) {
        int a = m34997a(parcel, i);
        if (a == 0) {
            return null;
        }
        m35003b(parcel, a, 8);
        return Double.valueOf(parcel.readDouble());
    }

    /* renamed from: p */
    public static BigDecimal m35019p(Parcel parcel, int i) {
        int a = m34997a(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (a == 0) {
            return null;
        }
        byte[] createByteArray = parcel.createByteArray();
        int readInt = parcel.readInt();
        parcel.setDataPosition(dataPosition + a);
        return new BigDecimal(new BigInteger(createByteArray), readInt);
    }

    /* renamed from: q */
    public static String m35020q(Parcel parcel, int i) {
        int a = m34997a(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (a == 0) {
            return null;
        }
        String readString = parcel.readString();
        parcel.setDataPosition(dataPosition + a);
        return readString;
    }

    /* renamed from: r */
    public static IBinder m35021r(Parcel parcel, int i) {
        int a = m34997a(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (a == 0) {
            return null;
        }
        IBinder readStrongBinder = parcel.readStrongBinder();
        parcel.setDataPosition(dataPosition + a);
        return readStrongBinder;
    }

    /* renamed from: s */
    public static Bundle m35022s(Parcel parcel, int i) {
        int a = m34997a(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (a == 0) {
            return null;
        }
        Bundle readBundle = parcel.readBundle();
        parcel.setDataPosition(dataPosition + a);
        return readBundle;
    }

    /* renamed from: t */
    public static byte[] m35023t(Parcel parcel, int i) {
        int a = m34997a(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (a == 0) {
            return null;
        }
        byte[] createByteArray = parcel.createByteArray();
        parcel.setDataPosition(dataPosition + a);
        return createByteArray;
    }

    /* renamed from: u */
    public static byte[][] m35024u(Parcel parcel, int i) {
        int a = m34997a(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (a == 0) {
            return null;
        }
        int readInt = parcel.readInt();
        byte[][] bArr = new byte[readInt][];
        for (int i2 = 0; i2 < readInt; i2++) {
            bArr[i2] = parcel.createByteArray();
        }
        parcel.setDataPosition(dataPosition + a);
        return bArr;
    }

    /* renamed from: v */
    public static boolean[] m35025v(Parcel parcel, int i) {
        int a = m34997a(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (a == 0) {
            return null;
        }
        boolean[] createBooleanArray = parcel.createBooleanArray();
        parcel.setDataPosition(dataPosition + a);
        return createBooleanArray;
    }

    /* renamed from: w */
    public static int[] m35026w(Parcel parcel, int i) {
        int a = m34997a(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (a == 0) {
            return null;
        }
        int[] createIntArray = parcel.createIntArray();
        parcel.setDataPosition(dataPosition + a);
        return createIntArray;
    }

    /* renamed from: x */
    public static long[] m35027x(Parcel parcel, int i) {
        int a = m34997a(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (a == 0) {
            return null;
        }
        long[] createLongArray = parcel.createLongArray();
        parcel.setDataPosition(dataPosition + a);
        return createLongArray;
    }

    /* renamed from: y */
    public static float[] m35028y(Parcel parcel, int i) {
        int a = m34997a(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (a == 0) {
            return null;
        }
        float[] createFloatArray = parcel.createFloatArray();
        parcel.setDataPosition(dataPosition + a);
        return createFloatArray;
    }

    /* renamed from: z */
    public static double[] m35029z(Parcel parcel, int i) {
        int a = m34997a(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (a == 0) {
            return null;
        }
        double[] createDoubleArray = parcel.createDoubleArray();
        parcel.setDataPosition(dataPosition + a);
        return createDoubleArray;
    }

    /* renamed from: a */
    public static int m34996a(Parcel parcel) {
        return parcel.readInt();
    }

    /* renamed from: b */
    public static int m35001b(Parcel parcel) {
        int readInt = parcel.readInt();
        int a = m34997a(parcel, readInt);
        int dataPosition = parcel.dataPosition();
        if (m34995a(readInt) != 20293) {
            String valueOf = String.valueOf(Integer.toHexString(readInt));
            throw new sec(valueOf.length() == 0 ? new String("Expected object header. Got 0x") : "Expected object header. Got 0x".concat(valueOf), parcel);
        }
        int i = a + dataPosition;
        if (i >= dataPosition && i <= parcel.dataSize()) {
            return i;
        }
        StringBuilder sb = new StringBuilder(54);
        sb.append("Size read is invalid start=");
        sb.append(dataPosition);
        sb.append(" end=");
        sb.append(i);
        throw new sec(sb.toString(), parcel);
    }

    /* renamed from: a */
    public static int m34997a(Parcel parcel, int i) {
        return (i & -65536) != -65536 ? (char) (i >> 16) : parcel.readInt();
    }

    /* renamed from: c */
    public static boolean m35006c(Parcel parcel, int i) {
        m34999a(parcel, i, 4);
        return parcel.readInt() != 0;
    }

    /* renamed from: a */
    public static Parcelable m34998a(Parcel parcel, int i, Parcelable.Creator creator) {
        int a = m34997a(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (a == 0) {
            return null;
        }
        Parcelable parcelable = (Parcelable) creator.createFromParcel(parcel);
        parcel.setDataPosition(dataPosition + a);
        return parcelable;
    }

    /* renamed from: b */
    public static void m35002b(Parcel parcel, int i) {
        parcel.setDataPosition(parcel.dataPosition() + m34997a(parcel, i));
    }

    /* renamed from: a */
    private static void m34999a(Parcel parcel, int i, int i2) {
        int a = m34997a(parcel, i);
        if (a != i2) {
            String hexString = Integer.toHexString(a);
            StringBuilder sb = new StringBuilder(String.valueOf(hexString).length() + 46);
            sb.append("Expected size ");
            sb.append(i2);
            sb.append(" got ");
            sb.append(a);
            sb.append(" (0x");
            sb.append(hexString);
            sb.append(")");
            throw new sec(sb.toString(), parcel);
        }
    }

    /* renamed from: b */
    private static void m35003b(Parcel parcel, int i, int i2) {
        if (i != i2) {
            String hexString = Integer.toHexString(i);
            StringBuilder sb = new StringBuilder(String.valueOf(hexString).length() + 46);
            sb.append("Expected size ");
            sb.append(i2);
            sb.append(" got ");
            sb.append(i);
            sb.append(" (0x");
            sb.append(hexString);
            sb.append(")");
            throw new sec(sb.toString(), parcel);
        }
    }

    /* renamed from: b */
    public static Object[] m35004b(Parcel parcel, int i, Parcelable.Creator creator) {
        int a = m34997a(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (a == 0) {
            return null;
        }
        Object[] createTypedArray = parcel.createTypedArray(creator);
        parcel.setDataPosition(dataPosition + a);
        return createTypedArray;
    }

    /* renamed from: a */
    public static void m35000a(Parcel parcel, int i, List list, ClassLoader classLoader) {
        int a = m34997a(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (a != 0) {
            parcel.readList(list, classLoader);
            parcel.setDataPosition(dataPosition + a);
        }
    }
}
