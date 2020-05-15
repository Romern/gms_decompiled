package p000;

import android.accounts.Account;
import android.text.TextUtils;
import android.util.Log;
import android.util.SparseArray;
import com.google.android.gms.auth.firstparty.dataservice.PasswordSettings;
import com.google.android.gms.auth.firstparty.dataservice.PinSettings;
import com.google.android.gms.auth.firstparty.dataservice.ReauthSettingsRequest;
import com.google.android.gms.auth.firstparty.dataservice.ReauthSettingsResponse;
import java.io.IOException;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.message.BasicNameValuePair;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: glv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class glv {

    /* renamed from: c */
    private static final SparseArray f18593c;

    /* renamed from: a */
    public final ilq f18594a;

    /* renamed from: b */
    public final adyd f18595b;

    /* renamed from: d */
    private final goa f18596d;

    static {
        SparseArray sparseArray = new SparseArray(3);
        f18593c = sparseArray;
        sparseArray.append(7, 4);
        f18593c.append(3, 3);
        f18593c.append(16, 5);
    }

    public glv(ilq ilq) {
        adyd a = adyd.m51363a(rpr.m34216b());
        goa goa = (goa) goa.f18759a.mo13145b();
        bmxy.m108581a(ilq);
        this.f18594a = ilq;
        bmxy.m108581a(a);
        this.f18595b = a;
        bmxy.m108581a(goa);
        this.f18596d = goa;
    }

    /* renamed from: a */
    public static final int m13421a(JSONObject jSONObject) {
        int optInt = jSONObject.optInt("errorCode", -1);
        if (optInt == -1) {
            return -1;
        }
        Object[] objArr = {Integer.valueOf(optInt), jSONObject.optString("errorMessage", null)};
        Integer num = (Integer) f18593c.get(optInt);
        if (num == null) {
            StringBuilder sb = new StringBuilder(30);
            sb.append("Unknown errorCode: ");
            sb.append(optInt);
            Log.w("ReauthClient", sb.toString());
            num = 1;
        }
        return num.intValue();
    }

    /* renamed from: a */
    public final ReauthSettingsResponse mo12041a(ReauthSettingsRequest reauthSettingsRequest) {
        String str;
        ReauthSettingsResponse reauthSettingsResponse;
        ReauthSettingsRequest reauthSettingsRequest2 = reauthSettingsRequest;
        bmxy.m108581a(reauthSettingsRequest);
        Account account = reauthSettingsRequest2.f10699d;
        bmxy.m108581a(account);
        String str2 = this.f18594a.packageName;
        String str3 = reauthSettingsRequest2.f10700e;
        if (str3 != null) {
            str2 = str3;
        }
        if (!reauthSettingsRequest2.f10698c) {
            str = (String) this.f18596d.mo12090a(account, gqd.f18816j);
            if (str == null) {
                Log.i("ReauthClient", "Reauth settings not cached. Set force=true to hit server.");
                return null;
            }
        } else {
            String a = this.f18595b.mo33908a(account);
            if (!TextUtils.isEmpty(a)) {
                try {
                    String b = this.f18594a.mo13125b(str2);
                    HashMap hashMap = new HashMap();
                    hashMap.put("token", a);
                    hashMap.put("packageName", str2);
                    hashMap.put("packageSignature", b);
                    str = mo12042a((String) gnv.f18731b.mo58455c(), str2, hashMap);
                } catch (IOException e) {
                    Log.w("ReauthClient", "Network error calling reauth settings.", e);
                    return new ReauthSettingsResponse(2);
                }
            } else {
                Log.w("ReauthClient", "Not able to getReauthSettings. No LST for the account.");
                return new ReauthSettingsResponse(5);
            }
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            int a2 = m13421a(jSONObject);
            if (a2 == -1) {
                JSONObject jSONObject2 = jSONObject.getJSONObject("password");
                JSONObject jSONObject3 = jSONObject.getJSONObject("pin");
                reauthSettingsResponse = new ReauthSettingsResponse(1, 0, new PasswordSettings(2, jSONObject2.getString("status"), jSONObject2.optString("recovery_url", null)), new PinSettings(2, jSONObject3.getString("status"), jSONObject3.optString("reset_url", null), jSONObject3.optString("setup_url", null), jSONObject3.optString("recovery_url", null), jSONObject3.optInt("length")));
            } else {
                reauthSettingsResponse = new ReauthSettingsResponse(a2);
            }
            if (reauthSettingsResponse.f10702b == 0) {
                this.f18596d.mo12095b(account, gqd.f18816j, str);
            }
            return reauthSettingsResponse;
        } catch (JSONException e2) {
            Log.e("ReauthClient", "Error deserializing reauth settings response.", e2);
            return new ReauthSettingsResponse(1);
        }
    }

    /* renamed from: a */
    public final String mo12042a(String str, String str2, Map map) {
        LinkedList linkedList = new LinkedList();
        for (Map.Entry entry : map.entrySet()) {
            linkedList.add(new BasicNameValuePair((String) entry.getKey(), (String) entry.getValue()));
        }
        return gmv.m13467b(gmv.m13464a(str, str2, new UrlEncodedFormEntity(linkedList), this.f18594a.context));
    }
}
