package p000;

import com.google.android.gms.nearby.bootstrap.Device;
import com.google.android.gms.nearby.bootstrap.request.SendDataRequest;

/* renamed from: ahdz */
public final /* synthetic */ class ahdz implements roo {

    /* renamed from: a */
    private final Device f67068a;

    /* renamed from: b */
    private final byte[] f67069b;

    public ahdz(Device device, byte[] bArr) {
        this.f67068a = device;
        this.f67069b = bArr;
    }

    /* renamed from: a */
    public final void mo6476a(Object obj, Object obj2) {
        Device device = this.f67068a;
        byte[] bArr = this.f67069b;
        ahdc ahdc = (ahdc) obj;
        rlf a = ahej.m55617a((aucf) obj2);
        ahdc.mo25288A();
        ((ahds) ahdc.mo25289B()).mo36358a(new SendDataRequest(device, bArr, ahdo.m55569a(a)));
    }
}
