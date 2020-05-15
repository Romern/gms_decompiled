package p000;

import android.app.PendingIntent;
import android.os.Bundle;
import android.os.ParcelFileDescriptor;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.plus.data.internal.PlusImageView;

/* renamed from: anvr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class anvr extends antm {

    /* renamed from: a */
    final /* synthetic */ anwj f77784a;

    /* renamed from: b */
    private final PlusImageView f77785b;

    public anvr(anwj anwj, PlusImageView plusImageView) {
        this.f77784a = anwj;
        this.f77785b = plusImageView;
    }

    /* renamed from: a */
    public final void mo42238a(int i, Bundle bundle, ParcelFileDescriptor parcelFileDescriptor) {
        PendingIntent pendingIntent;
        if (bundle != null) {
            pendingIntent = (PendingIntent) bundle.getParcelable("pendingIntent");
        } else {
            pendingIntent = null;
        }
        ConnectionResult connectionResult = new ConnectionResult(i, pendingIntent);
        anwj anwj = this.f77784a;
        anwj.mo25295a(new anvs(anwj, this.f77785b, connectionResult, parcelFileDescriptor));
    }
}
