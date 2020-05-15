package p000;

import android.os.Parcel;
import com.google.android.gms.nearby.internal.connection.OnConnectionResponseParams;

/* renamed from: aiga */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aiga extends dck implements aigb {

    /* renamed from: a */
    final /* synthetic */ aigi f68880a;

    public aiga() {
        super("com.google.android.gms.nearby.internal.connection.IConnectionResponseListener");
    }

    /* renamed from: a */
    public final void mo37466a(OnConnectionResponseParams onConnectionResponseParams) {
        aigi aigi = this.f68880a;
        String str = onConnectionResponseParams.f80581a;
        int i = onConnectionResponseParams.f80582b;
        byte[] bArr = onConnectionResponseParams.f80583c;
        Parcel bj = aigi.mo8529bj();
        bj.writeString(str);
        bj.writeInt(i);
        bj.writeByteArray(bArr);
        aigi.mo8528b(1006, bj);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public aiga(aigi aigi) {
        super("com.google.android.gms.nearby.internal.connection.IConnectionResponseListener");
        this.f68880a = aigi;
    }

    /* renamed from: a */
    public final boolean mo3209a(int i, Parcel parcel, Parcel parcel2) {
        if (i != 2) {
            return false;
        }
        mo37466a((OnConnectionResponseParams) dcl.m8163a(parcel, OnConnectionResponseParams.CREATOR));
        return true;
    }
}
