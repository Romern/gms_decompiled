package p000;

import android.os.Parcel;
import com.google.android.gms.common.audience.widgets.AudienceView;
import com.google.android.gms.common.people.data.AudienceMember;

/* renamed from: rql */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class rql extends dck implements rqm {

    /* renamed from: a */
    final /* synthetic */ AudienceView f43521a;

    public rql() {
        super("com.google.android.gms.common.audience.dynamite.IAudienceViewCallbacks");
    }

    /* renamed from: a */
    public final void mo25031a() {
        this.f43521a.f30147a.mo7892a();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public rql(AudienceView audienceView) {
        super("com.google.android.gms.common.audience.dynamite.IAudienceViewCallbacks");
        this.f43521a = audienceView;
    }

    /* renamed from: a */
    public final void mo25032a(AudienceMember audienceMember) {
        rqp rqp = this.f43521a.f30148b;
        anpm anpm = (anpm) rqp;
        anpm.mo42093g().mo42124a(sfi.m35165b(anpm.mo42093g().f77451a, audienceMember), rqp);
    }

    /* renamed from: a */
    public final boolean mo3209a(int i, Parcel parcel, Parcel parcel2) {
        if (i == 3) {
            mo25032a((AudienceMember) dcl.m8163a(parcel, AudienceMember.CREATOR));
        } else if (i != 4) {
            return false;
        } else {
            mo25031a();
        }
        parcel2.writeNoException();
        return true;
    }
}
