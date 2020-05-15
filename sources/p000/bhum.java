package p000;

import java.util.ArrayList;
import java.util.List;

/* renamed from: bhum */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bhum implements bhul {
    /* renamed from: a */
    public final String mo64321a() {
        return "LogReg";
    }

    /* renamed from: a */
    public final float[] mo64322a(bhun bhun, List list) {
        int size = list.size();
        if (size == 0) {
            bhuj.m101555a().mo64360b("No candidates to score");
            return new float[0];
        }
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            C1245ok okVar = new C1245ok();
            bhue bhue = (bhue) list.get(i);
            for (int i2 = 0; i2 < bhue.mo64305a(); i2++) {
                okVar.put(((Integer) bhue.f119618a.mo15620b(i2)).toString(), (Float) bhue.f119618a.mo15621c(i2));
            }
            arrayList.add(okVar);
        }
        float[] fArr = new float[size];
        for (int i3 = 0; i3 < size; i3++) {
            C1245ok okVar2 = (C1245ok) arrayList.get(i3);
            C1245ok okVar3 = bhun.f119642a;
            float f = 0.0f;
            for (int i4 = 0; i4 < okVar2.f26809h; i4++) {
                Float f2 = (Float) okVar3.get((String) okVar2.mo15620b(i4));
                if (f2 != null) {
                    f += f2.floatValue() * ((Float) okVar2.mo15621c(i4)).floatValue();
                }
            }
            fArr[i3] = f;
        }
        return fArr;
    }
}
