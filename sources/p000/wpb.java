package p000;

import android.view.View;
import com.google.android.gms.family.model.InvitationDataModel;

/* renamed from: wpb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class wpb implements View.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ InvitationDataModel f51071a;

    /* renamed from: b */
    final /* synthetic */ wpd f51072b;

    public wpb(wpd wpd, InvitationDataModel invitationDataModel) {
        this.f51072b = wpd;
        this.f51071a = invitationDataModel;
    }

    public void onClick(View view) {
        wgn.m41923c("ManageInvitationFragment", "Uninvite clicked", new Object[0]);
        this.f51072b.f51073a.mo18443b().mo29109a(14);
        this.f51072b.f51073a.mo18518b(this.f51071a);
    }
}
