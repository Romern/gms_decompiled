package p000;

import android.util.SparseArray;
import android.util.SparseIntArray;
import java.util.BitSet;
import java.util.Comparator;
import java.util.List;
import java.util.SortedMap;

/* renamed from: dit */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class dit implements Comparator {

    /* renamed from: a */
    private final SparseIntArray f13267a;

    public dit(diu diu, SparseArray sparseArray, SortedMap sortedMap) {
        boolean z;
        boolean z2;
        int size = sparseArray.size();
        SparseArray sparseArray2 = new SparseArray(size);
        for (int i = 0; i < size; i++) {
            int keyAt = sparseArray.keyAt(i);
            List<dmo> list = (List) sparseArray.valueAt(i);
            bmzs.m108696a(list);
            BitSet bitSet = new BitSet();
            for (dmo dmo : list) {
                djn djn = (djn) sortedMap.get(dmo);
                bmzs.m108696a(djn);
                bitSet.set(diu.mo9101a(djn));
            }
            sparseArray2.append(keyAt, bitSet);
        }
        this.f13267a = new SparseIntArray(size);
        int i2 = 0;
        while (this.f13267a.size() < size) {
            int size2 = sparseArray2.size();
            boolean z3 = false;
            for (int i3 = 0; i3 < size2; i3++) {
                int keyAt2 = sparseArray2.keyAt(i3);
                BitSet bitSet2 = (BitSet) sparseArray2.valueAt(i3);
                if (bitSet2 == null || !bitSet2.isEmpty()) {
                    z = false;
                } else {
                    z = true;
                }
                if (bitSet2 == null || bitSet2.cardinality() != 1 || !bitSet2.get(keyAt2)) {
                    z2 = false;
                } else {
                    z2 = true;
                }
                if (z || z2) {
                    sparseArray2.setValueAt(i3, null);
                    int i4 = i2 + 1;
                    this.f13267a.append(keyAt2, i2);
                    int size3 = sparseArray2.size();
                    for (int i5 = 0; i5 < size3; i5++) {
                        BitSet bitSet3 = (BitSet) sparseArray2.valueAt(i5);
                        if (bitSet3 != null) {
                            bitSet3.clear(keyAt2);
                        }
                    }
                    i2 = i4;
                    z3 = true;
                }
            }
            bmzs.m108698a(z3);
        }
    }

    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        diq diq = (diq) obj2;
        int i = this.f13267a.get(((diq) obj).f13263b, -1);
        boolean z = true;
        bmzs.m108698a(i >= 0);
        int i2 = this.f13267a.get(diq.f13263b, -1);
        if (i2 < 0) {
            z = false;
        }
        bmzs.m108698a(z);
        return i2 - i;
    }
}
