package p000;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.auth.firstparty.dataservice.TokenResponse;
import com.google.android.gms.common.api.Status;

/* renamed from: gpc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class gpc extends dcj implements IInterface {
    public gpc(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.auth.account.data.IGetTokenCallback");
    }

    /* renamed from: a */
    public final void mo12123a(Status status, TokenResponse tokenResponse) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, status);
        dcl.m8165a(bj, tokenResponse);
        mo8530c(2, bj);
    }
}
