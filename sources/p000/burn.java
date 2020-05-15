package p000;

import java.util.ArrayList;
import java.util.Collection;

/* renamed from: burn */
public final /* synthetic */ class burn implements bmxj {

    /* renamed from: a */
    public static final bmxj f154777a = new burn();

    private burn() {
    }

    public final Object apply(Object obj) {
        ahza ahza;
        ahza ahza2;
        Collection<basd> collection = (Collection) obj;
        ArrayList arrayList = new ArrayList();
        if (collection != null) {
            for (basd basd : collection) {
                try {
                    ahzb ahzb = (ahzb) basd.mo55930a();
                    if (ahzb.f68450a == 2) {
                        ahza ahza3 = (ahza) ahzb.f68451b;
                        if ((ahza3.f68443a & 1) == 0 && (ahza3.f68443a & 4) != 0) {
                            if (ahzb.f68450a == 2) {
                                ahza = (ahza) ahzb.f68451b;
                            } else {
                                ahza = ahza.f68441e;
                            }
                            byte[] k = ahza.f68446d.mo73780k();
                            if (k.length >= 4) {
                                int i = 0;
                                while (true) {
                                    if (i < 4) {
                                        if (k[i] != -16) {
                                            break;
                                        }
                                        i++;
                                    } else {
                                        if (ahzb.f68450a == 2) {
                                            ahza2 = (ahza) ahzb.f68451b;
                                        } else {
                                            ahza2 = ahza.f68441e;
                                        }
                                        arrayList.add(ahza2);
                                    }
                                }
                            }
                        }
                    }
                } catch (bxwf e) {
                    bnsl bnsl = (bnsl) busr.f154819a.mo68388c();
                    bnsl.mo68437a(e);
                    bnsl.mo68432a("buru", "b", 267, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                    bnsl.mo68405a("Footprints Manager: Failed to parse device");
                }
            }
        }
        return arrayList;
    }
}
