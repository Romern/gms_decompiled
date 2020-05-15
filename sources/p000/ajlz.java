package p000;

import com.google.android.gms.nearby.sharing.NearbySharingChimeraService;
import com.google.android.gms.nearby.sharing.internal.SetDeviceNameParams;

/* renamed from: ajlz */
final /* synthetic */ class ajlz implements Runnable {

    /* renamed from: a */
    private final ajmt f70890a;

    /* renamed from: b */
    private final SetDeviceNameParams f70891b;

    public ajlz(ajmt ajmt, SetDeviceNameParams setDeviceNameParams) {
        this.f70890a = ajmt;
        this.f70891b = setDeviceNameParams;
    }

    public final void run() {
        ajmt ajmt = this.f70890a;
        SetDeviceNameParams setDeviceNameParams = this.f70891b;
        NearbySharingChimeraService.m67474a(ajmt.f70933a, "setDeviceName", setDeviceNameParams.f81127b, new ajlw(ajmt, setDeviceNameParams));
    }
}
