package p000;

import android.os.RemoteException;
import com.google.android.gms.smartdevice.d2d.D2DDevice;

/* renamed from: ardu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ardu implements ardt {

    /* renamed from: a */
    private static final sek f87473a = ascp.m73787a("D2D", "SourceDeviceScanController");

    /* renamed from: b */
    private final ariz f87474b;

    public ardu(ariz ariz) {
        sdo.m34959a(ariz);
        this.f87474b = ariz;
    }

    /* renamed from: a */
    public final void mo48217a() {
        try {
            this.f87474b.mo48586a();
        } catch (RemoteException e) {
            f87473a.mo25417e("Error invoking callback.", e, new Object[0]);
        }
    }

    /* renamed from: b */
    public final void mo48220b(D2DDevice d2DDevice) {
        try {
            this.f87474b.mo48589b(d2DDevice);
        } catch (RemoteException e) {
            f87473a.mo25410a((Throwable) e);
        }
    }

    /* renamed from: a */
    public final void mo48218a(int i) {
        try {
            this.f87474b.mo48587a(i);
        } catch (RemoteException e) {
            f87473a.mo25417e("Error invoking callback.", e, new Object[0]);
        }
    }

    /* renamed from: a */
    public final void mo48219a(D2DDevice d2DDevice) {
        try {
            this.f87474b.mo48588a(d2DDevice);
        } catch (RemoteException e) {
            f87473a.mo25417e("Error invoking callback.", e, new Object[0]);
        }
    }
}
