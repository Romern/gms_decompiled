package p000;

/* renamed from: cz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class C0921cz {
    /* renamed from: a */
    static int m7967a(C1405ui uiVar, C0918cw cwVar, C0918cw cwVar2, int i) {
        int a = cwVar.mo8348a();
        int i2 = i - a;
        int size = (cwVar.size() - a) - cwVar.mo8349b();
        if (i2 >= 0 && i2 < size) {
            for (int i3 = 0; i3 < 30; i3++) {
                int i4 = i3 / 2;
                int i5 = 1;
                if (i3 % 2 == 1) {
                    i5 = -1;
                }
                int i6 = (i4 * i5) + i2;
                if (i6 >= 0 && i6 < cwVar.f12225g) {
                    try {
                        if (i6 < uiVar.f27252b) {
                            int i7 = uiVar.f27251a[i6];
                            int i8 = (i7 & 15) != 0 ? i7 >> 4 : -1;
                            if (i8 != -1) {
                                return i8 + cwVar2.f12220b;
                            }
                        } else {
                            throw new IndexOutOfBoundsException("Index out of bounds - passed position = " + i6 + ", old list size = " + uiVar.f27252b);
                        }
                    } catch (IndexOutOfBoundsException e) {
                    }
                }
            }
        }
        return Math.max(0, Math.min(i, cwVar2.size() - 1));
    }
}
