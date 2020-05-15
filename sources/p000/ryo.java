package p000;

import android.os.Parcel;
import com.google.android.gms.common.api.Status;

/* renamed from: ryo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ryo extends dck implements ryp {

    /* renamed from: a */
    final /* synthetic */ ryi f43858a;

    public ryo() {
        super("com.google.android.gms.common.download.internal.IDownloadServiceCallbacks");
    }

    /* renamed from: a */
    public final void mo25255a(Status status) {
        this.f43858a.mo17716a((rkk) status);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ryo(ryi ryi) {
        super("com.google.android.gms.common.download.internal.IDownloadServiceCallbacks");
        this.f43858a = ryi;
    }

    /* renamed from: a */
    public final boolean mo3209a(int i, Parcel parcel, Parcel parcel2) {
        if (i == 1) {
            mo25255a((Status) dcl.m8163a(parcel, Status.CREATOR));
        } else if (i != 2) {
            return false;
        } else {
            this.f43858a.mo17716a((rkk) ((Status) dcl.m8163a(parcel, Status.CREATOR)));
        }
        return true;
    }
}
