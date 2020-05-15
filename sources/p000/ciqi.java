package p000;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* renamed from: ciqi */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ciqi extends AbstractList implements RandomAccess {

    /* renamed from: a */
    public final cipx[] f191240a;

    /* renamed from: b */
    public final int[] f191241b;

    private ciqi(cipx[] cipxArr, int[] iArr) {
        this.f191240a = cipxArr;
        this.f191241b = iArr;
    }

    /* renamed from: a */
    private static int m150840a(cipu cipu) {
        return (int) (cipu.f191213b / 4);
    }

    public final /* bridge */ /* synthetic */ Object get(int i) {
        return this.f191240a[i];
    }

    public final int size() {
        return this.f191240a.length;
    }

    /* renamed from: a */
    public static ciqi m150841a(cipx... cipxArr) {
        if (cipxArr.length == 0) {
            return new ciqi(new cipx[0], new int[]{0, -1});
        }
        ArrayList arrayList = new ArrayList(Arrays.asList(cipxArr));
        Collections.sort(arrayList);
        ArrayList arrayList2 = new ArrayList();
        for (int i = 0; i < arrayList.size(); i++) {
            arrayList2.add(-1);
        }
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            arrayList2.set(Collections.binarySearch(arrayList, cipxArr[i2]), Integer.valueOf(i2));
        }
        if (((cipx) arrayList.get(0)).mo86345e() != 0) {
            int i3 = 0;
            while (i3 < arrayList.size()) {
                cipx cipx = (cipx) arrayList.get(i3);
                int i4 = i3 + 1;
                int i5 = i4;
                while (i5 < arrayList.size()) {
                    cipx cipx2 = (cipx) arrayList.get(i5);
                    if (!cipx2.mo86339a(cipx)) {
                        continue;
                        break;
                    } else if (cipx2.mo86345e() == cipx.mo86345e()) {
                        String valueOf = String.valueOf(cipx2);
                        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 18);
                        sb.append("duplicate option: ");
                        sb.append(valueOf);
                        throw new IllegalArgumentException(sb.toString());
                    } else if (((Integer) arrayList2.get(i5)).intValue() > ((Integer) arrayList2.get(i3)).intValue()) {
                        arrayList.remove(i5);
                        arrayList2.remove(i5);
                    } else {
                        i5++;
                    }
                }
                i3 = i4;
            }
            cipu cipu = new cipu();
            m150842a(0, cipu, 0, arrayList, 0, arrayList.size(), arrayList2);
            int a = m150840a(cipu);
            int[] iArr = new int[a];
            for (int i6 = 0; i6 < a; i6++) {
                iArr[i6] = cipu.mo86312g();
            }
            if (cipu.mo86295b()) {
                return new ciqi((cipx[]) cipxArr.clone(), iArr);
            }
            throw new AssertionError();
        }
        throw new IllegalArgumentException("the empty byte string is not a supported option");
    }

    /* renamed from: a */
    private static void m150842a(long j, cipu cipu, int i, List list, int i2, int i3, List list2) {
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        cipu cipu2 = cipu;
        int i9 = i;
        List list3 = list;
        int i10 = i2;
        int i11 = i3;
        List list4 = list2;
        if (i10 < i11) {
            int i12 = i10;
            while (i12 < i11) {
                if (((cipx) list3.get(i12)).mo86345e() >= i9) {
                    i12++;
                } else {
                    throw new AssertionError();
                }
            }
            cipx cipx = (cipx) list.get(i2);
            cipx cipx2 = (cipx) list3.get(i11 - 1);
            if (i9 == cipx.mo86345e()) {
                int intValue = ((Integer) list4.get(i10)).intValue();
                int i13 = i10 + 1;
                i4 = i13;
                i5 = intValue;
                cipx = (cipx) list3.get(i13);
            } else {
                i5 = -1;
                i4 = i10;
            }
            if (cipx.mo86335a(i9) == cipx2.mo86335a(i9)) {
                int min = Math.min(cipx.mo86345e(), cipx2.mo86345e());
                int i14 = 0;
                int i15 = i9;
                while (i15 < min && cipx.mo86335a(i15) == cipx2.mo86335a(i15)) {
                    i14++;
                    i15++;
                }
                long a = 1 + j + ((long) m150840a(cipu)) + 2 + ((long) i14);
                cipu2.mo86304d(-i14);
                cipu2.mo86304d(i5);
                int i16 = i9;
                while (true) {
                    i8 = i9 + i14;
                    if (i16 >= i8) {
                        break;
                    }
                    cipu2.mo86304d((int) (cipx.mo86335a(i16) & 255));
                    i16++;
                }
                if (i4 + 1 != i11) {
                    cipu cipu3 = new cipu();
                    cipu2.mo86304d((int) (-(((long) m150840a(cipu3)) + a)));
                    m150842a(a, cipu3, i8, list, i4, i3, list2);
                    cipu2.mo74930a(cipu3, cipu3.f191213b);
                } else if (i8 == ((cipx) list3.get(i4)).mo86345e()) {
                    cipu2.mo86304d(((Integer) list4.get(i4)).intValue());
                } else {
                    throw new AssertionError();
                }
            } else {
                int i17 = 1;
                for (int i18 = i4 + 1; i18 < i11; i18++) {
                    if (((cipx) list3.get(i18 - 1)).mo86335a(i9) != ((cipx) list3.get(i18)).mo86335a(i9)) {
                        i17++;
                    }
                }
                long a2 = j + ((long) m150840a(cipu)) + 2 + ((long) (i17 + i17));
                cipu2.mo86304d(i17);
                cipu2.mo86304d(i5);
                for (int i19 = i4; i19 < i11; i19++) {
                    byte a3 = ((cipx) list3.get(i19)).mo86335a(i9);
                    if (i19 == i4 || a3 != ((cipx) list3.get(i19 - 1)).mo86335a(i9)) {
                        cipu2.mo86304d((int) (a3 & 255));
                    }
                }
                cipu cipu4 = new cipu();
                int i20 = i4;
                while (i20 < i11) {
                    byte a4 = ((cipx) list3.get(i20)).mo86335a(i9);
                    int i21 = i20 + 1;
                    int i22 = i21;
                    while (true) {
                        if (i22 < i11) {
                            if (a4 != ((cipx) list3.get(i22)).mo86335a(i9)) {
                                i6 = i22;
                                break;
                            }
                            i22++;
                        } else {
                            i6 = i11;
                            break;
                        }
                    }
                    if (i21 == i6 && i9 + 1 == ((cipx) list3.get(i20)).mo86345e()) {
                        cipu2.mo86304d(((Integer) list4.get(i20)).intValue());
                        i7 = i6;
                    } else {
                        cipu2.mo86304d((int) (-(((long) m150840a(cipu4)) + a2)));
                        i7 = i6;
                        m150842a(a2, cipu4, i9 + 1, list, i20, i6, list2);
                    }
                    i20 = i7;
                }
                cipu2.mo74930a(cipu4, cipu4.f191213b);
            }
        } else {
            throw new AssertionError();
        }
    }
}
