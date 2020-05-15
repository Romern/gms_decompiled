package p000;

import android.app.PendingIntent;
import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;

/* renamed from: anvx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class anvx extends antm {

    /* renamed from: a */
    final /* synthetic */ anwj f77795a;

    /* renamed from: b */
    private final anut f77796b;

    public anvx(anwj anwj, anut anut) {
        this.f77795a = anwj;
        this.f77796b = anut;
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
        anwj anwj = this.f77795a;
        anut anut = this.f77796b;
        if (bundle2 != null) {
            ansz = new ansz(bundle2);
        }
        anwj.mo25295a(new anvy(anwj, anut, connectionResult, ansz));
    }
}
