package p000;

import android.content.ComponentName;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.apps.nbu.paisa.inapp.aidl.IsReadyToPayRequest;

/* renamed from: awsn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class awsn extends aeaa {

    /* renamed from: a */
    public final /* synthetic */ awso f95041a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public awsn(awso awso) {
        super("wallet");
        this.f95041a = awso;
    }

    /* renamed from: a */
    public final void mo6500a(ComponentName componentName) {
    }

    /* renamed from: a */
    public final void mo6501a(ComponentName componentName, IBinder iBinder) {
        ddi ddi;
        ddj ddj = new ddj(this);
        awso awso = this.f95041a;
        if (iBinder != null) {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.apps.nbu.paisa.inapp.aidl.IIsReadyToPayService");
            if (queryLocalInterface instanceof ddi) {
                ddi = (ddi) queryLocalInterface;
            } else {
                ddi = new ddi(iBinder);
            }
        } else {
            ddi = null;
        }
        awso.f95047f = ddi;
        try {
            awso awso2 = this.f95041a;
            ddi ddi2 = awso2.f95047f;
            if (ddi2 != null) {
                IsReadyToPayRequest isReadyToPayRequest = new IsReadyToPayRequest(awso2.f95044c);
                Parcel bj = ddi2.mo8529bj();
                dcl.m8165a(bj, isReadyToPayRequest);
                dcl.m8164a(bj, ddj);
                ddi2.mo8530c(1, bj);
                return;
            }
            ddj.mo8540a(false);
        } catch (RemoteException e) {
            throw new RuntimeException("isReadyToPay error: ", e);
        }
    }
}
