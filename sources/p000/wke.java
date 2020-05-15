package p000;

import android.content.DialogInterface;
import com.google.android.gms.family.p042v2.create.FamilyInvitationChimeraActivity;

/* renamed from: wke */
public final /* synthetic */ class wke implements DialogInterface.OnClickListener {

    /* renamed from: a */
    private final FamilyInvitationChimeraActivity f50790a;

    public wke(FamilyInvitationChimeraActivity familyInvitationChimeraActivity) {
        this.f50790a = familyInvitationChimeraActivity;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        FamilyInvitationChimeraActivity familyInvitationChimeraActivity = this.f50790a;
        dialogInterface.dismiss();
        familyInvitationChimeraActivity.mo18487s();
    }
}
