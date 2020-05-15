package p000;

import android.app.PendingIntent;
import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.plus.internal.model.apps.AppAclsEntity;

/* renamed from: anvf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class anvf extends antm {

    /* renamed from: a */
    final /* synthetic */ anwj f77760a;

    /* renamed from: b */
    private final anuo f77761b;

    public anvf(anwj anwj, anuo anuo) {
        this.f77760a = anwj;
        this.f77761b = anuo;
    }

    /* renamed from: a */
    public final void mo42240a(int i, Bundle bundle, AppAclsEntity appAclsEntity) {
        ConnectionResult connectionResult = new ConnectionResult(i, bundle != null ? (PendingIntent) bundle.getParcelable("pendingIntent") : null);
        anwj anwj = this.f77760a;
        anwj.mo25295a(new anvg(anwj, this.f77761b, connectionResult, appAclsEntity));
    }
}
