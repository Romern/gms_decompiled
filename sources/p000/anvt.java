package p000;

import android.app.PendingIntent;
import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.plus.service.v1whitelisted.models.PeopleFeed;

/* renamed from: anvt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class anvt extends antm {

    /* renamed from: a */
    final /* synthetic */ anwj f77788a;

    /* renamed from: b */
    private final anrp f77789b;

    public anvt(anwj anwj, anrp anrp) {
        this.f77788a = anwj;
        this.f77789b = anrp;
    }

    /* renamed from: a */
    public final void mo42245a(int i, Bundle bundle, PeopleFeed peopleFeed) {
        PendingIntent pendingIntent;
        if (bundle != null) {
            pendingIntent = (PendingIntent) bundle.getParcelable("pendingIntent");
        } else {
            pendingIntent = null;
        }
        new ConnectionResult(i, pendingIntent);
        anwj anwj = this.f77788a;
        anwj.mo25295a(new anvu(anwj, this.f77789b, peopleFeed));
    }
}
