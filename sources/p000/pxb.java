package p000;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.cast.CastDevice;

/* renamed from: pxb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class pxb extends pwz {

    /* renamed from: c */
    private final int f40549c;

    public pxb(pvd pvd, pwv pwv, int i) {
        super("ProvisionVirtualDisplayOperation", pvd, pwv);
        this.f40549c = i;
    }

    /* renamed from: a */
    public final void mo6502a(Context context) {
        pvd pvd = this.f40546a;
        pwv pwv = this.f40547b;
        int i = this.f40549c;
        qav qav = pvd.f40336a;
        StringBuilder sb = new StringBuilder(46);
        sb.append("provisionVirtualDisplay displayId: ");
        sb.append(i);
        qav.mo23670a(sb.toString(), new Object[0]);
        if (pvd.f40346k != null) {
            pvd.f40336a.mo23677d("provisionVirtualDisplay called twice", new Object[0]);
            try {
                pvd.f40346k.mo23796a(2203);
                return;
            } catch (RemoteException e) {
                pvd.f40336a.mo23670a("Unable to call provisionVirtualDisplay onError", new Object[0]);
            }
        }
        pvd.f40346k = pwv;
        if (pvd.f40342g == null) {
            pvd.f40336a.mo23677d("provisionVirtualDisplay called without starting the remote display", new Object[0]);
            pwv pwv2 = pvd.f40346k;
            if (pwv2 != null) {
                try {
                    pwv2.mo23796a(2208);
                    return;
                } catch (RemoteException e2) {
                    pvd.f40336a.mo23670a("Unable to call provisionVirtualDisplayCallback onError", new Object[0]);
                }
            }
        }
        CastDevice castDevice = pvd.f40342g.f40381p;
        pvd.f40336a.mo23857a("Provisioning virtual display %d on device %s", Integer.valueOf(i), castDevice.f29715c);
        pvd.f40338c.mo23462b(castDevice.mo17494a(), i);
        qav qav2 = pvd.f40336a;
        String valueOf = String.valueOf(castDevice);
        StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf).length() + 35);
        sb2.append("onDeviceProvisionedVirtualDisplay: ");
        sb2.append(valueOf);
        qav2.mo23670a(sb2.toString(), new Object[0]);
        pvd.f40337b.mo23842a();
        if (castDevice.mo17494a().equals(pvd.f40340e)) {
            pwv pwv3 = pvd.f40346k;
            if (pwv3 != null) {
                try {
                    pwv3.mo8528b(4, pwv3.mo8529bj());
                } catch (RemoteException e3) {
                    pvd.f40336a.mo23670a("Unable to call onConnectedWithDisplay", new Object[0]);
                }
                pvd.f40346k = null;
            }
            pvd.f40340e = null;
        }
    }
}
