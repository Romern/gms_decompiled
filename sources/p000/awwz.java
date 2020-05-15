package p000;

import android.os.Parcel;
import com.google.android.gms.wallet.service.p087ow.CreateWalletObjectsServiceRequest;
import com.google.android.gms.wallet.shared.BuyFlowConfig;
import com.google.android.gms.wallet.shared.service.ServerResponse;

/* renamed from: awwz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class awwz extends dck implements awxa {
    public awwz() {
        super("com.google.android.gms.wallet.service.ow.IOwInternalService");
    }

    /* renamed from: a */
    public final boolean mo3209a(int i, Parcel parcel, Parcel parcel2) {
        if (i != 1) {
            return false;
        }
        ServerResponse a = mo52695a((BuyFlowConfig) dcl.m8163a(parcel, BuyFlowConfig.CREATOR), (CreateWalletObjectsServiceRequest) dcl.m8163a(parcel, CreateWalletObjectsServiceRequest.CREATOR));
        parcel2.writeNoException();
        dcl.m8169b(parcel2, a);
        return true;
    }
}
