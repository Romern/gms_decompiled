package p000;

import com.google.android.gms.romanesco.protomodel.RestoreInfoEntity;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: abkh */
final /* synthetic */ class abkh implements aubq {

    /* renamed from: a */
    private final abkj f57609a;

    /* renamed from: b */
    private final String f57610b;

    public abkh(abkj abkj, String str) {
        this.f57609a = abkj;
        this.f57610b = str;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: abkj.a(java.lang.String, java.lang.String, boolean):void
     arg types: [java.lang.String, java.lang.String, int]
     candidates:
      abkj.a(java.lang.String, java.lang.String, java.lang.String):android.content.Intent
      abkj.a(java.lang.String, java.lang.String, boolean):void */
    /* renamed from: a */
    public final void mo6378a(aucb aucb) {
        abkj abkj = this.f57609a;
        String str = this.f57610b;
        if (aucb.mo50384b()) {
            try {
                JSONObject jSONObject = new JSONObject();
                for (RestoreInfoEntity restoreInfoEntity : (List) aucb.mo50386d()) {
                    jSONObject.put(restoreInfoEntity.f107246a, restoreInfoEntity.f107247b);
                }
                abkj.mo32153a(str, jSONObject.toString(), true);
            } catch (JSONException e) {
                bnsl bnsl = (bnsl) abkj.f57613a.mo68388c();
                bnsl.mo68437a(e);
                bnsl.mo68432a("abkj", "a", 472, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl.mo68405a("Failed to fetch restore info from Romanesco");
                abkj.mo32153a(str, JSONObject.NULL.toString(), false);
            }
        } else {
            bnsl bnsl2 = (bnsl) abkj.f57613a.mo68388c();
            bnsl2.mo68437a(aucb.mo50387e());
            bnsl2.mo68432a("abkj", "a", 456, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl2.mo68405a("Failed to fetch restore info from Romanesco");
            abkj.mo32153a(str, JSONObject.NULL.toString(), false);
        }
    }
}
