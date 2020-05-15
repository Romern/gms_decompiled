package p000;

import android.app.PendingIntent;
import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.plus.service.v1whitelisted.models.MomentsFeed;

/* renamed from: anvp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class anvp extends antm {

    /* renamed from: a */
    final /* synthetic */ anwj f77780a;

    /* renamed from: b */
    private final anns f77781b;

    public anvp(anwj anwj, anns anns) {
        this.f77780a = anwj;
        this.f77781b = anns;
    }

    /* renamed from: a */
    public final void mo42244a(int i, Bundle bundle, MomentsFeed momentsFeed) {
        PendingIntent pendingIntent;
        if (bundle != null) {
            pendingIntent = (PendingIntent) bundle.getParcelable("pendingIntent");
        } else {
            pendingIntent = null;
        }
        ConnectionResult connectionResult = new ConnectionResult(i, pendingIntent);
        anwj anwj = this.f77780a;
        anwj.mo25295a(new anvq(anwj, this.f77781b, connectionResult, momentsFeed));
    }
}
