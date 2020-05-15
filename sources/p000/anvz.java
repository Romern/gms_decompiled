package p000;

import android.app.PendingIntent;
import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.plus.model.posts.Settings;

/* renamed from: anvz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class anvz extends antm {

    /* renamed from: a */
    final /* synthetic */ anwj f77799a;

    /* renamed from: b */
    private final anuu f77800b;

    public anvz(anwj anwj, anuu anuu) {
        this.f77799a = anwj;
        this.f77800b = anuu;
    }

    /* renamed from: a */
    public final void mo42243a(int i, Bundle bundle, Settings settings) {
        PendingIntent pendingIntent;
        if (bundle != null) {
            pendingIntent = (PendingIntent) bundle.getParcelable("pendingIntent");
        } else {
            pendingIntent = null;
        }
        ConnectionResult connectionResult = new ConnectionResult(i, pendingIntent);
        anwj anwj = this.f77799a;
        anwj.mo25295a(new anwa(anwj, this.f77800b, connectionResult, settings));
    }
}
