package p000;

import java.util.List;

/* renamed from: bhvg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bhvg implements bhve {
    /* renamed from: a */
    public final bhvi mo64339a(bhtx bhtx, List list) {
        bhuj.m101555a();
        List a = bhvc.m101600a(list.size());
        for (int i = 0; i < list.size(); i++) {
            bhsu bhsu = (bhsu) list.get(i);
            bhue bhue = (bhue) a.get(i);
            if (bhsu.mo64229d()) {
                bhue.mo64306a(7, Float.valueOf(1.0f));
            }
            if (bhsu.mo64230e()) {
                bhue.mo64306a(8, Float.valueOf(1.0f));
            }
            if (bhsu.mo64232f()) {
                bhue.mo64306a(9, Float.valueOf(1.0f));
            }
            if (bhsu.mo64233g()) {
                bhue.mo64306a(10, Float.valueOf(1.0f));
            }
            if (bhsu.mo64226a(4, 3)) {
                bhue.mo64306a(6, Float.valueOf(1.0f));
            }
            if (bhue.mo64305a() != 0) {
                bhuj.m101555a();
            }
        }
        return new bhvi(list, a);
    }

    /* renamed from: a */
    public final String mo64340a() {
        return "HomeWork";
    }
}
