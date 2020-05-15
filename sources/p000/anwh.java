package p000;

import android.app.PendingIntent;
import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.plus.service.v1whitelisted.models.UpgradeAccountEntity;

/* renamed from: anwh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class anwh extends antm {

    /* renamed from: a */
    final /* synthetic */ anwj f77814a;

    /* renamed from: b */
    private final anux f77815b;

    public anwh(anwj anwj, anux anux) {
        this.f77814a = anwj;
        this.f77815b = anux;
    }

    /* renamed from: a */
    public final void mo42246a(int i, Bundle bundle, UpgradeAccountEntity upgradeAccountEntity) {
        PendingIntent pendingIntent;
        if (bundle != null) {
            pendingIntent = (PendingIntent) bundle.getParcelable("pendingIntent");
        } else {
            pendingIntent = null;
        }
        ConnectionResult connectionResult = new ConnectionResult(i, pendingIntent);
        anwj anwj = this.f77814a;
        anwj.mo25295a(new anwi(anwj, this.f77815b, connectionResult, upgradeAccountEntity));
    }
}
