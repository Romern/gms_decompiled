package p000;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.fitness.request.ListSubscriptionsRequest;
import com.google.android.gms.fitness.request.SubscribeRequest;
import com.google.android.gms.fitness.request.UnsubscribeRequest;

/* renamed from: zbu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class zbu extends dcj implements zbw {
    public zbu(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.fitness.internal.IGoogleFitRecordingApi");
    }

    /* renamed from: a */
    public final void mo30917a(ListSubscriptionsRequest listSubscriptionsRequest) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, listSubscriptionsRequest);
        mo8528b(3, bj);
    }

    /* renamed from: a */
    public final void mo30918a(SubscribeRequest subscribeRequest) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, subscribeRequest);
        mo8528b(1, bj);
    }

    /* renamed from: a */
    public final void mo30919a(UnsubscribeRequest unsubscribeRequest) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, unsubscribeRequest);
        mo8528b(2, bj);
    }
}
