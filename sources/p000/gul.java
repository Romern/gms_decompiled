package p000;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.auth.api.accounttransfer.AccountTransferMsg;
import com.google.android.gms.auth.api.accounttransfer.AuthenticatorTransferInfo;
import com.google.android.gms.auth.api.accounttransfer.internal.DeviceMetaDataRequest;
import com.google.android.gms.auth.api.accounttransfer.internal.NotifyCompletionRequest;
import com.google.android.gms.auth.api.accounttransfer.internal.RetrieveDataRequest;
import com.google.android.gms.auth.api.accounttransfer.internal.SendDataRequest;
import com.google.android.gms.auth.api.accounttransfer.internal.UserChallengeRequest;

/* renamed from: gul */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class gul extends dcj implements gun {
    public gul(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.auth.api.accounttransfer.internal.IAccountTransferService");
    }

    /* renamed from: a */
    public final void mo12179a(guk guk, AccountTransferMsg accountTransferMsg) {
        Parcel bj = mo8529bj();
        dcl.m8164a(bj, guk);
        dcl.m8165a(bj, accountTransferMsg);
        mo8528b(1, bj);
    }

    /* renamed from: a */
    public final void mo12180a(guk guk, AuthenticatorTransferInfo authenticatorTransferInfo) {
        throw null;
    }

    /* renamed from: b */
    public final void mo12186b(guk guk, AccountTransferMsg accountTransferMsg) {
        Parcel bj = mo8529bj();
        dcl.m8164a(bj, guk);
        dcl.m8165a(bj, accountTransferMsg);
        mo8528b(2, bj);
    }

    /* renamed from: b */
    public final void mo12187b(guk guk, AuthenticatorTransferInfo authenticatorTransferInfo) {
        throw null;
    }

    /* renamed from: a */
    public final void mo12181a(guk guk, DeviceMetaDataRequest deviceMetaDataRequest) {
        Parcel bj = mo8529bj();
        dcl.m8164a(bj, guk);
        dcl.m8165a(bj, deviceMetaDataRequest);
        mo8528b(7, bj);
    }

    /* renamed from: a */
    public final void mo12182a(guk guk, NotifyCompletionRequest notifyCompletionRequest) {
        Parcel bj = mo8529bj();
        dcl.m8164a(bj, guk);
        dcl.m8165a(bj, notifyCompletionRequest);
        mo8528b(9, bj);
    }

    /* renamed from: a */
    public final void mo12183a(guk guk, RetrieveDataRequest retrieveDataRequest) {
        Parcel bj = mo8529bj();
        dcl.m8164a(bj, guk);
        dcl.m8165a(bj, retrieveDataRequest);
        mo8528b(6, bj);
    }

    /* renamed from: a */
    public final void mo12184a(guk guk, SendDataRequest sendDataRequest) {
        Parcel bj = mo8529bj();
        dcl.m8164a(bj, guk);
        dcl.m8165a(bj, sendDataRequest);
        mo8528b(5, bj);
    }

    /* renamed from: a */
    public final void mo12185a(guk guk, UserChallengeRequest userChallengeRequest) {
        Parcel bj = mo8529bj();
        dcl.m8164a(bj, guk);
        dcl.m8165a(bj, userChallengeRequest);
        mo8528b(8, bj);
    }
}
