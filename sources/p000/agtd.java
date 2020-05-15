package p000;

import com.android.volley.Response;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.mobiledataplan.MdpCarrierPlanIdResponse;
import org.json.JSONException;

/* renamed from: agtd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class agtd implements Response.Listener {

    /* renamed from: a */
    final /* synthetic */ agth f66441a;

    public agtd(agth agth) {
        this.f66441a = agth;
    }

    public final /* bridge */ /* synthetic */ void onResponse(Object obj) {
        MdpCarrierPlanIdResponse mdpCarrierPlanIdResponse;
        String str;
        String str2 = (String) obj;
        Long l = agth.f66446a;
        try {
            mdpCarrierPlanIdResponse = this.f66441a.mo36080a(str2);
        } catch (JSONException e) {
            bnsl bnsl = (bnsl) agth.f66447g.mo68387b();
            bnsl.mo68437a(e);
            bnsl.mo68420a("Unable to parse json from carrier:{%s}", new bryx(2, str2));
            mdpCarrierPlanIdResponse = null;
        }
        if (mdpCarrierPlanIdResponse == null || (str = mdpCarrierPlanIdResponse.f80151a) == null || str.isEmpty()) {
            ((bnsl) agth.f66447g.mo68388c()).mo68405a("MDP_SERVER_CARRIER_INVALID_RESPONSE. Unable to parse carrier response.");
            agth agth = this.f66441a;
            String valueOf = String.valueOf(str2);
            agth.mo6503a(new Status(27008, valueOf.length() == 0 ? new String("MDP_SERVER_CARRIER_INVALID_RESPONSE. Unable to parse carrier response: ") : "MDP_SERVER_CARRIER_INVALID_RESPONSE. Unable to parse carrier response: ".concat(valueOf)));
        } else if (!cfmv.m140307f() || mdpCarrierPlanIdResponse.f80152b > 0) {
            this.f66441a.mo36081a(mdpCarrierPlanIdResponse);
        } else {
            ((bnsl) agth.f66447g.mo68388c()).mo68415a("MDP_SERVER_CARRIER_INVALID_TTL. TTL of CPID is invalid: %d", mdpCarrierPlanIdResponse.f80152b);
            agth agth2 = this.f66441a;
            String valueOf2 = String.valueOf(str2);
            agth2.mo6503a(new Status(27053, valueOf2.length() == 0 ? new String("MDP_SERVER_CARRIER_INVALID_TTL. TTL of CPID is invalid: ") : "MDP_SERVER_CARRIER_INVALID_TTL. TTL of CPID is invalid: ".concat(valueOf2)));
        }
    }
}
