package p000;

import android.os.Bundle;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.internal.GetServiceRequest;
import com.google.android.gms.smartdevice.d2d.TargetDeviceChimeraService;
import java.util.Collections;
import java.util.Set;

/* renamed from: aren */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aren extends rzu {

    /* renamed from: a */
    public arge f87536a;

    /* renamed from: b */
    final /* synthetic */ TargetDeviceChimeraService f87537b;

    /* renamed from: h */
    private arth f87538h;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public aren(TargetDeviceChimeraService targetDeviceChimeraService) {
        super(targetDeviceChimeraService, 76, new int[0]);
        this.f87537b = targetDeviceChimeraService;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Set mo6392a() {
        return Collections.emptySet();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo6393a(sbj sbj, GetServiceRequest getServiceRequest) {
        TargetDeviceChimeraService targetDeviceChimeraService = this.f87537b;
        String str = getServiceRequest.f30230d;
        ascd ascd = new ascd(targetDeviceChimeraService);
        new ascd(targetDeviceChimeraService);
        if (cgqs.m146597c()) {
            sre.m36088h(targetDeviceChimeraService);
        }
        new sbe(str).mo25332b();
        Feature[] featureArr = getServiceRequest.f30235i;
        if (featureArr == null || featureArr.length == 0) {
            if (this.f87536a == null) {
                TargetDeviceChimeraService targetDeviceChimeraService2 = this.f87537b;
                int i = TargetDeviceChimeraService.f107947e;
                this.f87536a = new arge(targetDeviceChimeraService2.f107950d, TargetDeviceChimeraService.f107945a, TargetDeviceChimeraService.f107946b, targetDeviceChimeraService, this.f87537b.f107949c, str, ascd.mo49037b(str), ascd.mo49036a(str));
            }
            arge arge = this.f87536a;
            arge.asBinder();
            sbj.mo16678a(0, arge, (Bundle) null);
        } else if (featureArr[0].equals(aqwz.f87013a)) {
            if (this.f87538h == null) {
                TargetDeviceChimeraService targetDeviceChimeraService3 = this.f87537b;
                int i2 = TargetDeviceChimeraService.f107947e;
                this.f87538h = new arth(targetDeviceChimeraService3.f107950d, targetDeviceChimeraService, str, ascd.mo49037b(str));
            }
            arth arth = this.f87538h;
            arth.asBinder();
            sbj.mo16678a(0, arth, (Bundle) null);
        }
    }
}
