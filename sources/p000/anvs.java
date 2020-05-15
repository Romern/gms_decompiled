package p000;

import android.os.ParcelFileDescriptor;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.plus.data.internal.PlusImageView;

/* renamed from: anvs */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class anvs extends saf {

    /* renamed from: a */
    private final ConnectionResult f77786a;

    /* renamed from: b */
    private final ParcelFileDescriptor f77787b;

    public anvs(anwj anwj, PlusImageView plusImageView, ConnectionResult connectionResult, ParcelFileDescriptor parcelFileDescriptor) {
        super(anwj, plusImageView);
        this.f77786a = connectionResult;
        this.f77787b = parcelFileDescriptor;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo25280a(Object obj) {
        PlusImageView plusImageView = (PlusImageView) obj;
        ConnectionResult connectionResult = this.f77786a;
        ParcelFileDescriptor parcelFileDescriptor = this.f77787b;
        if (connectionResult.mo17671b()) {
            plusImageView.f82343c = false;
            if (parcelFileDescriptor != null) {
                new ansy(plusImageView, plusImageView.f82341a).execute(parcelFileDescriptor);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo25282b() {
        ParcelFileDescriptor parcelFileDescriptor = this.f77787b;
        if (parcelFileDescriptor != null) {
            srz.m36170a(parcelFileDescriptor);
        }
    }
}
