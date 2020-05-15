package p000;

import android.os.Parcel;
import com.google.android.gms.nearby.bootstrap.Device;
import com.google.android.gms.smartdevice.d2d.D2DDevice;

/* renamed from: ahdu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ahdu extends dck implements ahdv {

    /* renamed from: a */
    private final arbi f67057a;

    public ahdu() {
        super("com.google.android.gms.nearby.bootstrap.internal.IScanListener");
    }

    /* renamed from: a */
    public final void mo36361a() {
        arbi arbi = this.f67057a;
        arbj.f87275a.logVerbose("Nearby.Bootstrap scan stopped.", new Object[0]);
        ardt ardt = arbi.f87274a.f87278d;
        if (ardt != null) {
            ardt.mo48217a();
            arbi.f87274a.f87278d = null;
        }
    }

    public ahdu(arbi arbi) {
        super("com.google.android.gms.nearby.bootstrap.internal.IScanListener");
        this.f67057a = arbi;
    }

    /* renamed from: a */
    public final void mo36362a(Device device) {
        arbi arbi = this.f67057a;
        Logger Logger = arbj.f87275a;
        String str = device.f80397b;
        String str2 = device.f80399d;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 34 + String.valueOf(str2).length());
        sb.append("Found Nearby Bootstrap device: ");
        sb.append(str);
        sb.append(" (");
        sb.append(str2);
        sb.append(")");
        Logger.logVerbose(sb.toString(), new Object[0]);
        D2DDevice d2DDevice = new D2DDevice(1, device.f80397b, device.f80399d, device.f80400e, 0);
        bmxy.m108582a(arbi.f87274a.f87278d, "ScanController is null.");
        arbi.f87274a.f87278d.mo48219a(d2DDevice);
    }

    /* renamed from: a */
    public final boolean mo3209a(int i, Parcel parcel, Parcel parcel2) {
        if (i == 1) {
            mo36362a((Device) dcl.m8163a(parcel, Device.CREATOR));
        } else if (i == 2) {
            mo36361a();
        } else if (i != 3) {
            return false;
        } else {
            int readInt = parcel.readInt();
            arbi arbi = this.f67057a;
            Logger Logger = arbj.f87275a;
            String valueOf = String.valueOf(ahcu.m55496a(readInt));
            Logger.mo25418e(valueOf.length() == 0 ? new String("Nearby.Bootstrap error: ") : "Nearby.Bootstrap error: ".concat(valueOf), new Object[0]);
            bmxy.m108582a(arbi.f87274a.f87278d, "ScanController is null.");
            arbi.f87274a.f87278d.mo48218a(10557);
            arbj arbj = arbi.f87274a;
            arbj.f87275a.logVerbose("resetScanController()", new Object[0]);
            arbj.f87278d = null;
        }
        return true;
    }
}
