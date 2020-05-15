package p000;

import android.os.Parcel;
import com.google.android.gms.nearby.bootstrap.Device;

/* renamed from: ahdi */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ahdi extends dck implements ahdj {

    /* renamed from: a */
    public aheg f67052a;

    /* renamed from: b */
    private final ahcp f67053b;

    /* renamed from: c */
    private Device f67054c;

    public ahdi() {
        super("com.google.android.gms.nearby.bootstrap.internal.IConnectionListener");
    }

    /* renamed from: a */
    public final void mo36343a() {
        Device device;
        this.f67053b.mo36303a();
        aheg aheg = this.f67052a;
        if (aheg != null && (device = this.f67054c) != null) {
            aheg.f67074a.mo36365b(device);
            this.f67054c = null;
        }
    }

    /* renamed from: b */
    public final void mo36347b(String str) {
        this.f67053b.mo36308b(str);
    }

    /* renamed from: c */
    public final void mo36348c() {
        this.f67053b.mo36307b();
    }

    public ahdi(ahcp ahcp) {
        super("com.google.android.gms.nearby.bootstrap.internal.IConnectionListener");
        this.f67053b = ahcp;
    }

    /* renamed from: a */
    public final void mo36344a(int i) {
        this.f67053b.mo36304a(i);
    }

    /* renamed from: a */
    public final void mo36345a(Device device, byte[] bArr) {
        this.f67053b.mo36305a(device, bArr);
        aheg aheg = this.f67052a;
        if (aheg != null) {
            this.f67054c = device;
            ahej ahej = aheg.f67074a;
            rod a = ahej.f67076a.mo37440a(ahej, device, "connection");
            rob rob = a.f43429b;
            sdo.checkIfNull(rob, "Key must not be null");
            ahej.f67076a.mo37437a(ahej, new aheh(a), new ahei(rob));
        }
    }

    /* renamed from: a */
    public final void mo36346a(String str) {
        this.f67053b.mo36306a(str);
    }

    /* renamed from: a */
    public final boolean mo3209a(int i, Parcel parcel, Parcel parcel2) {
        switch (i) {
            case 1:
                mo36345a((Device) dcl.m8163a(parcel, Device.CREATOR), parcel.createByteArray());
                return true;
            case 2:
                mo36343a();
                return true;
            case 3:
                mo36344a(parcel.readInt());
                return true;
            case 4:
                mo36346a(parcel.readString());
                return true;
            case 5:
                mo36348c();
                return true;
            case 6:
                mo36347b(parcel.readString());
                return true;
            default:
                return false;
        }
    }
}
