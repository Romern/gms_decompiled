package p000;

import android.os.Handler;
import android.os.RemoteException;
import java.util.List;

/* renamed from: ozt */
public final /* synthetic */ class ozt implements Runnable {

    /* renamed from: a */
    private final pam f38679a;

    /* renamed from: b */
    private final List f38680b;

    /* renamed from: c */
    private final List f38681c;

    public ozt(pam pam, List list, List list2) {
        this.f38679a = pam;
        this.f38680b = list;
        this.f38681c = list2;
    }

    public final void run() {
        pam pam = this.f38679a;
        List list = this.f38680b;
        List<oer> list2 = this.f38681c;
        pad pad = pam.f38723g;
        bmxy.m108581a(pad);
        bnsi d = pam.f38717a.mo68390d();
        d.mo68432a("pad", "b", 379, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        d.mo68405a("Connection start additional services in conman");
        try {
            bngs j = bngx.m109377j();
            for (oer oer : list2) {
                j.mo67668c(Integer.valueOf(oer.mo3214a()));
            }
            pad.f38705m.mo22299a(pad.f38695c, list, j.mo67664a(), pad.f38694b);
        } catch (RemoteException e) {
            bnsi d2 = pam.f38717a.mo68390d();
            d2.mo68437a(e);
            d2.mo68432a("pad", "b", 388, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            d2.mo68405a("Start additional services had exception.");
            pam pam2 = pad.f38703k;
            Handler handler = pam2.f38720d;
            nov nov = pam2.f38724h;
            nov.getClass();
            handler.post(new pab(nov));
        }
    }
}
