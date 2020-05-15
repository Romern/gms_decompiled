package p000;

import android.text.TextUtils;
import com.google.android.gms.drive.DriveSpace;
import java.util.Arrays;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: vab */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class vab extends uzx {

    /* renamed from: e */
    private static final sbw f48798e = new sbw("QueryFeed", "");

    /* renamed from: a */
    public final String f48799a;

    /* renamed from: b */
    public final String f48800b;

    /* renamed from: d */
    public final String f48801d;

    public vab(String str, String str2, String str3) {
        super(uzz.QUERY);
        sdo.m34959a((Object) str);
        this.f48799a = str;
        sdo.m34959a((Object) str2);
        this.f48800b = str2;
        this.f48801d = str3;
    }

    /* renamed from: a */
    public static vab m39866a(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            return new vab(jSONObject.getString("query"), jSONObject.getString("spaces"), jSONObject.has("orderBy") ? jSONObject.getString("orderBy") : null);
        } catch (JSONException e) {
            f48798e.mo25369a("Could not parse JSON [%s]; assuming legacy feed", str);
            return new vab(str, DriveSpace.f30738e, null);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && obj.getClass() == getClass()) {
            vab vab = (vab) obj;
            return sdg.m34949a(this.f48799a, vab.f48799a) && sdg.m34949a(this.f48800b, vab.f48800b) && sdg.m34949a(this.f48801d, vab.f48801d);
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f48799a, this.f48800b, this.f48801d});
    }

    /* renamed from: a */
    public static vab m39867a(uzt uzt) {
        return new vab(uzt.f48780a.f48779b, TextUtils.join(",", uzt.f48781b), uzt.f48782c);
    }

    /* renamed from: a */
    public final String mo28138a() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("query", this.f48799a);
            jSONObject.put("spaces", this.f48800b);
            jSONObject.put("orderBy", this.f48801d);
            return jSONObject.toString();
        } catch (JSONException e) {
            throw new RuntimeException("Could not encode JSON");
        }
    }
}
