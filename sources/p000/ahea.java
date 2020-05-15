package p000;

import com.google.android.gms.nearby.bootstrap.Device;
import com.google.android.gms.nearby.bootstrap.request.DisconnectRequest;

/* renamed from: ahea */
final /* synthetic */ class ahea implements roo {

    /* renamed from: a */
    private final Device f67070a;

    public ahea(Device device) {
        this.f67070a = device;
    }

    /* renamed from: a */
    public final void mo6476a(Object obj, Object obj2) {
        Device device = this.f67070a;
        ahdc ahdc = (ahdc) obj;
        rlf a = ahej.m55617a((aucf) obj2);
        ahdc.mo25288A();
        ((ahds) ahdc.mo25289B()).mo36356a(new DisconnectRequest(device, ahdo.m55569a(a)));
    }
}
