package p000;

import android.os.Parcel;
import com.google.location.nearby.direct.client.internal.OperationRequest;
import com.google.location.nearby.direct.client.internal.OperationResponse;

/* renamed from: bvaz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class bvaz extends dck implements bvba {
    public bvaz() {
        super("com.google.location.nearby.direct.client.internal.INearbyDirectService");
    }

    /* renamed from: a */
    public final boolean mo3209a(int i, Parcel parcel, Parcel parcel2) {
        if (i == 1) {
            OperationResponse a = mo73267a((OperationRequest) dcl.m8163a(parcel, OperationRequest.CREATOR));
            parcel2.writeNoException();
            dcl.m8169b(parcel2, a);
        } else if (i == 2) {
            OperationResponse a2 = mo73268a(parcel.readString());
            parcel2.writeNoException();
            dcl.m8169b(parcel2, a2);
        } else if (i == 3) {
            OperationResponse b = mo73269b((OperationRequest) dcl.m8163a(parcel, OperationRequest.CREATOR));
            parcel2.writeNoException();
            dcl.m8169b(parcel2, b);
        } else if (i == 4) {
            boolean c = mo73270c((OperationRequest) dcl.m8163a(parcel, OperationRequest.CREATOR));
            parcel2.writeNoException();
            dcl.m8166a(parcel2, c);
        } else if (i != 5) {
            return false;
        } else {
            boolean d = mo73271d((OperationRequest) dcl.m8163a(parcel, OperationRequest.CREATOR));
            parcel2.writeNoException();
            dcl.m8166a(parcel2, d);
        }
        return true;
    }
}
