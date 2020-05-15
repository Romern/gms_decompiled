package p000;

import android.util.SparseArray;
import android.util.SparseIntArray;

/* renamed from: bjim */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bjim {

    /* renamed from: a */
    private static final SparseArray f122794a = new SparseArray();

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        sparseIntArray.put(1, 1);
        sparseIntArray.put(2, 2);
        sparseIntArray.put(3, 2);
        sparseIntArray.put(4, 2);
        sparseIntArray.put(5, 80);
        sparseIntArray.put(6, 6);
        f122794a.put(0, sparseIntArray);
        SparseIntArray sparseIntArray2 = new SparseIntArray();
        sparseIntArray2.put(2, 2);
        sparseIntArray2.put(3, 2);
        sparseIntArray2.put(4, 2);
        sparseIntArray2.put(5, 2);
        sparseIntArray2.put(6, 2);
        f122794a.put(1, sparseIntArray2);
        SparseIntArray sparseIntArray3 = new SparseIntArray();
        sparseIntArray3.put(1, 5);
        sparseIntArray3.put(3, 3);
        sparseIntArray3.put(4, 64);
        sparseIntArray3.put(5, 5);
        sparseIntArray3.put(6, 5);
        f122794a.put(2, sparseIntArray3);
        SparseIntArray sparseIntArray4 = new SparseIntArray();
        sparseIntArray4.put(1, 4);
        sparseIntArray4.put(2, 4);
        sparseIntArray4.put(4, 4);
        sparseIntArray4.put(5, 4);
        sparseIntArray4.put(6, 4);
        f122794a.put(3, sparseIntArray4);
        SparseIntArray sparseIntArray5 = new SparseIntArray();
        sparseIntArray5.put(1, 5);
        sparseIntArray5.put(2, 5);
        sparseIntArray5.put(3, 3);
        sparseIntArray5.put(5, 5);
        sparseIntArray5.put(6, 5);
        f122794a.put(4, sparseIntArray5);
        SparseIntArray sparseIntArray6 = new SparseIntArray();
        sparseIntArray6.put(1, 1);
        sparseIntArray6.put(2, 1);
        sparseIntArray6.put(3, 1);
        sparseIntArray6.put(4, 1);
        sparseIntArray6.put(6, 6);
        f122794a.put(5, sparseIntArray6);
    }

    /* renamed from: a */
    public static void m103623a(bjil bjil, int i) {
        while (bjil.f122792n != i) {
            int i2 = ((SparseIntArray) f122794a.get(bjil.f122792n)).get(i, -1);
            if (i2 != -1) {
                switch (i2) {
                    case 0:
                        break;
                    case 1:
                        bjil.mo65292y();
                        break;
                    case 2:
                        bjil.mo65293z();
                        break;
                    case 3:
                        bjil.mo65280A();
                        break;
                    case 4:
                        bjil.mo65281B();
                        break;
                    case 5:
                        bjil.mo65282C();
                        break;
                    case 6:
                        bjil.mo65283D();
                        break;
                    default:
                        bjil.f122792n = i2 >> 4;
                        break;
                }
            } else {
                throw new IllegalArgumentException(String.format("Cannot transit to target state %s from current state %s.", Integer.valueOf(i), Integer.valueOf(bjil.f122792n)));
            }
        }
    }
}
