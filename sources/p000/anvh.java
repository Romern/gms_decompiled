package p000;

import android.app.PendingIntent;
import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.data.DataHolder;

/* renamed from: anvh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class anvh extends antm {

    /* renamed from: a */
    final /* synthetic */ anwj f77764a;

    /* renamed from: b */
    private final anup f77765b;

    public anvh(anwj anwj, anup anup) {
        this.f77764a = anwj;
        this.f77765b = anup;
    }

    /* renamed from: a */
    public final void mo42250a(DataHolder dataHolder, String str) {
        PendingIntent pendingIntent;
        DataHolder dataHolder2;
        Bundle bundle = dataHolder.f30166f;
        if (bundle != null) {
            pendingIntent = (PendingIntent) bundle.getParcelable("pendingIntent");
        } else {
            pendingIntent = null;
        }
        ConnectionResult connectionResult = new ConnectionResult(dataHolder.f30165e, pendingIntent);
        if (!connectionResult.mo17671b() && dataHolder != null) {
            if (!dataHolder.mo17768b()) {
                dataHolder.close();
            }
            dataHolder2 = null;
        } else {
            dataHolder2 = dataHolder;
        }
        anwj anwj = this.f77764a;
        anwj.mo25295a(new anvi(anwj, this.f77765b, connectionResult, dataHolder2, str));
    }
}
