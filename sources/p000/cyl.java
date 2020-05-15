package p000;

import java.util.ArrayList;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: cyl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cyl implements cyn {
    /* renamed from: a */
    public final cut mo8390a(cuo cuo, cyp cyp) {
        JSONObject jSONObject;
        cyx cyx = cyp.f12399b.f12408a;
        String g = cuo.mo8307g();
        cvc cvc = null;
        if (!(g == null || (jSONObject = (JSONObject) cyx.f12424b.get(g)) == null)) {
            ArrayList arrayList = new ArrayList();
            if ("BF50".equalsIgnoreCase(g)) {
                arrayList.add(cuy.m7637b(cvz.m7720b("DF20")).mo8325a(cyx.m7943a(jSONObject)));
                cvc = cuy.m7637b(cvz.m7720b(g)).mo8324a((cvc[]) arrayList.toArray(new cvc[arrayList.size()]));
            } else if (!"BF51".equalsIgnoreCase(g)) {
                cvc = cuy.m7637b(cvz.m7720b(g)).mo8325a(cyx.m7943a(jSONObject));
            } else {
                for (Map.Entry entry : new cyw().entrySet()) {
                    cuy b = cuy.m7637b(cvz.m7720b((String) entry.getKey()));
                    String optString = jSONObject.optString((String) entry.getValue(), null);
                    if (optString == null || optString.length() == 0) {
                        optString = cyx.mo8443c((String) entry.getValue());
                    }
                    arrayList.add(b.mo8325a(optString));
                }
                cvc = cuy.m7637b(cvz.m7720b(g)).mo8324a((cvc[]) arrayList.toArray(new cvc[arrayList.size()]));
            }
        }
        return cut.m7621a(cvc);
    }
}
