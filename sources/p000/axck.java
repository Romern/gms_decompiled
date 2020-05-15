package p000;

/* renamed from: axck */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class axck {
    /* renamed from: a */
    public static int m82310a(bwig bwig) {
        int i = bwig.f159632f;
        if (i == 0) {
            return 1;
        }
        return i;
    }

    /* renamed from: a */
    static int m82311a(bwig bwig, bwij bwij) {
        bxwc bxwc = bwij.f159640b;
        int size = bxwc.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            bwig bwig2 = (bwig) bxwc.get(i2);
            if (bwig2 == bwig) {
                return i;
            }
            i += m82310a(bwig2);
        }
        throw new IllegalArgumentException("Cell must be contained in row to getColumnOfCellInRow.");
    }
}
