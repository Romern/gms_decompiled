package p000;

import java.math.BigInteger;

/* renamed from: bow */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bow {
    static {
        bow.class.getSimpleName();
        citv.m151011a(bow.class);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:38:0x009a, code lost:
        if (r0 == false) goto L_0x009c;
     */
    /* renamed from: a */
    public static int m3422a(boz boz, byte[] bArr) {
        Integer num;
        int i;
        int i2;
        byte[] bArr2;
        int i3;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boz boz2 = boz;
        byte[] bArr3 = bArr;
        byte[] bArr4 = null;
        try {
            i = boz2.f5299a;
            i2 = boz2.f5300b;
            bArr2 = new byte[i2];
            System.arraycopy(bArr3, i - 1, bArr2, 0, i2);
            BigInteger bigInteger = new BigInteger(1, bArr2);
            Object[] objArr = {"extractGPOData() - result {} in position {} length {} PDOL {}", bArr2, Integer.valueOf(i), Integer.valueOf(i2), bArr3};
            int i4 = cbd.f6383a;
            BigInteger and = boz2.f5302d[0].and(bigInteger);
            bos bos = boz2.f5303e;
            BigInteger[] bigIntegerArr = boz2.f5302d;
            Boolean bool = null;
            int i5 = 1;
            while (i5 < bigIntegerArr.length) {
                try {
                    int compareTo = and.compareTo(bigIntegerArr[i5]);
                    bos bos2 = bos.MATCH;
                    int ordinal = bos.ordinal();
                    if (ordinal == 0) {
                        if (compareTo == 0) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        bool = Boolean.valueOf(z4);
                        if (bool.booleanValue()) {
                            Object[] objArr2 = {bool, bos, bigIntegerArr, and};
                        } else {
                            i5++;
                        }
                    } else if (ordinal == 1) {
                        if (compareTo < 0) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        bool = Boolean.valueOf(z2);
                        z = bool.booleanValue();
                        Object[] objArr3 = {bool, bos, bigIntegerArr, and};
                    } else if (ordinal == 2) {
                        if (compareTo > 0) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        bool = Boolean.valueOf(z3);
                        try {
                            z = bool.booleanValue();
                            Object[] objArr4 = {bool, bos, bigIntegerArr, and};
                        } catch (Throwable th) {
                            th = th;
                            Object[] objArr5 = {bool, bos, bigIntegerArr, and};
                            throw th;
                        }
                    } else {
                        box box = box.LOOP_DETECTED;
                        throw new boy();
                    }
                    i3 = boz2.f5304f;
                } catch (Throwable th2) {
                    th = th2;
                    Object[] objArr52 = {bool, bos, bigIntegerArr, and};
                    throw th;
                }
            }
            Object[] objArr6 = {bool, bos, bigIntegerArr, and};
            i3 = boz2.f5305g;
            num = Integer.valueOf(i3);
            try {
                int intValue = num.intValue();
                Object[] objArr7 = {"apply() - result {} in {} {}", new byte[]{(byte) num.intValue()}, boz2, bArr3};
                return intValue;
            } catch (Throwable th3) {
                th = th3;
                Object[] objArr8 = new Object[4];
                objArr8[0] = "apply() - result {} in {} {}";
                if (num != null) {
                    bArr4 = new byte[]{(byte) num.intValue()};
                }
                objArr8[1] = bArr4;
                objArr8[2] = boz2;
                objArr8[3] = bArr3;
                int i6 = cbd.f6383a;
                throw th;
            }
        } catch (Exception e) {
            box box2 = box.LOOP_DETECTED;
            throw new boy(e);
        } catch (Throwable th4) {
            th = th4;
            num = null;
        }
    }
}
