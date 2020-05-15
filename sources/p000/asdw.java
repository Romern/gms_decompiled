package p000;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.smartdevice.wifi.GetWifiCredentialsResponse;

/* renamed from: asdw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class asdw implements asbm {

    /* renamed from: a */
    final /* synthetic */ bqgy f88744a;

    public asdw(bqgy bqgy) {
        this.f88744a = bqgy;
    }

    /* renamed from: a */
    public final void mo48990a(Exception exc) {
        asdx.f88745a.mo25417e("Error while fetching PSK from backup set.", exc, new Object[0]);
        this.f88744a.mo69138b(new C1240of(Status.f30109c, asdx.m73850a()));
    }

    /* renamed from: a */
    public final void mo48991a(String str) {
        if (str == null) {
            bqgy bqgy = this.f88744a;
            Logger Logger = asdx.f88745a;
            bqgy.mo69138b(new C1240of(new Status(10600), asdx.m73850a()));
            return;
        }
        this.f88744a.mo69138b(new C1240of(Status.f30107a, new GetWifiCredentialsResponse(2, str)));
    }
}
