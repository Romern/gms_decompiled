package p000;

/* renamed from: bjh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bjh {
    /* renamed from: a */
    public static int m3190a(byte[] bArr, int i, int i2, int i3, bjg bjg) {
        int a;
        bjg bjg2 = new bjg();
        while (i < i2 && (a = m3191a(bArr, i, i2, bjg2)) != 0) {
            if (a == i3) {
                bjg.f3363b = bjg2.f3363b;
                bjg.f3364c = bjg2.f3364c;
                return i + bjg2.f3364c;
            }
            i += bjg2.f3364c;
            if (!bjg2.f3365d) {
                i += bjg2.f3363b;
            }
        }
        return -1;
    }

    /* renamed from: a */
    public static int m3191a(byte[] bArr, int i, int i2, bjg bjg) {
        boolean z;
        byte b;
        int i3;
        int i4;
        int i5;
        if (i < i2) {
            if ((bArr[i] & 32) == 32) {
                z = true;
            } else {
                z = false;
            }
            bjg.f3365d = z;
            int i6 = 0;
            while (true) {
                byte b2 = bArr[i];
                if (b2 == 0 || (b = b2 & 255) == 255) {
                    if (i >= bArr.length - 2) {
                        break;
                    }
                    i++;
                    i6++;
                } else {
                    if ((b2 & 31) == 31) {
                        bjg.f3362a = bji.m3195a(bArr, i);
                        i4 = i + 2;
                        i3 = i6 + 2;
                    } else {
                        i4 = i + 1;
                        bjg.f3362a = b;
                        i3 = i6 + 1;
                    }
                    byte b3 = bArr[i4];
                    if (b3 == -127) {
                        bjg.f3363b = bArr[i4 + 1] & 255;
                        i5 = i3 + 2;
                    } else if (b3 == -126) {
                        bjg.f3363b = bji.m3195a(bArr, i4 + 1);
                        i5 = i3 + 3;
                    } else {
                        bjg.f3363b = b3 & 255;
                        i5 = i3 + 1;
                    }
                    bjg.f3364c = i5;
                    return bjg.f3362a;
                }
            }
        }
        return 0;
    }
}
