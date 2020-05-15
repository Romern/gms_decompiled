package p000;

import java.util.List;

/* renamed from: bhwx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bhwx {

    /* renamed from: a */
    public final bicy f119761a;

    public bhwx(bicy bicy) {
        this.f119761a = bicy;
    }

    /* renamed from: a */
    public static final float[] m101676a(float[] fArr) {
        int length = fArr.length;
        if (length == 0) {
            return new float[0];
        }
        float[] fArr2 = new float[length];
        float f = fArr[0];
        for (int i = 1; i < length; i++) {
            float f2 = fArr[i];
            if (f2 > f) {
                f = f2;
            }
        }
        float[] fArr3 = new float[length];
        float f3 = 0.0f;
        for (int i2 = 0; i2 < length; i2++) {
            float exp = (float) Math.exp((double) (fArr[i2] - f));
            fArr3[i2] = exp;
            f3 += exp;
        }
        for (int i3 = 0; i3 < length; i3++) {
            float f4 = fArr3[i3];
            if (f4 == 0.0f) {
                fArr2[i3] = 0.0f;
            } else {
                fArr2[i3] = f4 / f3;
            }
        }
        return fArr2;
    }

    /* renamed from: a */
    public final float mo64371a(long j, float f, float f2, C1245ok okVar) {
        float f3 = f2 * f;
        Long valueOf = Long.valueOf(j);
        if (okVar.containsKey(valueOf)) {
            for (bhww bhww : (List) okVar.get(valueOf)) {
                bhww.f119760c = mo64371a(bhww.f119758a.mo64234h(), f3, bhww.f119760c, okVar);
            }
        }
        return f3;
    }

    /* renamed from: a */
    public final void mo64372a(bhww bhww, C1245ok okVar) {
        List<bhww> list;
        if (bhww != null && (list = (List) okVar.get(Long.valueOf(bhww.f119758a.mo64234h()))) != null && list.size() != 0) {
            float f = bhww.f119759b;
            for (bhww bhww2 : list) {
                mo64372a(bhww2, okVar);
                float f2 = bhww2.f119759b;
                if (f2 > f) {
                    f = f2;
                }
            }
            bhww.f119759b = f;
        }
    }
}
