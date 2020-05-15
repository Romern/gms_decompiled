package p000;

import android.net.Uri;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tapandpay.firstparty.CardInfo;
import com.google.android.gms.tapandpay.firstparty.TokenReference;
import com.google.android.gms.tapandpay.firstparty.TokenStatus;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: bjuw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bjuw {
    /* renamed from: a */
    static Status m104661a(JSONObject jSONObject) {
        try {
            return new Status(jSONObject.getInt("statusCode"), m104668b(jSONObject, "statusMessage"));
        } catch (JSONException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: b */
    static CardInfo m104667b(JSONObject jSONObject) {
        Uri uri;
        TokenStatus tokenStatus = null;
        TokenReference tokenReference = null;
        if (jSONObject == null) {
            return null;
        }
        String b = m104668b(jSONObject, "cardImageUrl");
        asmg asmg = new asmg();
        asmg.f89223a = m104668b(jSONObject, "billingCardId");
        asmg.f89227e = jSONObject.getInt("cardNetwork");
        if (b != null) {
            uri = Uri.parse(b);
        } else {
            uri = null;
        }
        asmg.f89230h = uri;
        JSONObject a = m104663a(jSONObject, "tokenStatus");
        if (a != null) {
            asoz asoz = new asoz();
            asoz.f89333c = a.getBoolean("isSelected");
            asoz.f89332b = a.getInt("tokenState");
            JSONObject a2 = m104663a(a, "tokenReference");
            if (a2 != null) {
                asox asox = new asox();
                asox.f89330b = a2.getInt("tokenProvider");
                tokenReference = asox.mo49311a();
            }
            asoz.f89331a = tokenReference;
            tokenStatus = asoz.mo49314a();
        }
        asmg.f89228f = tokenStatus;
        return asmg.mo49237a();
    }

    /* renamed from: c */
    public static rjr m104669c(JSONObject jSONObject) {
        try {
            return new rjr(m104661a(jSONObject.getJSONObject("status")), jSONObject.getBoolean("value"));
        } catch (JSONException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: a */
    static JSONObject m104662a(Status status) {
        boolean z;
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("statusCode", status.f30115i);
            m104665a(jSONObject, "statusMessage", status.f30116j);
            if (status.f30117k == null) {
                z = true;
            } else {
                z = false;
            }
            bmxy.m108589a(z, "Can't serialize resolution");
            return jSONObject;
        } catch (JSONException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: a */
    public static JSONObject m104663a(JSONObject jSONObject, String str) {
        if (jSONObject.has(str)) {
            return jSONObject.getJSONObject(str);
        }
        return null;
    }

    /* renamed from: a */
    public static JSONObject m104664a(rjr rjr) {
        try {
            JSONObject jSONObject = new JSONObject();
            m104666a(jSONObject, "status", m104662a(rjr.f43154a));
            jSONObject.put("value", rjr.f43155b);
            return jSONObject;
        } catch (JSONException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: b */
    public static String m104668b(JSONObject jSONObject, String str) {
        if (jSONObject.has(str)) {
            return jSONObject.getString(str);
        }
        return null;
    }

    /* renamed from: a */
    public static void m104665a(JSONObject jSONObject, String str, String str2) {
        if (str2 != null) {
            jSONObject.put(str, str2);
        }
    }

    /* renamed from: a */
    public static void m104666a(JSONObject jSONObject, String str, JSONObject jSONObject2) {
        if (jSONObject2 != null) {
            jSONObject.put(str, jSONObject2);
        }
    }
}
