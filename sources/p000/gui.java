package p000;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.auth.api.accounttransfer.AccountTransferMsg;
import com.google.android.gms.auth.api.accounttransfer.AuthenticatorTransferInfo;
import com.google.android.gms.auth.api.accounttransfer.DeviceMetaData;
import com.google.android.gms.common.api.Status;

/* renamed from: gui */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class gui extends dcj implements guk {
    public gui(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.auth.api.accounttransfer.internal.IAccountTransferCallbacks");
    }

    /* renamed from: a */
    public final void mo12199a() {
        mo8530c(4, mo8529bj());
    }

    /* renamed from: a */
    public final void mo12194a(DeviceMetaData deviceMetaData) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, deviceMetaData);
        mo8530c(7, bj);
    }

    /* renamed from: a */
    public final void mo12196a(Status status) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, status);
        mo8530c(5, bj);
    }

    /* renamed from: a */
    public final void mo12195a(Status status, AccountTransferMsg accountTransferMsg) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, status);
        dcl.m8165a(bj, accountTransferMsg);
        mo8530c(3, bj);
    }

    /* renamed from: a */
    public final void mo12241a(Status status, AuthenticatorTransferInfo authenticatorTransferInfo) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, status);
        dcl.m8165a(bj, authenticatorTransferInfo);
        mo8530c(2, bj);
    }

    /* renamed from: a */
    public final void mo12193a(byte[] bArr) {
        Parcel bj = mo8529bj();
        bj.writeByteArray(bArr);
        mo8530c(6, bj);
    }
}
