package p000;

import android.os.IInterface;
import com.google.android.gms.nearby.bootstrap.request.ConnectRequest;
import com.google.android.gms.nearby.bootstrap.request.ContinueConnectRequest;
import com.google.android.gms.nearby.bootstrap.request.DisableTargetRequest;
import com.google.android.gms.nearby.bootstrap.request.DisconnectRequest;
import com.google.android.gms.nearby.bootstrap.request.EnableTargetRequest;
import com.google.android.gms.nearby.bootstrap.request.SendDataRequest;
import com.google.android.gms.nearby.bootstrap.request.StartScanRequest;
import com.google.android.gms.nearby.bootstrap.request.StopScanRequest;

/* renamed from: ahds */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public interface ahds extends IInterface {
    /* renamed from: a */
    String mo36351a();

    /* renamed from: a */
    void mo36352a(ahdp ahdp);

    /* renamed from: a */
    void mo36353a(ConnectRequest connectRequest);

    /* renamed from: a */
    void mo36354a(ContinueConnectRequest continueConnectRequest);

    /* renamed from: a */
    void mo36355a(DisableTargetRequest disableTargetRequest);

    /* renamed from: a */
    void mo36356a(DisconnectRequest disconnectRequest);

    /* renamed from: a */
    void mo36357a(EnableTargetRequest enableTargetRequest);

    /* renamed from: a */
    void mo36358a(SendDataRequest sendDataRequest);

    /* renamed from: a */
    void mo36359a(StartScanRequest startScanRequest);

    /* renamed from: a */
    void mo36360a(StopScanRequest stopScanRequest);
}
