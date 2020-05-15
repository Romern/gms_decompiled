package p000;

import android.content.Context;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.mobiledataplan.consent.SetConsentStatusRequest;

/* renamed from: agtm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class agtm implements Runnable {

    /* renamed from: a */
    final /* synthetic */ Context f66487a;

    /* renamed from: b */
    final /* synthetic */ Long f66488b;

    /* renamed from: c */
    final /* synthetic */ bygb f66489c;

    /* renamed from: d */
    final /* synthetic */ Long f66490d;

    /* renamed from: e */
    final /* synthetic */ agto f66491e;

    public agtm(agto agto, Context context, Long l, bygb bygb, Long l2) {
        this.f66491e = agto;
        this.f66487a = context;
        this.f66488b = l;
        this.f66489c = bygb;
        this.f66490d = l2;
    }

    public final void run() {
        Long l;
        Integer num;
        agry a = agrz.m55030a(this.f66487a, cfmv.m140318q(), this.f66491e.f66498c.f66261a, agqg.m54846a().intValue());
        try {
            agqd agqd = this.f66491e.f66498c;
            String str = agqd.f66264d;
            Long l2 = this.f66488b;
            int i = agqd.f66265e;
            bygb bygb = this.f66489c;
            bxvd da = byge.f166289c.mo74144da();
            long mostSignificantBits = this.f66491e.f66496a.f80284b.getUuid().getMostSignificantBits();
            int i2 = 0;
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            ((byge) da.f164949b).f166291a = mostSignificantBits;
            long leastSignificantBits = this.f66491e.f66496a.f80284b.getUuid().getLeastSignificantBits();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            ((byge) da.f164949b).f166292b = leastSignificantBits;
            byge byge = (byge) da.mo74062i();
            Integer valueOf = Integer.valueOf(this.f66491e.f66496a.f80287e);
            bxyk a2 = bxzt.m124580a(this.f66490d.longValue());
            SetConsentStatusRequest setConsentStatusRequest = this.f66491e.f66496a;
            if (!(setConsentStatusRequest == null || (num = setConsentStatusRequest.f80288f) == null)) {
                i2 = num.intValue();
            }
            Integer valueOf2 = Integer.valueOf(i2);
            SetConsentStatusRequest setConsentStatusRequest2 = this.f66491e.f66496a;
            long j = 0;
            if (!(setConsentStatusRequest2 == null || (l = setConsentStatusRequest2.f80289g) == null)) {
                j = l.longValue();
            }
            a.mo36043a(str, l2, i, bygb, byge, valueOf, a2, valueOf2, Long.valueOf(j));
            this.f66491e.mo36086a(bmxv.m108566b(Status.f30107a), this.f66489c);
        } catch (gid e) {
            bnsl bnsl = (bnsl) agto.f66495d.mo68388c();
            bnsl.mo68437a(e);
            bnsl.mo68420a("MDP_SERVER_GTAF_AUTH_FAILURE. Google auth failure: %s", bryx.m114908a(e.getMessage()));
            this.f66491e.mo36086a(bmxv.m108566b(new Status(27009, "MDP_SERVER_GTAF_AUTH_FAILURE. Google auth failure.")), this.f66489c);
        } catch (chuw e2) {
            bnsl bnsl2 = (bnsl) agto.f66495d.mo68388c();
            bnsl2.mo68437a(e2);
            bnsl2.mo68420a("StatusException while setting consent status: %s", bryx.m114908a(agrs.m55019a(e2)));
            this.f66491e.mo36086a(bmxv.m108566b(agrs.m55019a(e2)), this.f66489c);
        }
    }
}
