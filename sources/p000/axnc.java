package p000;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.walletp2p.internal.firstparty.ConfirmTransactionResponse;
import com.google.android.gms.walletp2p.internal.firstparty.GetTransactionDetailsResponse;

/* renamed from: axnc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class axnc extends dcj implements IInterface {
    public axnc(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.walletp2p.internal.firstparty.IFirstPartyWalletP2PServiceCallbacks");
    }

    /* renamed from: a */
    public final void mo53262a(ConfirmTransactionResponse confirmTransactionResponse, Status status) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, confirmTransactionResponse);
        dcl.m8165a(bj, status);
        mo8530c(4, bj);
    }

    /* renamed from: a */
    public final void mo53263a(GetTransactionDetailsResponse getTransactionDetailsResponse, Status status) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, getTransactionDetailsResponse);
        dcl.m8165a(bj, status);
        mo8530c(3, bj);
    }

    /* renamed from: a */
    public final void mo53264a(boolean z) {
        Parcel bj = mo8529bj();
        dcl.m8166a(bj, z);
        mo8530c(5, bj);
    }

    /* renamed from: a */
    public final void mo53265a(boolean z, Status status) {
        Parcel bj = mo8529bj();
        dcl.m8166a(bj, z);
        dcl.m8165a(bj, status);
        mo8530c(2, bj);
    }
}
