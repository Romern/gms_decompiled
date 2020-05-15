package p000;

import java.lang.reflect.Array;
import java.util.HashMap;
import java.util.Map;

/* renamed from: bfdz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bfdz {

    /* renamed from: a */
    public final bfkf f113541a;

    /* renamed from: b */
    public final Map f113542b;

    public bfdz(String str, int i, int i2) {
        this.f113541a = new bfkf(i, i2, 300, 0);
        HashMap hashMap = new HashMap();
        this.f113542b = hashMap;
        hashMap.put(str, Integer.valueOf(i2));
    }

    /* renamed from: a */
    public final void mo61518a() {
        int i = -1;
        for (Integer num : this.f113542b.values()) {
            i = Math.max(i, num.intValue());
        }
        if (i > 0) {
            bfkf bfkf = this.f113541a;
            if (bfkf.f114285d.length != i) {
                long[] jArr = new long[i];
                int i2 = bfkf.f114282a;
                int[] iArr = new int[2];
                iArr[1] = i;
                iArr[0] = i2;
                float[][] fArr = (float[][]) Array.newInstance(float.class, iArr);
                int max = Math.max(0, bfkf.f114284c - i);
                int i3 = 0;
                while (true) {
                    int i4 = bfkf.f114284c;
                    if (max < i4) {
                        jArr[i3] = bfkf.mo61829a(max);
                        for (int i5 = 0; i5 < bfkf.f114282a; i5++) {
                            fArr[i5][i3] = bfkf.mo61826a(max, i5);
                        }
                        max++;
                        i3++;
                    } else {
                        bfkf.f114285d = jArr;
                        bfkf.f114286e = fArr;
                        bfkf.f114283b = 0;
                        bfkf.f114284c = Math.min(i4, i);
                        return;
                    }
                }
            }
        }
    }
}
