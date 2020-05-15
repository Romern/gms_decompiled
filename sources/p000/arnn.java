package p000;

import com.google.android.gms.nearby.bootstrap.Device;

/* renamed from: arnn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class arnn implements aqzo {

    /* renamed from: a */
    public final Device f87975a;

    /* renamed from: b */
    private final ahco f87976b;

    public arnn(ahco ahco, Device device) {
        sdo.m34959a(ahco);
        this.f87976b = ahco;
        sdo.m34959a(device);
        this.f87975a = device;
    }

    /* renamed from: a */
    public final void mo48304a() {
        ascs.m73792a(this.f87976b.mo36302a(this.f87975a));
    }

    /* renamed from: a */
    public final void mo48305a(byte[] bArr) {
        boolean z;
        ahco ahco = this.f87976b;
        Device device = this.f87975a;
        sdo.m34959a(bArr);
        int length = bArr.length;
        boolean z2 = true;
        if (length > 0) {
            z = true;
        } else {
            z = false;
        }
        sdo.m34974b(z);
        if (length >= 65536) {
            z2 = false;
        }
        sdo.m34974b(z2);
        roz b = rpa.m34196b();
        b.f43472a = new ahdz(device, bArr);
        ((rjx) ahco).mo24732b(b.mo24977a());
    }
}
