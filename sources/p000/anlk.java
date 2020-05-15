package p000;

import android.app.PendingIntent;
import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;

/* renamed from: anlk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class anlk extends antm {

    /* renamed from: a */
    final /* synthetic */ anll f77053a;

    /* renamed from: b */
    final /* synthetic */ anky f77054b;

    public anlk(anll anll, anky anky) {
        this.f77053a = anll;
        this.f77054b = anky;
    }

    /* renamed from: a */
    public final void mo41924a(int i, Bundle bundle, Bundle bundle2) {
        PendingIntent pendingIntent;
        if (bundle != null) {
            pendingIntent = (PendingIntent) bundle.getParcelable("pendingIntent");
        } else {
            pendingIntent = null;
        }
        this.f77053a.f77055a.post(new anlj(this, new ConnectionResult(i, pendingIntent)));
    }
}
