package p000;

import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: atgx */
final /* synthetic */ class atgx implements Runnable {

    /* renamed from: a */
    private final athb f90341a;

    /* renamed from: b */
    private final brep f90342b;

    public atgx(athb athb, brep brep) {
        this.f90341a = athb;
        this.f90342b = brep;
    }

    public final void run() {
        String str;
        athb athb = this.f90341a;
        brep brep = this.f90342b;
        srn srn = atgf.f90279a;
        bepl a = athb.mo49978a().mo60898a();
        try {
            JSONObject jSONObject = new JSONObject();
            int i = athb.f90353b;
            int i2 = i - 2;
            if (i != 0) {
                if (i2 == 5) {
                    str = "ID";
                } else if (i2 == 6) {
                    str = "QUICPAY";
                } else {
                    String valueOf = String.valueOf(btod.m116977b(i));
                    StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 47);
                    sb.append("Service provider ");
                    sb.append(valueOf);
                    sb.append(" is not supported for this SDK");
                    throw new UnsupportedOperationException(sb.toString());
                }
                jSONObject.put("serviceProvider", str);
                jSONObject.put("walletAppId", athb.f90352a);
                if (a != null) {
                    jSONObject.put("defaultCardId", 1);
                }
                brep.mo49932a(jSONObject);
                return;
            }
            throw null;
        } catch (JSONException e) {
            String valueOf2 = String.valueOf(e);
            StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 20);
            sb2.append("JSON error occurred ");
            sb2.append(valueOf2);
            sb2.toString();
            brep.mo49931a(new bres(atgv.APTEST_JSON_ERROR));
        }
    }
}
