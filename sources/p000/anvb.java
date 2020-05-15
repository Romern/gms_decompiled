package p000;

import android.app.PendingIntent;
import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;

/* renamed from: anvb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class anvb extends antm {

    /* renamed from: a */
    final /* synthetic */ anwj f77753a;

    /* renamed from: b */
    private final anum f77754b;

    public anvb(anwj anwj, anum anum) {
        this.f77753a = anwj;
        this.f77754b = anum;
    }

    /* renamed from: a */
    public final void mo42237a(int i, Bundle bundle) {
        ConnectionResult connectionResult = new ConnectionResult(i, bundle != null ? (PendingIntent) bundle.getParcelable("pendingIntent") : null);
        anwj anwj = this.f77753a;
        anwj.mo25295a(new anvc(anwj, this.f77754b, connectionResult));
    }
}
