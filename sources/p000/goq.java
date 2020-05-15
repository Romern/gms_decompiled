package p000;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.auth.AccountChangeEventsResponse;
import com.google.android.gms.common.api.Status;

/* renamed from: goq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class goq extends dcj implements gos {
    public goq(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.auth.account.data.IGetAccountChangeEventsCallback");
    }

    /* renamed from: a */
    public final void mo12114a(Status status, AccountChangeEventsResponse accountChangeEventsResponse) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, status);
        dcl.m8165a(bj, accountChangeEventsResponse);
        mo8530c(2, bj);
    }
}
