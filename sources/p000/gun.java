package p000;

import android.os.IInterface;
import com.google.android.gms.auth.api.accounttransfer.AccountTransferMsg;
import com.google.android.gms.auth.api.accounttransfer.AuthenticatorTransferInfo;
import com.google.android.gms.auth.api.accounttransfer.internal.DeviceMetaDataRequest;
import com.google.android.gms.auth.api.accounttransfer.internal.NotifyCompletionRequest;
import com.google.android.gms.auth.api.accounttransfer.internal.RetrieveDataRequest;
import com.google.android.gms.auth.api.accounttransfer.internal.SendDataRequest;
import com.google.android.gms.auth.api.accounttransfer.internal.UserChallengeRequest;

/* renamed from: gun */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public interface gun extends IInterface {
    /* renamed from: a */
    void mo12179a(guk guk, AccountTransferMsg accountTransferMsg);

    /* renamed from: a */
    void mo12180a(guk guk, AuthenticatorTransferInfo authenticatorTransferInfo);

    /* renamed from: a */
    void mo12181a(guk guk, DeviceMetaDataRequest deviceMetaDataRequest);

    /* renamed from: a */
    void mo12182a(guk guk, NotifyCompletionRequest notifyCompletionRequest);

    /* renamed from: a */
    void mo12183a(guk guk, RetrieveDataRequest retrieveDataRequest);

    /* renamed from: a */
    void mo12184a(guk guk, SendDataRequest sendDataRequest);

    /* renamed from: a */
    void mo12185a(guk guk, UserChallengeRequest userChallengeRequest);

    /* renamed from: b */
    void mo12186b(guk guk, AccountTransferMsg accountTransferMsg);

    /* renamed from: b */
    void mo12187b(guk guk, AuthenticatorTransferInfo authenticatorTransferInfo);
}
