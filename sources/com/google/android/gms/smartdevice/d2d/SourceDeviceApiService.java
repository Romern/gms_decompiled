package com.google.android.gms.smartdevice.d2d;

import android.os.Handler;
import android.os.HandlerThread;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.internal.GetServiceRequest;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class SourceDeviceApiService extends zzx {

    /* renamed from: b */
    private static final sek f107918b = ascp.m73787a("D2D", "SourceDeviceApiService");

    /* renamed from: m */
    private static final arah f107919m = arah.f87196a;

    /* renamed from: n */
    private static final armb f107920n = armb.f87877a;

    /* renamed from: a */
    Handler f107921a;

    /* renamed from: k */
    private arda f107922k;

    /* renamed from: l */
    private artc f107923l;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo6267a(aaac aaac, GetServiceRequest getServiceRequest) {
        String str = getServiceRequest.f30230d;
        ascd ascd = new ascd(this);
        boolean a = ascd.mo49036a(str);
        new sbe(str).mo25332b();
        Feature[] featureArr = getServiceRequest.f30235i;
        if (featureArr == null || featureArr.length == 0) {
            if (this.f107922k == null) {
                this.f107922k = new arda(this.f56354e, f107919m, f107920n, this, this.f107921a, str, a);
            }
            aaac.mo16652a(this.f107922k);
        } else if (featureArr[0].equals(aqwz.f87013a)) {
            if (this.f107923l == null) {
                this.f107923l = new artc(this.f56354e, this, str, ascd.mo49037b(str));
            }
            aaac.mo16652a(this.f107923l);
        }
    }

    public final void onCreate() {
        f107918b.mo25409a("onCreate()", new Object[0]);
        HandlerThread handlerThread = new HandlerThread("SourceDeviceBackground", 10);
        handlerThread.start();
        handlerThread.getLooper();
        this.f107921a = new adzt(handlerThread.getLooper());
    }

    public final void onDestroy() {
        f107918b.mo25409a("onDestroy()", new Object[0]);
        arda arda = this.f107922k;
        if (arda != null) {
            arda.mo48419c();
        }
        asct.m73795a();
        asca.m73765a(this.f107921a);
    }

    public SourceDeviceApiService() {
        super(75, "com.google.android.gms.smartdevice.d2d.SourceDeviceService.START", bnon.f131923a, 3, 10);
    }
}
