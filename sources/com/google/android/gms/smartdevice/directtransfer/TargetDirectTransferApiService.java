package com.google.android.gms.smartdevice.directtransfer;

import android.os.Handler;
import android.os.HandlerThread;
import com.felicanetworks.mfc.mfi.BaseMfiEventCallback;
import com.google.android.gms.common.internal.GetServiceRequest;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class TargetDirectTransferApiService extends zzx {

    /* renamed from: a */
    static arah f108059a = arah.f87196a;

    /* renamed from: b */
    static armb f108060b = armb.f87877a;

    /* renamed from: l */
    private static final sek f108061l = ascp.m73787a("D2D", "TargetDirectTransferApiService");

    /* renamed from: k */
    Handler f108062k;

    /* renamed from: m */
    private arre f108063m;

    /* renamed from: a */
    public final void mo6267a(aaac aaac, GetServiceRequest getServiceRequest) {
        String str = getServiceRequest.f30230d;
        ascd ascd = new ascd(this);
        if (this.f108063m == null) {
            this.f108063m = new arre(this.f56354e, f108059a, f108060b, this, this.f108062k, str, ascd.mo49037b(str), ascd.mo49036a(str));
        }
        aaac.mo16652a(this.f108063m);
    }

    public final void onCreate() {
        f108061l.mo25409a("onCreate()", new Object[0]);
        HandlerThread handlerThread = new HandlerThread("TargetDeviceBackground", 10);
        handlerThread.start();
        handlerThread.getLooper();
        this.f108062k = new adzt(handlerThread.getLooper());
    }

    public final void onDestroy() {
        f108061l.mo25409a("onDestroy()", new Object[0]);
        arre arre = this.f108063m;
        if (arre != null) {
            if (!arre.f88177d) {
                arre.mo48772b();
            }
            if (!spn.m35859a()) {
                arre.f88176c.mo48657a();
            }
            arre.f88174a.post(new arqz(arre));
        }
        asca.m73765a(this.f108062k);
    }

    public TargetDirectTransferApiService() {
        super((int) BaseMfiEventCallback.TYPE_CARD_NOT_ACTIVE, "com.google.android.gms.smartdevice.directtransfer.TargetDirectTransferService.START", bnon.f131923a, 3, 10);
    }
}
