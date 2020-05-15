package p000;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.drive.internal.OnLoadRealtimeResponse;

/* renamed from: udq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class udq implements vhe {

    /* renamed from: a */
    final /* synthetic */ vhb f47305a;

    /* renamed from: b */
    final /* synthetic */ uds f47306b;

    /* renamed from: c */
    private ubw f47307c;

    public udq(uds uds, vhb vhb) {
        this.f47306b = uds;
        this.f47305a = vhb;
    }

    /* renamed from: a */
    public final void mo27246a(Status status) {
        ubw ubw = this.f47307c;
        if (ubw != null) {
            vjo vjo = ubw.f47207l;
            if (vjo != null) {
                try {
                    Parcel bj = vjo.mo8529bj();
                    dcl.m8165a(bj, status);
                    vjo.mo8528b(2, bj);
                } catch (RemoteException e) {
                    ubw.f47196a.mo25373b("RealtimeService", String.format("Unable to deliver error: %s", status), e);
                }
            }
            if (!status.mo17709b() && status.f30115i != 7) {
                ubw.mo27172a();
                return;
            }
            return;
        }
        try {
            this.f47306b.f47238b.mo27107a(status);
        } catch (RemoteException e2) {
        }
    }

    /* renamed from: a */
    public final void mo27247a(vhs vhs, bkmc bkmc, vhb vhb) {
        ubw ubw;
        OnLoadRealtimeResponse onLoadRealtimeResponse = new OnLoadRealtimeResponse(bkmc.f124870d.mo66228b());
        this.f47306b.f47314j.f49397e.mo28437a(vhb);
        try {
            uds uds = this.f47306b;
            ubn ubn = uds.f47311g;
            IBinder asBinder = uds.f47238b.asBinder();
            synchronized (ubn.f47171e) {
                if (!ubn.f47172f) {
                    ubw = new ubw(ubn.f47168b, ubn.f47169c, ubn.f47170d, bkmc, asBinder, vhb, vhs);
                    ubn.f47171e.add(ubw);
                } else {
                    ubn.f47167a.mo25371b("DriveService closed before Realtime document finished loading.");
                    throw new RemoteException();
                }
            }
            this.f47307c = ubw;
            this.f47306b.f47238b.mo27978a(onLoadRealtimeResponse, this.f47307c);
        } catch (RemoteException e) {
            uds.f47310f.mo25368a("LoadRealtimeOperation", "Application disconnected before Realtime load completed; closing Realtime document: %s", vhb);
            bkmc.mo66105a();
            try {
                new vhl(vhs, this.f47306b.f47313i.f49776w, true).mo6502a(this.f47306b.f47313i.f49755b);
            } catch (aaaj | RemoteException e2) {
                uds.f47310f.mo25378c("LoadRealtimeOperation", String.format("Failed to close the cache for Realtime document: %s", this.f47305a), e2);
            }
            this.f47306b.f47314j.f49397e.mo28438b(this.f47305a);
        }
    }
}
