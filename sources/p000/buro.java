package p000;

import java.util.ArrayList;
import java.util.Collection;

/* renamed from: buro */
final /* synthetic */ class buro implements bmxj {

    /* renamed from: a */
    static final bmxj f154778a = new buro();

    private buro() {
    }

    public final Object apply(Object obj) {
        Collection<basd> collection = (Collection) obj;
        ArrayList arrayList = new ArrayList();
        if (collection != null) {
            for (basd basd : collection) {
                try {
                    ahzb ahzb = (ahzb) basd.mo55930a();
                    if (ahzb.f68450a == 2) {
                        ahza ahza = (ahza) ahzb.f68451b;
                        if ((ahza.f68443a & 1) != 0) {
                            arrayList.add(ahza);
                        }
                    }
                } catch (bxwf e) {
                    bnsl bnsl = (bnsl) busr.f154819a.mo68388c();
                    bnsl.mo68437a(e);
                    bnsl.mo68432a("buru", "a", 305, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                    bnsl.mo68405a("Footprints Manager: Failed to parse device");
                }
            }
        }
        return arrayList;
    }
}
