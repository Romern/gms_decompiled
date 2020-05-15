package p000;

import com.google.autofill.detection.p098ml.AndroidInputTypeSignal;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/* renamed from: bhug */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bhug {

    /* renamed from: a */
    private static final int[] f119636a = {14, 11};

    /* JADX WARN: Type inference failed for: r6v1, types: [java.util.HashSet, java.util.Collection, java.util.Set], assign insn: 0x00d8: CONSTRUCTOR  (r6v1 ? I:java.util.HashSet) =  call: java.util.HashSet.<init>():void type: CONSTRUCTOR */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: a */
    public static List m101542a(bhub bhub, int i) {
        int i2;
        ArrayList arrayList = new ArrayList(160);
        int i3 = i + 15;
        double a = ayuo.m84842a(bhub.f119605a);
        double a2 = ayuo.m84842a(bhub.f119606b);
        long a3 = ayvd.m84899a(ayvd.m84896a(bhub.f119605a, bhub.f119606b), 15);
        long[] jArr = new long[8];
        ayvd.m84902a(a3, 15, jArr);
        long[] jArr2 = new long[36];
        int i4 = 0;
        while (true) {
            i2 = 4;
            if (i4 >= 4) {
                break;
            }
            jArr2[i4] = ayvd.m84912b(a3, i4);
            i4++;
        }
        int i5 = 0;
        while (i5 < 8 && jArr[i5] != 0) {
            for (int i6 = 0; i6 < 4; i6++) {
                jArr2[(i5 * 4) + 4 + i6] = ayvd.m84912b(jArr[i5], i6);
            }
            i5++;
        }
        long[] jArr3 = new long[AndroidInputTypeSignal.TYPE_TEXT_VARIATION_VISIBLE_PASSWORD];
        int i7 = 0;
        while (i7 < 36 && jArr2[i7] != 0) {
            for (int i8 = 0; i8 < 4; i8++) {
                jArr3[(i7 * 4) + i8] = ayvd.m84912b(jArr2[i7], i8);
            }
            i7++;
        }
        double[] dArr = new double[2];
        int i9 = 0;
        while (i9 < 144 && jArr3[i9] != 0) {
            int i10 = 0;
            while (i10 < i2) {
                long b = ayvd.m84912b(jArr3[i9], i10);
                ayvd.m84914b(b, dArr);
                long j = b;
                int i11 = i10;
                int i12 = i9;
                if (ayuo.m84841a(a, a2, dArr[0], dArr[1]) < ((double) i3)) {
                    arrayList.add(Long.valueOf(j));
                }
                i10 = i11 + 1;
                i9 = i12;
                i2 = 4;
            }
            i9++;
            i2 = 4;
        }
        int[] iArr = f119636a;
        int length = iArr.length;
        ArrayList<Long> arrayList2 = arrayList;
        int i13 = 0;
        while (i13 < length) {
            int i14 = iArr[i13];
            ? hashSet = new HashSet();
            for (Long l : arrayList2) {
                hashSet.add(Long.valueOf(ayvd.m84899a(l.longValue(), i14)));
            }
            arrayList.addAll(hashSet);
            i13++;
            arrayList2 = hashSet;
        }
        return arrayList;
    }
}
