package p000;

import com.google.android.gms.location.WifiScan;

/* renamed from: bxbj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bxbj {
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00a9 A[LOOP:2: B:30:0x00a7->B:31:0x00a9, LOOP_END] */
    /* renamed from: a */
    public static WifiScan m122535a(bfnv bfnv) {
        int i;
        bfnv bfnv2 = bfnv;
        if (!bfnv.mo62004a()) {
            return null;
        }
        int b = bfnv.mo62006b();
        long d = bfnv.mo62009d();
        boolean f = bfnv.mo62013f();
        aeiw aeiw = (aeiw) aeiw.f63428a.getAndSet(null);
        if (aeiw != null) {
            aeiw.mo34191a(b, d, f);
        } else {
            aeiw = new aeiw(b, d, f);
        }
        if (f) {
            bfnz[] bfnzArr = bfnv2.f114516c;
            if (bfnzArr == null) {
                i = 0;
                while (i < b) {
                    aeiw.mo34192a(bfnv2.mo62003a(i), bfnv2.mo62005b(i), bfnv2.mo62008c(i));
                    i++;
                }
            } else {
                int i2 = 0;
                while (i2 < b) {
                    long a = bfnv2.mo62003a(i2);
                    int i3 = 0;
                    int i4 = 0;
                    int i5 = 0;
                    int i6 = 0;
                    int i7 = 0;
                    int i8 = 0;
                    while (i3 < bfnzArr.length && i4 == 0) {
                        bfnz bfnz = bfnzArr[i3];
                        bfnz[] bfnzArr2 = bfnzArr;
                        if (a == bfnz.f114529a) {
                            i4 = bfnz.f114536h;
                            i5 = bfnz.f114537i;
                            i6 = bfnz.f114533e * 10;
                            i7 = bfnz.f114534f * 10;
                            i8 = bfnz.f114538j;
                        }
                        i3++;
                        bfnzArr = bfnzArr2;
                    }
                    bfnz[] bfnzArr3 = bfnzArr;
                    if (i4 != 0) {
                        byte b2 = bfnv2.mo62005b(i2);
                        int c = bfnv2.mo62008c(i2);
                        if (aeiw.f63438k) {
                            aeiw.mo34192a(a, b2, c);
                            int i9 = aeiw.f63437j - 1;
                            aeiw.f63432e[i9] = i4;
                            aeiw.f63433f[i9] = i5;
                            aeiw.f63434g[i9] = i6;
                            aeiw.f63435h[i9] = i7;
                            aeiw.f63436i[i9] = i8;
                        } else {
                            throw new IllegalStateException("Cannot add RTT information");
                        }
                    } else {
                        aeiw.mo34192a(a, bfnv2.mo62005b(i2), bfnv2.mo62008c(i2));
                    }
                    i2++;
                    bfnzArr = bfnzArr3;
                }
            }
        } else {
            i = 0;
            while (i < b) {
            }
        }
        int i10 = aeiw.f63437j;
        long[] jArr = aeiw.f63430c;
        int length = jArr.length;
        if (i10 == length) {
            WifiScan wifiScan = new WifiScan(aeiw.f63429b, jArr, aeiw.f63431d, aeiw.f63432e, aeiw.f63433f, aeiw.f63434g, aeiw.f63435h, aeiw.f63436i);
            aeiw.f63430c = null;
            aeiw.f63431d = null;
            aeiw.f63428a.set(aeiw);
            return wifiScan;
        }
        StringBuilder sb = new StringBuilder(73);
        sb.append("Haven't filled devices yet, expected ");
        sb.append(length);
        sb.append(" but received ");
        sb.append(i10);
        throw new IllegalStateException(sb.toString());
    }
}
