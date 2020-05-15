package p000;

/* renamed from: bubo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bubo {

    /* renamed from: a */
    public static final bubo f153255a = new bubo();

    /* renamed from: a */
    public static int m119297a(byte[] bArr, int i) {
        if (i + 1 <= bArr.length) {
            return bArr[i] & 255;
        }
        return -1;
    }

    /* renamed from: a */
    public static final double[] m119298a(int i, byte[] bArr, int i2) {
        byte b;
        int length = bArr.length;
        if (length < i2 + 3) {
            StringBuilder sb = new StringBuilder(32);
            sb.append("cellMapBytes length: ");
            sb.append(length);
            sb.toString();
            StringBuilder sb2 = new StringBuilder(27);
            sb2.append("current cursor: ");
            sb2.append(i2);
            sb2.toString();
            return null;
        }
        double[] dArr = new double[3];
        int i3 = i2 + 2;
        if (i3 <= length) {
            b = (bArr[i2 + 1] & 255) | ((bArr[i2] << 8) & 65280);
        } else {
            b = -1;
        }
        double[] dArr2 = new double[2];
        ayvd.m84903a((((long) i) << 41) | (((long) b) << 25) | 16777216, dArr2);
        dArr[0] = dArr2[0];
        dArr[1] = dArr2[1];
        double a = (double) m119297a(bArr, i3);
        Double.isNaN(a);
        dArr[2] = a / 10.0d;
        return dArr;
    }
}
