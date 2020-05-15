package p000;

import com.felicanetworks.mfc.mfi.MfiClientException;
import com.google.autofill.detection.p098ml.AndroidInputTypeSignal;
import java.util.Iterator;
import java.util.Map;

/* renamed from: yti */
final /* synthetic */ class yti implements yuu {

    /* renamed from: a */
    static final yuu f54581a = new yti();

    private yti() {
    }

    /* renamed from: a */
    public final Object mo30727a(Object obj, Object obj2) {
        Iterator it;
        bngx a;
        caah caah;
        caal caal;
        String str = (String) obj;
        bnhe bnhe = (bnhe) obj2;
        srn srn = ytj.f54582a;
        if (!str.isEmpty()) {
            bnha h = bnhe.m109414h();
            try {
                Iterator it2 = ytj.f54583b.mo66915a(str).entrySet().iterator();
                while (it2.hasNext()) {
                    Map.Entry entry = (Map.Entry) it2.next();
                    String str2 = (String) entry.getKey();
                    String str3 = (String) entry.getValue();
                    bngs j = bngx.m109377j();
                    Iterator it3 = ytj.f54584c.mo66917a().mo66918a((CharSequence) str3).iterator();
                    while (true) {
                        if (it3.hasNext()) {
                            String str4 = (String) it3.next();
                            String[] split = str4.split("-");
                            it = it2;
                            if (split.length != 2) {
                                bnsl bnsl = (bnsl) ytj.f54582a.mo68387b();
                                bnsl.mo68432a("ytj", "d", 160, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                                bnsl.mo68420a("Un-recognized field format: %s", str4);
                                caal = null;
                            } else {
                                int a2 = caak.m126415a(Integer.parseInt(split[1]));
                                if (a2 == 0) {
                                    bnsl bnsl2 = (bnsl) ytj.f54582a.mo68387b();
                                    bnsl2.mo68432a("ytj", "d", 166, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                                    bnsl2.mo68420a("Unknown field format: %s", split[1]);
                                    caal = null;
                                } else {
                                    caal = bzzj.m126351a(split[0], a2);
                                }
                            }
                            if (caal == null) {
                                bnsl bnsl3 = (bnsl) ytj.f54582a.mo68387b();
                                bnsl3.mo68432a("ytj", "c", (int) AndroidInputTypeSignal.TYPE_TEXT_VARIATION_VISIBLE_PASSWORD, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                                bnsl3.mo68420a("Cannot construct field: %s", str4);
                                a = bngx.m109376e();
                                break;
                            }
                            j.mo67668c(caal);
                            it2 = it;
                        } else {
                            it = it2;
                            a = j.mo67664a();
                            if (a.isEmpty()) {
                                bnsl bnsl4 = (bnsl) ytj.f54582a.mo68387b();
                                bnsl4.mo68432a("ytj", "c", (int) MfiClientException.TYPE_MFICLIENT_NOT_FOUND, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                                bnsl4.mo68405a("No fields found");
                            }
                        }
                    }
                    if (a.isEmpty()) {
                        bnsl bnsl5 = (bnsl) ytj.f54582a.mo68387b();
                        bnsl5.mo68432a("ytj", "a", 133, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                        bnsl5.mo68420a("DataType creation failed due to bad fields: %s", str3);
                        caah = null;
                    } else {
                        caah = bzzn.m126361a(str2, a);
                    }
                    if (caah != null) {
                        h.mo67695b(caah.f172336b, caah);
                        it2 = it;
                    } else {
                        bnsl bnsl6 = (bnsl) ytj.f54582a.mo68387b();
                        bnsl6.mo68432a("ytj", "b", 118, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                        bnsl6.mo68420a("Error creating datatype: %s.", entry.getKey());
                        throw new IllegalArgumentException();
                    }
                }
                return h.mo67618b();
            } catch (IllegalArgumentException e) {
            }
        }
        return bnoj.f131912b;
    }
}
