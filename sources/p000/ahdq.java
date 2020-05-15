package p000;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.nearby.bootstrap.request.ConnectRequest;
import com.google.android.gms.nearby.bootstrap.request.ContinueConnectRequest;
import com.google.android.gms.nearby.bootstrap.request.DisableTargetRequest;
import com.google.android.gms.nearby.bootstrap.request.DisconnectRequest;
import com.google.android.gms.nearby.bootstrap.request.EnableTargetRequest;
import com.google.android.gms.nearby.bootstrap.request.SendDataRequest;
import com.google.android.gms.nearby.bootstrap.request.StartScanRequest;
import com.google.android.gms.nearby.bootstrap.request.StopScanRequest;

/* renamed from: ahdq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ahdq extends dcj implements ahds {
    public ahdq(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.nearby.bootstrap.internal.INearbyBootstrapService");
    }

    /* renamed from: a */
    public final String mo36351a() {
        throw null;
    }

    /* renamed from: a */
    public final void mo36355a(DisableTargetRequest disableTargetRequest) {
        throw null;
    }

    /* renamed from: a */
    public final void mo36357a(EnableTargetRequest enableTargetRequest) {
        throw null;
    }

    /* renamed from: a */
    public final void mo36352a(ahdp ahdp) {
        Parcel bj = mo8529bj();
        dcl.m8164a(bj, ahdp);
        mo8528b(10, bj);
    }

    /* renamed from: a */
    public final void mo36353a(ConnectRequest connectRequest) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, connectRequest);
        mo8528b(5, bj);
    }

    /* renamed from: a */
    public final void mo36354a(ContinueConnectRequest continueConnectRequest) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, continueConnectRequest);
        mo8528b(8, bj);
    }

    /* renamed from: a */
    public final void mo36356a(DisconnectRequest disconnectRequest) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, disconnectRequest);
        mo8528b(6, bj);
    }

    /* renamed from: a */
    public final void mo36358a(SendDataRequest sendDataRequest) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, sendDataRequest);
        mo8528b(7, bj);
    }

    /* renamed from: a */
    public final void mo36359a(StartScanRequest startScanRequest) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, startScanRequest);
        mo8528b(1, bj);
    }

    /* renamed from: a */
    public final void mo36360a(StopScanRequest stopScanRequest) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, stopScanRequest);
        mo8528b(2, bj);
    }
}
