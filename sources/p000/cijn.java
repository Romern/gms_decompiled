package p000;

import com.felicanetworks.mfc.mfi.MfiClient;
import com.felicanetworks.mfc.mfi.MfiClientException;
import com.felicanetworks.mfc.mfi.SeInfo;
import com.felicanetworks.mfc.mfi.User;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: cijn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class cijn implements brfa {

    /* renamed from: a */
    final /* synthetic */ cijv f190439a;

    /* renamed from: b */
    final /* synthetic */ cijo f190440b;

    public cijn(cijo cijo, cijv cijv) {
        this.f190440b = cijo;
        this.f190439a = cijv;
    }

    /* renamed from: a */
    public final void mo49936a(bret bret) {
        Integer num = cijs.f190456a;
        new Object[1][0] = bret.name();
        this.f190440b.f190441a.mo49931a(new bres(bret));
    }

    /* renamed from: a */
    public final void mo49937a(MfiClient mfiClient, User user) {
        Integer num = cijs.f190456a;
        try {
            srn srn = atgf.f90279a;
            SeInfo seInformation = mfiClient.getSeInformation();
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("seId", seInformation.getSeId());
            jSONObject.put("sepId", seInformation.getSepId());
            jSONObject.put("platformType", seInformation.getPlatformType());
            jSONObject.put("seType", seInformation.getSeType());
            jSONObject.put("serviceProvider", "QUICPAY");
            jSONObject.put("walletAppId", this.f190440b.f190444d.f190458f);
            cijv cijv = this.f190439a;
            if (cijv != null) {
                if (cijv.f190459a == cijs.f190457b.intValue()) {
                    cijv cijv2 = this.f190439a;
                    if (cijv2.f190460b) {
                        jSONObject.put("idm", cijv2.f190469c);
                        jSONObject.put("icCode", this.f190439a.f190470d);
                        jSONObject.put("containerIssueInformation", this.f190439a.f190471e);
                        JSONArray jSONArray = new JSONArray();
                        jSONArray.put(this.f190439a.f190472f);
                        jSONObject.put("identifiableBlockData", jSONArray);
                        jSONObject.put("serviceId", "SV000024");
                    }
                }
            }
            this.f190440b.f190441a.mo49932a(jSONObject);
        } catch (JSONException e) {
            String valueOf = String.valueOf(e.toString());
            if (valueOf.length() == 0) {
                new String("JSON error occurred ");
            } else {
                "JSON error occurred ".concat(valueOf);
            }
            this.f190440b.f190441a.mo49931a(new bres(cijw.QUICPAY_JSON_ERROR));
        } catch (MfiClientException e2) {
            String exc = e2.toString();
            StringBuilder sb = new StringBuilder(String.valueOf(exc).length() + 56);
            sb.append("getSecureElementData MfiClientException occurred (e = ");
            sb.append(exc);
            sb.append(");");
            sb.toString();
            throw e2;
        }
    }
}
