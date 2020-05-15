package p000;

import com.google.android.gms.contextmanager.internal.ContextManagerClientInfo;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;

/* renamed from: dom */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class dom extends dwm implements efy {

    /* renamed from: a */
    final HashMap f13714a = new HashMap();

    /* renamed from: b */
    dol f13715b;

    /* renamed from: c */
    private final boolean f13716c;

    /* renamed from: d */
    private final doo f13717d;

    public dom(doo doo) {
        this.f13717d = doo;
        boolean z = false;
        if (!cdgp.f180782a.mo6606a().mo77582b() && cdgp.f180782a.mo6606a().mo77535a()) {
            z = true;
        }
        this.f13716c = z;
        dwq.m9644A().mo10082a(this, dwq.m9667k());
    }

    /* renamed from: a */
    public final dol mo9349a(doh doh) {
        dol dol = (dol) this.f13714a.get(doh);
        if (dol != null) {
            return dol;
        }
        if (this.f13716c && !doh.mo9338b()) {
            if (this.f13715b == null) {
                dol dol2 = new dol(doh);
                this.f13715b = dol2;
                dol2.mo9347a();
            }
            dol dol3 = this.f13715b;
            this.f13714a.put(doh, dol3);
            return dol3;
        }
        dol dol4 = new dol(doh);
        this.f13714a.put(doh, dol4);
        dol4.mo9347a();
        return dol4;
    }

    /* renamed from: a */
    public final void mo9350a() {
        for (dol dol : this.f13714a.values()) {
            dol.mo9347a();
        }
    }

    /* renamed from: a */
    public final boolean mo9351a(int i, Collection collection, ContextManagerClientInfo contextManagerClientInfo, boolean z) {
        if (collection != null && !collection.isEmpty()) {
            dol a = mo9349a(contextManagerClientInfo.mo18066a());
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                int a2 = a.mo9346a(i, ((Integer) it.next()).intValue(), contextManagerClientInfo);
                if (a2 != 1 && (z || a2 != 6)) {
                    return false;
                }
            }
        }
        return true;
    }

    /* renamed from: a */
    public final boolean mo9352a(ContextManagerClientInfo contextManagerClientInfo, bxco bxco) {
        int ordinal;
        dol a = mo9349a(contextManagerClientInfo.mo18066a());
        bxjq bxjq = (bxjq) a.f13710b.get(doj.m8942a(bxco));
        if (bxjq == null || (ordinal = bxjq.ordinal()) == 1) {
            return false;
        }
        if (ordinal == 2) {
            return true;
        }
        if (ordinal == 3) {
            return a.f13709a.mo9338b();
        }
        if (ordinal != 4) {
            bnsl bnsl = (bnsl) dss.f13961a.mo68387b();
            bnsl.mo68432a("dol", "a", 450, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68420a("[AclManager] Unknown SyncType %s", bxjq);
            return false;
        } else if (a.f13709a.mo9338b()) {
            return false;
        } else {
            return true;
        }
    }

    /* renamed from: a */
    public final boolean mo9353a(Collection collection, ContextManagerClientInfo contextManagerClientInfo) {
        return mo9354a(collection, contextManagerClientInfo, false);
    }

    /* renamed from: a */
    public final boolean mo9354a(Collection collection, ContextManagerClientInfo contextManagerClientInfo, boolean z) {
        return mo9351a(0, collection, contextManagerClientInfo, z);
    }
}
