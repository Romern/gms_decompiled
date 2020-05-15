package p000;

import android.os.Bundle;
import android.os.IBinder;
import android.util.Log;
import com.google.android.gms.common.internal.ConnectionInfo;

/* renamed from: sah */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class sah extends scj {

    /* renamed from: a */
    private sam f43920a;

    /* renamed from: b */
    private final int f43921b;

    public sah(sam sam, int i) {
        this.f43920a = sam;
        this.f43921b = i;
    }

    /* renamed from: a */
    public final void mo16677a(int i, Bundle bundle) {
        Log.wtf("GmsClient", "received deprecated onAccountValidationComplete callback, ignoring", new Exception());
    }

    /* renamed from: a */
    public final void mo16678a(int i, IBinder iBinder, Bundle bundle) {
        sdo.checkIfNull(this.f43920a, "onPostInitComplete can be called only once per call to getRemoteService");
        this.f43920a.mo16780a(i, iBinder, bundle, this.f43921b);
        this.f43920a = null;
    }

    /* renamed from: a */
    public final void mo16679a(int i, IBinder iBinder, ConnectionInfo connectionInfo) {
        sdo.checkIfNull(this.f43920a, "onPostInitCompleteWithConnectionInfo can be called only once per call togetRemoteService");
        sdo.m34959a(connectionInfo);
        sam sam = this.f43920a;
        String[] strArr = sam.f43928G;
        sam.f43934E = connectionInfo;
        mo16678a(i, iBinder, connectionInfo.f30223a);
    }
}
