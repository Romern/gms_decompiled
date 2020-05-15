package p000;

import com.google.android.gms.location.LocationAvailability;
import java.util.Iterator;
import java.util.List;

/* renamed from: bfqj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bfqj implements bfrb {

    /* renamed from: a */
    final /* synthetic */ bfqm f114860a;

    public bfqj(bfqm bfqm) {
        this.f114860a = bfqm;
    }

    /* renamed from: a */
    public final void mo62121a(LocationAvailability locationAvailability) {
        LocationAvailability locationAvailability2;
        LocationAvailability locationAvailability3;
        int i;
        int i2;
        bfqm bfqm = this.f114860a;
        if (bfqm.f114880g.mo26039a()) {
            int i3 = 1000;
            if (locationAvailability.f79346c == 0 && locationAvailability.f79344a == 1 && locationAvailability.f79345b == 1 && ((i2 = locationAvailability.f79347d) == 0 || i2 == 1000)) {
                locationAvailability2 = locationAvailability;
            } else {
                if (locationAvailability.mo43544a()) {
                    i3 = 0;
                }
                locationAvailability2 = LocationAvailability.m66850a(i3, 1, 1, 0);
            }
            bfqm.f114896w = locationAvailability;
            bfqm.f114897x = locationAvailability2;
            for (bfph bfph : bfqm.f114883j.mo25992c()) {
                if (!bfph.f114769e) {
                    locationAvailability3 = locationAvailability2;
                } else {
                    locationAvailability3 = locationAvailability;
                }
                if (bfph.mo62092b(locationAvailability3)) {
                    bfpj bfpj = bfqm.f114894u;
                    List list = bfph.f114767c.f79421c;
                    if (!locationAvailability3.mo43544a()) {
                        i = 17;
                    } else {
                        i = 16;
                    }
                    bfpj.mo26010a(i, bfpj.f114791k.mo62094a(list));
                }
            }
        }
    }

    /* renamed from: f */
    public final void mo62122f(List list) {
        boolean z;
        List list2;
        bfqm bfqm = this.f114860a;
        if (bfqm.f114880g.mo26039a()) {
            bfqm.f114895v.mo63540a();
            boolean b = aeri.m52437b(bfqm.f114879f);
            if (!bfqm.f114884k.mo34487a("gps") || !bfqm.f114884k.mo34487a("network")) {
                Iterator it = bfqm.f114883j.mo25992c().iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (((bfph) it.next()).f114767c.f79427i) {
                            z = false;
                            break;
                        }
                    } else {
                        break;
                    }
                }
            }
            z = true;
            for (bfph bfph : bfqm.f114883j.mo25992c()) {
                long b2 = bfph.f114767c.f79420b.mo43550b();
                if (b2 >= 0 && b2 < Long.MAX_VALUE) {
                    boolean z2 = bfph.f114769e;
                    if (z2 && bfph.f114768d) {
                        list2 = bfqm.f114892s.mo62188a(list, bfqm.f114881h, true, true, bfph.f114767c.f79427i, z, b);
                    } else if (bfph.f114768d) {
                        list2 = bfqm.f114892s.mo62188a(list, bfqm.f114881h, false, true, bfph.f114767c.f79427i, z, b);
                    } else {
                        list2 = bfqm.f114892s.mo62188a(list, bfqm.f114882i, z2, false, bfph.f114767c.f79427i, z, b);
                    }
                    bfqm.mo62138a(list2, bfph);
                }
            }
            bfqm.f114881h.clear();
            bfqm.f114882i.clear();
        }
    }
}
