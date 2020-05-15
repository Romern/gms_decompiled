package p000;

import com.google.android.gms.drive.DriveId;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: vpd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class vpd {
    /* renamed from: a */
    public static String m40996a(JSONObject jSONObject, String str) {
        if (jSONObject.has(str)) {
            return jSONObject.getString(str);
        }
        return null;
    }

    /* renamed from: a */
    public static Set m40997a(JSONArray jSONArray) {
        sdo.m34959a(jSONArray);
        HashSet hashSet = new HashSet();
        for (int i = 0; i < jSONArray.length(); i++) {
            hashSet.add(DriveId.m22925b(jSONArray.getString(i)));
        }
        return hashSet;
    }

    /* renamed from: a */
    public static JSONArray m40998a(Set set) {
        sdo.m34959a(set);
        JSONArray jSONArray = new JSONArray();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            jSONArray.put(((DriveId) it.next()).mo18112a());
        }
        return jSONArray;
    }

    /* renamed from: a */
    public static void m40999a(JSONObject jSONObject, String str, String str2) {
        if (str2 != null) {
            jSONObject.put(str, str2);
        }
    }
}
