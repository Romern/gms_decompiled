package com.google.android.gms.smartdevice.directtransfer;

import android.os.Handler;
import android.os.HandlerThread;
import com.felicanetworks.mfc.mfi.BaseMfiEventCallback;
import com.google.android.gms.common.internal.GetServiceRequest;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class SourceDirectTransferApiService extends zzx {

    /* renamed from: b */
    private static final sek f108054b = ascp.m73787a("DirectTransfer", "SourceDirectTransferApiService");

    /* renamed from: l */
    private static final arah f108055l = arah.f87196a;

    /* renamed from: m */
    private static final armb f108056m = armb.f87877a;

    /* renamed from: a */
    Handler f108057a;

    /* renamed from: k */
    private arqy f108058k;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo6267a(aaac aaac, GetServiceRequest getServiceRequest) {
        String str = getServiceRequest.f30230d;
        ascd ascd = new ascd(this);
        sbe sbe = new sbe(str);
        if (this.f108058k == null) {
            this.f108058k = new arqy(this.f56354e, f108055l, f108056m, this, this.f108057a, str, sbe.mo25331a(), ascd.mo49036a(str));
        }
        aaac.mo16652a(this.f108058k);
    }

    public final void onCreate() {
        f108054b.mo25409a("onCreate()", new Object[0]);
        HandlerThread handlerThread = new HandlerThread("SourceDeviceBackground", 10);
        handlerThread.start();
        handlerThread.getLooper();
        this.f108057a = new adzt(handlerThread.getLooper());
    }

    public final void onDestroy() {
        f108054b.mo25409a("onDestroy()", new Object[0]);
        arqy arqy = this.f108058k;
        if (arqy != null) {
            armh armh = arqy.f88150a;
            if (armh != null) {
                arqy.m73320a(armh, arqy.f88151b);
            }
            arqy.mo48766b();
        }
        asct.m73795a();
        asca.m73765a(this.f108057a);
    }

    public SourceDirectTransferApiService() {
        super((int) BaseMfiEventCallback.TYPE_INVALID_LINKAGE_DATA, "com.google.android.gms.smartdevice.directtransfer.SourceDirectTransferService.START", bnon.f131923a, 3, 10);
    }
}
