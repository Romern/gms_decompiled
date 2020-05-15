package p000;

import android.os.Bundle;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.internal.GetServiceRequest;
import com.google.android.gms.smartdevice.d2d.SourceDeviceChimeraService;
import java.util.Collections;
import java.util.Set;

/* renamed from: araz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class araz extends rzu {

    /* renamed from: a */
    public arda f87257a;

    /* renamed from: b */
    final /* synthetic */ SourceDeviceChimeraService f87258b;

    /* renamed from: h */
    private artc f87259h;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public araz(SourceDeviceChimeraService sourceDeviceChimeraService) {
        super(sourceDeviceChimeraService, 75, new int[0]);
        this.f87258b = sourceDeviceChimeraService;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Set mo6392a() {
        return Collections.emptySet();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo6393a(sbj sbj, GetServiceRequest getServiceRequest) {
        SourceDeviceChimeraService sourceDeviceChimeraService = this.f87258b;
        String str = getServiceRequest.f30230d;
        ascd ascd = new ascd(sourceDeviceChimeraService);
        boolean a = ascd.mo49036a(str);
        new sbe(str).mo25332b();
        Feature[] featureArr = getServiceRequest.f30235i;
        if (featureArr == null || featureArr.length == 0) {
            if (this.f87257a == null) {
                SourceDeviceChimeraService sourceDeviceChimeraService2 = this.f87258b;
                arah arah = SourceDeviceChimeraService.f107924a;
                this.f87257a = new arda(sourceDeviceChimeraService2.f107928d, SourceDeviceChimeraService.f107924a, SourceDeviceChimeraService.f107925b, sourceDeviceChimeraService, this.f87258b.f107927c, str, a);
            }
            arda arda = this.f87257a;
            arda.asBinder();
            sbj.mo16678a(0, arda, (Bundle) null);
        } else if (featureArr[0].equals(aqwz.f87013a)) {
            if (this.f87259h == null) {
                SourceDeviceChimeraService sourceDeviceChimeraService3 = this.f87258b;
                arah arah2 = SourceDeviceChimeraService.f107924a;
                this.f87259h = new artc(sourceDeviceChimeraService3.f107928d, sourceDeviceChimeraService, str, ascd.mo49037b(str));
            }
            artc artc = this.f87259h;
            artc.asBinder();
            sbj.mo16678a(0, artc, (Bundle) null);
        }
    }
}
