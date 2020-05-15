package p000;

import com.google.android.location.reporting.service.ReportingAndroidChimeraService;

/* renamed from: bgxi */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bgxi implements Runnable {

    /* renamed from: a */
    final /* synthetic */ ReportingAndroidChimeraService f117915a;

    public bgxi(ReportingAndroidChimeraService reportingAndroidChimeraService) {
        this.f117915a = reportingAndroidChimeraService;
    }

    public final void run() {
        bgzo.m100459a(this.f117915a);
        ReportingAndroidChimeraService reportingAndroidChimeraService = this.f117915a;
        reportingAndroidChimeraService.f150884a = bgye.m100307a(reportingAndroidChimeraService);
        ReportingAndroidChimeraService reportingAndroidChimeraService2 = this.f117915a;
        reportingAndroidChimeraService2.f150885b = bgyg.m100351a(reportingAndroidChimeraService2);
    }
}
