package p000;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.auth.firstparty.dataservice.GoogleAccountData;
import com.google.android.gms.common.api.Status;

/* renamed from: gpb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class gpb extends dcj implements IInterface {
    public gpb(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.auth.account.data.IGetGoogleAccountDataCallback");
    }

    /* renamed from: a */
    public final void mo12122a(Status status, GoogleAccountData googleAccountData) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, status);
        dcl.m8165a(bj, googleAccountData);
        mo8530c(2, bj);
    }
}
