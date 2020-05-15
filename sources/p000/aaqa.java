package p000;

import android.os.IInterface;
import android.os.Parcel;

/* renamed from: aaqa */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aaqa extends dck implements IInterface {

    /* renamed from: a */
    final /* synthetic */ apik f28872a;

    public aaqa() {
        super("com.google.android.gms.gcm.nts.INetworkTaskCallback");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public aaqa(apik apik) {
        super("com.google.android.gms.gcm.nts.INetworkTaskCallback");
        this.f28872a = apik;
    }

    /* renamed from: a */
    public final boolean mo3209a(int i, Parcel parcel, Parcel parcel2) {
        if (i != 1) {
            return false;
        }
        this.f28872a.mo47293a(parcel.readInt());
        parcel2.writeNoException();
        return true;
    }
}
