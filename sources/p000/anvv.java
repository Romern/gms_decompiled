package p000;

import android.app.PendingIntent;
import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;

/* renamed from: anvv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class anvv extends antm {

    /* renamed from: a */
    final /* synthetic */ anwj f77791a;

    /* renamed from: b */
    private final anus f77792b;

    public anvv(anwj anwj, anus anus) {
        this.f77791a = anwj;
        this.f77792b = anus;
    }

    /* renamed from: a */
    public final void mo41924a(int i, Bundle bundle, Bundle bundle2) {
        PendingIntent pendingIntent;
        anta anta = null;
        if (bundle != null) {
            pendingIntent = (PendingIntent) bundle.getParcelable("pendingIntent");
        } else {
            pendingIntent = null;
        }
        ConnectionResult connectionResult = new ConnectionResult(i, pendingIntent);
        if (bundle2 != null) {
            anta = new anta(bundle2);
        }
        anwj anwj = this.f77791a;
        anwj.mo25295a(new anvw(anwj, this.f77792b, connectionResult, anta));
    }
}
