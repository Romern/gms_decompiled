package p000;

import android.app.PendingIntent;
import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.plus.internal.model.apps.AppAclsEntity;

/* renamed from: anvd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class anvd extends antm {

    /* renamed from: a */
    final /* synthetic */ anwj f77756a;

    /* renamed from: b */
    private final anun f77757b;

    public anvd(anwj anwj, anun anun) {
        this.f77756a = anwj;
        this.f77757b = anun;
    }

    /* renamed from: a */
    public final void mo42248a(int i, Bundle bundle, String str, AppAclsEntity appAclsEntity) {
        ConnectionResult connectionResult = new ConnectionResult(i, bundle != null ? (PendingIntent) bundle.getParcelable("pendingIntent") : null);
        anwj anwj = this.f77756a;
        anwj.mo25295a(new anve(anwj, this.f77757b, connectionResult, appAclsEntity));
    }
}
