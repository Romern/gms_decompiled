package p000;

import android.app.PendingIntent;
import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;

/* renamed from: anwf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class anwf extends antm {

    /* renamed from: a */
    final /* synthetic */ anwj f77811a;

    /* renamed from: b */
    private final annh f77812b;

    public anwf(anwj anwj, annh annh) {
        this.f77811a = anwj;
        this.f77812b = annh;
    }

    /* renamed from: b */
    public final void mo42251b(int i, Bundle bundle) {
        PendingIntent pendingIntent;
        if (bundle != null) {
            pendingIntent = (PendingIntent) bundle.getParcelable("pendingIntent");
        } else {
            pendingIntent = null;
        }
        ConnectionResult connectionResult = new ConnectionResult(i, pendingIntent);
        anwj anwj = this.f77811a;
        anwj.mo25295a(new anwg(anwj, this.f77812b, connectionResult));
    }
}
