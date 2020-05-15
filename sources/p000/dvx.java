package p000;

import com.google.android.gms.contextmanager.internal.ContextDataFilterImpl;
import com.google.android.gms.contextmanager.internal.ContextManagerClientInfo;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* renamed from: dvx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class dvx extends dwm implements aerc {

    /* renamed from: a */
    public final HashMap f14223a = new HashMap();

    /* renamed from: b */
    public final dvr f14224b = new dvr(this);

    /* renamed from: c */
    public final egi f14225c = new egi();

    /* renamed from: d */
    public final boolean f14226d = cdgp.m133205n();

    /* renamed from: e */
    public final Set f14227e = new HashSet();

    /* renamed from: f */
    private final aeri f14228f = aeri.m52441e(dwq.m9662f());

    /* renamed from: c */
    private static final boolean m9564c(dwa dwa) {
        if (!dwa.m9589a(dwa, 1) || !dwa.m9591b(dwa)) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public final Collection mo9719a(doh doh) {
        dwf dwf = (dwf) this.f14223a.get(doh);
        if (dwf != null) {
            return dwf.mo9766a();
        }
        return null;
    }

    /* renamed from: b */
    public final void mo9729b() {
        long a = dwq.m9665i().mo20505a();
        for (doh doh : dwq.m9681y().mo9331a()) {
            tjq a2 = dwq.m9673q().mo10053a(doh, 14);
            if (a2 != null) {
                try {
                    tnn tnn = (tnn) bxvk.m124014a(tnn.f46304b, a2.mo26593c());
                    if (tnn != null && !sqw.m36041a((Collection) tnn.f46306a)) {
                        bxwc bxwc = tnn.f46306a;
                        int size = bxwc.size();
                        for (int i = 0; i < size; i++) {
                            bxcx bxcx = (bxcx) bxwc.get(i);
                            bxcw bxcw = bxcx.f163009h;
                            if (bxcw == null) {
                                bxcw = bxcw.f162994e;
                            }
                            dwa dwa = new dwa(bxcx, new dvz(bxcw, spn.f44932a, doh));
                            if (!dwa.m9590a(dwa, a)) {
                                this.f14224b.mo9716a(dwa);
                            }
                        }
                    }
                } catch (bxwf e) {
                    bnsl bnsl = (bnsl) dss.f13961a.mo68387b();
                    bnsl.mo68437a(e);
                    bnsl.mo68432a("dvx", "b", 573, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                    bnsl.mo68405a("[InterestManager] Could not deserialize proto.");
                }
            }
        }
    }

    /* renamed from: a */
    public final Set mo9720a() {
        return this.f14223a.keySet();
    }

    /* renamed from: a */
    public final void mo9721a(int i, int i2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        if (i2 == 0) {
            tit tit = new tit();
            for (int i3 : doi.f13691a) {
                tit.mo26579a(i3);
            }
            tiu a = tit.mo26578a();
            for (doh doh : dwq.m9681y().mo9331a()) {
                Object[] objArr2 = {Integer.valueOf(dwq.m9672p().mo10041b((ContextDataFilterImpl) a, new ContextManagerClientInfo(doh.f13690b, null, 0, null, 0, 0, null, null, 0, 0))), doh};
            }
            for (dwa dwa : this.f14227e) {
                this.f14224b.mo9715a(dwa.f14242b);
            }
            return;
        }
        for (dwa dwa2 : this.f14227e) {
            this.f14224b.mo9716a(dwa2);
        }
    }

    /* renamed from: b */
    public final void mo9730b(dvz dvz) {
        if (this.f14226d) {
            this.f14227e.remove(dvz);
            if (this.f14227e.isEmpty()) {
                this.f14228f.mo34478a(dwq.m9674r());
            }
        }
    }

    /* renamed from: b */
    public final void mo9731b(dwa dwa) {
        mo9730b(dwa.f14242b);
        if (!this.f14226d || mo9728a(dwa.f14242b)) {
            mo9732b(dwa, false);
            this.f14224b.mo9715a(dwa.f14242b);
        }
    }

    /* renamed from: a */
    public final void mo9722a(doh doh, drb drb) {
        if (this.f14226d) {
            ArrayList arrayList = new ArrayList(this.f14224b.f14211a.size() + this.f14227e.size());
            for (dwa dwa : this.f14224b.f14211a) {
                if ((drb == null || drb.equals(dwa.f14243c)) && dwa.f14242b.f14240c.equals(doh)) {
                    arrayList.add(dwa);
                }
            }
            for (dwa dwa2 : this.f14227e) {
                if ((drb == null || drb.equals(dwa2.f14243c)) && dwa2.f14242b.f14240c.equals(doh)) {
                    arrayList.add(dwa2);
                }
            }
            if (!arrayList.isEmpty()) {
                mo9733b(arrayList);
            }
        }
        dwf dwf = (dwf) this.f14223a.get(doh);
        if (dwf == null) {
            new Object[1][0] = drb;
            return;
        }
        Collection a = drb != null ? dwf.mo9767a(drb) : dwf.mo9766a();
        if (a != null) {
            mo9733b(new ArrayList(a));
        } else {
            new Object[1][0] = drb;
        }
    }

    /* renamed from: b */
    public final void mo9732b(dwa dwa, boolean z) {
        if (cdgp.m133206o() && m9564c(dwa)) {
            doh doh = dwa.f14242b.f14240c;
            if (z || (this.f14223a.containsKey(doh) && ((dwf) this.f14223a.get(doh)).mo9769a(dwa.f14242b))) {
                ArrayList arrayList = new ArrayList();
                if (z) {
                    arrayList.add(dwa.f14241a);
                }
                if (this.f14223a.containsKey(doh) && ((dwf) this.f14223a.get(doh)).mo9766a() != null) {
                    for (dwa dwa2 : ((dwf) this.f14223a.get(doh)).mo9766a()) {
                        if (!dwa2.f14242b.equals(dwa.f14242b) && m9564c(dwa2)) {
                            arrayList.add(dwa2.f14241a);
                        }
                    }
                }
                bxvd da = tnn.f46304b.mo74144da();
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                tnn tnn = (tnn) da.f164949b;
                if (!tnn.f46306a.mo73666a()) {
                    tnn.f46306a = bxvk.m124021a(tnn.f46306a);
                }
                bxsy.m123078a(arrayList, tnn.f46306a);
                dwq.m9673q().mo10051a(tjq.m37092a(doh, 14, (tnn) da.mo74062i()));
                return;
            }
            Object[] objArr = {dwa.f14242b.mo9740c(), doh.f13690b};
        }
    }

    /* renamed from: a */
    public final void mo9723a(dvw dvw, dqb dqb) {
        new Object[1][0] = dvw;
        this.f14225c.mo10088a(dvw, dqb);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: dvx.a(dwa, boolean):void
     arg types: [dwa, int]
     candidates:
      dvx.a(int, int):void
      dvx.a(doh, drb):void
      dvx.a(dvw, dqb):void
      dvx.a(java.util.Collection, boolean):void
      aerc.a(int, int):void
      dvx.a(dwa, boolean):void */
    /* renamed from: a */
    public final void mo9724a(dwa dwa) {
        mo9725a(dwa, true);
    }

    /* renamed from: a */
    public final void mo9725a(dwa dwa, boolean z) {
        if (z || !mo9728a(dwa.f14242b)) {
            if (this.f14226d && doi.m8936a(dwa.mo9747b().f162973bD)) {
                boolean b = aeri.m52437b(dwq.m9662f());
                if (this.f14227e.isEmpty()) {
                    this.f14228f.mo34480a(dwq.m9674r(), dwq.m9667k().mo9432a(dqy.m9123a("location_settings")));
                }
                this.f14227e.add(dwa);
                if (!b) {
                    return;
                }
            }
            this.f14224b.mo9716a(dwa);
            mo9732b(dwa, true);
        }
    }

    /* renamed from: b */
    public final void mo9733b(Collection collection) {
        new Object[1][0] = collection;
        if (collection != null && !collection.isEmpty()) {
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                mo9731b((dwa) it.next());
            }
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: dvx.a(java.util.Collection, boolean):void
     arg types: [java.util.Collection, int]
     candidates:
      dvx.a(int, int):void
      dvx.a(doh, drb):void
      dvx.a(dvw, dqb):void
      dvx.a(dwa, boolean):void
      aerc.a(int, int):void
      dvx.a(java.util.Collection, boolean):void */
    /* renamed from: a */
    public final void mo9726a(Collection collection) {
        mo9727a(collection, true);
    }

    /* renamed from: a */
    public final void mo9727a(Collection collection, boolean z) {
        if (collection != null && !collection.isEmpty()) {
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                mo9725a((dwa) it.next(), z);
            }
        }
    }

    /* renamed from: a */
    public final boolean mo9728a(dvz dvz) {
        if (this.f14226d && this.f14224b.f14211a.contains(dvz)) {
            return true;
        }
        dwf dwf = (dwf) this.f14223a.get(dvz.f14240c);
        return dwf != null && dwf.mo9769a(dvz);
    }
}
