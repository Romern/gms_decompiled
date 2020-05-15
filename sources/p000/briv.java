package p000;

import android.os.IBinder;
import android.os.Parcel;
import com.google.firebase.appindexing.internal.CallStatus;
import com.google.firebase.appindexing.internal.GetIndexableRequest;
import com.google.firebase.appindexing.internal.MutateRequest;

/* renamed from: briv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class briv extends dcj implements brix {
    public briv(IBinder iBinder) {
        super(iBinder, "com.google.firebase.appindexing.internal.IAppIndexingService");
    }

    /* renamed from: a */
    public final CallStatus mo69574a(rnt rnt, MutateRequest mutateRequest) {
        Parcel bj = mo8529bj();
        dcl.m8164a(bj, rnt);
        dcl.m8165a(bj, mutateRequest);
        Parcel a = mo8526a(8, bj);
        CallStatus callStatus = (CallStatus) dcl.m8163a(a, CallStatus.CREATOR);
        a.recycle();
        return callStatus;
    }

    /* renamed from: a */
    public final void mo69575a(briu briu, GetIndexableRequest getIndexableRequest) {
        Parcel bj = mo8529bj();
        dcl.m8164a(bj, briu);
        dcl.m8165a(bj, getIndexableRequest);
        mo8528b(5, bj);
    }
}
