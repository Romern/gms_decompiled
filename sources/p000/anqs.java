package p000;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.people.data.AudienceMember;

/* renamed from: anqs */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class anqs implements rkl {

    /* renamed from: a */
    final /* synthetic */ anqt f77463a;

    /* renamed from: b */
    private final AudienceMember f77464b;

    /* renamed from: c */
    private final String f77465c;

    public anqs(anqt anqt, AudienceMember audienceMember, String str) {
        this.f77463a = anqt;
        this.f77464b = audienceMember;
        this.f77465c = str;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo9454a(rkk rkk) {
        String str;
        alle alle = (alle) rkk;
        if (alle == null || !alle.mo7183bo().mo17710c() || (str = this.f77464b.f30294d) == null || !str.equals(alle.mo40482b().get(0))) {
            this.f77463a.mo42141a(7, new rqd(1, this.f77464b, 2, null).mo25022a(), (Status) null);
        } else {
            this.f77463a.mo42141a(-1, new rqd(1, this.f77464b, 1, this.f77465c).mo25022a(), alle.mo7183bo());
        }
    }
}
