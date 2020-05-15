package p000;

import android.net.Uri;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: plg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class plg {

    /* renamed from: a */
    public int f39584a;

    /* renamed from: b */
    public String f39585b;

    /* renamed from: c */
    public Uri f39586c;

    public plg(JSONObject jSONObject) {
        int i = jSONObject.getInt("platform");
        if (i < 0 || i > 3) {
            throw new JSONException("Invalid value for 'platform'");
        }
        this.f39584a = i;
        this.f39585b = jSONObject.getString("package");
        this.f39586c = Uri.parse(jSONObject.getString("url"));
    }
}
