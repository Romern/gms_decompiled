package p000;

import android.os.Handler;
import com.google.android.gms.location.places.internal.PlacesParams;
import com.google.android.gms.maps.model.LatLngBounds;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* renamed from: bhyd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bhyd {

    /* renamed from: a */
    public final Set f119870a = new HashSet();

    /* renamed from: b */
    public final Handler f119871b;

    /* renamed from: c */
    public final biam f119872c;

    /* renamed from: d */
    public final bibq f119873d;

    /* renamed from: e */
    public final biak f119874e;

    /* renamed from: f */
    public final bhqg f119875f;

    /* renamed from: g */
    public final bhpt f119876g;

    /* renamed from: h */
    public boolean f119877h;

    /* renamed from: i */
    public bhxo f119878i;

    /* renamed from: j */
    public final bhyi f119879j;

    public bhyd(biam biam, bibq bibq, biak biak, Handler handler, bhqg bhqg, bhyi bhyi, bhpt bhpt) {
        this.f119872c = biam;
        this.f119873d = bibq;
        this.f119874e = biak;
        this.f119871b = handler;
        this.f119875f = bhqg;
        this.f119879j = bhyi;
        this.f119876g = bhpt;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo64411a(bhxn bhxn) {
        this.f119870a.remove(bhxn);
    }

    /* renamed from: a */
    public final void mo64412a(bhxn bhxn, LatLngBounds latLngBounds) {
        if (this.f119870a.add(bhxn)) {
            new bhyc(this, bhxn, latLngBounds, cgfr.m145054i()).mo64410b();
        }
    }

    /* renamed from: a */
    public final void mo64413a(List list, bhxn bhxn, boolean z) {
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((bhzs) it.next()).f119985a);
        }
        if (!list.isEmpty()) {
            int i = bhxn.f119830b.f109596e;
            if (i == 2) {
                biag.m101852a(list, 80.0f);
                this.f119878i.mo64390a(bhxn, list);
            } else if (i == 4) {
                biag.m101852a(list, 150.0f);
                this.f119878i.mo64390a(bhxn, list);
            } else if (cgfr.f186745a.mo6606a().mo83624L() && bhxn.f119830b.f109597f == 100) {
                biag.m101852a(list, (float) cgfr.f186745a.mo6606a().mo83650y());
                this.f119878i.mo64390a(bhxn, list);
            } else if (z && cgfr.f186745a.mo6606a().mo83625M()) {
                this.f119878i.mo64390a(bhxn, list);
            } else if (!cghh.f186930a.mo6606a().mo83789f()) {
                biap biap = new biap(this, list, bhxn, list);
                this.f119874e.mo64490a(new biat(this.f119872c, arrayList, PlacesParams.f79571a), biap);
                if (cgfl.m145006b()) {
                    this.f119876g.mo64139a(bhqq.m101346a(bhqq.m101350a(arrayList.size(), PlacesParams.f79571a)));
                }
            } else {
                bibu bibu = new bibu(this, list, bhxn, list);
                this.f119874e.mo64490a(new bibz(this.f119873d, arrayList, PlacesParams.f79571a), bibu);
                if (cgfl.m145006b()) {
                    this.f119876g.mo64139a(bhqq.m101346a(bhqq.m101350a(arrayList.size(), PlacesParams.f79571a)));
                }
            }
        } else {
            this.f119878i.mo64390a(bhxn, new ArrayList());
        }
    }
}
