package p000;

import java.util.ArrayList;
import java.util.List;

/* renamed from: bhvj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bhvj implements bhve {

    /* renamed from: a */
    public static final int[] f119684a = {18, 19, 20, 21};

    /* renamed from: a */
    public final bhvi mo64339a(bhtx bhtx, List list) {
        bhuj.m101555a();
        List a = bhvc.m101600a(list.size());
        ArrayList arrayList = new ArrayList(list);
        for (int i = 0; i < arrayList.size(); i++) {
            bhue bhue = (bhue) a.get(i);
            bxvs bxvs = ((bhsu) arrayList.get(i)).f119498a.f157008m;
            if (bxvs.size() == f119684a.length) {
                int i2 = 0;
                while (true) {
                    int[] iArr = f119684a;
                    if (i2 >= iArr.length) {
                        break;
                    }
                    bhue.mo64306a(Integer.valueOf(iArr[i2]), (Float) bxvs.get(i2));
                    i2++;
                }
            }
        }
        return new bhvi(list, a);
    }

    /* renamed from: a */
    public final String mo64340a() {
        return "Popularity";
    }
}
