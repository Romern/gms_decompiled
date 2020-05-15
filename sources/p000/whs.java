package p000;

import android.os.Bundle;
import com.google.android.chimera.Loader;
import com.google.android.chimera.LoaderManager;
import com.google.android.gms.family.invites.Contact;
import com.google.android.gms.family.invites.SendInvitationsChimeraActivity;

/* renamed from: whs */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class whs implements LoaderManager.LoaderCallbacks {

    /* renamed from: a */
    final /* synthetic */ Contact f50678a;

    /* renamed from: b */
    final /* synthetic */ boolean f50679b;

    /* renamed from: c */
    final /* synthetic */ SendInvitationsChimeraActivity f50680c;

    public whs(SendInvitationsChimeraActivity sendInvitationsChimeraActivity, Contact contact, boolean z) {
        this.f50680c = sendInvitationsChimeraActivity;
        this.f50678a = contact;
        this.f50679b = z;
    }

    public final Loader onCreateLoader(int i, Bundle bundle) {
        SendInvitationsChimeraActivity sendInvitationsChimeraActivity = this.f50680c;
        return new whx(sendInvitationsChimeraActivity, sendInvitationsChimeraActivity.f31316h, sendInvitationsChimeraActivity.f31315g, this.f50678a, this.f50679b, sendInvitationsChimeraActivity.f31311c);
    }

    public final /* bridge */ /* synthetic */ void onLoadFinished(Loader loader, Object obj) {
        SendInvitationsChimeraActivity sendInvitationsChimeraActivity;
        Contact contact;
        boolean z;
        brel brel = (brel) obj;
        if (this.f50679b) {
            sendInvitationsChimeraActivity = this.f50680c;
            contact = this.f50678a;
            z = true;
        } else {
            sendInvitationsChimeraActivity = this.f50680c;
            contact = this.f50678a;
            z = false;
        }
        sendInvitationsChimeraActivity.mo18411a(contact, z);
    }

    public final void onLoaderReset(Loader loader) {
    }
}
