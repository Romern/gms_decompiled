package p000;

import java.util.ArrayList;

/* renamed from: fb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class C0980fb {

    /* renamed from: a */
    public final ArrayList f16185a = new ArrayList();

    /* renamed from: a */
    public final void mo10642a(C0981fc fcVar) {
        C0981fc fcVar2 = fcVar;
        this.f16185a.clear();
        for (int i = 1; i < fcVar2.f16249e; i++) {
            C0983fe feVar = fcVar2.f16251g.f16133a[i];
            for (int i2 = 0; i2 < 6; i2++) {
                feVar.f16361e[i2] = 0.0f;
            }
            feVar.f16361e[feVar.f16359c] = 1.0f;
            if (feVar.f16364h == 4) {
                this.f16185a.add(feVar);
            }
        }
        int size = this.f16185a.size();
        for (int i3 = 0; i3 < size; i3++) {
            C0983fe feVar2 = (C0983fe) this.f16185a.get(i3);
            int i4 = feVar2.f16358b;
            if (i4 != -1) {
                C0976ey eyVar = fcVar2.f16247c[i4].f16077d;
                int i5 = eyVar.f16011a;
                for (int i6 = 0; i6 < i5; i6++) {
                    C0983fe a = eyVar.mo10573a(i6);
                    if (a != null) {
                        float b = eyVar.mo10576b(i6);
                        for (int i7 = 0; i7 < 6; i7++) {
                            float[] fArr = a.f16361e;
                            fArr[i7] = fArr[i7] + (feVar2.f16361e[i7] * b);
                        }
                        if (!this.f16185a.contains(a)) {
                            this.f16185a.add(a);
                        }
                    }
                }
                for (int i8 = 0; i8 < 6; i8++) {
                    feVar2.f16361e[i8] = 0.0f;
                }
            }
        }
    }

    public final String toString() {
        int size = this.f16185a.size();
        String str = "Goal: ";
        for (int i = 0; i < size; i++) {
            C0983fe feVar = (C0983fe) this.f16185a.get(i);
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            String str2 = feVar + "[";
            for (int i2 = 0; i2 < feVar.f16361e.length; i2++) {
                String str3 = str2 + feVar.f16361e[i2];
                if (i2 < feVar.f16361e.length - 1) {
                    str2 = str3 + ", ";
                } else {
                    str2 = str3 + "] ";
                }
            }
            sb.append(str2);
            str = sb.toString();
        }
        return str;
    }
}
