package p000;

import com.felicanetworks.mfc.mfi.BaseMfiEventCallback;
import com.felicanetworks.mfc.mfi.MfiClientException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: bdlo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bdlo implements bdlq {

    /* renamed from: a */
    private static final int[] f105913a = {0, 4, 8, 10, 12, 14, 16, 18, 20, 25, 30, 40, 50, 60, 70, 80, 90, 100, MfiClientException.TYPE_MFICLIENT_REMOTE_ACCESS_FAILED, BaseMfiEventCallback.TYPE_UNKNOWN_ERROR, 300, 400, 500, 600, 700, 800, 900, 1000};

    /* renamed from: b */
    private final int[] f105914b = new int[f105913a.length];

    /* renamed from: c */
    private int f105915c;

    /* renamed from: d */
    private int f105916d;

    /* renamed from: e */
    private int f105917e;

    /* renamed from: f */
    private int f105918f;

    /* renamed from: a */
    public final void mo58150a(int i, int i2) {
        boolean z;
        if (i >= 0) {
            z = true;
        } else {
            z = false;
        }
        bmxy.m108588a(z);
        this.f105916d++;
        if (i > i2) {
            this.f105915c++;
        }
        int[] iArr = this.f105914b;
        int binarySearch = Arrays.binarySearch(f105913a, i);
        if (binarySearch < 0) {
            binarySearch = -(binarySearch + 2);
        }
        iArr[binarySearch] = iArr[binarySearch] + 1;
        this.f105917e = Math.max(this.f105917e, i);
        this.f105918f += i;
    }

    /* renamed from: a */
    public final boolean mo58151a() {
        return this.f105916d != 0;
    }

    /* renamed from: b */
    public final cioi mo58152b() {
        Integer num;
        boolean z;
        if (!mo58151a()) {
            return null;
        }
        bxvd da = cioi.f191066h.mo74144da();
        int i = this.f105915c;
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        cioi cioi = (cioi) da.f164949b;
        int i2 = cioi.f191068a | 1;
        cioi.f191068a = i2;
        cioi.f191069b = i;
        int i3 = this.f105916d;
        int i4 = i2 | 2;
        cioi.f191068a = i4;
        cioi.f191070c = i3;
        int i5 = this.f105918f;
        int i6 = i4 | 8;
        cioi.f191068a = i6;
        cioi.f191072e = i5;
        int i7 = this.f105917e;
        cioi.f191068a = i6 | 4;
        cioi.f191071d = i7;
        int[] iArr = this.f105914b;
        ArrayList arrayList = new ArrayList();
        int i8 = 0;
        while (true) {
            int[] iArr2 = f105913a;
            if (i8 >= iArr2.length) {
                break;
            }
            if (iArr[i8] > 0) {
                int i9 = i8 + 1;
                int i10 = iArr[i8];
                int i11 = iArr2[i8];
                if (i9 != iArr2.length) {
                    num = Integer.valueOf(iArr2[i9] - 1);
                } else {
                    num = null;
                }
                if (i10 > 0) {
                    z = true;
                } else {
                    z = false;
                }
                bmxy.m108588a(z);
                bxvd da2 = cioh.f191060e.mo74144da();
                if (da2.f164950c) {
                    da2.mo74035c();
                    da2.f164950c = false;
                }
                cioh cioh = (cioh) da2.f164949b;
                int i12 = cioh.f191062a | 2;
                cioh.f191062a = i12;
                cioh.f191064c = i11;
                cioh.f191062a = i12 | 1;
                cioh.f191063b = i10;
                if (num != null) {
                    int intValue = num.intValue();
                    if (da2.f164950c) {
                        da2.mo74035c();
                        da2.f164950c = false;
                    }
                    cioh cioh2 = (cioh) da2.f164949b;
                    cioh2.f191062a |= 4;
                    cioh2.f191065d = intValue;
                }
                arrayList.add((cioh) da2.mo74062i());
            }
            i8++;
        }
        List asList = Arrays.asList((cioh[]) arrayList.toArray(new cioh[0]));
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        cioi cioi2 = (cioi) da.f164949b;
        if (!cioi2.f191073f.mo73666a()) {
            cioi2.f191073f = bxvk.m124021a(cioi2.f191073f);
        }
        bxsy.m123078a(asList, cioi2.f191073f);
        return (cioi) da.mo74062i();
    }
}
