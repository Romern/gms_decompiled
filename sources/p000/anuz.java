package p000;

import android.app.PendingIntent;
import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.plus.model.posts.Comment;

/* renamed from: anuz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class anuz extends antm {

    /* renamed from: a */
    final /* synthetic */ anwj f77750a;

    /* renamed from: b */
    private final anuq f77751b;

    public anuz(anwj anwj, anuq anuq) {
        this.f77750a = anwj;
        this.f77751b = anuq;
    }

    /* renamed from: a */
    public final void mo42241a(int i, Bundle bundle, Comment comment) {
        PendingIntent pendingIntent;
        if (bundle != null) {
            pendingIntent = (PendingIntent) bundle.getParcelable("pendingIntent");
        } else {
            pendingIntent = null;
        }
        ConnectionResult connectionResult = new ConnectionResult(i, pendingIntent);
        anwj anwj = this.f77750a;
        anwj.mo25295a(new anva(anwj, this.f77751b, connectionResult));
    }
}
