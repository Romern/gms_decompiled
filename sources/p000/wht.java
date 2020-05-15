package p000;

import android.os.Bundle;
import com.google.android.chimera.Loader;
import com.google.android.chimera.LoaderManager;
import com.google.android.gms.family.invites.Contact;
import com.google.android.gms.family.invites.SendInvitationsChimeraActivity;
import java.util.ArrayList;
import java.util.List;

/* renamed from: wht */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class wht implements LoaderManager.LoaderCallbacks {

    /* renamed from: a */
    final /* synthetic */ SendInvitationsChimeraActivity f50681a;

    /* renamed from: b */
    private final String f50682b;

    /* renamed from: c */
    private final List f50683c;

    public wht(SendInvitationsChimeraActivity sendInvitationsChimeraActivity, String str, List list) {
        this.f50681a = sendInvitationsChimeraActivity;
        this.f50682b = str;
        this.f50683c = list;
    }

    public final Loader onCreateLoader(int i, Bundle bundle) {
        SendInvitationsChimeraActivity sendInvitationsChimeraActivity = this.f50681a;
        return new whn(sendInvitationsChimeraActivity, sendInvitationsChimeraActivity.f31316h, sendInvitationsChimeraActivity.f31315g, this.f50682b, this.f50683c, sendInvitationsChimeraActivity.f31311c);
    }

    public final /* bridge */ /* synthetic */ void onLoadFinished(Loader loader, Object obj) {
        why why = (why) obj;
        if (why.f50696b) {
            SendInvitationsChimeraActivity sendInvitationsChimeraActivity = this.f50681a;
            sendInvitationsChimeraActivity.f31312d = (ArrayList) why.f50695a;
            ArrayList arrayList = sendInvitationsChimeraActivity.f31312d;
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                int i2 = i + 1;
                if (((Contact) arrayList.get(i)).f31291j != 16) {
                    i = i2;
                } else {
                    this.f50681a.mo18417g();
                    return;
                }
            }
            this.f50681a.mo18408a(-1, 0);
            return;
        }
        ArrayList arrayList2 = this.f50681a.f31312d;
        int size2 = arrayList2.size();
        for (int i3 = 0; i3 < size2; i3++) {
            ((Contact) arrayList2.get(i3)).f31291j = 16;
        }
        this.f50681a.mo18417g();
    }

    public final void onLoaderReset(Loader loader) {
    }
}
