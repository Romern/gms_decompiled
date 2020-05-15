package p000;

import java.util.Collection;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;

/* renamed from: aztm */
final /* synthetic */ class aztm implements bmxj {

    /* renamed from: a */
    private final azto f100013a;

    /* renamed from: b */
    private final String f100014b;

    public aztm(azto azto, String str) {
        this.f100013a = azto;
        this.f100014b = str;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: azqf.a(java.util.List, bmxj):java.util.List
     arg types: [bngx, azro]
     candidates:
      azqf.a(java.lang.String, bmxj):bmxv
      azqf.a(bmxv, bmxv):java.lang.String
      azqf.a(java.lang.String, java.lang.Object[]):java.lang.String
      azqf.a(java.util.Collection, bmxj):org.json.JSONArray
      azqf.a(java.util.List, bmxj):java.util.List */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: azqf.a(java.util.Collection, bmxj):org.json.JSONArray
     arg types: [bngx, azrq]
     candidates:
      azqf.a(java.lang.String, bmxj):bmxv
      azqf.a(bmxv, bmxv):java.lang.String
      azqf.a(java.lang.String, java.lang.Object[]):java.lang.String
      azqf.a(java.util.List, bmxj):java.util.List
      azqf.a(java.util.Collection, bmxj):org.json.JSONArray */
    public final Object apply(Object obj) {
        azto azto = this.f100013a;
        String str = this.f100014b;
        bngx bngx = (bngx) obj;
        if (!cfgs.m139400f() || !cfgs.m139405k()) {
            azqf.m86130a(azto.f99942a);
            azqf.m86130a(azto.f99942a);
            return azqf.m86139a(azqf.m86142a((Collection) bngx, (bmxj) new azrq(azto)));
        }
        List a = azqf.m86130a(azto.f99942a).mo55213a((List) bngx, (bmxj) new azro(azto));
        try {
            JSONArray jSONArray = new JSONArray((String) a.get(0));
            if (a.size() > 1) {
                azqf.m86130a(azto.f99942a);
                azqf.m86148b(a.subList(1, a.size()), new azrp(azto, str));
            }
            azqf.m86130a(azto.f99942a);
            return azqf.m86139a(jSONArray);
        } catch (JSONException e) {
            azqf.m86130a(azto.f99942a);
            return azqf.m86138a("Unable to convert message batch to JSONArray", new Object[0]);
        }
    }
}
