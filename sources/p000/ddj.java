package p000;

import android.os.IInterface;
import android.os.Parcel;

/* renamed from: ddj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ddj extends dck implements IInterface {

    /* renamed from: a */
    final /* synthetic */ awsn f12936a;

    public ddj() {
        super("com.google.android.apps.nbu.paisa.inapp.aidl.IIsReadyToPayServiceCallback");
    }

    /* renamed from: a */
    public final void mo8540a(boolean z) {
        awso awso = this.f12936a.f95041a;
        awso.f95046e = z;
        awso.f95042a.countDown();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ddj(awsn awsn) {
        super("com.google.android.apps.nbu.paisa.inapp.aidl.IIsReadyToPayServiceCallback");
        this.f12936a = awsn;
    }

    /* renamed from: a */
    public final boolean mo3209a(int i, Parcel parcel, Parcel parcel2) {
        if (i != 1) {
            return false;
        }
        mo8540a(dcl.m8167a(parcel));
        return true;
    }
}
