package com.google.android.gms.phenotype;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class ExperimentTokens extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new andx();

    /* renamed from: a */
    public static final ExperimentTokens f82082a;

    /* renamed from: k */
    private static final byte[][] f82083k = new byte[0][];

    /* renamed from: l */
    private static final andw f82084l = new ands();

    /* renamed from: m */
    private static final andw f82085m = new andt();

    /* renamed from: n */
    private static final andw f82086n = new andu();

    /* renamed from: o */
    private static final andw f82087o = new andv();

    /* renamed from: b */
    public final String f82088b;

    /* renamed from: c */
    public final byte[] f82089c;

    /* renamed from: d */
    public final byte[][] f82090d;

    /* renamed from: e */
    public final byte[][] f82091e;

    /* renamed from: f */
    public final byte[][] f82092f;

    /* renamed from: g */
    public final byte[][] f82093g;

    /* renamed from: h */
    public final int[] f82094h;

    /* renamed from: i */
    public final byte[][] f82095i;

    /* renamed from: j */
    public final int[] f82096j;

    static {
        byte[][] bArr = f82083k;
        f82082a = new ExperimentTokens("", null, bArr, bArr, bArr, bArr, null, null, null);
    }

    public ExperimentTokens(String str, byte[] bArr, byte[][] bArr2, byte[][] bArr3, byte[][] bArr4, byte[][] bArr5, int[] iArr, byte[][] bArr6, int[] iArr2) {
        this.f82088b = str;
        this.f82089c = bArr;
        this.f82090d = bArr2;
        this.f82091e = bArr3;
        this.f82092f = bArr4;
        this.f82093g = bArr5;
        this.f82094h = iArr;
        this.f82095i = bArr6;
        this.f82096j = iArr2;
    }

    /* renamed from: a */
    public static int m68217a(byte[][] bArr) {
        if (bArr == null) {
            return 0;
        }
        int i = 0;
        for (byte[] bArr2 : bArr) {
            if (bArr2 != null) {
                i += bArr2.length;
            }
        }
        return i;
    }

    /* renamed from: b */
    private static List m68227b(int[] iArr) {
        if (iArr == null) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList(iArr.length >> 1);
        for (int i = 0; i < iArr.length; i += 2) {
            arrayList.add(new GenericDimension(iArr[i], iArr[i + 1]));
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    /* renamed from: c */
    private static int[] m68230c(DataInputStream dataInputStream) {
        int readInt = dataInputStream.readInt();
        if (readInt == 0) {
            return null;
        }
        int[] iArr = new int[readInt];
        for (int i = 0; i < readInt; i++) {
            iArr[i] = dataInputStream.readInt();
        }
        return iArr;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ExperimentTokens) {
            ExperimentTokens experimentTokens = (ExperimentTokens) obj;
            if (!anez.m64128a(this.f82088b, experimentTokens.f82088b) || !Arrays.equals(this.f82089c, experimentTokens.f82089c) || !anez.m64128a(m68228b(this.f82090d), m68228b(experimentTokens.f82090d)) || !anez.m64128a(m68228b(this.f82091e), m68228b(experimentTokens.f82091e)) || !anez.m64128a(m68228b(this.f82092f), m68228b(experimentTokens.f82092f)) || !anez.m64128a(m68228b(this.f82093g), m68228b(experimentTokens.f82093g)) || !anez.m64128a(m68220a(this.f82094h), m68220a(experimentTokens.f82094h)) || !anez.m64128a(m68228b(this.f82095i), m68228b(experimentTokens.f82095i)) || !anez.m64128a(m68227b(this.f82096j), m68227b(experimentTokens.f82096j))) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("ExperimentTokens");
        sb.append("(");
        String str2 = this.f82088b;
        if (str2 != null) {
            StringBuilder sb2 = new StringBuilder(str2.length() + 2);
            sb2.append("'");
            sb2.append(str2);
            sb2.append("'");
            str = sb2.toString();
        } else {
            str = "null";
        }
        sb.append(str);
        byte[] bArr = this.f82089c;
        sb.append(", direct==");
        if (bArr == null) {
            sb.append("null");
        } else {
            sb.append("'");
            sb.append(Base64.encodeToString(bArr, 3));
            sb.append("'");
        }
        sb.append(", ");
        m68221a(sb, "GAIA=", this.f82090d);
        sb.append(", ");
        m68221a(sb, "PSEUDO=", this.f82091e);
        sb.append(", ");
        m68221a(sb, "ALWAYS=", this.f82092f);
        sb.append(", ");
        m68221a(sb, "OTHER=", this.f82093g);
        sb.append(", weak=");
        sb.append(Arrays.toString(this.f82094h));
        sb.append(", ");
        m68221a(sb, "directs=", this.f82095i);
        sb.append(", genDims=");
        sb.append(Arrays.toString(m68227b(this.f82096j).toArray()));
        sb.append(")");
        return sb.toString();
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: see.a(android.os.Parcel, int, java.lang.String, boolean):void
     arg types: [android.os.Parcel, int, java.lang.String, int]
     candidates:
      see.a(android.os.Parcel, int, android.os.Bundle, boolean):void
      see.a(android.os.Parcel, int, android.os.Parcel, boolean):void
      see.a(android.os.Parcel, int, java.math.BigDecimal, boolean):void
      see.a(android.os.Parcel, int, java.util.List, boolean):void
      see.a(android.os.Parcel, int, byte[], boolean):void
      see.a(android.os.Parcel, int, double[], boolean):void
      see.a(android.os.Parcel, int, float[], boolean):void
      see.a(android.os.Parcel, int, int[], boolean):void
      see.a(android.os.Parcel, int, long[], boolean):void
      see.a(android.os.Parcel, int, android.os.Parcelable[], int):void
      see.a(android.os.Parcel, int, java.lang.String[], boolean):void
      see.a(android.os.Parcel, int, boolean[], boolean):void
      see.a(android.os.Parcel, int, java.lang.String, boolean):void */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: see.a(android.os.Parcel, int, byte[], boolean):void
     arg types: [android.os.Parcel, int, byte[], int]
     candidates:
      see.a(android.os.Parcel, int, android.os.Bundle, boolean):void
      see.a(android.os.Parcel, int, android.os.Parcel, boolean):void
      see.a(android.os.Parcel, int, java.lang.String, boolean):void
      see.a(android.os.Parcel, int, java.math.BigDecimal, boolean):void
      see.a(android.os.Parcel, int, java.util.List, boolean):void
      see.a(android.os.Parcel, int, double[], boolean):void
      see.a(android.os.Parcel, int, float[], boolean):void
      see.a(android.os.Parcel, int, int[], boolean):void
      see.a(android.os.Parcel, int, long[], boolean):void
      see.a(android.os.Parcel, int, android.os.Parcelable[], int):void
      see.a(android.os.Parcel, int, java.lang.String[], boolean):void
      see.a(android.os.Parcel, int, boolean[], boolean):void
      see.a(android.os.Parcel, int, byte[], boolean):void */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: see.a(android.os.Parcel, int, int[], boolean):void
     arg types: [android.os.Parcel, int, int[], int]
     candidates:
      see.a(android.os.Parcel, int, android.os.Bundle, boolean):void
      see.a(android.os.Parcel, int, android.os.Parcel, boolean):void
      see.a(android.os.Parcel, int, java.lang.String, boolean):void
      see.a(android.os.Parcel, int, java.math.BigDecimal, boolean):void
      see.a(android.os.Parcel, int, java.util.List, boolean):void
      see.a(android.os.Parcel, int, byte[], boolean):void
      see.a(android.os.Parcel, int, double[], boolean):void
      see.a(android.os.Parcel, int, float[], boolean):void
      see.a(android.os.Parcel, int, long[], boolean):void
      see.a(android.os.Parcel, int, android.os.Parcelable[], int):void
      see.a(android.os.Parcel, int, java.lang.String[], boolean):void
      see.a(android.os.Parcel, int, boolean[], boolean):void
      see.a(android.os.Parcel, int, int[], boolean):void */
    public final void writeToParcel(Parcel parcel, int i) {
        int a = see.m35030a(parcel);
        see.m35046a(parcel, 2, this.f82088b, false);
        see.m35052a(parcel, 3, this.f82089c, false);
        see.m35060a(parcel, 4, this.f82090d);
        see.m35060a(parcel, 5, this.f82091e);
        see.m35060a(parcel, 6, this.f82092f);
        see.m35060a(parcel, 7, this.f82093g);
        see.m35055a(parcel, 8, this.f82094h, false);
        see.m35060a(parcel, 9, this.f82095i);
        see.m35055a(parcel, 10, this.f82096j, false);
        see.m35062b(parcel, a);
    }

    /* renamed from: a */
    public static ExperimentTokens m68218a(String str) {
        DataInputStream dataInputStream = new DataInputStream(new ByteArrayInputStream(Base64.decode(str, 0)));
        try {
            int readInt = dataInputStream.readInt();
            if (readInt != 1) {
                if (readInt != 2) {
                    StringBuilder sb = new StringBuilder(30);
                    sb.append("Unexpected version ");
                    sb.append(readInt);
                    throw new RuntimeException(sb.toString());
                }
            }
            return new ExperimentTokens(dataInputStream.readUTF(), m68225a(dataInputStream), m68229b(dataInputStream), m68229b(dataInputStream), m68229b(dataInputStream), m68229b(dataInputStream), m68230c(dataInputStream), m68229b(dataInputStream), readInt >= 2 ? m68230c(dataInputStream) : null);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: c */
    private static final int[] m68231c(int[] iArr) {
        int length;
        return (iArr == null || (length = iArr.length) == 0) ? iArr : Arrays.copyOf(iArr, length);
    }

    /* renamed from: b */
    private static List m68228b(byte[][] bArr) {
        if (bArr == null) {
            return Collections.emptyList();
        }
        int length = bArr.length;
        ArrayList arrayList = new ArrayList(length);
        for (byte[] bArr2 : bArr) {
            arrayList.add(Base64.encodeToString(bArr2, 3));
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    /* renamed from: c */
    private static final byte[][] m68232c(byte[][] bArr) {
        int length;
        int length2;
        if (bArr == null || (length = bArr.length) == 0) {
            return bArr;
        }
        byte[][] bArr2 = new byte[length][];
        for (int i = 0; i < bArr.length; i++) {
            byte[] bArr3 = bArr[i];
            if (bArr3 == null || (length2 = bArr3.length) == 0) {
                bArr2[i] = bArr3;
            } else {
                bArr2[i] = Arrays.copyOf(bArr3, length2);
            }
        }
        return bArr2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:0x0095  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00ba  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00cd  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x00f7  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x0113  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x0133  */
    /* renamed from: a */
    public static ExperimentTokens m68219a(List list) {
        String str;
        int size;
        int i;
        int size2;
        int i2;
        int size3;
        int i3;
        int size4;
        int i4;
        int size5;
        int i5;
        int size6;
        int i6;
        int[] iArr;
        int[] iArr2;
        byte[][] bArr;
        byte[] bArr2;
        byte[][] bArr3;
        int[] iArr3;
        int[] iArr4;
        List list2 = list;
        int i7 = 0;
        if (list.size() == 1) {
            return (ExperimentTokens) list2.get(0);
        }
        if (!list.isEmpty()) {
            String str2 = ((ExperimentTokens) list2.get(0)).f82088b;
            int size7 = list.size();
            int i8 = 0;
            while (true) {
                if (i8 >= size7) {
                    break;
                }
                int i9 = i8 + 1;
                if (!anez.m64128a(str2, ((ExperimentTokens) list2.get(i8)).f82088b)) {
                    break;
                }
                i8 = i9;
            }
            str = "";
            byte[][] a = m68226a(list2, f82084l);
            byte[][] a2 = m68226a(list2, f82085m);
            byte[][] a3 = m68226a(list2, f82086n);
            byte[][] a4 = m68226a(list2, f82087o);
            size = list.size();
            i = 0;
            int i10 = 0;
            while (i < size) {
                ExperimentTokens experimentTokens = (ExperimentTokens) list2.get(i);
                if (!(experimentTokens == null || (iArr4 = experimentTokens.f82094h) == null)) {
                    i10 += iArr4.length;
                }
                i++;
                i7 = 0;
            }
            int[] iArr5 = new int[i10];
            size2 = list.size();
            i2 = 0;
            int i11 = 0;
            while (i2 < size2) {
                ExperimentTokens experimentTokens2 = (ExperimentTokens) list2.get(i2);
                if (!(experimentTokens2 == null || (iArr3 = experimentTokens2.f82094h) == null)) {
                    int length = iArr3.length;
                    int i12 = 0;
                    while (i12 < length) {
                        iArr5[i11] = iArr3[i12];
                        i12++;
                        i11++;
                    }
                }
                i2++;
                i7 = 0;
            }
            size3 = list.size();
            i3 = 0;
            int i13 = 0;
            while (i3 < size3) {
                ExperimentTokens experimentTokens3 = (ExperimentTokens) list2.get(i3);
                if (!(experimentTokens3 == null || experimentTokens3.f82089c == null)) {
                    i13++;
                }
                if (!(experimentTokens3 == null || (bArr3 = experimentTokens3.f82095i) == null)) {
                    i13 += bArr3.length;
                }
                i3++;
                i7 = 0;
            }
            byte[][] bArr4 = new byte[i13][];
            size4 = list.size();
            i4 = 0;
            int i14 = 0;
            while (i4 < size4) {
                ExperimentTokens experimentTokens4 = (ExperimentTokens) list2.get(i4);
                if (!(experimentTokens4 == null || (bArr2 = experimentTokens4.f82089c) == null)) {
                    bArr4[i14] = bArr2;
                    i14++;
                }
                if (!(experimentTokens4 == null || (bArr = experimentTokens4.f82095i) == null)) {
                    int length2 = bArr.length;
                    int i15 = 0;
                    while (i15 < length2) {
                        bArr4[i14] = bArr[i15];
                        i15++;
                        i14++;
                    }
                }
                i4++;
                i7 = 0;
            }
            size5 = list.size();
            i5 = 0;
            int i16 = 0;
            while (i5 < size5) {
                ExperimentTokens experimentTokens5 = (ExperimentTokens) list2.get(i5);
                if (!(experimentTokens5 == null || (iArr2 = experimentTokens5.f82096j) == null)) {
                    i16 += iArr2.length;
                }
                i5++;
                i7 = 0;
            }
            int[] iArr6 = new int[i16];
            size6 = list.size();
            i6 = 0;
            int i17 = 0;
            while (i6 < size6) {
                ExperimentTokens experimentTokens6 = (ExperimentTokens) list2.get(i6);
                if (!(experimentTokens6 == null || (iArr = experimentTokens6.f82096j) == null)) {
                    int length3 = iArr.length;
                    while (i7 < length3) {
                        iArr6[i17] = iArr[i7];
                        i7++;
                        i17++;
                    }
                }
                i6++;
                i7 = 0;
            }
            return new ExperimentTokens(str, null, a, a2, a3, a4, iArr5, bArr4, iArr6);
        }
        if (!list.isEmpty()) {
            str = ((ExperimentTokens) list2.get(0)).f82088b;
            byte[][] a5 = m68226a(list2, f82084l);
            byte[][] a22 = m68226a(list2, f82085m);
            byte[][] a32 = m68226a(list2, f82086n);
            byte[][] a42 = m68226a(list2, f82087o);
            size = list.size();
            i = 0;
            int i102 = 0;
            while (i < size) {
            }
            int[] iArr52 = new int[i102];
            size2 = list.size();
            i2 = 0;
            int i112 = 0;
            while (i2 < size2) {
            }
            size3 = list.size();
            i3 = 0;
            int i132 = 0;
            while (i3 < size3) {
            }
            byte[][] bArr42 = new byte[i132][];
            size4 = list.size();
            i4 = 0;
            int i142 = 0;
            while (i4 < size4) {
            }
            size5 = list.size();
            i5 = 0;
            int i162 = 0;
            while (i5 < size5) {
            }
            int[] iArr62 = new int[i162];
            size6 = list.size();
            i6 = 0;
            int i172 = 0;
            while (i6 < size6) {
            }
            return new ExperimentTokens(str, null, a5, a22, a32, a42, iArr52, bArr42, iArr62);
        }
        str = "";
        byte[][] a52 = m68226a(list2, f82084l);
        byte[][] a222 = m68226a(list2, f82085m);
        byte[][] a322 = m68226a(list2, f82086n);
        byte[][] a422 = m68226a(list2, f82087o);
        size = list.size();
        i = 0;
        int i1022 = 0;
        while (i < size) {
        }
        int[] iArr522 = new int[i1022];
        size2 = list.size();
        i2 = 0;
        int i1122 = 0;
        while (i2 < size2) {
        }
        size3 = list.size();
        i3 = 0;
        int i1322 = 0;
        while (i3 < size3) {
        }
        byte[][] bArr422 = new byte[i1322][];
        size4 = list.size();
        i4 = 0;
        int i1422 = 0;
        while (i4 < size4) {
        }
        size5 = list.size();
        i5 = 0;
        int i1622 = 0;
        while (i5 < size5) {
        }
        int[] iArr622 = new int[i1622];
        size6 = list.size();
        i6 = 0;
        int i1722 = 0;
        while (i6 < size6) {
        }
        return new ExperimentTokens(str, null, a52, a222, a322, a422, iArr522, bArr422, iArr622);
    }

    /* renamed from: b */
    private static byte[][] m68229b(DataInputStream dataInputStream) {
        int readInt = dataInputStream.readInt();
        if (readInt == 0) {
            return null;
        }
        byte[][] bArr = new byte[readInt][];
        for (int i = 0; i < readInt; i++) {
            bArr[i] = m68225a(dataInputStream);
        }
        return bArr;
    }

    /* renamed from: b */
    public final String mo46493b() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
        try {
            dataOutputStream.writeInt(2);
            dataOutputStream.writeUTF(this.f82088b);
            m68222a(this.f82089c, dataOutputStream);
            m68224a(this.f82090d, dataOutputStream);
            m68224a(this.f82091e, dataOutputStream);
            m68224a(this.f82092f, dataOutputStream);
            m68224a(this.f82093g, dataOutputStream);
            m68223a(this.f82094h, dataOutputStream);
            m68224a(this.f82095i, dataOutputStream);
            m68223a(this.f82096j, dataOutputStream);
            dataOutputStream.flush();
            String encodeToString = Base64.encodeToString(byteArrayOutputStream.toByteArray(), 0);
            try {
                dataOutputStream.close();
                return encodeToString;
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        } catch (IOException e2) {
            throw new RuntimeException(e2);
        } catch (Throwable th) {
            try {
                dataOutputStream.close();
                throw th;
            } catch (IOException e3) {
                throw new RuntimeException(e3);
            }
        }
    }

    /* renamed from: a */
    private static List m68220a(int[] iArr) {
        if (iArr == null) {
            return Collections.emptyList();
        }
        int length = iArr.length;
        ArrayList arrayList = new ArrayList(length);
        for (int i : iArr) {
            arrayList.add(Integer.valueOf(i));
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    /* renamed from: a */
    private static void m68221a(StringBuilder sb, String str, byte[][] bArr) {
        sb.append(str);
        sb.append("=");
        if (bArr == null) {
            sb.append("null");
            return;
        }
        sb.append("(");
        int length = bArr.length;
        boolean z = true;
        int i = 0;
        while (i < length) {
            byte[] bArr2 = bArr[i];
            if (!z) {
                sb.append(", ");
            }
            sb.append("'");
            sb.append(Base64.encodeToString(bArr2, 3));
            sb.append("'");
            i++;
            z = false;
        }
        sb.append(")");
    }

    /* renamed from: a */
    private static final void m68222a(byte[] bArr, DataOutputStream dataOutputStream) {
        if (bArr != null) {
            int length = bArr.length;
            dataOutputStream.writeInt(length);
            dataOutputStream.write(bArr, 0, length);
            return;
        }
        dataOutputStream.writeInt(0);
    }

    /* renamed from: a */
    private static final void m68223a(int[] iArr, DataOutputStream dataOutputStream) {
        if (iArr != null) {
            dataOutputStream.writeInt(iArr.length);
            for (int i : iArr) {
                dataOutputStream.writeInt(i);
            }
            return;
        }
        dataOutputStream.writeInt(0);
    }

    /* renamed from: a */
    private static final void m68224a(byte[][] bArr, DataOutputStream dataOutputStream) {
        if (bArr != null) {
            dataOutputStream.writeInt(bArr.length);
            for (byte[] bArr2 : bArr) {
                m68222a(bArr2, dataOutputStream);
            }
            return;
        }
        dataOutputStream.writeInt(0);
    }

    /* renamed from: a */
    private static byte[] m68225a(DataInputStream dataInputStream) {
        int readInt = dataInputStream.readInt();
        if (readInt == 0) {
            return null;
        }
        byte[] bArr = new byte[readInt];
        dataInputStream.readFully(bArr);
        return bArr;
    }

    /* renamed from: a */
    private static byte[][] m68226a(List list, andw andw) {
        int size = list.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            ExperimentTokens experimentTokens = (ExperimentTokens) list.get(i2);
            if (!(experimentTokens == null || andw.mo41745a(experimentTokens) == null)) {
                i += andw.mo41745a(experimentTokens).length;
            }
        }
        byte[][] bArr = new byte[i][];
        int size2 = list.size();
        int i3 = 0;
        for (int i4 = 0; i4 < size2; i4++) {
            ExperimentTokens experimentTokens2 = (ExperimentTokens) list.get(i4);
            if (!(experimentTokens2 == null || andw.mo41745a(experimentTokens2) == null)) {
                byte[][] a = andw.mo41745a(experimentTokens2);
                int length = a.length;
                int i5 = 0;
                while (i5 < length) {
                    bArr[i3] = a[i5];
                    i5++;
                    i3++;
                }
            }
        }
        return bArr;
    }

    /* renamed from: a */
    public final ExperimentTokens mo46492a() {
        byte[] bArr;
        int length;
        String str = this.f82088b;
        byte[] bArr2 = this.f82089c;
        if (bArr2 == null || (length = bArr2.length) == 0) {
            bArr = bArr2;
        } else {
            bArr = Arrays.copyOf(bArr2, length);
        }
        return new ExperimentTokens(str, bArr, m68232c(this.f82090d), m68232c(this.f82091e), m68232c(this.f82092f), m68232c(this.f82093g), m68231c(this.f82094h), m68232c(this.f82095i), m68231c(this.f82096j));
    }
}
