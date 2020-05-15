package p000;

import android.app.PendingIntent;
import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;

/* renamed from: anvn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class anvn extends antm {

    /* renamed from: a */
    final /* synthetic */ anwj f77776a;

    /* renamed from: b */
    private final anmx f77777b;

    public anvn(anwj anwj, anmx anmx) {
        this.f77776a = anwj;
        this.f77777b = anmx;
    }

    /* renamed from: a */
    public final void mo42247a(int i, Bundle bundle, String str) {
        ConnectionResult connectionResult = new ConnectionResult(i, bundle != null ? (PendingIntent) bundle.getParcelable("pendingIntent") : null);
        anwj anwj = this.f77776a;
        anwj.mo25295a(new anvo(anwj, this.f77777b, connectionResult, str));
    }
}
