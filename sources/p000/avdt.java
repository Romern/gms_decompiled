package p000;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.udc.DeviceDataUploadOptedInAccountsParcelable;

/* renamed from: avdt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class avdt extends avdk {

    /* renamed from: a */
    final /* synthetic */ avdu f92999a;

    public avdt(avdu avdu) {
        this.f92999a = avdu;
    }

    /* renamed from: a */
    public final void mo51157a(Status status, DeviceDataUploadOptedInAccountsParcelable deviceDataUploadOptedInAccountsParcelable) {
        this.f92999a.mo17716a((rkk) new avdi(status, deviceDataUploadOptedInAccountsParcelable));
    }
}
