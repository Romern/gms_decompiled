package p000;

import android.app.PendingIntent;
import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.plus.model.posts.Post;

/* renamed from: anwb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class anwb extends antm {

    /* renamed from: a */
    final /* synthetic */ anwj f77803a;

    /* renamed from: b */
    private final anuv f77804b;

    public anwb(anwj anwj, anuv anuv) {
        this.f77803a = anwj;
        this.f77804b = anuv;
    }

    /* renamed from: a */
    public final void mo42242a(int i, Bundle bundle, Post post) {
        PendingIntent pendingIntent;
        if (bundle != null) {
            pendingIntent = (PendingIntent) bundle.getParcelable("pendingIntent");
        } else {
            pendingIntent = null;
        }
        ConnectionResult connectionResult = new ConnectionResult(i, pendingIntent);
        anwj anwj = this.f77803a;
        anwj.mo25295a(new anwc(anwj, this.f77804b, connectionResult, post));
    }
}
