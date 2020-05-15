package p000;

import android.os.Parcel;

/* renamed from: aaln */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aaln extends dck implements aalo {

    /* renamed from: a */
    final /* synthetic */ apik f28410a;

    public aaln() {
        super("com.google.android.gms.gcm.INetworkTaskCallback");
    }

    /* renamed from: a */
    public final void mo16975a(int i) {
        this.f28410a.mo47293a(i);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public aaln(apik apik) {
        super("com.google.android.gms.gcm.INetworkTaskCallback");
        this.f28410a = apik;
    }

    /* renamed from: a */
    public final boolean mo3209a(int i, Parcel parcel, Parcel parcel2) {
        if (i != 2) {
            return false;
        }
        mo16975a(parcel.readInt());
        parcel2.writeNoException();
        return true;
    }
}
