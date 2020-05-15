package p000;

import java.util.Map;
import org.json.JSONObject;

/* renamed from: cxm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class cxm implements cvo {

    /* renamed from: a */
    private final Map f12377a = cvq.m7688a(cxt.f12380a, cxt.f12381b, new cxl(cup.class), cxo.f12378a);

    /* renamed from: a */
    public static cws m7835a(cyq cyq, cwm cwm) {
        cws cws;
        cwt cwt = new cwt(cwr.m7787a(cyq.f12399b.f12408a.mo8445d("PDOL_Decline_check")), cwr.m7787a(cyq.f12399b.f12408a.mo8445d("PDOL_Profile_check")), cwr.m7787a(cyq.f12399b.f12408a.mo8445d("PDOL_Online_check")));
        if (!cwm.mo8362a(cwj.PDOL_CHECKS_ENABLED)) {
            cws = new cws((byte) 0, (byte) 0, (byte) 0, false);
        } else if (cwt.f12276a.mo8370a()) {
            cwu a = cwt.f12276a.mo8369a(cyq);
            if (a.f12279a != 0) {
                cws = new cws((byte) 0, (byte) a.f12280b, (byte) 0, false);
            } else if (!cwt.f12277b.mo8370a()) {
                cws = cws.m7790c();
            } else if (cwt.f12278c.mo8370a()) {
                cws = new cws(cwt.f12277b.mo8369a(cyq).f12279a, (byte) 0, (byte) cwt.f12278c.mo8369a(cyq).f12280b, false);
            } else {
                cws = new cws((byte) 0, (byte) 0, cwt.f12277b.mo8369a(cyq).f12279a, true);
            }
        } else {
            cws = cws.m7790c();
        }
        byte b = cws.f12272a;
        if (b != 0) {
            cyx cyx = cyq.f12399b.f12408a;
            String valueOf = String.valueOf(Integer.toHexString(b).toUpperCase());
            cyx.m7945a(cyx.f12423a, (JSONObject) cyx.f12424b.get(valueOf.length() == 0 ? new String("DF2") : "DF2".concat(valueOf)));
        }
        return cws;
    }

    /* renamed from: a */
    public final Map mo8338a() {
        return this.f12377a;
    }

    /* renamed from: a */
    public final cut mo8337a(cvp cvp, cuv cuv) {
        return cut.m7622a(cvp.f12201b, cuv);
    }
}
