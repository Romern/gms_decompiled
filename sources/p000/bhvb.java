package p000;

import java.util.List;

/* renamed from: bhvb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bhvb implements bhve {
    /* renamed from: a */
    public final bhvi mo64339a(bhtx bhtx, List list) {
        List list2 = list;
        bhub bhub = bhtx.f119580a;
        bhuj.m101555a();
        List a = bhvc.m101600a(list.size());
        bhub bhub2 = bhtx.f119580a;
        for (int i = 0; i < list.size(); i++) {
            bhsu bhsu = (bhsu) list2.get(i);
            bhue bhue = (bhue) a.get(i);
            bhue.mo64306a(14, Float.valueOf((float) bhub2.f119609e));
            int i2 = bhub2.f119607c;
            if (i2 >= 0) {
                bhue.mo64306a(27, Float.valueOf(bhvd.m101601a(((float) i2) / 1000.0f, 0.1f, 0.0f)));
            }
            double a2 = ayuo.m84843a(bhub2.f119605a, bhub2.f119606b, bhsu.mo64227b(), bhsu.mo64228c());
            bhue.mo64306a(28, Float.valueOf(bhvd.m101601a((float) (a2 / 1000.0d), 0.1f, 0.5f)));
            double d = a2 / 250.0d;
            float min = (float) Math.min(d, 1.0d);
            bhue.mo64306a(15, Float.valueOf(min));
            bhue.mo64306a(16, Float.valueOf(min * min));
            if (a2 > 250.0d) {
                bhue.mo64306a(13, Float.valueOf(1.0f));
            }
            bhue.mo64306a(17, Float.valueOf((float) Math.max(0.0d, 1.0d - d)));
        }
        return new bhvi(list2, a);
    }

    /* renamed from: a */
    public final String mo64340a() {
        return "Distance";
    }
}
