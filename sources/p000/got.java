package p000;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.common.api.Status;

/* renamed from: got */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class got extends dcj implements IInterface {
    public got(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.auth.account.data.IGetAccountExportDataCallback");
    }

    /* renamed from: a */
    public final void mo12115a(Status status, Bundle bundle) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, status);
        dcl.m8165a(bj, bundle);
        mo8530c(2, bj);
    }
}
