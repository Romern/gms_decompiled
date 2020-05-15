package p000;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.common.api.Status;

/* renamed from: gpd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class gpd extends dcj implements IInterface {
    public gpd(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.auth.account.data.IGetTokenHandleCallback");
    }

    /* renamed from: a */
    public final void mo12124a(Status status, String str) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, status);
        bj.writeString(str);
        mo8530c(2, bj);
    }
}
