package p000;

import com.google.android.gms.drive.DriveSpace;
import com.google.android.gms.drive.events.ChangesAvailableOptions;
import java.util.Iterator;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: uqq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class uqq {
    /* renamed from: a */
    public static bnic m39258a(JSONArray jSONArray) {
        bnia bnia = new bnia();
        int i = 0;
        while (i < jSONArray.length()) {
            String string = jSONArray.getString(i);
            DriveSpace a = DriveSpace.m22929a(string);
            if (a != null) {
                bnia.mo67629b(a);
                i++;
            } else {
                String valueOf = String.valueOf(string);
                throw new JSONException(valueOf.length() == 0 ? new String("Invalid Drive space: ") : "Invalid Drive space: ".concat(valueOf));
            }
        }
        return bnia.mo67751a();
    }

    /* renamed from: b */
    static bnic m39262b(JSONObject jSONObject) {
        if (jSONObject.has("spaces")) {
            return m39258a(jSONObject.getJSONArray("spaces"));
        }
        return bnon.f131923a;
    }

    /* renamed from: a */
    public static String m39259a(ChangesAvailableOptions changesAvailableOptions, String str, Set set, long j) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("optionsSizeLimit", changesAvailableOptions.f30773a);
        jSONObject.put("optionsRepeats", changesAvailableOptions.f30774b);
        jSONObject.put("sequenceNumber", j);
        jSONObject.putOpt("optionsSpaces", m39261a(changesAvailableOptions.mo18151a()));
        jSONObject.putOpt("account", str);
        jSONObject.put("spaces", m39261a(set));
        return jSONObject.toString();
    }

    /* renamed from: a */
    static String m39260a(JSONObject jSONObject) {
        if (jSONObject.has("account")) {
            return jSONObject.getString("account");
        }
        return null;
    }

    /* renamed from: a */
    public static JSONArray m39261a(Set set) {
        JSONArray jSONArray = new JSONArray();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            jSONArray.put(((DriveSpace) it.next()).f30740f);
        }
        return jSONArray;
    }
}
