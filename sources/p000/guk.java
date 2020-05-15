package p000;

import android.os.IInterface;
import com.google.android.gms.auth.api.accounttransfer.AccountTransferMsg;
import com.google.android.gms.auth.api.accounttransfer.AuthenticatorTransferInfo;
import com.google.android.gms.auth.api.accounttransfer.DeviceMetaData;
import com.google.android.gms.common.api.Status;

/* renamed from: guk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public interface guk extends IInterface {
    /* renamed from: a */
    void mo12199a();

    /* renamed from: a */
    void mo12194a(DeviceMetaData deviceMetaData);

    /* renamed from: a */
    void mo12196a(Status status);

    /* renamed from: a */
    void mo12195a(Status status, AccountTransferMsg accountTransferMsg);

    /* renamed from: a */
    void mo12241a(Status status, AuthenticatorTransferInfo authenticatorTransferInfo);

    /* renamed from: a */
    void mo12193a(byte[] bArr);
}
