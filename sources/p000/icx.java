package p000;

import android.accounts.Account;
import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.Scope;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: icx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class icx {

    /* renamed from: b */
    private static icx f20751b = null;

    /* renamed from: a */
    final idk f20752a;

    private icx(Context context) {
        idk a = idk.m15277a(context);
        this.f20752a = a;
        a.mo12942a();
        this.f20752a.mo12945b();
    }

    /* renamed from: a */
    public static synchronized icx m15249a(Context context) {
        icx b;
        synchronized (icx.class) {
            b = m15250b(context.getApplicationContext());
        }
        return b;
    }

    /* renamed from: b */
    private static synchronized icx m15250b(Context context) {
        synchronized (icx.class) {
            if (f20751b == null) {
                icx icx = new icx(context);
                f20751b = icx;
                return icx;
            }
            icx icx2 = f20751b;
            return icx2;
        }
    }

    /* renamed from: a */
    public final synchronized void mo12927a() {
        idk idk = this.f20752a;
        idk.f20759a.lock();
        try {
            idk.f20760b.edit().clear().apply();
        } finally {
            idk.f20759a.unlock();
        }
    }

    /* renamed from: a */
    public final synchronized void mo12928a(GoogleSignInOptions googleSignInOptions, GoogleSignInAccount googleSignInAccount) {
        idk idk = this.f20752a;
        sdo.m34959a(googleSignInAccount);
        sdo.m34959a(googleSignInOptions);
        idk.mo12944a("defaultGoogleSignInAccount", googleSignInAccount.f10322i);
        sdo.m34959a(googleSignInAccount);
        sdo.m34959a(googleSignInOptions);
        String str = googleSignInAccount.f10322i;
        String b = idk.mo12946b("googleSignInAccount", str);
        JSONObject jSONObject = new JSONObject();
        try {
            String str2 = googleSignInAccount.f10315b;
            if (str2 != null) {
                jSONObject.put("id", str2);
            }
            String str3 = googleSignInAccount.f10316c;
            if (str3 != null) {
                jSONObject.put("tokenId", str3);
            }
            String str4 = googleSignInAccount.f10317d;
            if (str4 != null) {
                jSONObject.put("email", str4);
            }
            String str5 = googleSignInAccount.f10318e;
            if (str5 != null) {
                jSONObject.put("displayName", str5);
            }
            String str6 = googleSignInAccount.f10324k;
            if (str6 != null) {
                jSONObject.put("givenName", str6);
            }
            String str7 = googleSignInAccount.f10325l;
            if (str7 != null) {
                jSONObject.put("familyName", str7);
            }
            Uri uri = googleSignInAccount.f10319f;
            if (uri != null) {
                jSONObject.put("photoUrl", uri.toString());
            }
            String str8 = googleSignInAccount.f10320g;
            if (str8 != null) {
                jSONObject.put("serverAuthCode", str8);
            }
            jSONObject.put("expirationTime", googleSignInAccount.f10321h);
            jSONObject.put("obfuscatedIdentifier", googleSignInAccount.f10322i);
            JSONArray jSONArray = new JSONArray();
            List list = googleSignInAccount.f10323j;
            Scope[] scopeArr = (Scope[]) list.toArray(new Scope[list.size()]);
            Arrays.sort(scopeArr, icd.f20723a);
            for (Scope scope : scopeArr) {
                jSONArray.put(scope.f30106b);
            }
            jSONObject.put("grantedScopes", jSONArray);
            jSONObject.remove("serverAuthCode");
            idk.mo12944a(b, jSONObject.toString());
            String b2 = idk.mo12946b("googleSignInOptions", str);
            JSONObject jSONObject2 = new JSONObject();
            JSONArray jSONArray2 = new JSONArray();
            Collections.sort(googleSignInOptions.f10335h, GoogleSignInOptions.f10333r);
            Iterator it = googleSignInOptions.f10335h.iterator();
            while (it.hasNext()) {
                jSONArray2.put(((Scope) it.next()).f30106b);
            }
            jSONObject2.put("scopes", jSONArray2);
            Account account = googleSignInOptions.f10336i;
            if (account != null) {
                jSONObject2.put("accountName", account.name);
            }
            jSONObject2.put("idTokenRequested", googleSignInOptions.f10337j);
            jSONObject2.put("forceCodeForRefreshToken", googleSignInOptions.f10339l);
            jSONObject2.put("serverAuthRequested", googleSignInOptions.f10338k);
            if (!TextUtils.isEmpty(googleSignInOptions.f10340m)) {
                jSONObject2.put("serverClientId", googleSignInOptions.f10340m);
            }
            if (!TextUtils.isEmpty(googleSignInOptions.f10341n)) {
                jSONObject2.put("hostedDomain", googleSignInOptions.f10341n);
            }
            idk.mo12944a(b2, jSONObject2.toString());
        } catch (JSONException e) {
            throw new RuntimeException(e);
        } catch (JSONException e2) {
            throw new RuntimeException(e2);
        }
    }
}
