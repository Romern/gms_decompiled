package p000;

import java.util.ArrayList;
import java.util.List;

/* renamed from: bfio */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bfio {

    /* renamed from: a */
    public final int f114022a;

    /* renamed from: b */
    public final bfim f114023b;

    public bfio(int i, int i2, Class cls) {
        this.f114023b = new bfim((i2 + i) - 1, cls);
        this.f114022a = i;
    }

    /* renamed from: a */
    public final List mo61735a(float[] fArr, int i, int i2) {
        bfim bfim = this.f114023b;
        bmxy.m108588a(true);
        bfim.mo61730a(i, i2, fArr.length);
        for (int i3 = 0; i3 < i2; i3++) {
            bfim.f114018b[bfim.mo61729a(bfim.f114020d + i3)] = fArr[i + i3];
        }
        bfim.mo61731b(i2);
        ArrayList arrayList = new ArrayList();
        while (true) {
            bfim bfim2 = this.f114023b;
            int i4 = bfim2.f114020d;
            int i5 = this.f114022a;
            if (i4 < i5) {
                return arrayList;
            }
            float[] fArr2 = new float[i5];
            int min = Math.min(i5, i4);
            for (int i6 = 0; i6 < min; i6++) {
                fArr2[i6] = bfim2.f114018b[bfim2.mo61729a(i6)];
            }
            this.f114023b.mo61732c(i5);
            arrayList.add(fArr2);
        }
    }
}
