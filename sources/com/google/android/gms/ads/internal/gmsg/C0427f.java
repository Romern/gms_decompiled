package com.google.android.gms.ads.internal.gmsg;

import android.text.TextUtils;
import com.google.android.gms.ads.internal.p012js.function.C0487o;
import com.google.android.gms.ads.internal.util.C0640e;
import com.google.android.gms.ads.internal.util.client.C0633h;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.ads.internal.gmsg.f */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class C0427f implements C0426e {

    /* renamed from: a */
    public final Object f8382a = new Object();

    /* renamed from: b */
    public final Map f8383b = new HashMap();

    /* renamed from: a */
    public final void mo6625a(Object obj, Map map) {
        String str;
        String str2 = (String) map.get("id");
        String str3 = (String) map.get("fail");
        String str4 = (String) map.get("fail_reason");
        String str5 = (String) map.get("fail_stack");
        String str6 = (String) map.get("result");
        if (TextUtils.isEmpty(str5)) {
            str4 = "Unknown Fail Reason.";
        }
        if (!TextUtils.isEmpty(str5)) {
            String valueOf = String.valueOf(str5);
            str = valueOf.length() == 0 ? new String("\n") : "\n".concat(valueOf);
        } else {
            str = "";
        }
        synchronized (this.f8382a) {
            C0487o oVar = (C0487o) this.f8383b.remove(str2);
            if (oVar == null) {
                String valueOf2 = String.valueOf(str2);
                C0633h.m5672d(valueOf2.length() == 0 ? new String("Received result for unexpected method invocation: ") : "Received result for unexpected method invocation: ".concat(valueOf2));
            } else if (!TextUtils.isEmpty(str3)) {
                String valueOf3 = String.valueOf(str4);
                String valueOf4 = String.valueOf(str);
                oVar.mo6673a(valueOf4.length() == 0 ? new String(valueOf3) : valueOf3.concat(valueOf4));
            } else if (str6 != null) {
                try {
                    JSONObject jSONObject = new JSONObject(str6);
                    if (C0633h.m5667a(2) && C0640e.m5680a()) {
                        String valueOf5 = String.valueOf(jSONObject.toString(2));
                        if (valueOf5.length() == 0) {
                            new String("Result GMSG: ");
                        } else {
                            "Result GMSG: ".concat(valueOf5);
                        }
                    }
                    oVar.mo6674a(jSONObject);
                } catch (JSONException e) {
                    oVar.mo6673a(e.getMessage());
                }
            } else {
                oVar.mo6674a((JSONObject) null);
            }
        }
    }
}
