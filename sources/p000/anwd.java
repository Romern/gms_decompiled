package p000;

import android.app.PendingIntent;
import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;

/* renamed from: anwd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class anwd extends antm {

    /* renamed from: a */
    final /* synthetic */ anwj f77807a;

    /* renamed from: b */
    private final anuw f77808b;

    public anwd(anwj anwj, anuw anuw) {
        this.f77807a = anwj;
        this.f77808b = anuw;
    }

    /* renamed from: a */
    public final void mo41924a(int i, Bundle bundle, Bundle bundle2) {
        PendingIntent pendingIntent;
        antb antb = null;
        if (bundle != null) {
            pendingIntent = (PendingIntent) bundle.getParcelable("pendingIntent");
        } else {
            pendingIntent = null;
        }
        ConnectionResult connectionResult = new ConnectionResult(i, pendingIntent);
        if (bundle2 != null) {
            antb = new antb(bundle2);
        }
        anwj anwj = this.f77807a;
        anwj.mo25295a(new anwe(anwj, this.f77808b, connectionResult, antb));
    }
}
