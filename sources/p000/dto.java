package p000;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.contextmanager.internal.ContextManagerClientInfo;
import com.google.android.gms.location.internal.ParcelableGeofence;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: dto */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class dto implements dtw {

    /* renamed from: a */
    public final HashMap f13998a = new HashMap();

    /* renamed from: b */
    public final bnot f13999b = bnge.m109299s();

    /* renamed from: c */
    public final HashMap f14000c = new HashMap();

    /* renamed from: d */
    public final HashMap f14001d = new HashMap();

    /* renamed from: e */
    public final dtx f14002e;

    /* renamed from: f */
    public final ego f14003f;

    /* renamed from: g */
    public final Map f14004g;

    /* renamed from: h */
    private final egi f14005h;

    public dto(Context context, dtn dtn, dqb dqb) {
        egi egi = new egi();
        this.f14005h = egi;
        egi.mo10088a(dtn, dqb);
        this.f14002e = new dtx(context, this, dqb);
        this.f14003f = new ego();
        this.f14004g = new IdentityHashMap();
    }

    /* renamed from: a */
    public final drk mo9568a(String str) {
        return (drk) this.f13998a.get(str);
    }

    /* renamed from: b */
    public final duu mo9575b(String str) {
        new Object[1][0] = this.f13998a.keySet();
        drk drk = (drk) this.f13998a.get(str);
        if (drk != null) {
            return drk.mo9491b(str);
        }
        return null;
    }

    /* renamed from: c */
    public final Set mo9578c(String str) {
        if (this.f13999b.mo67271d(str)) {
            return new HashSet(this.f13999b.mo67361a(str));
        }
        return null;
    }

    /* renamed from: d */
    public final duu mo9581d(String str) {
        drk drk = (drk) this.f13998a.get(str);
        if (drk == null) {
            return null;
        }
        duu a = drk.mo9488a(str);
        if (a != null) {
            mo9577b(a);
            mo9580c(a);
            mo9582e(str);
            if (drk.mo9494e()) {
                this.f14001d.remove(drk.f13876a);
            }
        }
        this.f14002e.mo9597a(str);
        return a;
    }

    /* renamed from: e */
    public final void mo9582e(String str) {
        this.f13998a.remove(str);
        Set<ParcelableGeofence> b = this.f13999b.mo67362b(str);
        if (b != null) {
            for (ParcelableGeofence parcelableGeofence : b) {
                this.f14000c.remove(parcelableGeofence.f79438a);
            }
        }
    }

    /* renamed from: a */
    public final Collection mo9569a() {
        return this.f14001d.values();
    }

    /* renamed from: a */
    public final List mo9570a(ContextManagerClientInfo contextManagerClientInfo) {
        new Object[1][0] = this.f13998a.keySet();
        ArrayList arrayList = null;
        for (String str : this.f13998a.keySet()) {
            duu b = mo9575b(str);
            if (b != null && TextUtils.equals(contextManagerClientInfo.f30678b, b.f14123f) && TextUtils.equals(contextManagerClientInfo.f30677a, b.f14124g) && TextUtils.equals(contextManagerClientInfo.f30680d, b.f14125h)) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(b);
            }
        }
        return arrayList;
    }

    /* renamed from: b */
    public final Set mo9576b() {
        return this.f14004g.keySet();
    }

    /* renamed from: c */
    public final void mo9579c() {
        this.f14002e.mo9592a();
    }

    /* renamed from: b */
    public final void mo9577b(duu duu) {
        ego ego = duu.f14126i;
        for (int i = 0; i < ego.size(); i++) {
            mo9574a((Set) ego.valueAt(i));
        }
    }

    /* renamed from: c */
    public final void mo9580c(duu duu) {
        this.f14004g.remove(duu.f14119b);
        duu.m9453a(duu, 3);
    }

    /* renamed from: a */
    public final void mo9571a(dus dus) {
        duu duu = (duu) this.f14004g.get(dus);
        if (duu == null) {
            bnsl bnsl = (bnsl) dss.f13961a.mo68388c();
            bnsl.mo68432a("dto", "a", 356, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68405a("[FenceMapping] Did not find registration record for fence");
            return;
        }
        duu.mo9680a((List) null);
    }

    /* renamed from: a */
    public final void mo9572a(duu duu) {
        ego ego = duu.f14126i;
        if (ego != null) {
            for (int i = 0; i < ego.size(); i++) {
                for (dwa dwa : (Set) ego.valueAt(i)) {
                    this.f14003f.mo10098a(dwa.mo9747b().f162973bD, dwa);
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo9573a(Collection collection) {
        this.f14005h.mo10086a((egg) new dtm(collection));
    }

    /* renamed from: a */
    public final void mo9574a(Set set) {
        if (set != null) {
            Iterator it = set.iterator();
            while (it.hasNext()) {
                dwa dwa = (dwa) it.next();
                this.f14003f.mo10100b(dwa.mo9747b().f162973bD, dwa);
            }
        }
    }
}
