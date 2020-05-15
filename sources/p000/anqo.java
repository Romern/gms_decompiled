package p000;

import android.content.Intent;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.people.data.AudienceMember;
import java.util.ArrayList;
import java.util.Arrays;

/* renamed from: anqo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class anqo implements rkl {

    /* renamed from: a */
    final /* synthetic */ anqt f77459a;

    public anqo(anqt anqt) {
        this.f77459a = anqt;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo9454a(rkk rkk) {
        String str;
        allb allb = (allb) rkk;
        if (allb == null || !allb.mo7183bo().mo17710c()) {
            this.f77459a.mo42140a();
            return;
        }
        AudienceMember b = AudienceMember.m22640b(allb.mo40473b(), allb.mo40474c());
        Intent intent = this.f77459a.getActivity().getIntent();
        String a = rqc.m34255a(intent);
        String c = rqc.m34257c(intent);
        anqt anqt = this.f77459a;
        AudienceMember audienceMember = anqt.f77471f;
        if (audienceMember == null || (str = audienceMember.f30295e) == null) {
            this.f77459a.mo42141a(-1, new rqd(1, b, 3, null).mo25022a(), (Status) null);
            return;
        }
        rjo rjo = allr.f73629a;
        amcp.m62616a(anqt.f77470e, a, c, str, Arrays.asList(allb.mo40473b()), new ArrayList(), null).mo9458a(new anqs(this.f77459a, b, str));
    }
}
