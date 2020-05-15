package p000;

import java.util.NoSuchElementException;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: asro */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class asro implements asrx {

    /* renamed from: a */
    public final casa f89531a;

    public asro(JSONObject jSONObject) {
        try {
            JSONObject jSONObject2 = jSONObject.getJSONObject("DC_CP_MPP");
            JSONObject jSONObject3 = jSONObject2.getJSONObject("contactlessPaymentData");
            JSONObject jSONObject4 = jSONObject2.getJSONObject("cardRiskManagementData");
            casd casd = new casd();
            String string = jSONObject3.getString("issuerApplicationData");
            srn srn = asrs.f89540a;
            String str = "issuerApplicationData";
            casd casd2 = casd;
            casd.mo74808a(asti.m74762a(string), asti.m74762a(jSONObject3.getString("GPO_Response")), jSONObject3.getInt("CDOL1_RelatedDataLength"), asti.m74762a(jSONObject3.getString("CIAC_Decline")), asti.m74762a(jSONObject3.getString("CIAC_DeclineOnPPMS")), asti.m74762a(jSONObject3.getString("paymentFCI")), asti.m74762a(jSONObject3.getString("PPSE_FCI")), asti.m74762a(jSONObject3.getString("CVR_MaskAnd")), asti.m74762a(jSONObject3.getString("AID")), asti.m74762a(jSONObject3.getString("PIN_IV_CVC3_Track2")));
            casd2.mo74807a(asti.m74762a(jSONObject4.getString("additionalCheckTable")), asti.m74762a(jSONObject4.getString("CRM_CountryCode")));
            casd2.mo74811b(asti.m74762a(jSONObject3.getString("ICC_privateKey_p")), asti.m74762a(jSONObject3.getString("ICC_privateKey_q")), asti.m74762a(jSONObject3.getString("ICC_privateKey_dp")), asti.m74762a(jSONObject3.getString("ICC_privateKey_dq")), asti.m74762a(jSONObject3.getString("ICC_privateKey_a")));
            if (jSONObject3.has("alternateContactlessPaymentData")) {
                JSONObject jSONObject5 = jSONObject3.getJSONObject("alternateContactlessPaymentData");
                casd2.mo74809a(asti.m74762a(jSONObject5.getString("paymentFCI")), asti.m74762a(jSONObject5.getString("GPO_Response")), asti.m74762a(jSONObject5.getString("CVR_MaskAnd")), asti.m74762a(jSONObject5.getString("AID")), asti.m74762a(jSONObject5.getString("CIAC_Decline")));
            }
            JSONArray jSONArray = jSONObject3.getJSONArray("records");
            for (int i = 0; i < jSONArray.length(); i++) {
                JSONObject jSONObject6 = jSONArray.getJSONObject(i);
                casd2.mo74806a(asti.m74762a(jSONObject6.getString("recordNumber"))[0], asti.m74762a(jSONObject6.getString("SFI"))[0], asti.m74762a(jSONObject6.getString("recordValue")));
            }
            if (jSONObject2.has("remotePaymentData")) {
                JSONObject jSONObject7 = jSONObject2.getJSONObject("remotePaymentData");
                casd2.mo74810a(asti.m74762a(jSONObject7.getString("PAN")), asti.m74762a(jSONObject7.getString(str)), asti.m74762a(jSONObject7.getString("CVR_MaskAnd")), asti.m74762a(jSONObject7.getString("applicationExpiryDate")), asti.m74762a(jSONObject7.getString("track2_equivalentData")), asti.m74762a(jSONObject7.getString("PAN_SequenceNumber")), asti.m74762a(jSONObject7.getString("CIAC_Decline")), asti.m74762a(jSONObject7.getString("AIP")));
            }
            try {
                this.f89531a = casd2.mo74805a();
            } catch (JSONException e) {
                e = e;
                throw new RuntimeException(e);
            }
        } catch (JSONException e2) {
            e = e2;
            throw new RuntimeException(e);
        }
    }

    /* renamed from: a */
    public final byte[] mo3395a() {
        return this.f89531a.f175729b.mo74800d();
    }

    /* renamed from: a */
    public final byte[] mo3396a(int i) {
        carx[] carxArr = this.f89531a.f175729b.f175731b;
        int length = carxArr.length;
        int i2 = 0;
        while (i2 < length) {
            try {
                byte[] h = assu.m74713a(carxArr[i2].f175717c).mo49448c().mo49438a(i).mo49442h();
                if (h != null) {
                    return h;
                }
                i2++;
            } catch (NoSuchElementException e) {
            } catch (assv e2) {
                bnsl bnsl = (bnsl) asrs.f89540a.mo68388c();
                bnsl.mo68437a(e2);
                bnsl.mo68432a("asro", "a", 329, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl.mo68405a("Error decoding record bytes when getting issuer country code");
            }
        }
        return new byte[0];
    }
}
