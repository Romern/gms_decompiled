package p000;

import android.app.PendingIntent;
import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;

/* renamed from: anvj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class anvj extends antm {

    /* renamed from: a */
    final /* synthetic */ anwj f77769a;

    /* renamed from: b */
    private final aoae f77770b;

    public anvj(anwj anwj, aoae aoae) {
        this.f77769a = anwj;
        this.f77770b = aoae;
    }

    /* renamed from: a */
    public final void mo41924a(int i, Bundle bundle, Bundle bundle2) {
        PendingIntent pendingIntent;
        ansz ansz = null;
        if (bundle != null) {
            pendingIntent = (PendingIntent) bundle.getParcelable("pendingIntent");
        } else {
            pendingIntent = null;
        }
        ConnectionResult connectionResult = new ConnectionResult(i, pendingIntent);
        if (bundle2 != null) {
            ansz = new ansz(bundle2);
        }
        anwj anwj = this.f77769a;
        anwj.mo25295a(new anvk(anwj, this.f77770b, connectionResult, ansz));
    }
}
