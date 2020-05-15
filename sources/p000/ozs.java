package p000;

import android.os.ParcelFileDescriptor;
import android.os.RemoteException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* renamed from: ozs */
public final /* synthetic */ class ozs implements Runnable {

    /* renamed from: a */
    private final pam f38676a;

    /* renamed from: b */
    private final List f38677b;

    /* renamed from: c */
    private final List f38678c;

    public ozs(pam pam, List list, List list2) {
        this.f38676a = pam;
        this.f38677b = list;
        this.f38678c = list2;
    }

    public final void run() {
        pam pam = this.f38676a;
        List list = this.f38677b;
        List<oer> list2 = this.f38678c;
        pad pad = pam.f38723g;
        bmxy.m108581a(pad);
        bnsi d = pam.f38717a.mo68390d();
        d.mo68432a("pad", "a", 359, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        d.mo68405a("Connection start services in conman");
        try {
            ParcelFileDescriptor[] createReliableSocketPair = ParcelFileDescriptor.createReliableSocketPair();
            pad.f38700h = createReliableSocketPair[0];
            ojq ojq = pad.f38701i;
            ojq.f37794d.f37598v.mo22256a(pad.f38700h);
            ArrayList arrayList = new ArrayList();
            for (oer oer : list2) {
                arrayList.add(Integer.valueOf(oer.mo3214a()));
            }
            pad.f38705m.mo22298a(pad.f38695c, list, arrayList, createReliableSocketPair[1], pad.f38694b);
        } catch (RemoteException | IOException | IllegalArgumentException e) {
            bnsi d2 = pam.f38717a.mo68390d();
            d2.mo68437a(e);
            d2.mo68432a("pad", "a", 371, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            d2.mo68405a("Start required services had exception");
            pad.f38703k.f38720d.post(new paa(pad));
        }
    }
}
