package p000;

import android.os.Handler;
import android.os.RemoteException;
import java.util.List;

/* renamed from: pak */
final /* synthetic */ class pak implements Runnable {

    /* renamed from: a */
    private final pal f38713a;

    /* renamed from: b */
    private final boolean f38714b;

    /* renamed from: c */
    private final List f38715c;

    public pak(pal pal, boolean z, List list) {
        this.f38713a = pal;
        this.f38714b = z;
        this.f38715c = list;
    }

    public final void run() {
        pal pal = this.f38713a;
        boolean z = this.f38714b;
        List<byte[]> list = this.f38715c;
        pam pam = pal.f38716a;
        bnsn bnsn = pam.f38717a;
        pad pad = pam.f38723g;
        if (pad != null) {
            if (z) {
                try {
                    for (byte[] bArr : list) {
                        List list2 = pad.f38698f;
                        bxus c = bxus.m123744c();
                        list2.add((bivb) bxvk.m124016a(bivb.f121921l, bArr, c));
                    }
                    if (pad.f38699g != null) {
                        try {
                            bnsi d = pam.f38717a.mo68390d();
                            d.mo68432a("pad", "a", 303, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                            d.mo68405a("Fetching sensor service proxy from Gearhead.");
                            pad.f38702j = pad.f38705m.mo22293a(pad.f38699g);
                            bnsi d2 = pam.f38717a.mo68390d();
                            d2.mo68432a("pad", "a", 305, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                            d2.mo68420a("Sensor service proxy: %s", pad.f38702j);
                        } catch (RemoteException e) {
                            bnsi c2 = pam.f38717a.mo68388c();
                            c2.mo68437a(e);
                            c2.mo68432a("pad", "a", 308, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                            c2.mo68405a("Proxy sensors not available");
                        }
                    }
                    list.size();
                    pad.f38703k.f38720d.post(new ozy(pad));
                    return;
                } catch (bxwf e2) {
                }
            }
            pam pam2 = pad.f38703k;
            Handler handler = pam2.f38720d;
            nov nov = pam2.f38724h;
            nov.getClass();
            handler.post(new ozz(nov));
        }
    }
}
