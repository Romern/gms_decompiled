package p000;

import android.content.Context;
import android.content.SharedPreferences;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.Scope;
import java.util.HashSet;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: idk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class idk {

    /* renamed from: c */
    private static final Lock f20757c = new ReentrantLock();

    /* renamed from: d */
    private static idk f20758d;

    /* renamed from: a */
    public final Lock f20759a = new ReentrantLock();

    /* renamed from: b */
    public final SharedPreferences f20760b;

    public idk(Context context) {
        this.f20760b = context.getSharedPreferences("com.google.android.gms.signin", 0);
    }

    /* renamed from: a */
    public static idk m15277a(Context context) {
        sdo.m34959a(context);
        f20757c.lock();
        try {
            if (f20758d == null) {
                f20758d = new idk(context.getApplicationContext());
            }
            return f20758d;
        } finally {
            f20757c.unlock();
        }
    }

    /* renamed from: b */
    public final GoogleSignInOptions mo12945b() {
        String a;
        String a2 = mo12943a("defaultGoogleSignInAccount");
        if (TextUtils.isEmpty(a2) || (a = mo12943a(mo12946b("googleSignInOptions", a2))) == null) {
            return null;
        }
        try {
            return GoogleSignInOptions.m6415a(a);
        } catch (JSONException e) {
            return null;
        }
    }

    /* renamed from: a */
    public final GoogleSignInAccount mo12942a() {
        String a;
        Uri uri;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String a2 = mo12943a("defaultGoogleSignInAccount");
        if (!TextUtils.isEmpty(a2) && (a = mo12943a(mo12946b("googleSignInAccount", a2))) != null) {
            try {
                if (!TextUtils.isEmpty(a)) {
                    JSONObject jSONObject = new JSONObject(a);
                    String optString = jSONObject.optString("photoUrl");
                    if (!TextUtils.isEmpty(optString)) {
                        uri = Uri.parse(optString);
                    } else {
                        uri = null;
                    }
                    long parseLong = Long.parseLong(jSONObject.getString("expirationTime"));
                    HashSet hashSet = new HashSet();
                    JSONArray jSONArray = jSONObject.getJSONArray("grantedScopes");
                    int length = jSONArray.length();
                    for (int i = 0; i < length; i++) {
                        hashSet.add(new Scope(jSONArray.getString(i)));
                    }
                    String optString2 = jSONObject.optString("id");
                    if (jSONObject.has("tokenId")) {
                        str = jSONObject.optString("tokenId");
                    } else {
                        str = null;
                    }
                    if (jSONObject.has("email")) {
                        str2 = jSONObject.optString("email");
                    } else {
                        str2 = null;
                    }
                    if (jSONObject.has("displayName")) {
                        str3 = jSONObject.optString("displayName");
                    } else {
                        str3 = null;
                    }
                    if (jSONObject.has("givenName")) {
                        str4 = jSONObject.optString("givenName");
                    } else {
                        str4 = null;
                    }
                    if (jSONObject.has("familyName")) {
                        str5 = jSONObject.optString("familyName");
                    } else {
                        str5 = null;
                    }
                    GoogleSignInAccount a3 = GoogleSignInAccount.m6413a(optString2, str, str2, str3, str4, str5, uri, Long.valueOf(parseLong), jSONObject.getString("obfuscatedIdentifier"), hashSet);
                    a3.f10320g = jSONObject.has("serverAuthCode") ? jSONObject.optString("serverAuthCode") : null;
                    return a3;
                }
            } catch (JSONException e) {
            }
        }
        return null;
    }

    /* renamed from: b */
    public final String mo12946b(String str, String str2) {
        StringBuilder sb = new StringBuilder(str.length() + 1 + String.valueOf(str2).length());
        sb.append(str);
        sb.append(":");
        sb.append(str2);
        return sb.toString();
    }

    /* renamed from: a */
    public final String mo12943a(String str) {
        this.f20759a.lock();
        try {
            return this.f20760b.getString(str, null);
        } finally {
            this.f20759a.unlock();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo12944a(String str, String str2) {
        this.f20759a.lock();
        try {
            this.f20760b.edit().putString(str, str2).apply();
        } finally {
            this.f20759a.unlock();
        }
    }
}
