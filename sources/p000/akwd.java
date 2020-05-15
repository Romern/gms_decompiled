package p000;

import android.content.pm.PackageManager;
import android.content.pm.PermissionInfo;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: akwd */
final /* synthetic */ class akwd implements bmzi {

    /* renamed from: a */
    private final akwg f72988a;

    /* renamed from: b */
    private final PackageManager f72989b;

    public akwd(akwg akwg, PackageManager packageManager) {
        this.f72988a = akwg;
        this.f72989b = packageManager;
    }

    /* renamed from: a */
    public final Object mo6606a() {
        String str;
        akwg akwg = this.f72988a;
        PackageManager packageManager = this.f72989b;
        List<String> list = akwg.f72994a;
        JSONArray jSONArray = new JSONArray();
        for (String str2 : list) {
            try {
                PermissionInfo permissionInfo = packageManager.getPermissionInfo(str2, 128);
                if (permissionInfo != null) {
                    CharSequence loadDescription = permissionInfo.loadDescription(packageManager);
                    if (loadDescription != null) {
                        str = loadDescription.toString();
                    }
                } else {
                    str = "";
                }
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("permission", str2);
                    jSONObject.put("description", str);
                    jSONArray.put(jSONObject);
                } catch (JSONException e) {
                    akwg.f72993b.mo25417e("converting to JSON failed", e, new Object[0]);
                    return null;
                }
            } catch (PackageManager.NameNotFoundException e2) {
            }
        }
        return jSONArray;
    }
}
