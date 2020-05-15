package com.google.android.gms.smartdevice.d2d;

import android.content.Intent;
import android.os.Handler;
import android.os.HandlerThread;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.internal.GetServiceRequest;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class TargetDeviceApiService extends zzx {

    /* renamed from: a */
    static arah f107939a = arah.f87196a;

    /* renamed from: b */
    static armb f107940b = armb.f87877a;

    /* renamed from: l */
    private static final sek f107941l = ascp.m73787a("D2D", "TargetDeviceApiService");

    /* renamed from: k */
    Handler f107942k;

    /* renamed from: m */
    private arge f107943m;

    /* renamed from: n */
    private arth f107944n;

    /* renamed from: a */
    public final void mo6267a(aaac aaac, GetServiceRequest getServiceRequest) {
        String str = getServiceRequest.f30230d;
        ascd ascd = new ascd(this);
        new ascd(this);
        if (cgqs.m146597c()) {
            sre.m36088h(this);
        }
        new sbe(str).mo25332b();
        Feature[] featureArr = getServiceRequest.f30235i;
        if (featureArr == null || featureArr.length == 0) {
            if (this.f107943m == null) {
                f107941l.mo25412b("Creating targetDeviceServiceDelegate.", new Object[0]);
                this.f107943m = new arge(this.f56354e, f107939a, f107940b, this, this.f107942k, str, ascd.mo49037b(str), ascd.mo49036a(str));
            }
            aaac.mo16652a(this.f107943m);
        } else if (featureArr[0].equals(aqwz.f87013a)) {
            if (this.f107944n == null) {
                this.f107944n = new arth(this.f56354e, this, str, ascd.mo49037b(str));
            }
            aaac.mo16652a(this.f107944n);
        }
    }

    public final void onCreate() {
        f107941l.mo25409a("onCreate()", new Object[0]);
        HandlerThread handlerThread = new HandlerThread("TargetDeviceBackground", 10);
        handlerThread.start();
        handlerThread.getLooper();
        this.f107942k = new adzt(handlerThread.getLooper());
    }

    public final void onDestroy() {
        f107941l.mo25409a("onDestroy()", new Object[0]);
        if (this.f107943m != null) {
            if (!cgpa.m146402c()) {
                this.f107943m.mo48500b();
            } else {
                arge arge = this.f107943m;
                arge.f87643b.post(new arfk(arge));
            }
        }
        asca.m73765a(this.f107942k);
    }

    public final void onRebind(Intent intent) {
        f107941l.mo25409a("onRebind", new Object[0]);
        arge arge = this.f107943m;
        if (arge != null) {
            armn armn = arge.f87645d;
            armn.f87912c.set(false);
            armn.f87915f = new armg();
            armf b = armn.f87915f.mo48640b();
            armn.f87916g = new armp(boul.f134940e.mo74144da());
            armn.f87917h = new armt(b.f87890a);
            bxvd bxvd = armn.f87923n;
            bxvd.f164949b = (bxvk) bxvd.f164949b.mo74142c(4);
            bxvd bxvd2 = armn.f87920k;
            bxvd2.f164949b = (bxvk) bxvd2.f164949b.mo74142c(4);
            bxvd bxvd3 = armn.f87921l;
            bxvd3.f164949b = (bxvk) bxvd3.f164949b.mo74142c(4);
            armn.f87918i = new armq(armn.f87915f);
            armn.f87919j = new armr();
        }
    }

    public final boolean onUnbind(Intent intent) {
        if (cgpa.m146402c()) {
            f107941l.mo25409a("onUnbind", new Object[0]);
            if ("com.google.android.gms.smartdevice.d2d.TargetDeviceService.START".equals(intent.getAction())) {
                arge arge = this.f107943m;
                if (arge == null) {
                    return true;
                }
                arge.mo48504c();
                return true;
            }
        }
        return super.onUnbind(intent);
    }

    public TargetDeviceApiService() {
        super(76, "com.google.android.gms.smartdevice.d2d.TargetDeviceService.START", bnon.f131923a, 3, 10);
    }
}
