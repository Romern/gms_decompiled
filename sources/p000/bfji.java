package p000;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: bfji */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bfji {
    /* renamed from: a */
    public static final float m97019a(List list, boolean z) {
        float f;
        int size = list.size();
        int i = 0;
        int i2 = 0;
        float f2 = 0.0f;
        while (true) {
            float f3 = 360.0f;
            if (i >= size) {
                break;
            }
            if (!z || i >= 3) {
                bsax bsax = (bsax) list.get(i);
                if (bsax.mo70138j(2) != 0) {
                    ArrayList arrayList = new ArrayList();
                    for (int i3 = 0; i3 < bsax.mo70138j(2); i3++) {
                        arrayList.add(Float.valueOf(bsax.mo70131f(2, i3).mo70126d(4)));
                    }
                    Collections.sort(arrayList);
                    int size2 = arrayList.size();
                    float f4 = 0.0f;
                    for (int i4 = 0; i4 < size2; i4++) {
                        if (i4 == 0) {
                            f = 360.0f - (((Float) arrayList.get(size2 - 1)).floatValue() - ((Float) arrayList.get(0)).floatValue());
                        } else {
                            f = ((Float) arrayList.get(i4)).floatValue() - ((Float) arrayList.get(i4 - 1)).floatValue();
                        }
                        if (f > f4) {
                            f4 = f;
                        }
                    }
                    f3 = f4;
                }
                f2 += f3;
                i2++;
            }
            i++;
        }
        if (i2 != 0) {
            return f2 / ((float) i2);
        }
        return 360.0f;
    }
}
