package p000;

import com.google.android.gms.drive.UserMetadata;
import com.google.android.gms.drive.internal.model.File;
import org.json.JSONObject;

/* renamed from: uyo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class uyo extends uyk {
    public uyo(uvy uvy, vad vad) {
        super(uvy, false, vad);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo28102a(JSONObject jSONObject) {
        String str;
        JSONObject jSONObject2 = jSONObject.getJSONObject(this.f48716b.mo28084a());
        String string = jSONObject2.getString("permissionId");
        String optString = jSONObject2.optString("displayName", null);
        JSONObject optJSONObject = jSONObject2.optJSONObject("picture");
        if (optJSONObject != null) {
            str = optJSONObject.optString("url", null);
        } else {
            str = null;
        }
        return new UserMetadata(string, optString, str, jSONObject2.optBoolean("isAuthenticatedUser", false), jSONObject2.optString("emailAddress", null));
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ String mo28105b(Object obj, String str) {
        UserMetadata userMetadata = (UserMetadata) obj;
        throw new UnsupportedOperationException("Cannot query User Metadata from Genoa.");
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ String mo28107a(Object obj) {
        UserMetadata userMetadata = (UserMetadata) obj;
        throw new UnsupportedOperationException("Cannot convert User Metadata directly to a database value.");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo28100a(File file, Object obj) {
        UserMetadata userMetadata = (UserMetadata) obj;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo28104a(JSONObject jSONObject, Object obj) {
        UserMetadata userMetadata = (UserMetadata) obj;
        JSONObject put = new JSONObject().put("permissionId", userMetadata.f30749a).put("displayName", userMetadata.f30750b).put("isAuthenticatedUser", userMetadata.f30752d).put("emailAddress", userMetadata.f30753e);
        String str = userMetadata.f30751c;
        if (str != null) {
            put.put("picture", new JSONObject().put("url", str));
        }
        jSONObject.put(this.f48716b.mo28084a(), put);
    }
}
