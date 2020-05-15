package p000;

import android.os.Parcel;
import com.google.android.gms.auth.api.accounttransfer.AccountTransferMsg;
import com.google.android.gms.auth.api.accounttransfer.AuthenticatorTransferInfo;
import com.google.android.gms.auth.api.accounttransfer.DeviceMetaData;
import com.google.android.gms.common.api.Status;

/* renamed from: guj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class guj extends dck implements guk {
    public guj() {
        super("com.google.android.gms.auth.api.accounttransfer.internal.IAccountTransferCallbacks");
    }

    /* renamed from: a */
    public void mo12199a() {
        throw new UnsupportedOperationException();
    }

    /* renamed from: a */
    public void mo12194a(DeviceMetaData deviceMetaData) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: a */
    public void mo12196a(Status status) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: a */
    public void mo12195a(Status status, AccountTransferMsg accountTransferMsg) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: a */
    public final void mo12241a(Status status, AuthenticatorTransferInfo authenticatorTransferInfo) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: a */
    public void mo12193a(byte[] bArr) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: a */
    public final boolean mo3209a(int i, Parcel parcel, Parcel parcel2) {
        switch (i) {
            case 1:
                Status status = (Status) dcl.m8163a(parcel, Status.CREATOR);
                throw new UnsupportedOperationException();
            case 2:
                mo12241a((Status) dcl.m8163a(parcel, Status.CREATOR), (AuthenticatorTransferInfo) dcl.m8163a(parcel, AuthenticatorTransferInfo.CREATOR));
                return true;
            case 3:
                mo12195a((Status) dcl.m8163a(parcel, Status.CREATOR), (AccountTransferMsg) dcl.m8163a(parcel, AccountTransferMsg.CREATOR));
                return true;
            case 4:
                mo12199a();
                return true;
            case 5:
                mo12196a((Status) dcl.m8163a(parcel, Status.CREATOR));
                return true;
            case 6:
                mo12193a(parcel.createByteArray());
                return true;
            case 7:
                mo12194a((DeviceMetaData) dcl.m8163a(parcel, DeviceMetaData.CREATOR));
                return true;
            default:
                return false;
        }
    }
}
