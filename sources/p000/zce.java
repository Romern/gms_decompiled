package p000;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.fitness.result.ListSubscriptionsResult;

/* renamed from: zce */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class zce extends dcj implements IInterface {
    public zce(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.fitness.internal.IListSubscriptionsCallback");
    }

    /* renamed from: a */
    public final void mo30929a(ListSubscriptionsResult listSubscriptionsResult) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, listSubscriptionsResult);
        mo8530c(1, bj);
    }
}
