package p000;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.payse.internal.ExecuteSdkOperationRequest;
import com.google.android.gms.payse.internal.GetSeCardsRequest;

/* renamed from: alkj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class alkj extends dcj implements alkl {
    public alkj(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.payse.internal.IPaySeService");
    }

    /* renamed from: a */
    public final void mo40466a(alko alko) {
        throw null;
    }

    /* renamed from: a */
    public final void mo40467a(ExecuteSdkOperationRequest executeSdkOperationRequest, alko alko) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, executeSdkOperationRequest);
        dcl.m8164a(bj, alko);
        mo8528b(3, bj);
    }

    /* renamed from: a */
    public final void mo40468a(GetSeCardsRequest getSeCardsRequest, alko alko) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, getSeCardsRequest);
        dcl.m8164a(bj, alko);
        mo8528b(2, bj);
    }
}
