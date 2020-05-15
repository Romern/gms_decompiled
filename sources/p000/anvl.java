package p000;

import android.app.PendingIntent;
import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;
import java.util.List;

/* renamed from: anvl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class anvl extends antm {

    /* renamed from: a */
    final /* synthetic */ anwj f77773a;

    /* renamed from: b */
    private final anur f77774b;

    public anvl(anwj anwj, anur anur) {
        this.f77773a = anwj;
        this.f77774b = anur;
    }

    /* renamed from: a */
    public final void mo42249a(int i, Bundle bundle, List list) {
        PendingIntent pendingIntent;
        if (bundle != null) {
            pendingIntent = (PendingIntent) bundle.getParcelable("pendingIntent");
        } else {
            pendingIntent = null;
        }
        new ConnectionResult(i, pendingIntent);
        anwj anwj = this.f77773a;
        anwj.mo25295a(new anvm(anwj, this.f77774b, list));
    }
}
