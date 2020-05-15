package p000;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.wallet.service.p087ow.CreateWalletObjectsServiceRequest;
import com.google.android.gms.wallet.shared.BuyFlowConfig;
import com.google.android.gms.wallet.shared.service.ServerResponse;

/* renamed from: awwy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class awwy extends dcj implements awxa {
    public awwy(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.wallet.service.ow.IOwInternalService");
    }

    /* renamed from: a */
    public final ServerResponse mo52695a(BuyFlowConfig buyFlowConfig, CreateWalletObjectsServiceRequest createWalletObjectsServiceRequest) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, buyFlowConfig);
        dcl.m8165a(bj, createWalletObjectsServiceRequest);
        Parcel a = mo8526a(1, bj);
        ServerResponse serverResponse = (ServerResponse) dcl.m8163a(a, ServerResponse.CREATOR);
        a.recycle();
        return serverResponse;
    }
}
