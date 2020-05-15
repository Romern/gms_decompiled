package p000;

import android.content.DialogInterface;
import android.content.Intent;
import com.google.android.gms.family.invites.SendInvitationsChimeraActivity;

/* renamed from: whq */
public final /* synthetic */ class whq implements DialogInterface.OnClickListener {

    /* renamed from: a */
    private final SendInvitationsChimeraActivity f50674a;

    public whq(SendInvitationsChimeraActivity sendInvitationsChimeraActivity) {
        this.f50674a = sendInvitationsChimeraActivity;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        SendInvitationsChimeraActivity sendInvitationsChimeraActivity = this.f50674a;
        sendInvitationsChimeraActivity.f31317i.mo29111a(4, 9, "sendinv");
        sbw sbw = wgn.f50624a;
        sendInvitationsChimeraActivity.setResult(4, new Intent().putExtra("accountName", sendInvitationsChimeraActivity.f31311c).putExtra("errorCode", -8));
        sendInvitationsChimeraActivity.finish();
    }
}
